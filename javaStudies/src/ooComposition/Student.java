package ooComposition;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    List<Course> courses = new ArrayList<>();

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }
}
