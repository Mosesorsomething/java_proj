import java.util.ArrayList;
public class Faculty extends CollegeMembers
{
    private int facultyID;
    private String department;
    private ArrayList<String> courses;
    Faculty(String firstName, String lastName, int SSN, String address, int phoneNum, String email, int facultyID, String department, String course)
    {
        super(firstName, lastName, SSN, address, phoneNum, email);
        this.facultyID = facultyID;
        this.department = department;
        this.courses = new ArrayList<>();
        this.courses.add(course);
    }
    public String getDepartment()
    {
        return department;
    }
    public ArrayList<String> getCourses()
    {
        return courses;
    }
    public int getFacultyID()
    {
        return facultyID;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public void addCourse(String course)
    {
        courses.add(course);
    }
    public void removeCourse(String course)
    {
        if(courses.contains(course))
        {
            courses.remove(course);
        }
        else
        {
            System.out.println("Error: Course not found!");
        }
    }
    public void setFacultyID(int facultyID)
    {
        this.facultyID = facultyID;
    }
}