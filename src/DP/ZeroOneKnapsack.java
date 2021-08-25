package DP;

public class ZeroOneKnapsack {

    /*
     *  You will be given a set of weight-value pair and a bag of certain weight
     *  You have to maximum the value of bag using given weight-value pair such that bag is fully used
     *  set = [[2,15], [5,14], [1,10], [3,45], [4,30]]
     *  bag weight = 7
     *  So max value will be using 3 and 4 whose values are 45 an 30 which sums up to 75

     SAME APPROACH BUT WE HAVE TO BACKTRACK FOR GETTING THE SUBSETS
     DP ARRAY CALCULATED AS BELOW

                  0      1       2       3       4       5       6       7
           x      0      0       0       0       0       0       0       0
         2-15     0      0       15      15      15      15      15      15
         5-14     0      0       15      15      15      15      15      29
         1-10     0      10      15      25      25      25      25      29
         3-45     0      10      15      45      55      60      70      70
         4-30     0      10      15      45      55      60      70      75
      */

    public static void main(String[] args) {
        int weights[] = {2,5,1,3,4};
        int values[] = {15,14,10,45,30};
        int bag = 7;

        int[][] dp = new int[weights.length + 1][bag + 1];
        for (int i = 1 ; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= weights[i-1]) {
                    int res = j - weights[i-1];
                    if (dp[i-1][res] + values[i-1] > dp[i-1][j]) {
                        dp[i][j] = (dp[i-1][res] + values[i-1]);
                    } else {
                        dp[i][j] = dp[i-1][j];
                    }
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[weights.length][bag]);
    }
}
