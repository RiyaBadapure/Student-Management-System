import java.util.HashMap;

public class StudentManager {
    
    private HashMap<Integer,Student> students = new HashMap<>();

    public void addStudent(Student student)
    {
        if(students.containsKey(student.getStudentId()))
        {
            System.out.println("Student already exists");
        }
        else 
        {
            students.put(student.getStudentId(), student);
            System.out.println("student added successfully");
        }
    }

    public void viewStudent(int studentId)
    {
        if(students.containsKey(studentId))
        {
            System.out.println(students.get(studentId));
        }
        else 
        {
            System.out.println("Student with "+studentId+" not found");
        }
    }

    public void updateStudent(int studentId,String name,String email,String course,double cgpa)
    {
        if(students.containsKey(studentId))
        {
            Student student=students.get(studentId);
            student.setName(name);
            student.setEmail(email);
            student.setCourse(course);
            student.setCgpa(cgpa);
            System.out.println("Student updated successfully");
        }
        else 
        {
            System.out.println("Student with "+studentId+" not found");
        }
    }

    public void deleteStudent(int studentId)
    {
        if(students.containsKey(studentId))
        {
            students.remove(studentId);
            System.out.println("Student deleted successfully");
        }
        else 
        {
            System.out.println("Student with "+studentId+" not found");
        }
    }

    public void listAllStudents()
    {
        if(students.isEmpty())
        {
            System.out.println("No student found");
        }
        else 
        {
            for(Student s:students.values())
            {
                System.out.println(s);
            }
        }
    }

}
