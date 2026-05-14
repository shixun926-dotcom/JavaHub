package com05.Study04Demo.D4;

public class ArrayssortDemo2 {
    public static void main(String[] args) {
        //兔子 动态规划（Dynamic Programming，DP）
        int[] dp = new int[12];
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(Count1(dp));
        System.out.println(Count2(12));


    }

    public static int Count1(int[] dp) {

        for (int j = 2; j < dp.length; j++) {
            dp[j] = dp[j - 1] + dp[j - 2];
        }
        return dp[dp.length - 1];
    }
    //使用递归思想；
    public static int Count2(int month) {
        if (month == 1 || month == 2) {
            return 1;
        }
        return Count2(month - 1) + Count2(month-2);
    }
}
