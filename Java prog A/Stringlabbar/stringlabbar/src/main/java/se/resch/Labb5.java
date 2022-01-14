package se.resch;

public class Labb5 {
/* D5 - Plocka fram ett tecken
Be användare mata in ett ord eller en mening. 

Fråga användaren: ange en position: och mata in ett tal

Ta fram det tecken som finns i strängen på den positionen

OBS: Felkontroller...<0 eller > length ska ge felmeddelande och ny inmatning */
public void vilkenBokstav(){
    System.out.print("Skriv in ett ord: ");
    String input = System.console().readLine();

    int position = 0;
        while (true){
        System.out.print("Mata in en position: ");
        position = Integer.parseInt(System.console().readLine());

        if(position >= 0 && position < input.length())
        break; 
        }
    char ch = input.charAt(position);
    System.out.printf("Tecknet på position %d är %c ", position, ch);
    }
}
