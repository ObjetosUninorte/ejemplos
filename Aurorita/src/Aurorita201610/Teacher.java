package Aurorita201610;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String id;
    private ArrayList<Course> mCourses  = new ArrayList<Course>();;

    public Teacher(String id) {
        super();
        this.id = id;
    }
    
    public void addCourse(Course c){
        mCourses.add(c);
    }
}
