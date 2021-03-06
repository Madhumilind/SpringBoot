package com.spring.boot.service;

import com.spring.boot.dao.StudentDao;
import com.spring.boot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }
    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }
    public void updateStudent(Student student) {
        this.studentDao.updateStudent(student);
    }

    public void addStudentToDB(Student student) {
        this.studentDao.addStudentToDB(student);
    }
}
