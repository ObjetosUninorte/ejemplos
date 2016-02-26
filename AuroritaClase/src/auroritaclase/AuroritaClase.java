package auroritaclase;

import java.util.ArrayList;
import java.util.Random;


public class AuroritaClase {
    private ArrayList<Student> mStudents = new ArrayList<Student>(); 
    private ArrayList<Teacher> mTeachers = new ArrayList<Teacher>();
    private ArrayList<Course> mCourses = new ArrayList<Course>(); 
    
    public void getTeachearsLowScore(){
        int number;
        for (Teacher teacher : mTeachers){
            number = teacher.getLowAverageCourses();
            if ( number > 0){
                System.out.println("Teacher "+teacher.getId() + " has "+number);
            }
        }
    }

    public static void main(String[] args) {
        AuroritaClase aurora = new AuroritaClase();
        for (int i = 0; i < 200; i++) {
            aurora.mStudents.add(new Student(i));
        }
        for (int i = 0; i < 100; i++) {
            aurora.mCourses.add(new Course(i+200));
        }
        for (int i = 0; i < 30; i++) {
            aurora.mTeachers.add(new Teacher(i+300));
        }
        
        Random rnd = new Random();
        for (Course course : aurora.mCourses) {
            int r = rnd.nextInt(30) + 300;
            Teacher teacher = null;
            for (int i = 0; i < aurora.mTeachers.size(); i++) {
                if (aurora.mTeachers.get(i).getId() == r) {
                    teacher = aurora.mTeachers.get(i);
                    break;
                }
            }
            course.addTeacher(teacher);
            teacher.addCourse(course);
            for (int j = 0; j < 30; j++) {
                r = rnd.nextInt(200);
                Student s = null;
                for (int i = 0; i < aurora.mStudents.size(); i++) {
                    if (aurora.mStudents.get(i).getId() == r) {
                        s = aurora.mStudents.get(i);
                        break;
                    }
                }
                System.out.println(s.getId());
                course.addStudent(s);
                s.addCourse(course);
            }
        }
        
    }
}
