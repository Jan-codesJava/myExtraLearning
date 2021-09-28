package Day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Tom", "H- group");
        Teacher teaxher = new Teacher("Kate", "Computer Science");

        System.out.println(student.getGroupName());
        System.out.println(teaxher.getSubjectName());

        student.printInfo();
        teaxher.printInfo();

        System.out.println(student.getName());

    }
}
