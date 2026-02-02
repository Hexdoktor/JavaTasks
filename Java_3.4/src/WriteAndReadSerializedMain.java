import java.io.*;

public class WriteAndReadSerializedMain {
    private final static String FILENAME = "enrollments.ser";
    public static void main(String[] args){
        Student student = new Student(1,"Juuso Savinainen", 31);
        Course course = new Course("a1", "Object-Oriented Programming", "Jarkko Vuori");
        Enrollment enrollment = new Enrollment(student,course,"02.02.2026");

        try(FileOutputStream outputStream = new FileOutputStream(FILENAME);
            ObjectOutputStream objects = new ObjectOutputStream(outputStream)){
            objects.writeObject(student);
            objects.writeObject(course);
            objects.writeObject(enrollment);
        }catch(IOException e){
            System.out.println("Writing enrollment: " + e.getMessage());
        }

        try(FileInputStream inputStream = new FileInputStream(FILENAME);
            ObjectInputStream objects = new ObjectInputStream(inputStream))
        {
         student = (Student) objects.readObject();
         course = (Course) objects.readObject();
         enrollment = (Enrollment) objects.readObject();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Reading enrollment: " + e.getMessage());
        }

        System.out.println(student.toString());
        System.out.println(course.toString());
        System.out.println(enrollment.toString());
    }
}

