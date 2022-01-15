package ooComposition;

import java.util.ArrayList;
import java.util.List;

public class Course {

    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void addedStudent(Student student) {
        this.students.add(student);
        student.courses.add(this);
    }

}
