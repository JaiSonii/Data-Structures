package hashtable.hashtable;

public class Main {
    public static void main(String[] args) {
        hashTable myHashTable = new hashTable();
        myHashTable.set("alloy", 10);
        myHashTable.set("screws", 20);
        myHashTable.set("tires", 4);
        myHashTable.set("bonut", 10);

        myHashTable.printTable();

        System.out.println("\nGet alloy: " + myHashTable.get("alloy"));
        System.out.println("\nGet nails: " + myHashTable.get("nails"));

        System.out.println(myHashTable.keys());
    }
}
