
package auroritaclase;

import java.util.ArrayList;


public class Teacher {
    private int mId;
    private ArrayList<Course> mCourses = new ArrayList<Course>();

    public Teacher(int mId) {
        this.mId = mId;
    }    
    
    public int getId() {
        return mId;
    }
    
    public void addCourse(Course c){
        mCourses.add(c);
    }
    
}


