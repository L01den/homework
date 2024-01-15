package ru.example.homework;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentRepository.getAll();
    }

    @GetMapping(value = "/{id}")
    public Student getStudent(@PathVariable int id){
        return studentRepository.getById(id);
    }

    @GetMapping("/search")
    public List<Student> getStudentByName(@RequestParam String name){
        return studentRepository.getByName(name);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepository.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        studentRepository.deleteStudent(id);
    }
}
