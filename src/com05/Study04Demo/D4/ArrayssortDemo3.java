package com05.Study04Demo.D4;

public class ArrayssortDemo3 {
    @java.io.Serial
    public static void main(String[] args) {
        //猴子吃桃
        //第十天1个 第九天 （1+1）*2=4个
        //第八天 （4+1）*2 = 10个
        //假设第三天剩余1个，推导到第一天只需要推导2次。天数-1
        int i = 10;
        int j = 1;
        System.out.println(Count(i, j));

    }
    public static int Count(int i,int j){
        //i代表天数   j代表剩余的桃子数
        //整体为参数递归的思想

        if(i==1){
            return j;
        }
        i = i -1;
        j = (j +1)*2;
        return Count(i,j);

    }
    //也可以采用数学函数递归
    //这种方法是根据前一天推断后一天，然后一直推到第十天就是1
    public static int f(int day){
        if(day == 10){
            return 1;
        }

        return (f(day + 1) + 1) * 2;
    }
}
