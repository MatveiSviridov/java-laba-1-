package com.levelp.jb2;
/**
* Class, provides container functionality
*
*/
public class List {
    /**
     * @see Node
     */
    private Node list;
/**
* Class constructor
*/

    public List ()
    {
        list = null;
    }

    /**
    * Checking for the emptiness of the container
    */

    private boolean IsEmpty()
    {
       return list == null;
    }
/**
* Adding an element after node
* @param n - the number of the node to add after
* @param data - the value of the inserted node
*/

    public void add_after_node (int n, int data)
    {
        Node p = new Node(data);
        if (n == 0)
        {
            p.next = list;
            list = p;
        }
        else {
            Node tmp = list;
            for (int i = 0; i < n - 1; i++) {
                tmp = tmp.next;
            }
            p.next = tmp.next;
            tmp.next = p;
        }
    }

    /**
     * Deleting node
     * @param n - the number of the node to delete
     */

    public int delete_node (int n)
    {
        Node tmp = list;
        int res;
        if(n==1)
        {
            res = list.data;
            list = tmp.next;
            tmp.next= null;
        }
        else {
            for (int i = 0; i < n - 2; i++) {
                tmp = tmp.next;
            }
            res = tmp.data;
            Node tmp2 = tmp.next;
            tmp.next = tmp2.next;
            tmp2.next = null;
        }

        return res;
    }

    /**
     * Extracting one element
     * @param n - the number of the node to extract
     */

    public int get (int n)
    {
        Node tmp = list;
        for (int i = 0; i < n-1; i++)
        {
            tmp = tmp.next;
        }
        //int x = tmp.data;
        return tmp.data;
    }
    /**
     * Print all nodes data in the container
     */

    public void print()
    {
        Node tmp = list;
        while(tmp != null)
        {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
