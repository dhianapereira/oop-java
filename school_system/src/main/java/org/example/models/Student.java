package org.example.models;

public class Student {
    private final String name;
    private final int id;
    private final SchoolReport schoolReport;

    public Student(int id, String name, SchoolReport schoolReport) {
        this.id = id;
        this.name = name;
        this.schoolReport = schoolReport;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public SchoolReport getSchoolReport (){
        return schoolReport;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", id=" + getId() +
                ", reportCard=" + getSchoolReport() +
                '}';
    }
}
