package se.resch;

import static com.diogonunes.jcolor.Ansi.*;
import static com.diogonunes.jcolor.Attribute.*;


public class BankSystem {
    public void login(){
        System.out.println(colorize("Skriv in din email:",
        BLUE_TEXT()));
        String namn = System.console().readLine();
        System.out.println(colorize("Skriv in din kod:", 
        BLUE_TEXT()));
        String kod = System.console().readLine();
        //Här ska vi kunna komma namn och kod mot en databas.
        //Filer
    }
    public void visaMeny2(){
       while(true){
        System.out.println(colorize("Inloggad som:", 
        BLUE_TEXT()));
        
        System.out.println(colorize("1. Ta ut pengar", 
        BLUE_TEXT()));
        
        System.out.println(colorize("0. Tillbaka till huvudmeny", 
        BLUE_TEXT()));
       
       int sel = Integer.parseInt(System.console().readLine());
            if(sel == 3){
                break;
            }
        }
    }
    public void run (){
        //Huvudmeny i while loop
        while(true){
        System.out.println(colorize("*** HUVUDMENY ***", YELLOW_TEXT(),BLUE_BACK()));
        System.out.println("1. Login");
        System.out.println("2. Skapa konto");
        System.out.println("3. Avsluta programmet");
        System.out.print("Vad vill du göra?");
        int sel = Integer.parseInt(System.console().readLine());
            if(sel == 3){
                break;
            }
            if(sel == 1){
                login();
                visaMeny2();
            }
        }
    }
}
