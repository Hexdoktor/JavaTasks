import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate){
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public void setStudent(Student newStudent){
        this.student = newStudent;
    }

    public void setCourse(Course newCourse){
        this.course = newCourse;
    }

    public void setEnrollmentDate(String newEnrollmentDate){
        this.enrollmentDate = newEnrollmentDate;
    }

    public Student getStudent(){
        return student;
    }

    public Course getCourse(){
        return course;
    }

    public String getEnrollmentDate(){
        return enrollmentDate;
    }

    @Override
    public String toString(){
        return "Enrollment[student: "+student+", course: "+course+", date: "+enrollmentDate+"]";
    }
}
