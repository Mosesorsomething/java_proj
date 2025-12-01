public class Student extends CollegeMembers
{
    private int studentID;
    private double GPA;
    private String status;
    Student(String firstName, String lastName, int SSN, String address, int phoneNum, String email, int studentID, double GPA, String status)
    {
        super(firstName, lastName, SSN, address, phoneNum, email);
        this.studentID = studentID;
        this.GPA = GPA;
        this.status = status;
    }
    // getters for info
    public int getStudentID()
    {
        return studentID;
    }
    public double getGPA()
    {
        return GPA;
    }
    public String getStatus()
    {
        return status;
    }
    // setters
    public void setID(int studentID)
    {
        this.studentID = studentID;
    }
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
}