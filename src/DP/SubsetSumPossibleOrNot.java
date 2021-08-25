package DP;

public class SubsetSumPossibleOrNot {

      /*

      dp array calculated as below

                  0      1       2       3       4       5       6       7       8       9       10
            x    true    false   false   false   false   false   false   false   false   false   false
            4    true    false   false   false   true    false   false   false   false   false   false
            2    true    false   true    false   true    false   true    false   false   false   false
            7    true    false   true    false   true    false   true    true    false   true    false
            1    true    true    true    true    true    true    true    true    true    true    true
            3    true    true    true    true    true    true    true    true    true    true    true
      */


    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3};
        int tar = 10;
        boolean[][] dp = new boolean[arr.length+1][tar+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j ==0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;
                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    if (dp[i-1][j] == true) {
                        dp[i][j] = true;
                    } else {
                        int val = arr[i-1];
                        if (j >= val) {
                            if (dp[i-1][j-val] == true) {
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(dp[arr.length][tar]);
    }
}
