#include <gtest/gtest.h>
#include "patterns.h"

TEST(Document, DefaultConstructor) {
    Document* doc = Factory::createDocument();
    EXPECT_STREQ("default", doc->getTitle().c_str());
    delete doc;
}

TEST(Document, Constructor) {
    Document* doc = Factory::createDocument("document");
    EXPECT_STREQ("document", doc->getTitle().c_str());
    delete doc;
}

TEST(Document, Copy_Constructor) {
    Document doc("document");
    Document d(doc);
    EXPECT_STREQ("document", d.getTitle().c_str());
}

TEST(Document, Assign_Constructor) {
    Document doc("document");
    Document d;
    d = doc;
    EXPECT_STREQ("document", d.getTitle().c_str());
}

