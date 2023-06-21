package com.sanndag.jpatest;

import com.sanndag.jpatest.logic.Career;
import com.sanndag.jpatest.logic.Student;
import com.sanndag.jpatest.logic.Subject;
import com.sanndag.jpatest.logic.LogicController;
import java.util.Date;
import java.util.LinkedList;

public class Jpatest {

    public static void main(String[] args) throws Exception {
        
        //I utilized the main class to load the students, as this is a demo app.
        
        LogicController control = new LogicController();
        
        LinkedList<Subject> subjectList = new LinkedList<Subject>();
        
        Career career = new Career(6, "Computer Science", subjectList);
        
        control.createCareer(career);
        
        Subject sub1 = new Subject(55, "Programming Fundamentals", "semester", career);
        Subject sub2 = new Subject(60, "Data Structures and Algorithms", "semester", career);
        Subject sub3 = new Subject(66, "Computer Architecture", "semester", career);
        
        control.createSubject(sub1);
        control.createSubject(sub2);
        control.createSubject(sub3);
       
        subjectList.add(sub1);
        subjectList.add(sub2);
        subjectList.add(sub3);
        
        career.setSubjectList(subjectList);
        
        control.updateCareer(career);
        
        Student st = new Student(18, "John", "Edison", new Date(), career);
        
        control.createStudent(st);
        
        System.out.println("Student info:");
        Student stu = control.getStudent(18);
        System.out.println("Full name: " + stu.getName() + " " + stu.getLastname());
        System.out.println("Career: " + stu.getCareer().getName());
     
     
    }    
}
