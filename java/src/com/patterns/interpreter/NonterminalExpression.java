package com.patterns.interpreter;

public class NonterminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("Nonterminal interpret");
    }

}
