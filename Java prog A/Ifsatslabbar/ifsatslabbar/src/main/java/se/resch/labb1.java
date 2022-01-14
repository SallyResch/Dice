package se.resch;

public class labb1 {
    public static labb1 uppg;

    public void largNR(){
    int tal1, tal2;
    System.out.println("Skriv in ett tal");
    tal1 = Integer.parseInt(System.console().readLine());

    System.out.println("Skriv in ett till tal");
    tal2 = Integer.parseInt(System.console().readLine());

        int largest;
        if(tal1 > tal2)
            largest = tal1;
        else
            largest = tal2;
        
    System.out.println("Det största talet av dessa är " + largest);
    /*Skapa en applikation där man matar in TVÅ int-variabler (tal1 och tal2)
    Lagra det STÖRSTA talet av dom två i en tredje variabel, largest
    Skriv ut "Det största talet av dessa är "  largest*/
    }
}
