package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentDataTest {

    StudentData studentData;
//    ArrayList<StudentData> arrayList = new ArrayList<StudentData>();
    @Before
    public void setUp() {
        this.studentData = new StudentData();
    }

    @After
    public void tearDown() {
        this.studentData = null;
    }

    @Test
    public void testStudent() {
        List<StudentData> students = new ArrayList<>();
        StudentData obj1 = new StudentData(1, "A", 27);
        StudentData obj2 = new StudentData(2, "S", 23);
        StudentData obj3 = new StudentData(3, "Si", 37);
        StudentData obj4 = new StudentData(4, "A", 22);
        StudentData obj5 = new StudentData(5, "A", 29);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        Collections.sort(students,new SortStudentData());
        // After Sorting
        String expected="[Student{id=3, name='Si', age=37}, Student{id=5, name='A', age=29}, Student{id=1, name='A', age=27}, Student{id=2, name='S', age=23}, Student{id=4, name='A', age=22}]";
        assertEquals(expected, students.toString());
    }
}