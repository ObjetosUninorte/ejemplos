package Aurorita201610;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String mId;
    private HashMap<String,Course> mCourses = new HashMap<String,Course>();;
    

    public Student(String id) {
        super();
        mId = id;
    }
    
    public String getId(){
        return mId;
    }
    
    
    public void addCourse(Course c){
        mCourses.put(c.getId(),c);
    }
    
    public int getCourseNumber(){
        return mCourses.size();
    }
    
    public Set<Map.Entry<String, Course>> getCourses(){
        return mCourses.entrySet();
    }
}
