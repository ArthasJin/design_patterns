#ifndef __ABS_FACTORY_H__
#define __ABS_FACTORY_H__

#include "patterns.h"

using namespace std;

class AbsProductA {
protected:
    string m_name;
public:
    AbsProductA(const string &name) : m_name(name) {}

    virtual string& getName() = 0;

    virtual ~AbsProductA() {};
};

class ProductA : public AbsProductA {
public:
    explicit ProductA(const string &name) : AbsProductA(name) {}

    virtual string& getName() {
        return m_name;
    }

    virtual ~ProductA() {}
};

class AbsProductB {
protected:
    string m_name;
public:
    AbsProductB(const string &name) : m_name(name) {}

    virtual string& getName() = 0;

    virtual ~AbsProductB() {};
};

class ProductB : public AbsProductB {
public:
    explicit ProductB(const string &name) : AbsProductB(name) {}

    virtual string& getName() {
        return m_name;
    }

    virtual ~ProductB() {}
};

class AbsFactory {
protected:
    AbsFactory() {}
public:
    virtual AbsProductA* createProductA(const string &name) const = 0;

    virtual AbsProductB* createProductB(const string &name) const = 0;

};

class ConcreteFactoryA : public AbsFactory {
public:
    ConcreteFactoryA() {}

    virtual AbsProductA* createProductA(const string &name) const {
        string n = name + " from concrete factoryA";
        return new ProductA(n);
    }
    virtual AbsProductB* createProductB(const string &name) const {
        string n = name + " from concrete factoryA";
        return new ProductB(n);
    }
};

class ConcreteFactoryB : public AbsFactory {
public:
    ConcreteFactoryB() {}

    virtual AbsProductA* createProductA(const string &name) const {
        string n = name + " from concrete factoryB";
        return new ProductA(n);
    }
    virtual AbsProductB* createProductB(const string &name) const {
        string n = name + " from concrete factoryB";
        return new ProductB(n);
    }
};

#endif // ABS_FACTORY_H

