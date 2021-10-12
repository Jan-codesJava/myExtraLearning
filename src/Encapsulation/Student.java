package Encapsulation;

public class Student {  //settings of variables are inside of method

    String name;
    int age;

    public void setName(String newName){
        name = newName;

    }

    public String getName(){
        return name;
    }
       public void setAge(int newAge){
        age = newAge;
       }

    public int getAge(){
        return age;
    }
}
