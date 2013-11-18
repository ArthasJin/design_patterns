package com.patterns.mediator;

public class Test {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        
        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);
        
        colleagueA.send("This is colleagueA");
        colleagueB.send("This is colleagueB");
    }

}
