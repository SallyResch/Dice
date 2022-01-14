package se.resch;

public class Labb3 {
/*D3 - Email validering
Be användaren mata in en mailadress. Programmet skall kontrollera att inmatningen är

rätt dvs att det finns ett @ tecken och att det finns en . med 2 eller 3 tecken efter.

Meddela användaren om det är rätt eller felaktig adress*/
    public void controll(){
        System.out.print ("Skriv in din email: ");
        String email = System.console().readLine();

        boolean isValidEmail = false; //Om emailen är falsk
        if (email.indexOf('@') != -1){
            int lastDoIndex = email.lastIndexOf('.');
            if(lastDoIndex != -1){
               int charsAfter = email.length() - lastDoIndex -1;
               if(charsAfter == 2 || charsAfter == 3){
                 isValidEmail = true;
                }
            }
            System.out.printf("%s is an %s emailadress", email,
            isValidEmail ? "valid" : "invalid"       );
        }
    }
}
