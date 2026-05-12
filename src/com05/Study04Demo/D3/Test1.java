package com05.Study04Demo.D3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String number =  input.nextLine();
        while(list.size()<200){
            list.add(Integer.parseInt(number));
        }
    }
}
