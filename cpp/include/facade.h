#ifndef __FACADE_H__
#define __FACADE_H__

#include "patterns.h"

class SubSystem1 {
public:
    void method1() {}
};

class SubSystem2 {
public:
    void method2() {}
};

class SubSystem3 {
public:
    void method3() {}
};

class SubSystem4 {
public:
    void method4() {}
};

class Facade {
private:
    SubSystem1 m_system1;
    SubSystem2 m_system2;
    SubSystem3 m_system3;
    SubSystem4 m_system4;
public:
    void methodA() {
        m_system1.method1();
        m_system3.method3();
    }
    void methodB() {
        m_system2.method2();
        m_system4.method4();
    }
};

#endif // FACADE_H

