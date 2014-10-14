#ifndef __SINGLETON_H__
#define __SINGLETON_H__

#include "patterns.h"

class Singleton {
private:
    static Singleton* s_instance1;
    Singleton() {}
public:
    static Singleton* getInstance1() {
        return s_instance1;
    }
    static Singleton* getInstance2() {
        static Singleton instance2;
        return &instance2;
    }
};

#endif // SINGLETON_H

