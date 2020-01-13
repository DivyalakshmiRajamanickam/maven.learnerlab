package com.github.curriculeon;


final class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        //Student student = new Student();
        new Instructor(0,"instructor0");
        for(long i=0; i<5; i++){
            Instructor instructor = new Instructor(i,"instructor"+i);
            //add it to the instance
            super.add(instructor);
        }
    }
    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

}
