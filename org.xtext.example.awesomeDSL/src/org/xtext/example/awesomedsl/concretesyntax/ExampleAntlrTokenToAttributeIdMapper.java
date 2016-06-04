package org.xtext.example.awesomedsl.concretesyntax;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class ExampleAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper
{
    private static final Pattern QUOTED = Pattern.compile("(?:^'(\\w[^']*)'$)|(?:^\"(\\w[^\"]*)\")$", Pattern.MULTILINE);

    @Override
    protected String calculateId(String tokenName, int tokenType) {
    	System.out.println(tokenName);
        if(tokenName.equals("RULE_INT")) {
            return ExampleHighlightingConfiguration.NUMBER_ID;
        }
        else if(tokenName.equals("RULE_STRING")){
        	return ExampleHighlightingConfiguration.GREEN_ID;
        }
        else if(QUOTED.matcher(tokenName).matches()) {
            return ExampleHighlightingConfiguration.KEYWORD_ID;
        }
        return ExampleHighlightingConfiguration.DEFAULT_ID;
    }
}