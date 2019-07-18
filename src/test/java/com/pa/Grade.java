package com.pa;

public class Grade {
    String s1="A";
    String s2="B";
    String s3="C";
    String s4="D";
    String s0="该成绩不存在，请核实！";
    public String grade(int s){
        if (s < 0){
            System.out.println(s0);
            return s0;
        }else if (s>=0 && s<60) {
            System.out.println(s4);
            return s4;
        }else if (s>=60 && s<80){
            System.out.println(s3);
            return s3;
        }else if (s>=80 && s<90){
            System.out.println(s2);
            return s2;
        }else if (s>=90 && s<101){
            System.out.println(s1);
            return s1;
        }else {
            System.out.println(s0);
            return s0;
        }
    }

}
