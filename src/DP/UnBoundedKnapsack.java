package DP;

public class UnBoundedKnapsack {

     /*
     *  You will be given a set of weight-value pair and a bag of certain weight
     *  You have to maximum the value of bag using given weight-value pair such that bag is fully used
     *  set = [[2,15], [5,14], [1,10], [3,45], [4,30]]
     *  bag weight = 7
     *  in Unbounded knapsack you can use same weight-value pairs multiple times
     *
     * 3-45 + 3-45 + 1-10 = 7-100
     */

    public static void main(String[] args) {
        int weights[] = {2,5,1,3,4};
        int values[] = {15,14,10,45,30};
        int capacity = 7;
        int dp[] = new int[capacity + 1];
        dp[0] = 0;
        for (int currCap = 1; currCap < dp.length; currCap++) {
            int max = 0;
            for (int j = 0; j < weights.length; j++) {
                if (weights[j] <= currCap) {
                    int rBagC = currCap - weights[j];
                    int rBagV = dp[rBagC];
                    int tBagV = rBagV + values[j];
                    if (tBagV > max) {
                        max = tBagV;
                    }
                }
            }
            dp[currCap] = max;
        }

        System.out.println(dp[capacity]);
    }

}
