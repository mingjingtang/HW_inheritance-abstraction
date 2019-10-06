package com.company;

public class Main {

    public static void main(String[] args) {
        //Classroom is extends interface school, sign a course with classroom and then resign a different classroom.
        System.out.println("School have total number of "+ School.totalClassRoom + " classroom.");
        System.out.println();

        Classroom classroom1 = new Classroom();
        classroom1.signCourseClassroom(100, "Physics1");
        System.out.println("Classroom1 is signed!");

        System.out.println(classroom1.getCourseName() + " is teaching in " + classroom1.getClassRoomNum());
        classroom1.setClassRoomNum(101);
        System.out.println(classroom1.getCourseName() + " changed into classroom " + classroom1.getClassRoomNum());
        System.out.println();

        Classroom classroom2 = new Classroom();
        classroom2.signCourseClassroom(100, "Computer Science");
        System.out.println("Classroom2 is signed!");
        System.out.println(classroom2.getCourseName() + " will be teaching in " + classroom2.getClassRoomNum());
        System.out.println();




        //use abstract class teacher to declear different kinds of teacher, then sigh them to different classroom.
        Teacher physicsTeacher = new PhysicsTeacher();
        physicsTeacher.annouceSubject();
        Teacher csTeacher = new CSTeacher();
        csTeacher.annouceSubject();

        physicsTeacher.signClassRoom(101);
        csTeacher.signClassRoom(100);
        System.out.println();




        //student with subclass studentGrade1, studentGrade2, studentGrade3 examples.
        Student student1 = new Student("John");
        student1.getName();
        student1.choiceCourse();
        StudentGrade1 studentGrade1 = new StudentGrade1("John");
        student1 = studentGrade1;
        ((StudentGrade1) student1).announceStudentGrade();
        ((StudentGrade1) student1).courseCanChoose();

        StudentGrade2 studentGrade2 = new StudentGrade2("John");
        student1 = studentGrade2;
        ((StudentGrade2) student1).announceStudentGrade();
        ((StudentGrade2) student1).courseCanChoose();

        StudentGrade3 studentGrade3 = new StudentGrade3("John");
        student1 = studentGrade3;
        ((StudentGrade3) student1).announceStudentGrade();
        ((StudentGrade3) student1).courseCanChoose();
    }
}
