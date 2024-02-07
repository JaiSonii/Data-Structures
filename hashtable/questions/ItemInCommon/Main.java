package hashtable.questions.ItemInCommon;

import java.util.HashMap;

public class Main {

    public static boolean ItemInCommon(int[] array1, int[] array2) {
        if (array1 == null || array2 == null)
            return false;
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : array1) {
            myHashMap.put(i, true);
        }
        for (int i : array2) {
            if (myHashMap.get(i) != null)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array1 = { 2, 5, 7 };
        int[] array2 = { 3, 8, 6 };
        System.out.println(ItemInCommon(array1, array2));
    }
}
