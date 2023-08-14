package Easy;

public class SortedSquaredArray {

    public static void main(String[] args) {

        int[] result = sortedSquaredArray(new int[]{-5,-2,0,1,3,6});
        for(int i: result)
            System.out.println(i);
    }

    public static int[] sortedSquaredArray(int[] array) {
        int start=0;
        int end= array.length-1;
        int[] result= new int[array.length];
        int counter=array.length-1;
        while(start<=end){
            if(Math.abs(array[start])> Math.abs(array[end])){
                result[counter--]= array[start]*array[start];
                start++;
            }else {
                result[counter--]= array[end]*array[end];
                end--;
            }
        }
        return result;
    }
}
