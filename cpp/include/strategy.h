#ifndef __STRATEGY_H__
#define __STRATEGY_H__

#include "patterns.h"

class Strategy {
public:
    virtual int findElement() = 0;
};

class DefaultStrategy : public Strategy {
public:
    virtual int findElement() {
        return 0;
    }
};

class ConcreteStrategyA : public Strategy {
public:
    virtual int findElement() {
        return 1;
    }
};

class ConcreteStrategyB : public Strategy {
public:
    virtual int findElement() {
        return 2;
    }
};

class Context {
private:
    Strategy* m_strategy;
public:
    Context(Strategy *strategy) : m_strategy(strategy) {}
    int apply() {
        if (m_strategy) {
            return m_strategy->findElement();
        }
        return -1;
    }
};

#endif // STRATEGY_H
