TEMPLATE = app
CONFIG += console
CONFIG -= app_bundle
CONFIG -= qt

SOURCES += src/main.cpp \

HEADERS += \
    include/patterns.h \
    include/factory.h \
    include/abs_factory.h \
    include/builder.h \
    include/prototype.h \
    include/singleton.h \
    include/adapter.h \
    include/bridge.h \
    include/composite.h \
    include/decorator.h \
    include/facade.h \
    include/flyweight.h \
    include/proxy.h \
    include/chain.h \
    include/command.h \
    include/interpreter.h \
    include/mediator.h \
    include/momento.h \
    include/observer.h \
    include/state.h \
    include/strategy.h \
    include/template.h \
    include/visitor.h
