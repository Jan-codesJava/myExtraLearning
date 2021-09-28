package String;

/*
Strings in java are just characters grouped together than you can use for printing, storing and manipulating.
You can convert them to uppercase, lowercase or even get just a piece of the string by using these built in methods.
 I teach you how to lowercase in java and how to uppercase in java amongst a few other useful string methods.
 */
public class StringMethod {
    public static void main(String[] args) {

        String name = "Billy Bob Joe";

        System.out.println("Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Length : " +name.length());
        System.out.println("Last char: " + name.charAt(12));
        System.out.println("Substring: " + name.substring(10, 13));
    }
}
