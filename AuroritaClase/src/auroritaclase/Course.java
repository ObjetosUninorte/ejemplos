
package auroritaclase;

import java.util.ArrayList;
import java.util.HashMap;


public class Course {
   private int mId;
   private ArrayList<Student> mStudents = new ArrayList<Student>(); 
   private Teacher mTeacher;
   private  HashMap<Integer, Grade> mGrades = new HashMap<Integer, Grade>(); 

    public Course(int mId) {
        this.mId = mId;
    }

    public int getId() {
        return mId;
    }
    
    public void addStudent(Student s){
        this.mStudents.add(s);
        s.addCourse(this);
    }
    
    public void addTeacher(Teacher mTeacher){
        this.mTeacher = mTeacher;
        mTeacher.addCourse(this);
                
    } 
    
    public void addGradeToStudent(int studentId, float value){
        mGrades.put(studentId,new Grade(value));
    }
    
    public float findStudentGrade(int studentId){
      return mGrades.get(studentId).getValue();   
    }
   
    public float getAverage(){
        float average = 0f;
        for (Student s : mStudents){
            average = average + mGrades.get(s.getId()).getValue();
        }
        return average / mGrades.size();
    }
   
}
