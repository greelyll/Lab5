//Luke Greely 002
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    String = setName;
    double = setGPA;
    String = setMajor;
   
    Student student1 = new Student();
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    Student student2 = new Student();
    student2.setName("Luke Greely");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");

    ArrayList<String> gpas = new ArrayList<String>();
    gpas.get(student1.setGPA);
    gpas.get(student2.setGPA);

    double averageGPA = new averageGPA();
    for (double x=4.0; x<=averageGPA; x++) {
    student1.setGPA = student2.setGPA + x;
} 
    System.out.println("The average GPA is:" + averageGPA);

    

// or can do this with the dot operator
    //student1.name = "Arnold Spielberg";
    //student1.gpa = 4.0;
    //student1.major = "Electrical Engineering";
  
     print( "student1's name is " + student1.setName() + " and their GPA is " + student1.setGPA() + " and their major is " + student1.setMajor());
    
 print("student2's name is " + 
 student2.setName() + " and their GPA is " + 
 student2.setGPA() + " and their major is " + student2.setMajor());
// or can do this with the dot operator
    //System.out.println("student1's name is " + student1.name + " and their GPA is " + student1.gpa + " and their major is " + student1.major);
  }
}