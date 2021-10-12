package ClassesAndObjects;

public class Robot {
    public static void main(String[] args) {

    }

    String name;
    String color;
    int weight;




    public Robot(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }


  /* Robot r1 = new Robot();
    r1.name = "Tom";
    r1.color = "red";
    r1.weight = 30;



    Robot r2 = new Robot();
    r2.name = "Jerry";
    r2.color = "blue"
    r2.weight = 40;

    r1.introduceSelf();
    r2.introduceSelf();


   */

    void introduceSelf(){
        System.out.println("My name is" + this.name);
    }
}
