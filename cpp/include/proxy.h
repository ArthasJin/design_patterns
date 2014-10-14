#ifndef __PROXY_H__
#define __PROXY_H__

#include "patterns.h"

class Subject {
public:
    virtual int request() = 0;
    virtual ~Subject() {}
};

class RealSubject : public Subject {
public:
    RealSubject() {}

    virtual int request() {
        return 1;
    }

    ~RealSubject() {}
};

class Proxy : public Subject {
private:
    Subject* m_subject;
public:
    Proxy() {
        m_subject = new RealSubject();
    }

    virtual int request() {
        return m_subject->request();
    }

    ~Proxy() {
        delete m_subject;
    }
};

#endif // PROXY_H

