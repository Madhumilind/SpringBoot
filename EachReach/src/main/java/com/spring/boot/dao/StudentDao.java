package com.spring.boot.dao;

import com.spring.boot.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {

            {
                put(1, new Student(1,"Ampere", "Electrical"));
                put(2, new Student(2,"Bit", "Electronics"));
                put(3, new Student(3,"Datum", "Computer Science"));
            }
        };
    }

    public Collection<Student> getAllStudents() {
        return this.students.values();
    }

    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    public void updateStudent(Student student) {
        Student stud = students.get(student.getId());
        stud.setCourse(student.getCourse());
        stud.setName(student.getName());

        students.put(student.getId(), student);
    }

    public void addStudentToDB(Student student) {
        this.students.put(student.getId(), student);
    }
}
