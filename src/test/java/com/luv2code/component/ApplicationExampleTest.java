package com.luv2code.component;

import com.luv2code.component.models.CollegeStudent;
import com.luv2code.component.models.StudentGrades;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest(classes = MvcTestingExampleApplication.class)
public class ApplicationExampleTest {
    private static int count = 0;

    @Value("${info.app.name}")
    private String appName;
    //test

    @Value("${info.app.description}")
    private String appDescription;

    @Value("${info.app.version}")
    private String appVersion;

    @Value("${info.school.name}")
    private String schoolName;

    @Autowired
    CollegeStudent student;

    @Autowired
    StudentGrades studentGrades;

    @BeforeEach
    public void beforeEach() {
        count = count + 1;
        System.out.println("Testing:" + appName + " which is " + appDescription + " Version " + appVersion + " Execution of Test Methods " + count);
        student.setFirstname("Eric");
        student.setLastname("Bob");
        student.setEmailAddress("tere@tere.com");
        studentGrades.setMathGradeResults(new ArrayList<>(Arrays.asList(100.0, 85.0, 76.50, 91.75)));
        student.setStudentGrades(studentGrades);

    }


    @Test
    void basicTest() {

    }
}
