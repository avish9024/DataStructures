package DP;

public class CoinChangePermutation {

    /*
     *  You will be given a set of coins having some number -- for ex- 3 coins having number 2,3,5
     *  Then there will be an amount for which you have to find all possible combinations for
     *  this amount by using above coins
     *  Let's say amount = 7
     *  All possible combinations will be
     *  2 + 2 + 3 = 7
     *  3 + 2 + 2 = 7
     *  2 + 3 + 2 = 7
     *  5 + 2 = 7
     *  2 + 5 = 7
     */

    public static void main(String[] args) {
        int coins[] = {2,3,5,6};
        int amount = 10;

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int currAmt = 0; currAmt < dp.length; currAmt++) {
            for (int coin: coins) {
                if (coin <= currAmt) {
                    dp[currAmt] += dp[currAmt - coin];
                }
            }
        }
        System.out.println(dp[amount]);
    }
}
