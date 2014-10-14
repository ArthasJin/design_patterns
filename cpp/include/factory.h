#ifndef __FACTORY_H__
#define __FACTORY_H__

#include "patterns.h"

using namespace std;

class Document {
private:
    string m_title;
public:
    Document() : m_title("default") {}

    explicit Document(const string &title) : m_title(title) {}

    Document(Document &doc) : m_title(doc.getTitle()) {

    }

    Document& operator=(Document &rhs) {
        if (this != &rhs) {
            this->setTitle(rhs.getTitle());
        }
        return *this;
    }

    const string& getTitle() {
        return m_title;
    }

    void setTitle(const string &title) {
        m_title = title;
    }

    virtual ~Document() {}
};

class Factory {
private:
    Factory() {}
public:
    static Document* createDocument() {
        return new Document();
    }
    static Document* createDocument(const string &title) {
        return new Document(title);
    }
};

#endif // FACTORY_H

