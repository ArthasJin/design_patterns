#include <gtest/gtest.h>
#include "patterns.h"

TEST(ConcreteFactoryA, AbsProductA) {
    AbsFactory *factory = new ConcreteFactoryA();
    AbsProductA *pa = factory->createProductA("productA");
    EXPECT_STREQ("productA from concrete factoryA", pa->getName().c_str());
    delete factory;
    delete pa;
}

TEST(ConcreteFactoryA, AbsProductB) {
    AbsFactory *factory = new ConcreteFactoryA();
    AbsProductB *pb = factory->createProductB("productB");
    EXPECT_STREQ("productB from concrete factoryA", pb->getName().c_str());
    delete factory;
    delete pb;
}

TEST(ConcreteFactoryB, AbsProductA) {
    AbsFactory *factory = new ConcreteFactoryB();
    AbsProductA *pa = factory->createProductA("productA");
    EXPECT_STREQ("productA from concrete factoryB", pa->getName().c_str());
    delete factory;
    delete pa;
}

TEST(ConcreteFactoryB, AbsProductB) {
    AbsFactory *factory = new ConcreteFactoryB();
    AbsProductB *pb = factory->createProductB("productB");
    EXPECT_STREQ("productB from concrete factoryB", pb->getName().c_str());
    delete factory;
    delete pb;
}

