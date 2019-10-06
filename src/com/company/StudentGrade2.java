package com.company;

public class StudentGrade2 extends Student{
    private final String courseName = "computer science";

    public StudentGrade2(String name){
        super(name);
    }
    public void announceStudentGrade(){
        System.out.println("I am second grade!");
    }
    public void courseCanChoose(){
        System.out.println("The only course you can choose is "+ this.courseName + ".");
    }
}
