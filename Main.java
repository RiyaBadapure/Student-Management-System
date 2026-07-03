import java.util.*;
public class Main {
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        StudentManager manager=new StudentManager();

        int choice=0;
        do { 
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. List All Students");
            System.out.println("6. Exit");
            System.out.println("enter your choice:");
            choice=sc.nextInt();

            try{
            switch (choice) {
                case 1:
                    System.out.println("enter student id:");
                    int studentId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter name:");
                    String name=sc.nextLine();
                    System.out.println("enter email:");
                    String email=sc.nextLine();
                    System.out.println("enter course:");
                    String course=sc.nextLine();
                    System.out.println("enter cgpa:");
                    double cgpa=sc.nextDouble();

                    Student student=new Student(studentId, name, email, course, cgpa);

                    manager.addStudent(student);
                    break;

                case 2:
                    System.out.println("enter student id:");
                    studentId=sc.nextInt();
                    sc.nextLine();
                    manager.viewStudent(studentId);
                    break;
                
                case 3:
                    System.out.println("enter student id");
                    studentId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter name:");
                    name=sc.nextLine();
                    System.out.println("enter email:");
                    email=sc.nextLine();
                    System.out.println("enter course:");
                    course=sc.nextLine();
                    System.out.println("enter cgpa:");
                    cgpa=sc.nextDouble();
                    manager.updateStudent(studentId, name, email, course, cgpa);
                    break;

                case 4:
                    System.out.println("enter student id:");
                    studentId=sc.nextInt();
                    sc.nextLine();
                    manager.deleteStudent(studentId);
                    break;

                case 5:
                    manager.listAllStudents();
                    break;

                case 6:
                    System.out.println("Exiting..");

                default:
                    System.out.println("Invalid choice");


            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Invalid Input !! Enter a number");
            sc.nextLine();
        }
            
        } while (choice!=6);
        sc.close();
    }
}
