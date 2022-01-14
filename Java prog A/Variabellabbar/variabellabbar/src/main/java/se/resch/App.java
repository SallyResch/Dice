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
        Lab1 labben = new Lab1();
       labben.Execute();
        //Uppgift 2
       Lab2 labb2 = new Lab2();
       labb2.Run();
        //Uppgift 3
       Lab3 labb3 = new Lab3();
       labb3.Do();
        //Uppgift 4
       Lab4 labb4 = new Lab4();
       labb4.Do2();
       //Uppgift 5
       Lab5 labb5 = new Lab5();
       labb5.Do3();
       //Uppgift 6
       Lab6 labb6 = new Lab6();
       labb6.Do4();
       //Uppgift 7
       Lab7 labb7 = new Lab7();
       labb7.Do5();
    }
}
