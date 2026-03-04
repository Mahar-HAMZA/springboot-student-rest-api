package com.example.firstProject;

public class Student {
    private String name;
    private int age;
    private char grade;

    public Student() {}

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGrade(){
        return grade;
    }
}
