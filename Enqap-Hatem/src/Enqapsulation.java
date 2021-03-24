
public class Enqapsulation {
	

    public static void main(String[] args) {
        Student student=new Student();
        student.setName("Ali");
        student.setAge(25);
        System.out.println("Student name: "+student.getName());   
        System.out.println("Student name: "+student.getName());
        System.out.println("Student age: "+student.getAge());

    }
}    
class Student{
    private String name;
    private int age;
  
    //setter methods
    public void setName(String newName){
        name=newName;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    
    //getter methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
   


