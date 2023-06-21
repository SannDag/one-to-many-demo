package com.sanndag.jpatest.logic;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-06-16T12:28:53", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Date> birthdate;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, Integer> id;
    public static volatile SingularAttribute<Student, String> lastname;

}