package com.company;

public class CSTeacher extends Teacher {
    private String subjectName = "CS";

    public void annouceSubject(){
        System.out.println("The subject I am teaching is " + this.subjectName + "!");
    }

    public void signClassRoom(int classroom){
        System.out.println("As a cs teacher,I will be teaching in classroom "+ classroom);
    }
}
