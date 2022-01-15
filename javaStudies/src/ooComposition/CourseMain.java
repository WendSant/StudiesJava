package ooComposition;

public class CourseMain {
    public static void main(String[] args) {
        Student student1 = new Student("João");
        Student student2 = new Student("João");
        Student student3 = new Student("João");

        Course course1 = new Course("Java Web");
        Course course2 = new Course("FullStack");
        Course course3 = new Course("Django");

        course1.addedStudent(student1);
        course1.addedStudent(student2);

        course2.addedStudent(student1);
        course2.addedStudent(student3);

        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);

        for (Student student : course3.students) {
            System.out.println("My course: " + course3.name);
            System.out.println("My name: " + student.name);
        }

        System.out.println(student1.courses.get(0).students);

        Course courseEncontrado = student1.couserPerName("Java Web");

        if (courseEncontrado != null) {
            System.out.println(courseEncontrado.name);
            System.out.println(courseEncontrado.students);
        }

    }
}
