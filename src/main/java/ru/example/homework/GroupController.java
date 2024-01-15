package ru.example.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {
    private final StudentRepository studentRepository;

    public GroupController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping(value = "/{groupName}/student")
    public List<Student> getStudentByGroupe(@PathVariable String groupName){
        return studentRepository.getStudentsByGroup(groupName);
    }


}
