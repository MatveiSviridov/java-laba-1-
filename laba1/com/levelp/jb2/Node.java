package com.levelp.jb2;

/**
 * Class - list node
 */
public class Node {
    public int data;
    public Node next;

    /**
     * Class constructor
     * @param new_data - information in the node
     */
    public Node (int new_data)
    {
        this.data = new_data;
        this.next = null;
    }
}
