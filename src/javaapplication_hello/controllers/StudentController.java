/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication_hello.controllers;

import java.util.List;
import javaapplication_hello.Student;
import javaapplication_hello.dao.StudentDAO;

/**
 *
 * @author agusseputra
 */
public class StudentController {
     private StudentDAO studentDAO = new StudentDAO();

    public int create(Student student) {
        return studentDAO.create(student);
    }

    public List<Student> getStudent() {
        return studentDAO.getStudent();
    }

    
    
}
