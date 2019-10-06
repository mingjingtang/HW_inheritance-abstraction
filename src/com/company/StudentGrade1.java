package com.company;

public class StudentGrade1 extends Student {
    private final String courseName = "Physics";

    public StudentGrade1(String name){
        super(name);
    }
    public void announceStudentGrade(){
        System.out.println("I am first grade!");
    }

    public void courseCanChoose(){
        System.out.println("The only course you can choose is "+ this.courseName + ".");
    }

}
