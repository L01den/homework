package ru.example.homework;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class StudentRepository {

    private final List<Student> students;

    public StudentRepository() {
        this.students = new ArrayList<>();
        students.add(new Student("Vlad", "Manager"));
        students.add(new Student("Oleg", "Manager"));
        students.add(new Student("Olesia", "Manager"));
        students.add(new Student("Vlad", "Proger_Java"));
        students.add(new Student("Dasha", "Proger_Java"));
        students.add(new Student("Igor", "Proger_Java"));
        students.add(new Student("Natasha", "Tester"));
        students.add(new Student("Vladimir", "Tester"));
        students.add(new Student("Olesia", "Tester"));
        students.add(new Student("Ray", "Designer"));
        students.add(new Student("Oleg", "Designer"));
        students.add(new Student("Vlad", "Designer"));
        students.add(new Student("Nastia", "Proger_C1"));
        students.add(new Student("Natasha", "Proger_C1"));
        students.add(new Student("Oleg", "Proger_C1"));
    }

    public List<Student> getAll() {
        return List.copyOf(students);
    }

    public List<Student> getByName(String name) {
        return students.stream()
                .filter(it -> Objects.equals(it.getName(), name))
                .toList();
    }

    public Student getById(int id) {
        return students.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getStudentsByGroup(String group){
        return students.stream()
                .filter(it -> Objects.equals(it.getGroup(), group))
                .toList();
    }

    public Student addStudent(Student student){
        students.add(student);
        return student;
    }

    public void deleteStudent(int id){
        students.remove(id);
    }


}
