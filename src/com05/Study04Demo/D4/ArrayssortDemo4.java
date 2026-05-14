package com05.Study04Demo.D4;

public class ArrayssortDemo4 {
    public static void main(String[] args) {
        //爬楼梯，一次爬一层或者两层，爬到20层有几种爬法
        //dp[i] = dp[i-1] + dp[i-2];
        //dp[0] = 1
        //dp[1] = 2
        int[] dp = new int[21];



        //在这里用到一个方法，用来计算从计算机原点到现在过去了多少毫秒
        //System.currentTimeMillis();
        //直接赋值给long Start
        //这里应该是太快了 使用毫秒级无法查看时间，所以使用纳秒
//        long StartTime1 = System.currentTimeMillis();
//        System.out.println(Count(dp, 20));
//        long EndTime1 = System.currentTimeMillis();
//        long StartTime2 = System.currentTimeMillis();
//        System.out.println(Count2(dp, 20));
//        long EndTime2 = System.currentTimeMillis();
//        System.out.println("第一种" + (EndTime1 - StartTime1));
//        System.out.println("第二种" +  (EndTime2 - StartTime2));

        long StartTime1 = System.nanoTime();
        System.out.println(Count(dp, 20));
        long EndTime1 = System.nanoTime();
        long StartTime2 = System.nanoTime();
        System.out.println(Count2(dp, 20));
        long EndTime2 = System.nanoTime();
        System.out.println("第一种" + (EndTime1 - StartTime1));
        System.out.println("第二种" +  (EndTime2 - StartTime2));
    }
    public static int Count(int[] dp,int i ){
        //但总体是一种暴力递归，不好
        //dp为传入的数组，用来记录每个台阶的方法
        //i是台阶数
        if(i==1 ){
            return 1;
        }
        if(i==2){
            return 2;
        }
        return Count(dp,i-1)+Count(dp,i-2);

    }
    public static int Count2(int[] dp,int i ){
        if(i==1){
            return 1;
        }
        if(i==2){
            return 2;
        }
        //在这里进行更改，虽然定义了dp但是并没有用到数组进行存储
        //如果数组该索引不是0，那么直接返回
        //开21个位子，不然越界
        if(dp[i] != 0){
            return dp[i];
        }
        //如果是0.先存入，再返回
        dp[i] = Count2(dp,i-1)+Count2(dp,i-2);
        return dp[i];
    }
}
