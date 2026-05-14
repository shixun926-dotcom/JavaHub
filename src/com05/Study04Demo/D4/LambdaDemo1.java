package com05.Study04Demo.D4;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {
    public static void main(String[] args) {
        String[] arr1 = {"abc", "dedwef", "ghdwi", "jkls"};
        //传统
        Arrays.sort(arr1,new Comparator<String>() {
            @Override

            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(Arrays.toString(arr1));
        //lambda重写
        Arrays.sort(arr1,((o1, o2) ->  o1.length()-o2.length()));
        System.out.println(Arrays.toString(arr1));
    }

}
