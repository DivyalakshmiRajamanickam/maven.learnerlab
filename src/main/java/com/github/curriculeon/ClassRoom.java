package com.github.curriculeon;

import java.util.HashMap;
import java.util.List;

public class ClassRoom  {
    private static final ClassRoom instance = new ClassRoom();
    Students students = Students.getINSTANCE();
    Instructors instructors = Instructors.getINSTANCE();

    private ClassRoom(){

    }
    public static ClassRoom getInstance(){
        return instance;
    }


    public void hostLecture(ITeacher teacher, double numberOfHours){

        teacher.lecture(this.students.toarray(),numberOfHours);


    }
    public void hostLecture(long id,double numberOfHours){
        Instructor instructor = new Instructor(0,"");
        instructor.lecture(this.instructors.toarray(),numberOfHours);
    }
    public Double getStudyMap(){
        return student.
    }
}