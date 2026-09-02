import java.util.Scanner; 
class Student { 
    // Fields (data members) 
    String name; 
    int rollNo; 
    int marks; 
// Method To Display Student details 
void display() 
{ 
     System.out.println("Student Name:" + name); 
     System.out.println("Roll Number:" + rollNo); 
     System.out.println("Marks:" + marks); 
} 
// Method To Check Result 
void checkResult() 
  { 
     if (marks >= 40) 
     { 
           System.out.println("Result : Pass "); 
     } 
     else 
    { 
         System.out.println("Result : Fail"); 
     } 
  } 
} 
 
public class ClassObjectExample { 
        public static void main(String[] args) 
           { 
            Scanner sc = new Scanner(System.in); 
     // Creating Object 
    Student s1 = new Student(); 
    // Assigning Values To Fields 
    System.out.print("Enter Student Name: "); 
s1.name = sc.nextLine(); 
System.out.print("Enter Roll Number: "); 
s1.rollNo = sc.nextInt(); 
System.out.print("Enter Marks: "); 
s1.marks = sc.nextInt(); 
// Calling Methods Using Object 
s1.display(); 
s1.checkResult(); 
sc.close(); 
} 
}
