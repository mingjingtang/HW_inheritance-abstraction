package com.company;

class Classroom implements School {
    private int classRoomNum;
    private String courseName;

    @Override
    public void signCourseClassroom(int classRoomNum, String courseName){
        this.classRoomNum = classRoomNum;
        this.courseName = courseName;
    }

    public int getClassRoomNum() {
        return classRoomNum;
    }

    public void setClassRoomNum(int classRoomNum) {
        this.classRoomNum = classRoomNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
