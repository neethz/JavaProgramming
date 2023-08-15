package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {



    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
       String max="";
        Map<String,Integer> scores= new HashMap<>();
       for(int i=0;i<competitions.size();i++){
           String winner;
           if(results.get(i)==1)
               winner=competitions.get(i).get(0);
           else
               winner=competitions.get(i).get(1);
           if(!scores.containsKey(winner)){
               scores.put(winner,3);
           }else
               scores.put(winner,scores.get(winner)+3);

           if(!max.equalsIgnoreCase("")){
               if(scores.get(max)< scores.get(winner))
                   max=winner;
           }else
               max=winner;
       }
       return max;
    }
}
