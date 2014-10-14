#ifndef __TEMPLATE_H__
#define __TEMPLATE_H__

#include "patterns.h"

class AbsClass {
public:
    virtual string operation1() = 0;

    virtual string operation2() = 0;

    string method() {
        return operation1() + " " + operation2();
    }
};

class ConcreteClass1 : public AbsClass {
public:
    virtual string operation1() {
        return "op1 from ConcreteClass1";
    }

    virtual string operation2() {
        return "op2 from ConcreteClass1";
    }
};

class ConcreteClass2 : public AbsClass {
public:
    virtual string operation1() {
        return "op1 from ConcreteClass2";
    }

    virtual string operation2() {
        return "op2 from ConcreteClass2";
    }
};

#endif // TEMPLATE_H

