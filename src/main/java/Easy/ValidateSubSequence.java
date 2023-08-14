package Easy;

import java.util.Arrays;
import java.util.List;

public class ValidateSubSequence {

    public static void main(String[] args) {
        System.out.println(isValidSubsequence(Arrays.asList(new Integer[]{1,2,3,4,5}), Arrays.asList(new Integer[]{1,3,2,5})));
    }

    public static boolean isValidSubsequence(
            List<Integer> array, List<Integer> sequence
    ) {
        int arrayLen = array.size();
        int seqLen = sequence.size();

        if(arrayLen<seqLen)
            return false;

        int i=0;
        int j=0;

        while(i<arrayLen && j< seqLen){
            int a= array.get(i++);
            if(sequence.get(j)== a){
                j++;
            }
        }
        if(j==seqLen)
            return true;

        return false;
    }
}
