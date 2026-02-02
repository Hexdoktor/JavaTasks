import java.io.Serializable;

public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;


    //Constructor
    public Course(String courseCode, String courseName, String instructor){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }


    //Setters
    public void setCourseCode(String newCourseCode){
        this.courseCode = newCourseCode;
    }

    public void setCourseName(String newCourseName){
        this.courseName = newCourseName;
    }

    public void setInstructor(String newInstructor){
        this.instructor = newInstructor;
    }


    //Getters
    public String getCourseCode(){
        return courseCode;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getInstructor(){
        return instructor;
    }

    @Override
    public String toString(){
        return "Course[code: "+courseCode+", name: "+courseName+", instructor: "+instructor+"]";
    }
}
