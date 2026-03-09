package com.telusko;

import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("Navin");
        s1.setRollNo(101);
        s1.setsAge(30);

        Session session = null;


        System.out.println(s1);

    }
}