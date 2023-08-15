package Easy;

import java.util.Arrays;

public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int changeCanBeCreated = 0;
        for (int coin: coins){
            if(coin > changeCanBeCreated+1)
                return changeCanBeCreated+1;
            changeCanBeCreated+=coin;
        }
        return changeCanBeCreated+1;


    }


}
