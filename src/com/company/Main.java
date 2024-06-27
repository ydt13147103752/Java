package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat=new Cat();
        System.out.println(cat.name);
        Cat.name="更新";
        System.out.println(cat.name);
    }
}
