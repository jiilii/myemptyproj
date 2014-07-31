package com.hyweb;

/**
 * Created by Administrator on 2014/7/31.
 */
public class Java8Test {
    public static void main(String[] args) {
        Add a = (x, y) -> x + y;
        System.out.println(a.add(120, 50));
        System.out.println("----------------------------------");
    }
}

interface Add{
    public int add(int x,int y);

    public static void interfaceStaticMethod(){
        System.out.println("interface static method");
    }

    public default void defaultMethod(){
        System.out.println("default method");
    }

}