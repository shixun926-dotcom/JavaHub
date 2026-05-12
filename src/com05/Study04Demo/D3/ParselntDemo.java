package com05.Study04Demo.D3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParselntDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        ParselntDemo demo = new ParselntDemo();

        //基本类型不能调用方法
        int num = demo.parselntDemo(number);
        if(num == -1){
            System.out.println("错误！请重新输入！");

        }else{
            System.out.println(num);
        }
        //在这里如果想要输入错误之后再重新输入，可以直接写入while循环
        //或者利用递归，重新创建一个方法，但是使用递归容易栈溢出


    }
    public int parselntDemo(String number) {
        int[] arr = new int[number.length()];
        if (number.length() < 1 || number.length() > 10 || number.charAt(0) == '0') {
            return -1;
        }

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            //matches()是String方法
            boolean b = String.valueOf(ch).matches("[0-9]");
            //如果满足将写入数组，反之返回报错
            if(b){
                arr[i] = Integer.parseInt(String.valueOf(ch));
            }else{
                return -1;
            }
        }
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            //数字的拼接
           result = result*10 + arr[i];
        }
        return result;
    }
}
