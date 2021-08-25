package DP;

public class CoinChangeCombination {

    /*
    *  You will be given a set of coins having some number -- for ex- 3 coins having number 2,3,5
    *  Then there will be an amount for which you have to find all possible combinations for
    *  this amount by using above coins
    *  Let's say amount = 7
    *  All possible combinations will be
    *  2 + 2 + 3 = 7
    *  2 + 5 = 7
    */

    public static void main(String[] args) {
        int coins[] = {2,3,5};
        int amount = 7;
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        System.out.println(dp[7]);
    }

}
