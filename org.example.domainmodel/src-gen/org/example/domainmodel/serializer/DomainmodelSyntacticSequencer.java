/*
 * generated by Xtext 2.12.0
 */
package org.example.domainmodel.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.example.domainmodel.services.DomainmodelGrammarAccess;

@SuppressWarnings("all")
public class DomainmodelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DomainmodelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Feature_ColonKeyword_4_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DomainmodelGrammarAccess) access;
		match_Feature_ColonKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getFeatureAccess().getColonKeyword_4_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Feature_ColonKeyword_4_0_q.equals(syntax))
				emit_Feature_ColonKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     type=[Type|QualifiedName] (ambiguity) (rule end)
	 */
	protected void emit_Feature_ColonKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
