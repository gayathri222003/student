import java.util.HashMap;

class stud {
    String name;
    String program;
    String department;
    HashMap<String, Integer> coursesMarks;

    public stud(String name, String program, String department) {
        this.name = name;
        this.program = program;
        this.department = department;
        this.coursesMarks = new HashMap<>();
    }

    public void addCourseMark(String course, int mark) {
        coursesMarks.put(course, mark);
    }

    public void retrieveStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Department: " + department);
        System.out.println("Courses Registered: " + coursesMarks.keySet());
        
        System.out.println("Courses with marks less than 40:");
        for (String course : coursesMarks.keySet()) {
            if (coursesMarks.get(course) < 40) {
                System.out.println(course + ": " + coursesMarks.get(course));
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        stud student = new stud("geeta", "devops", "BCA");
        student.addCourseMark("java", 65);
        student.addCourseMark("c++", 30);
        student.addCourseMark("web tech", 50);

        student.retrieveStudentInfo();
    }
}