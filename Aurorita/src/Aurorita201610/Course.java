package Aurorita201610;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Course {

    private String mId;
    private HashMap<Student,ArrayList<EvaluationGrade>> mEstNota = new HashMap();
    private HashMap<String,Student> mStudent = new HashMap<String,Student>();
    private Teacher mTeacher;


    public Course(String id) {
        super();
        mId = id;
    }
    
     public void addStudent(Student student){
        mStudent.put(student.getId(),student);
        student.addCourse(this);
    }

    public void addTeacher(Teacher teacher) {
        mTeacher = teacher;
        teacher.addCourse(this);
    }
    
    public int getStudentNumber(){
        return mStudent.size();
    }

    public String getId() {
        return mId;
    }
}
