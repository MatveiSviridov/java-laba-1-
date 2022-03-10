package com.levelp.jb2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void print() {
        List list = new List();

        list.add_after_node(0,1);
        list.add_after_node(0,2);
        list.add_after_node(0,3);
        list.add_after_node(0,4);

        int actual = list.get(1);
        int expected = 4;
        assertEquals(expected, actual);

    }

    @Test
    void add_after_node() {
        List list = new List();

        list.add_after_node(0,1);
        list.add_after_node(0,2);
        list.add_after_node(0,3);
        list.add_after_node(2,50);

        int actual = list.get(3);
        int expected = 50;
        assertEquals(expected, actual);

    }

    @Test
    void delete_node() {
        List list = new List();

        list.add_after_node(0,1);
        list.add_after_node(0,2);
        list.add_after_node(0,30);
        list.add_after_node(0,4);

        int actual = list.delete_node(3);
        int expected = 30;
        assertEquals(expected, actual);

    }

    @Test
    void get() {
        List list = new List();

        list.add_after_node(0,1);
        list.add_after_node(0,2);
        list.add_after_node(0,3);
        list.add_after_node(0,4);

        int actual = list.get(1);
        int expected = 4;
        assertEquals(expected, actual);
    }
}