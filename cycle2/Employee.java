import java.util.Scanner;
public class Employee{
int eNo;
String eName;
double eSalary;
public void getdetails(){
System.out.println("\nEnter the Employee details");
Scanner sc=new Scanner(System.in);
System.out.println("Employee number:");
eNo=sc.nextInt();
eName=sc.nextLine();
System.out.println("Salary:");
eSalary=sc.nextDouble();
}
void display(){
System.out.println("Employee No:"+eNo);
System.out.println("Name:"+eName);
System.out.println("Salary Amount"+eSalary+"\n");
}
public static void main(String[] args){
System.out.println("TESMOL SHAJI\n56\n26-03-2024\nprgm9:Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ information and Search for an employee given eNo, using the concept of Array of objects.");
System.out.println("\nEnter the no of employees");
Scanner sc1 = new Scanner(System.in);
int num = sc1.nextInt();
Employee arr[]=new Employee[num];
for(int i =0;i<num;i++){
arr[i]=new Employee();
arr[i].getdetails();
}
System.out.println("\nInformations of all the employee's");
for(int i=0;i<num;i++){
arr[i].display();
}
boolean state = false;
System.out.println("\nEnter the Employee Number to get details of a employee");
int num2= sc1.nextInt();
for(int i=0;i<num;i++){
if(arr[i].eNo==num2){
System.out.println("\nEmployee details");
arr[i].display();
}
}
}
}
