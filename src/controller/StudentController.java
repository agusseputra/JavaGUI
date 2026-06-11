/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import javaapplication_hello.Student;
import dao.StudentDAO;
import dao.StudentDAO;

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
    public int update(Student student, int id) {
        return studentDAO.update(student, id);
    }

    public int delete(int id) {
        return studentDAO.delete(id);
    }
    
    
}
