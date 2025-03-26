package org.example.model;

// https://leetcode.com/problems/design-hashmap/

public class MyHashMap {
    private static final int INIT_CAPACITY = 16;
    private static final int INCREASE_FACTOR = 2;
    private static final float LOAD_FACTOR = 0.75f;
    Node[] table;
    int size;
    int threshold; // ступінь заповненості
    int capacity; // поточний розмір

    public MyHashMap() {
    }

    public void put(int key, int value) {
        tableResize();
        Node newNode = new Node(key, value);
        putNewNode(newNode);
    }

    private void putNewNode(Node newNode) {
        int newNodeIndex = newNode.hash % capacity;

        if (table[newNodeIndex] == null) {
            table[newNodeIndex] = newNode;
        } else {
            Node lastNodeInBucket = table[newNodeIndex];

            while (lastNodeInBucket != null) {
                if (newNode.key == lastNodeInBucket.key) {
                    lastNodeInBucket.value = newNode.value;
                    return;
                }

                if (lastNodeInBucket.next == null) {
                    lastNodeInBucket.next = newNode;
                    break;
                }

                lastNodeInBucket = lastNodeInBucket.next;
            }
        }
        size++;
    }

    private void tableResize() {
        if (size < threshold && capacity != 0) {
            return;
        }

        int newCapacity = capacity == 0 ? INIT_CAPACITY : capacity * INCREASE_FACTOR;

        Node[] newTable = new Node[newCapacity];
        Node[] oldTable = table;
        table = newTable;

        capacity = newCapacity;
        threshold = (int) (newCapacity * LOAD_FACTOR);

        if (size == 0) {
            return;
        }

        int oldSize = size;
        size = 0;
        for (Node node : oldTable) {
            while (node != null) {
                put(node.key, node.value);
                node = node.next;
            }
        }

        size = oldSize;
    }

    public int get(int key) {
        if (size == 0) {
            return -1;
        }

        int keyHashKode = Math.abs(Integer.hashCode(key));
        int nodeIndex = keyHashKode % capacity;
        Node currentNode = table[nodeIndex];

        while (currentNode != null) {
            if (key == currentNode.key) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
        }

        return -1;
    }

    public void remove(int key) {
        if (size == 0) {
            return;
        }

        int keyHashCode = Math.abs(Integer.hashCode(key));
        int nodeIndex = keyHashCode % capacity;
        Node currentNode = table[nodeIndex];
        Node prevNode = null;

        while (currentNode != null) {
            if (key == currentNode.key) {
                if (prevNode == null) {
                    table[nodeIndex] = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void printMap() {
        if (size == 0) {
            System.out.println("Node is Empty");
            return;
        }

        for (Node node : table) {
            String listNodeDelimiter = "";
            if (node == null) {
                System.out.print("Node = null" + " ");
            } else {
                while (node != null) {
                    System.out.print(listNodeDelimiter + "Node = " + node.key + "/" + node.value + " ");
                    node = node.next;
                    listNodeDelimiter = "->";
                }

            }
        }
        System.out.println();
    }

    class Node {
        final int hash;
        final int key;
        int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.hash = Math.abs(Integer.hashCode(key));
        }

    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */