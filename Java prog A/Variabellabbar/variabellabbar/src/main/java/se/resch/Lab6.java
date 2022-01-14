package se.resch;

public class Lab6 {
    public void Do4(){
    //DENNA GÅNG MED FLYTTAL (FLOAT)
    //Skriv in Mata in tal 1:
    System.out.println("Skriv ett tal:");
    //Ta emot detta tal i en variabel
    float tal1 = Float.parseFloat(System.console().readLine());

    //Skriv in Mata in tal 2:
    System.out.println("Skriv in ett annat tal:");
    //Ta emot värdet på detta tal
    float tal2 = Float.parseFloat(System.console().readLine());

    //Nu ska ni göra massa beräkningar på dessa tal. OBS: lägg resultat i en variabel innan ni skriver ut
    //resultat = tal1 * tal2
    
    //räkna tal1 upphöjd till tal 2 (tips Math.Pow) och skriv ut 
    float result1 = (float) Math.pow(tal1,tal2);
    System.out.printf("%f upphöjt till %f är %f\n",
    tal1,
    tal2,
    result1);

    //räkna tal1 gånger tal 2 och skriv ut
    float result2 = tal1 * tal2;
    System.out.printf("%f gånger %f är %f\n",
    tal1,
    tal2,
    result2);

    //räkna tal1 delat med tal 2 och skriv ut    (OBS! Testa med 12 och 5, ) Vad blir resultatet?  Och HUR kan du göra om du vill ha 2.40000  (decimaltal som svar) 
    float result3 = tal1 / tal2;
    System.out.printf("%f delat med %f är %f\n",
    tal1,
    tal2,
    result3);

    //räkna tal1 plus tal 2 och skriv ut
    float result4 = tal1 + tal2;
    System.out.printf("%f plus %f är %f\n",
    tal1,
    tal2,
    result4);

    //räkna tal1 minus tal 2 och skriv ut
    float result5 = tal1 - tal2;
    System.out.printf("%f minus %f är %f\n",
    tal1,
    tal2,
    result5);

    //räkna tal1  heltalsdividerat   tal 2 och skriv ut
    float result6 = tal1 / tal2;
    System.out.printf("%f / %f är %f\n",
    tal1,
    tal2,
    result6);

    //räkna ut resten från heltalsdivision  mellan tal1 och  tal 2 och skriv ut
    float result7 = tal1 % tal2;
    System.out.printf("%f kvarvarande %f är %f\n",
    tal1,
    tal2,
    result7);
    }
}
