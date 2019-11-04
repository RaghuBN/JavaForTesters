package Variables;

public class StaticVariableExample {
	public static void main(String[] args) {
        Student student =  new Student(100, "Java Student 1");
        Student student2 = new Student(101, "Developer Student 2");
        Student student3 = new Student(102, "Tester Student 3");
        Student student4 = new Student(103, "Management Student 4");

        System.out.println(" ------------ Java Student 1 -------------");
        System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
    }
}

class Student {
    private int rollNo;
    private String name;
    private static String college = "Vishweshwarai Technological University"; // static variable
    public Student(int rollNo, String name) {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", college=" + college + "]";
    }
}
