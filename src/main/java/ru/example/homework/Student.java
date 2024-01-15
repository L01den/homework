package ru.example.homework;


import lombok.Data;

@Data
public class Student {
    private static int counterId;

    private int id;
    private String name;
    private String group;

    public Student(String name, String group) {
        this.name = name;
        id = counterId++;
        this.group = group;
    }


}
