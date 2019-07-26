package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentDataTest {


//    ArrayList<StudentData> arrayList = new ArrayList<StudentData>();
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testStudent() {
        List<StudentData> students = new ArrayList<>();
        StudentData obj1 = new StudentData(1, "Aman", 24);
        StudentData obj2 = new StudentData(2, "Balraj", 23);
        StudentData obj3 = new StudentData(3, "Manish", 27);
        StudentData obj4 = new StudentData(4, "Rohan", 22);
        StudentData obj5 = new StudentData(5, "Shanu", 29);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        Collections.sort(students,new SortStudentData());
        // After Sorting
        String expected="[Student{id=3, name='Manish', age=27}, Student{id=5, name='Shanu', age=29}, Student{id=1, name='Aman', age=24}, Student{id=2, name='Balraj', age=23}, Student{id=4, name='Rohan', age=22}]";
        assertEquals(expected, students.toString());
    }
}