
package auroritaclase;

import java.util.ArrayList;


public class Course {
   private int mId;
   private ArrayList<Student> mStudents = new ArrayList<Student>(); 
   private Teacher mTeacher;

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
   
   
}
