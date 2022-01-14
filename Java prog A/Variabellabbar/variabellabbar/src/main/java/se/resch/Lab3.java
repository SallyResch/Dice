package se.resch;

public class Lab3 {
    public void Do(){
    
    
    String forNamn , efterNamn; //Skapar variablerna för förnamn och efternamn
   
    //Skriv ut Skriv in ditt förnamn: . Ta emot värdet i en variabel
    System.out.println("Skriv in ditt förnamn;");
    forNamn = System.console().readLine();

    //Låt markören vänta på din inmatning på samma rad.
    
    //Gör på samma sätt med efternamnet.
    System.out.println("Skriv in ditt efternamn");
    efterNamn = System.console().readLine();//readline läser en sträng
    //Skriv sedan ut namnen i omvänd ordning.

    System.out.println("Du heter: " + efterNamn + "," + forNamn);

    }
    
}
