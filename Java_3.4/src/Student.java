import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;


    //Constructor
    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }


    //Setters
    public void setStudentId(int newId){
        this.id = newId;
    }

    public void setStudentName(String newName){
        this.name = newName;
    }

    public void setStudentAge(int newAge){
        this.age = newAge;
    }

    //Getters
    public int getStudentId(){
        return id;
    }

    public String getStudentName(){
        return name;
    }

    public int getStudentAge(){
        return age;
    }

    @Override
    public String toString(){
        return "Student[id: "+id+", name: "+name+", age: "+age+"]";
    }

}
