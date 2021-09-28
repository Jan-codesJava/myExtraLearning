package Day7;

public class Task1 {

    /*В классе самолет создать статический метод, который в качестве аргументов принимает два обьекта (два самолета)
    и выводит сообщение в консоль о том, какой из самолетов длинее
     */

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2010, 30, 40000);
        Airplane airplane2 = new Airplane("Boeing", 2010, 40, 40000);

        Airplane.compareAirplanes(airplane1,airplane2);
    }
}
