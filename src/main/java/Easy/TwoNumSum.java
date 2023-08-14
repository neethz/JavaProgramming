package Easy;

import java.util.ArrayList;
import java.util.List;

public class TwoNumSum {

    public static void main(String[] args) {
        int[] result = twoNumberSum(new int[]{1,2,4,-3,6},3);
        for(int i: result)
            System.out.println(i);
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        List<Integer> list= new ArrayList<>();
        for(int i: array){
            if(list.contains(targetSum - i)){
                return new int[]{i,targetSum-i};
            }
            list.add(i);
        }
        return new int[]{};
    }
}
