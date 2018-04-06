package org.example.domainmodel.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.example.domainmodel.domainmodel.Entity
import org.example.domainmodel.domainmodel.Feature
import org.example.domainmodel.domainmodel.Method
import org.eclipse.xtext.naming.IQualifiedNameProvider
 
import com.google.inject.Inject
import org.eclipse.emf.common.util.EList

class DomainmodelGenerator extends AbstractGenerator {
 
    @Inject extension IQualifiedNameProvider
    
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        for (e : resource.allContents.toIterable.filter(Entity)) {
            fsa.generateFile(
                e.fullyQualifiedName.toString("/") + ".java",
                e.compile)
        }
    }
 
    def compile(Entity e) ''' 
        «IF e.eContainer.fullyQualifiedName !== null»
            package «e.eContainer.fullyQualifiedName»;
        «ENDIF»
        
        public class «e.name» «IF e.superType !== null
                »extends «e.superType.fullyQualifiedName» «ENDIF»{
            «FOR f : e.features»
                «f.compile»
            «ENDFOR»
            «FOR m : e.methods»
                «m.compile»
            «ENDFOR»
        }
    '''
 
    def compile(Feature f) '''    	 
        private «f.type.fullyQualifiedName» «f.name»«IF f.value !== null && !f.value.equals("") && f.type.equals("String")» = "«getValue(f)»"«ENDIF»;
        
        public «f.type.fullyQualifiedName» get«f.name.toFirstUpper»() {
            return «f.name»;
        }
        
        public void set«f.name.toFirstUpper»(«f.type.fullyQualifiedName» «f.name») {
            this.«f.name» = «f.name»;
        }
    '''
    
    def compile(Method m)'''
    	public void «m.name»() {
    		«m.body»;
    	}
    '''
    def String getValue(Feature f) {
		var String result = ""
    	for (var int i = 0; i < f.getValue().length; i++) {
    		result = result+f.getValue().get(i)
    	}
    	return result
    }
    
}

