/*
 * generated by Xtext
 */
package org.xtext.example.awesomedsl;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.xtext.example.awesomedsl.concretesyntax.ExampleAntlrTokenToAttributeIdMapper;
import org.xtext.example.awesomedsl.concretesyntax.ExampleHighlightingConfiguration;
import org.xtext.example.awesomedsl.concretesyntax.ExampleSemanticHighlightingCalculator;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class AwesomeDSLRuntimeModule extends org.xtext.example.awesomedsl.AbstractAwesomeDSLRuntimeModule {

	@Override
	public void configure(Binder binder) {
		// TODO Auto-generated method stub
		super.configure(binder);
		
		binder.bind(IHighlightingConfiguration.class).to(ExampleHighlightingConfiguration.class);
		binder.bind(AbstractAntlrTokenToAttributeIdMapper.class).to(ExampleAntlrTokenToAttributeIdMapper.class);
		binder.bind(ISemanticHighlightingCalculator.class).to(ExampleSemanticHighlightingCalculator.class);
	}
	
}
