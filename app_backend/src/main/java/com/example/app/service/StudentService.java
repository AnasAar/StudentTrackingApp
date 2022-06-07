package com.example.app.service;


import com.example.app.entity.Classe;
import com.example.app.entity.Student;
import com.example.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentrepo;
    @Autowired ClassService classService;

    public List<Student> getStudents(){
        return studentrepo.findAll();
    }

    public Student save(Student student) {
        studentrepo.save(student);
        return student;
    }

    public Student setClasse(int idclasse, int idstudent) {
        Student student=studentrepo.findById(Long.valueOf(idstudent)).get();
        Classe classe=classService.findById(Long.valueOf(idclasse));
        if(student==null) return null;
        else if(classe==null) return null;
        else{
            student.setClasse(classe);
            studentrepo.save(student);
        }
        return student;
    }

    public Student getById(Long id){
        return studentrepo.findById(id).get();
    }
}
