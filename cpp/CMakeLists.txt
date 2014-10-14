cmake_minimum_required(VERSION 2.8)

project(pattern)

find_package(GTest REQUIRED)
include_directories(${GTEST_INCLUDE_DIRS})

## include
set(pattern-include
    include
)

## src
set(pattern-src
    src/main.cpp
    src/singleton.cpp
    src/test_factory.cpp
    src/test_abs_factory.cpp
    src/test_builder.cpp
    src/test_singleton.cpp
)

## cflags
    set(cflags
        --std=c++11
        -pedantic
        -Wall
        -Wextra
        -Wno-unused-parameter
        -D_FILE_OFFSET_BITS=64
        -D_GNU_SOURCE
        -D_LARGEFILE_SOURCE
    )

# build ------------------------------------------------------------------------

include_directories(
    ${pattern-include}
)

add_executable(pattern
    ${pattern-src}
)

target_link_libraries(pattern
    ${GTEST_LIBRARIES}
    pthread
)

#set_target_properties(pattern PROPERTIES
#    COMPILE_FLAGS "${cflags}"
#)

