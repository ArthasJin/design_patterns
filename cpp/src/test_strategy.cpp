#include <gtest/gtest.h>
#include "patterns.h"

TEST(Strategy, DefaultStrategy) {
    Strategy* s = new DefaultStrategy();
    Context c(s);
    EXPECT_EQ(c.apply(), 0);
    delete s;
}

TEST(Strategy, ConcreteStrategyA) {
    Strategy* s = new ConcreteStrategyA();
    Context c(s);
    EXPECT_EQ(c.apply(), 1);
    delete s;
}

TEST(Strategy, ConcreteStrategyB) {
    Strategy* s = new ConcreteStrategyB();
    Context c(s);
    EXPECT_EQ(c.apply(), 2);
    delete s;
}

