package HW2;

import java.util.*;
public class Appearances {
    public static <T> int sameCount(Collection<T> a, Collection<T> b) {
        Map<T, Integer> countA = new HashMap<>();
        Map<T, Integer> countB = new HashMap<>();
        for (T c : a) {
            if (countA.containsKey(c))
                countA.put(c, countA.get(c)+1);
            else
                countA.put(c, 1);
        }
        for (T c : b) {
            if (countB.containsKey(c))
                countB.put(c, countB.get(c)+1);
            else
                countB.put(c, 1);
        }
        int sameCount = 0;
        for (T c : countA.keySet()){
            if (countB.containsKey(c) && countB.get(c).equals(countA.get(c))) {
                sameCount++;
            }
        }
        return sameCount;
    }

//    public static void main(String[] args) {
//        List<String> listA = Arrays.asList("a", "b", "a", "b", "c");
//        List<String> listB = Arrays.asList("c", "a", "a", "d", "b", "b", "b");
//        int count = sameCount(listA, listB);
//        System.out.print(count);
//    }
}

