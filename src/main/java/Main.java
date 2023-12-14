import java.util.*;
import java.util.stream.Collectors;

public class Main {
    /*public static int findMaxSum(List<Integer> list){

    }*/


    private static long sumRange(int from, int to, List<Integer> arr){
        long sum = 0;
        for (int i = from; i < to; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    public static int balancedSum(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            long left = sumRange(0, i, arr);
            long right = sumRange(i+1, arr.size(), arr);
            if (left == right){
                return i;
            }
        }
        assert false;
        return -1;
    }

    public Main() {
        Collections.synchronizedList(new LinkedList<>());

    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6);
        List<Integer> list2 = Arrays.asList(1,2,3,3);
        /*List<Integer> result = list.parallelStream().sorted((o1, o2) -> o1 < o2? o1 : o2).collect(Collectors.toList());
        System.out.println(result);*/
        assert balancedSum(list) == 4;
        assert balancedSum(list2) == 2;
    }
}
