public class StudentTest{
    public static void main(String[] args){
        
        //Create student object
        Student student1 = new Student("123", "Santos", "Maria");

        System.out.println(student1);

        System.out.println();

        //Create student2 using the sett methods
        Student student2 = new Student();
        student2.setStudentNo("567");
        student2.setFirstName("Juan");
        student2.setLastName("Dela Cruz");

        System.out.println(student2);

        System.out.println();

        Student student3 = new Student("Nancy", "Davis");
        student3.setStudentNo("987");
        System.out.println(student3);

    }
}