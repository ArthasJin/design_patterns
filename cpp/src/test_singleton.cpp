#include <gtest/gtest.h>
#include "patterns.h"

TEST(Singleton, 1) {
    Singleton* instance1 = Singleton::getInstance1();
    Singleton* instance2 = Singleton::getInstance1();
    EXPECT_EQ(instance1, instance2);
}

TEST(Singleton, 2) {
    Singleton* instance1 = Singleton::getInstance2();
    Singleton* instance2 = Singleton::getInstance2();
    EXPECT_EQ(instance1, instance2);
}

TEST(Singleton, 1_2) {
    Singleton* instance1 = Singleton::getInstance1();
    Singleton* instance2 = Singleton::getInstance2();
    EXPECT_NE(instance1, instance2);
}

