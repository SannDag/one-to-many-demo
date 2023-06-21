package com.sanndag.jpatest.logic;

import com.sanndag.jpatest.persistence.PersistenceController;
import java.util.ArrayList;
import java.util.LinkedList;

public class LogicController {
    
    PersistenceController perstController = new PersistenceController();

    //Student
    public void createStudent(Student stu){
       perstController.createStudent(stu);
    }

    public void deleteStudent(int id){
        perstController.deleteStudent(id);
    }
    
     public void updateStudent(Student stu) throws Exception{
        perstController.updateStudent(stu);
    }
     
     public Student getStudent(int id){
         return perstController.getStudent(id);
     }
     
     public ArrayList<Student> getStudentsList(){
         return perstController.getStudentsList();
     }
     
     //Career
    public void createCareer(Career car){
       perstController.createCareer(car);
    }

    public void deleteCareer(int id){
        perstController.deleteCareer(id);
    }
    
     public void updateCareer(Career car) throws Exception{
        perstController.updateCareer(car);
    }
     
     public Career getCareer(int id){
         return perstController.getCareer(id);
     }
     
     public ArrayList<Career> getCareerList(){
         return perstController.getCareersList();
     }
     
     //Subject
    public void createSubject(Subject sub){
       perstController.createSubject(sub);
    }

    public void deleteSubject(int id){
        perstController.deleteSubject(id);
    }
    
     public void updateSubject(Subject sub) throws Exception{
        perstController.updateSubject(sub);
    }
     
     public Subject getSubject(int id){
         return perstController.getSubject(id);
     }
     
     public LinkedList<Subject> getSubjectsList(){
         return perstController.getSubjectsList();
     }

 }

   