#include <gtest/gtest.h>
#include "patterns.h"

TEST(Template, 1) {
    AbsClass* t = new ConcreteClass1();
    string res = t->method();
    EXPECT_STREQ("op1 from ConcreteClass1 op2 from ConcreteClass1", res.c_str());
}

TEST(Template, 2) {
    AbsClass* t = new ConcreteClass2();
    string res = t->method();
    EXPECT_STREQ("op1 from ConcreteClass2 op2 from ConcreteClass2", res.c_str());
}

