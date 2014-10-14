#include <gtest/gtest.h>
#include "patterns.h"

TEST(Builder, ConcreteBuilderA) {
    Director director;
    ConcreteBuilderA builder;
    director.construct(builder);
    Product p = builder.getProduct();
    list<string> result = p.getPartList();
    EXPECT_STREQ(result.front().c_str(), "PartA from ConcreteBuilderA");
    result.pop_front();
    EXPECT_STREQ(result.front().c_str(), "PartB from ConcreteBuilderA");
    result.pop_front();
    EXPECT_STREQ(result.front().c_str(), "PartC from ConcreteBuilderA");
}

TEST(Builder, ConcreteBuilderB) {
    Director director;
    ConcreteBuilderB builder;
    director.construct(builder);
    Product p = builder.getProduct();
    list<string> result = p.getPartList();
    EXPECT_STREQ(result.front().c_str(), "PartA from ConcreteBuilderB");
    result.pop_front();
    EXPECT_STREQ(result.front().c_str(), "PartB from ConcreteBuilderB");
    result.pop_front();
    EXPECT_STREQ(result.front().c_str(), "PartC from ConcreteBuilderB");
}

