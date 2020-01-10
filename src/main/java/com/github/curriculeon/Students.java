package com.github.curriculeon;

import java.util.List;

final class Students extends People{
    private static final Students INSTANCE = new Students();

    private Students() {
        //Student student = new Student();
        new Student(0,"student0");
        for(long i=0; i<5; i++){
            Student student = new Student(i,"student"+i);
            //add it to the instance
           super.add(student);
        }
    }
    public static Students getINSTANCE() {
        return INSTANCE;
    }

}
