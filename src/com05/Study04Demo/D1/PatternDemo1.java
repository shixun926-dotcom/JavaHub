package com05.Study04Demo.D1;

public class PatternDemo1 {
    public  static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "34132420060204055X";
        boolean r1 = method1(str1);
        boolean r2 = method2(str2);
        System.out.println(r1);
        System.out.println(r2);

    }
    String s = "xiaohsihsishud";
    String r = s.replaceAll("x","2");

    //验证用户的名字是否满足需求，大小写字母，数字，下划线_ 4-16
    public static boolean method1(String str){
        boolean b = str.matches("[a-zA-Z0-9_]{4,16}");
        return b;
    }
    //验证用户的身份证号码是否满足需求
    public static boolean method2(String str){
        boolean b = str.matches("[1-9][0-9]{16}[0-9Xx]");
        return b;
    }
}
