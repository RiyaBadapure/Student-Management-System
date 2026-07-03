public class Student
{
    private int studentId;
    private String name;
    private String email;
    private String course;
    private double cgpa;

    public Student(int studentId,String name,String email,String course,double cgpa)
    {
        this.studentId=studentId;
        this.name=name;
        this.email=email;
        this.course=course;
        this.cgpa=cgpa;

    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getCourse()
    {
        return course;
    }

    public void setCourse(String course)
    {
        this.course=course;
    }

    public double getCgpa()
    {
        return cgpa;
    }

    public void setCgpa(double cgpa)
    {
        this.cgpa=cgpa;
    }

    @Override
    public String toString()
    {
        return "StudentId:"+studentId+
                "\nName:"+name+
                "\nEmail:"+email+
                "\nCourse:"+course+
                "\nCgpa:"+cgpa;
    }
}