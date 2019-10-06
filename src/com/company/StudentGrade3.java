package com.company;

public class StudentGrade3 extends Student{
    private final String courseName0 = "Physics";
    private final String courseName1 = "computer science";


    public StudentGrade3(String name){
        super(name);
    }
    public void announceStudentGrade(){
        System.out.println("I am third grade!");
    }
    public void courseCanChoose(){
        System.out.println("The course you can choose are "+ this.courseName0 + " and " + this.courseName1 +  ".");
    }
}
