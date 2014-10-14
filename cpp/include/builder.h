#ifndef __BUILDER_H__
#define __BUILDER_H__

#include "patterns.h"

using namespace std;

class Product {
private:
    list<string> m_part_list;
public:
    Product() {}

    list<string>& getPartList() {
        return m_part_list;
    }

    void addPart(const string &part) {
        m_part_list.push_back(part);
    }
};

class AbsBuilder {
protected:
    Product m_product;
public:
    AbsBuilder() {}

    virtual void buildPartA() = 0;

    virtual void buildPartB() = 0;

    virtual void buildPartC() = 0;

    virtual Product& getProduct() {
        return m_product;
    }
};

class ConcreteBuilderA : public AbsBuilder {
public:
    ConcreteBuilderA() {}

    virtual void buildPartA() {
        m_product.addPart("PartA from ConcreteBuilderA");
    }

    virtual void buildPartB() {
        m_product.addPart("PartB from ConcreteBuilderA");
    }

    virtual void buildPartC() {
        m_product.addPart("PartC from ConcreteBuilderA");
    }
};

class ConcreteBuilderB : public AbsBuilder {
public:
    ConcreteBuilderB() {}

    virtual void buildPartA() {
        m_product.addPart("PartA from ConcreteBuilderB");
    }

    virtual void buildPartB() {
        m_product.addPart("PartB from ConcreteBuilderB");
    }

    virtual void buildPartC() {
        m_product.addPart("PartC from ConcreteBuilderB");
    }
};

class Director {
public:
    Director() {}

    void construct(AbsBuilder &builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
};

#endif // BUILDER_H
