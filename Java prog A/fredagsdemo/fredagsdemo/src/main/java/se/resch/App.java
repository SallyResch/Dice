package se.resch;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void Hej ()
    {
        String namn = System.console().readLine(); //minne i RAM 100 tecken
        System.out.println("Hej" + namn);
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int i = 123; //Primitiva datatyper har inte construktor

        String namn = ""; //Klass/Objekt initieras i s.k construktorn = metod (namn = "")
        if(i == 123) {
        namn = "Kalle";
        }
        else {
        namn = "Nisse";
        }
        Hej();
        System.out.println("Hello World!" + namn);
    }
}
