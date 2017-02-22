package Aurorita201610;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Aurora {
    
    private HashMap<String, Course> mCourses = new HashMap<String,Course>() ;
    private HashMap<String, Student> mStudents = new HashMap<String,Student>() ;
    private HashMap<String,Teacher> mTeachers = new HashMap<String,Teacher>() ;
    
    public Aurora() {
        super();
    }
    
    public void addStudent(String id){
        Student student = new Student(id);
        mStudents.put(id,student);
    }
    
    public Student getStudent(String id){
        return mStudents.get(id);
    }
    
    public void addTeacher(String id){
        Teacher teacher = new Teacher(id);
        mTeachers.put(id,teacher);
    }
    
    public void addCourse(String courseId){
        Course course = new Course(courseId);
        mCourses.put(courseId,course);
    }
    
    public Course getCourse(String courseId){
        return mCourses.get(courseId);
    }
    
    private void addTechearToCourse(String courseId, String teacherId) {
        System.out.println("addTechearToCourse "+"  "+ courseId + "  "+teacherId);
        Teacher teacher = mTeachers.get(teacherId);
        mCourses.get(courseId).addTeacher(teacher);
    }
    
    private void addStudentToCourse(String courseId, String studentId) {
        System.out.println("addStudentToCourse "+"  "+ courseId + "  "+studentId);
        Student student = mStudents.get(studentId);
        Course c = mCourses.get(courseId);
        c.addStudent(student);
    }
    
    
    
    public static void main(String[] args) {
        Aurora aurora = new Aurora();
        Random ran = new Random();

        
        // we are going to have 21 teachers
        for (int i=0;i<=20;i++){
            aurora.addTeacher("Teacher"+i);
        }
        
        // we are going to have 201 students
        for (int i=0;i<=200;i++){
            aurora.addStudent("Student"+i);
        }        

        // we are going to have 81 courses
        for (int i=0;i<=80;i++){
            aurora.addCourse("Course"+i);
            // add a random teacher
            aurora.addTechearToCourse("Course"+i,"Teacher"+ran.nextInt(20));
            // add 30 random students to a course
            for (int j=1;j<=30;j++)
                aurora.addStudentToCourse("Course"+i,"Student"+ran.nextInt(200));
        }
        
        // how many students on a random course
        int randomNumber = ran.nextInt(80);
        System.out.println("On course "+randomNumber+" there are "+aurora.getCourse("Course"+randomNumber).getStudentNumber()+" students ");
        
        randomNumber = ran.nextInt(200);
        
        Student student = aurora.getStudent("Student"+randomNumber);
        System.out.println("Student "+randomNumber+ " has "+student.getCourseNumber()+ " the following courses");
        
        for ( Map.Entry<String, Course> entry : student.getCourses()) {
            Course course =  entry.getValue();
            System.out.println(course.getId());
        }
          
    }


}
