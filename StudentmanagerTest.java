import java.util.Scanner;

public class StudentmanagerTest {
    public static void main(String[] args) {
        //Student student  = new Student("tung",25);
        //System.out.println(student.toString());
        // StudentManager sm = new StudentManager();
//        System.out.println("add: "+student.toString());
        // sm.display();
//        System.out.println("name:"+student.getName());
//        System.out.println("age:"+student.getAge());
//        student.setName("tuan");
//        student.setAge(40);
//        System.out.println();
//        System.out.println(student.toString());
        StudentManager studentManager = new StudentManager();
        studentManager.display();

        Student andy = new Student("andy", 20);
        studentManager.add(andy);
        System.out.println("add: " + andy.getInformation());
        studentManager.display();

        Student bobby = new Student("bobby", 25);
        studentManager.add(bobby);
        System.out.println("add: " + bobby.getInformation());
        studentManager.display();

        Student anna = new Student("anna", 24) ;
        studentManager.add(anna);
        System.out.println("add: "+anna.getInformation());
        studentManager.display();

        Student gala = new Student("gala", 25);
        studentManager.add(gala);
        System.out.println("add: "+gala.getInformation());
        studentManager.display();

        // find student
        studentManager.find("anna");
        studentManager.find("lan");

    }
}
