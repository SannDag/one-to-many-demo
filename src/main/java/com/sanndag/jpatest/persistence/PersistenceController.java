
package com.sanndag.jpatest.persistence;

import com.sanndag.jpatest.logic.Career;
import com.sanndag.jpatest.persistence.exceptions.NonexistentEntityException;
import com.sanndag.jpatest.logic.Student;
import com.sanndag.jpatest.logic.Subject;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PersistenceController {
    
    StudentJpaController stJpa = new StudentJpaController();
    CareerJpaController carJpa = new CareerJpaController();
    SubjectJpaController subJpa = new SubjectJpaController();

    public void createStudent(Student student) {
        stJpa.create(student);
    }
    
    public void deleteStudent (int id){
        try{
            stJpa.destroy(id);
        } catch(NonexistentEntityException ex){
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateStudent (Student student) throws Exception{
        try{
            stJpa.edit(student);
        } catch(NonexistentEntityException ex){
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    public Student getStudent(int id) {
        return stJpa.findStudent(id);
    }

    public ArrayList<Student> getStudentsList() {
        List<Student> list = stJpa.findStudentEntities();
        ArrayList<Student> studentList = new ArrayList<Student>(list);
        return studentList;
    }
    
    
    //Career

    public void createCareer(Career car) {
        carJpa.create(car);    }

    public void deleteCareer(int id) {
        try {
            carJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateCareer(Career car) {
        try {
            carJpa.edit(car);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Career getCareer(int id) {
        return carJpa.findCareer(id);
    }

    public ArrayList<Career> getCareersList() {
        List<Career> list = carJpa.findCareerEntities();
        ArrayList<Career> careersList = new ArrayList(list);
        return careersList;
    }
    
    //Subject
    public void createSubject(Subject sub) {
        subJpa.create(sub);    }

    public void deleteSubject(int id) {
        try {
            subJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateSubject(Subject sub) {
        try {
            subJpa.edit(sub);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Subject getSubject(int id) {
        return subJpa.findSubject(id);
    }

    public LinkedList<Subject> getSubjectsList(){
        List<Subject> list = subJpa.findSubjectEntities();
        LinkedList<Subject> subjectList = new LinkedList(list);
        return subjectList;
    }
    
}
