package Stack;

import java.util.Stack;
public class StacksRFun {  //stack of video games example

    public static void main(String[] args) {

        Stack<String> games = new Stack<String>();

        games.add("Call of Duty");
        games.add("Guitar Hero");
        games.add("Super Monkey Ball");

        System.out.println(games.pop()); //top


        System.out.println(games.peek());
        System.out.println(games);


        System.out.println("=========================");

        //Y
        //B
        //R

        Stack<Character> tower = new Stack<Character>();

        tower.add('R');
        tower.add('B');
        tower.add('Y');

        System.out.println(tower.get(0));

        System.out.println(tower.set(1, 'P'));  //replacing
        System.out.println(tower);

        System.out.println(tower.size());
    }
}
