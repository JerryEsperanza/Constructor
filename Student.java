public class Student{
    private String studentNo;
    private String lastName;
    private String firstName;

    public Student(){

    }

    //overloading of constructor
    public Student(String studentNo, String lastName, String firstName){
        this.studentNo = studentNo;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getStudentNo() {
        return studentNo;
    }
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String toString(){
        return "Student number: " + studentNo + "\n" +
               "Last name: " + lastName + "\n" +
               "First name: " + firstName;
    }


}