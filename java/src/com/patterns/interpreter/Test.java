package com.patterns.interpreter;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        ArrayList<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression abstractExpression : list) {
            abstractExpression.interpret(context);
        }
    }

}
