package Day7;

public class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;

    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) ;
        countPlayers++;

    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Teams are not full, there are " + (6 - countPlayers) + "available spots");
        else {
            System.out.println("No available spots in teams");
        }
    }
}