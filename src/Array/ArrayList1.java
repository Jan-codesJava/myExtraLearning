 package Array;

import java.util.ArrayList;

    public class ArrayList1 {
        public static void main(String[] args) {

        /*ArrayList in Java is a data structure that can be stretched to accommodate
        additional elements within itself and shrink back to a smaller size when
        elements are removed. It is a very important data structure useful in handling
        the dynamic behavior of elements.
         */

        /*ArrayList<Object> a = new ArrayList<Object>();

        ArrayList methods:

        add(Object o);
        remove(Object o);
        int size();
        boolean contains(Object o);

        ArrayList add: This is used to add elements to the Array List.
        If an ArrayList already contains elements, the new element gets
        added after the last element unless the index is specified.Syntax:

        add(Object o);

        ArrayList remove: The specified element is removed from the list and the size
         is reduced accordingly. Alternately, you can also specify the index of the element to be removed.Syntax:
        remove(Object o);

        Java array size: This will give you the number of elements in the Array List.
         Just like arrays, here too the first element starts with index 0.Syntax:

        int size();

        ArrayList contains: This method will return true if the list contains the specified element.Syntax:

        boolean contains(Object o);


         */

                    //Creating a generic ArrayList
                    ArrayList<String> arlTest = new ArrayList<String>();
                    //Size of arrayList
                    System.out.println("Size of ArrayList at creation: " + arlTest.size());
                    //Lets add some elements to it
                    arlTest.add("D");
                    arlTest.add("U");
                    arlTest.add("K");
                    arlTest.add("E");

                    //Recheck the size after adding elements
                    System.out.println("Size of ArrayList after adding elements: " + arlTest.size());

                    //Display all contents of ArrayList
                    System.out.println("List of all elements: " + arlTest);

                    //Remove some elements from the list
                    arlTest.remove("D");
                    System.out.println("See contents after removing one element: " + arlTest);

                    //Remove element by index
                    arlTest.remove(2);
                    System.out.println("See contents after removing element by index: " + arlTest);

                    //Check size after removing elements
                    System.out.println("Size of arrayList after removing elements: " + arlTest.size());
                    System.out.println("List of all elements after removing elements: " + arlTest);

                    //Check if the list contains "K"
                    System.out.println(arlTest.contains("K"));

                }
            }



