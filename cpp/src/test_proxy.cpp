#include <gtest/gtest.h>
#include "patterns.h"

TEST(Proxy, Subject) {
    Proxy p;
    EXPECT_EQ(p.request(), 1);
}

