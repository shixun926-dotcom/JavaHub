package com05.Study04Demo.D4;

import java.util.Arrays;

public class ArrayssortDemo1 {
    public static void main(String[] args) {
        //建立数组
        GirlFriends[] arr = {new GirlFriends("xiaoshishi",21,170),
                        new GirlFriends("xiaotiantian",18,165),
                        new GirlFriends("rourou",18,159)};
        Arrays.sort(arr,(o1, o2) ->{
            //先比较年龄
            if(o1.getAge() != o2.getAge()){
                return o1.getAge() - o2.getAge();
            }

            //年龄一样比较身高
            if(o1.getHeight() != o2.getHeight()){
                return (int)(o1.getHeight() - o2.getHeight());
            }

            //身高一样比较姓名
            //compareTo()比较两个东西大小的方法
            //"a".compareTo("b")  a 和 b 比大小
            //str1.compareTo(str2)
            //返回值类型
            //负数 str1 小于 str2
            //正数 str1 大于 str2
            //0   相等

            //字符串比较大小
            //按字符的ASCII / Unicode编码比较
            //System.out.println("Tom".compareTo("Jack"));名字排序例子，Java会：从左到右一个一个字符比较
            //前面都一样，返回更短的
            //compareTo和equals区别
            //equals
            //str1.equals(str2)
            //只看：是否完全一样
            //结果：true / false
            //compareTo
            //看的是：大小关系
            //结果：负数 / 0 / 正数
            //compareTo本质

            return o1.getName().compareTo(o2.getName());


        });
        for (GirlFriends friend : arr) {
            System.out.println(
                    friend.getName() + " "
                            + friend.getAge() + " "
                            + friend.getHeight());

        }

    }

}
