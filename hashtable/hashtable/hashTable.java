package hashtable.hashtable;

import java.util.ArrayList;

public class hashTable {
    private int size = 7;
    private Node[] dataMap;

    public hashTable() {
        dataMap = new Node[size];
    }

    class Node {
        String key;
        int value;
        Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public void printTable() {
        System.out.println("Hash Table: ");
        for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            System.out.println(i + "-");
            while (temp != null) {
                System.out.println("   {" + temp.key + "," + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        char[] strArray = key.toCharArray();
        int hash = 0;
        for (char c : strArray) {
            int asciiValue = c;
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp != null) {
            if (temp.key == key)
                return temp.value;
            temp = temp.next;
        }
        return 0;
    }

    public ArrayList keys() {
        ArrayList<String> keyList = new ArrayList<String>();
        for (int i = 0; i < dataMap.length; i++) {
            for (Node temp = dataMap[i]; temp != null; temp = temp.next) {
                keyList.add(temp.key);
            }
        }

        return keyList;
    }
}
