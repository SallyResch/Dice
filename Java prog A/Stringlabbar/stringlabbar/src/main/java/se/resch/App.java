package se.resch;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //Uppgift 1
        Labb1 uppg1 = new Labb1();
        uppg1.inMatning();

        //Uppgift 2
        Labb2 uppg2 = new Labb2();
        uppg2.replace();

        //Uppgift 3
        Labb3 uppg3 = new Labb3();
        uppg3.controll();

        //Uppgift 4
        Labb4 uppg4 = new Labb4();
        uppg4.wordcounter();

        //Uppgift 5
        Labb5 uppg5 = new Labb5();
        uppg5.vilkenBokstav();

        //Uppgift 6
        Labb6 uppg6 = new Labb6();
        uppg6.initialer();
    }
}
