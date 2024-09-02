cmake_minimum_required(VERSION 3.28)
project(C C)

set(CMAKE_C_STANDARD 23)

add_executable(C main.c
        AU1/au1ex1.c
        AU2/au2ex1.c
        AU3/au3ex1.c
        AU3/au3ex2.c)
