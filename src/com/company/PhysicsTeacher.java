package com.company;

public class PhysicsTeacher extends Teacher {
    private String subjectName = "Physics";

    public void annouceSubject(){
        System.out.println("The subject I am teaching is " + this.subjectName + "!");
    }

    public void signClassRoom(int classroom){
        System.out.println("As a physics teacher,I will be teaching in classroom "+ classroom);
    }
}
