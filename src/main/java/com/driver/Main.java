package com.driver;


public class Main {
    public static class ClassA {
        public String meth(){
            return "Invoking method from class A";
        }
    }
    public static class ClassB extends ClassA{
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        ClassB b1 = new ClassB();
        System.out.println("Before OverRiding : "+b1.meth());
        ClassB b2 = new ClassB();
        System.out.println("After OverRiding : "+b2.meth());
    }
}