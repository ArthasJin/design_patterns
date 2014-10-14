#ifndef __BUILDER_H__
#define __BUILDER_H__

#include "patterns.h"

using namespace std;

class Product {
private:
    string m_name;
public:
    Product() {}

    string& getName() {
        return m_name;
    }
};

class AbsBuilder {
protected:
    Product m_product;
public:
    AbsBuilder() {}

    virtual void buildPart() = 0;

    virtual Product& getProduct() = 0;
};

class ConcreteBuilder : public AbsBuilder {
public:
    ConcreteBuilder() {}
};

class Director {

};

#endif // BUILDER_H
