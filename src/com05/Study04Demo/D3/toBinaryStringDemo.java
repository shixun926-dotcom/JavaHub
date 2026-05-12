package com05.Study04Demo.D3;

import java.util.ArrayList;
import java.util.Scanner;

public class toBinaryStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = toBinaryString(n);
        System.out.println(s);

    }
    public static String toBinaryString(int num) {
//        ArrayList<Integer> list = new ArrayList<>();
//        //判断是否为0
//        if (num == 0) {
//        //在这里给倒序
//
//            return "0";
//        }else{
//        //将余数加入
//            list.add(num%2);
//            num=num/2;
//            return  toBinaryString(num);
//        }



        //这里有个错误的思路，就是将整体进行存入集合，再倒叙。但是递归的算法本身就具有倒序的能力
        if (num == 0) {
            return "";
        }else{
            return toBinaryString(num/2)+num%2;
        }

    }
    //将十进制转化为2进制
    //10/2=5  10%2=0
    //5/2=2  5%2=1
    //2/2=1  2%2=0
    //1/2=0  1%2=1
    //再进行倒序

}
