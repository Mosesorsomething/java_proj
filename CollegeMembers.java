public class CollegeMembers
{
    private String firstName;
    private String lastName;
    private int SSN;
    private String address;
    private int phoneNum;
    private String email;
    CollegeMembers(String firstName, String lastName, int SSN, String address, int phoneNum, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getSSN()
    {
        return SSN;
    }
    public String getAddress()
    {
        return address;
    }
    public int getPhoneNum()
    {
        return phoneNum;
    }
    public String getEmail()
    {
        return email;
    }
    // setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    //SetSSN() is excluded.
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setPhoneNum(int phoneNum)
    {
        this.phoneNum = phoneNum;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
}
