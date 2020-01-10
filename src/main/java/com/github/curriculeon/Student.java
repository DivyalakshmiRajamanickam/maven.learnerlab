package com.github.curriculeon;

import java.util.Objects;

public class Student extends Person implements ILearner {
    double totalStudyTime =0;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {

        totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.totalStudyTime, totalStudyTime) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalStudyTime);
    }
}
