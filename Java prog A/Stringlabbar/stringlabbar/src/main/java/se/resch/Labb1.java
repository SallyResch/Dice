package se.resch;

public class Labb1 {
    public static Labb1 uppg;

    public void inMatning(){
        
        int antalInmatadeNamn = 0; //Variabel för antal inmatade namn
        
        while(true) { //Medans detta är sant gör dethär:
            System.out.print("Skriv in ditt namn: ");
            String namn = System.console().readLine();
            if(namn.equals("EXIT")) //om String variabeln är lika med EXIT bryt av.
                break;
            
            int length = namn.length(); //en integer variabel för längden på namnet
            System.out.println("Namnet " + namn + " har " + length + " tecken"); //Skriver ut detta
            antalInmatadeNamn++; 
        }
        System.out.printf("Hejdå du matade in totalt %d stycken ord\n", antalInmatadeNamn);
    }
}

/*D1 - String input
Skriv ett program som (förevigt) matar in "Skriv in ett namn:" till en strängvariabel

Du ska skriva ut hur många tecken det namnet har. Och dessutom hålla reda på hur många namn som totalt matats in



Skriver man in "EXIT" så skall programmet avslutas och du skriver ut:

Hej då. Du matade in totalt <antal> stycken ord*/

