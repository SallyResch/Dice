package se.resch;

public class Labb4 {
/*D4 - Ordräknaren
Gör ett program där användaren får mata in en mening t ex ”Detta är min text
som jag matar in”. Programmet skall räkna ut hur många ord meningen består av
och meddela användaren om detta.
OBS: detta är svårt. Vi kör happy case = vi kan förutsätta ett endaste MELLANSLAG mellan*/

    public void wordcounter(){
    System.out.print("Skriv in en mening: ");
        String input = System.console().readLine();

        String [] arrOfWords = input.split(" ");

        System.out.println("Antal ord blev: " + arrOfWords.length);
    }
}
