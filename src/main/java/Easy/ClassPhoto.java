package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassPhoto {

    public static void main(String args[]){
        ArrayList<Integer> redShirtHeights= new ArrayList<>(Arrays.asList(6,9,2,4,5));
        ArrayList<Integer> blueShirtHeights = new ArrayList<>(Arrays.asList(9,18,3,5,6));
        System.out.println("Arrangement possible ? "+classPhotos(redShirtHeights,blueShirtHeights));
    }

    public static boolean classPhotos(ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {

        Collections.sort(redShirtHeights);
        Collections.sort(blueShirtHeights);
//        int diff= redShirtHeights.get(0)- blueShirtHeights.get(0);
//        System.out.println("Diff is "+diff);
        for(int i=0;i<redShirtHeights.size();i++){
            System.out.println(redShirtHeights.get(i) +" "+blueShirtHeights.get(i));
            if((blueShirtHeights.get(i) - redShirtHeights.get(i))<=0)
                return false;
        }
        return true;
    }
}