package com.company;

abstract class Teacher {
    private String subject ;

    public Teacher(){

    }

//    public Teacher(String subject){
//        this.subject = subject;
//    }

    public abstract void annouceSubject();
    public abstract void signClassRoom(int classroom);
}
