class Employee { 
    String name; 
    int id; 

    Employee(String name, int id)
{ 
        this.name = name; 
        this.id = id; 
    } 
    void display()
{ 
        System.out.println("Employee Name: " + name); 
        System.out.println("Employee ID: " + id); 
    } 
void calculateSalary(int basicSalary)
{ 
System.out.println("Monthly Salary: " + basicSalary); 
} 
void calculateSalary(int basicSalary, int bonus) 
{ 
System.out.println("Monthly Salary with Bonus: " + (basicSalary + bonus)); 
} 
void calculateSalary(int basicSalary, int bonus, int allowance)
{ 
System.out.println("Total Salary: " + (basicSalary + bonus + allowance)); 
} 
} 
public class MethodOverloadingEmployee
{ 
public static void main(String[] args) 
{ 

Employee emp = new Employee("Amit", 101); 

emp.display(); 
emp.calculateSalary(30000); 
emp.calculateSalary(30000, 5000); 
emp.calculateSalary(30000, 5000, 3000); 
} 
}
