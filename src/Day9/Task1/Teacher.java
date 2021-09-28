package Day9.Task1;

public class Teacher extends Human {
    protected String subjectName;

    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("This teacher with name " + name);
    }
}
