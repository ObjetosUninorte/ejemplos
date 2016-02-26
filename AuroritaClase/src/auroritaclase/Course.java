
package auroritaclase;

import java.util.ArrayList;


public class Course {
   private int mId;
   private ArrayList<Student> mStudents = new ArrayList<Student>(); 
   private Teacher mTeacher;
   private ArrayList<Grade> mGrades = new ArrayList<Grade>();

    public Course(int mId) {
        this.mId = mId;
    }

    public int getId() {
        return mId;
    }
    
    public void addStudent(Student s){
        this.mStudents.add(s);
    }
    
    public void addTeacher(Teacher mTeacher){
        this.mTeacher = mTeacher;
                
    } 
    
    public void addGradeToStudent(int studentId, float value){
        Grade grade = new Grade(value);  
        mGrades.add(studentId,grade);
    }
    
    public float findStudentGrade(int studentId){
      return mGrades.get(studentId).getValue();   
    }
   
    public float getAverage(){
        float average = 0f;
        for (Grade grade : mGrades){
            average = average + grade.getValue();
        }
        return average / mGrades.size();
    }
   
}
