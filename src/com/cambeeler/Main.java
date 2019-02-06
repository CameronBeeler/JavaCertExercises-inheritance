package com.cambeeler;

public class Main {

    public static void main(String[] args) {
//        iParentA test1 = new Child();
//        test1.helloWorld();
//        System.out.println("test of interface static variable count =" + test1.PI);
//        test1.goodBye();
        ParentA test2 = new Child();
        test2.helloWorld();
        test2.helloWorld();
        test2.helloWorld();
        test2.helloWorld();
        ParentA test3 = new Child("CamBeeler");
        System.out.println(test2.getObjectCount() + " Parent Objects so far.");
        Child test4 = new Child("Cam");
        System.out.println(test4.getObjectCount() + " Parent Objects so far.");
        test4.helloWorld();
        test4.helloWorld();
        test4.helloWorld();
        test4.helloWorld();

        // next inheritance series of tests

        ParentB peace = new SimpleChild();
        System.out.println(new ParentB());
        System.out.println("---------------");
        System.out.println(peace.toString());

        System.out.println("---------------");
        StringBuilder gen = new StringBuilder();
        gen.append("In");
        gen.append("The");
        gen.append("Beginning");
        System.out.println(gen);
        System.out.println(gen.reverse());
        String s = "In the Beginning";
        s = gen.toString();
        System.out.println(s + " God Created the heavens and the earth");
    }
}
