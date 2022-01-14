package se.resch;

public class Lab5 {
    public void Do3() {
        System.out.println("Mata in tal 1:");
        //Skriv in Mata in tal 1:
        int tal1 = Integer.parseInt(System.console().readLine());
        //Ta emot detta tal i en variabel
        
        System.out.println("Mata in tal 2:");
        //Skriv in Mata in tal 2:
        int tal2 = Integer.parseInt(System.console().readLine());
        //Ta emot värdet på detta tal
        
        //Nu ska ni göra massa beräkningar på dessa tal. OBS: lägg resultat i en variabel innan ni skriver ut
        
        //resultat = tal1 * tal2
        
        //räkna tal1 upphöjd till tal 2 (tips Math.Pow) och skriv ut 
        int result1 = (int) Math.pow(tal1,tal2);
        System.out.printf("%d upphöjt till %d är %d\n", //%= modulus, d= decimal integer
        tal1,
        tal2,
        result1);
        
        //räkna tal1 gånger tal 2 och skriv ut
        int result2 = tal1 *tal2;
        System.out.printf("%d gånger %d är %d\n",
        tal1,
        tal2,
        result2);
        
        //räkna tal1 delat med tal 2 och skriv ut    (OBS! Testa med 12 och 5, ) Vad blir resultatet?  Och HUR kan du göra om du vill ha 2.40000  (decimaltal som svar)
        int result3 = tal1 / tal2;
        System.out.printf("%d delat med %d är %d\n",
        tal1,
        tal2,
        result3);

        //räkna tal1 plus tal 2 och skriv ut 
        int result4 = tal1 + tal2;
        System.out.printf("%d plus %d är %d\n",
        tal1,
        tal2,
        result4);

        //räkna tal1 minus tal 2 och skriv ut
        int result5 = tal1 - tal2;
        System.out.printf("%d minus %d är %d\n",
        tal1,
        tal2,
        result5);

        //räkna tal1  heltalsdividerat   tal 2 och skriv ut
        int result6 = tal1 / tal2;
        System.out.printf("%d / %d är %d\n",
        tal1,
        tal2,
        result6);

        //räkna ut resten från heltalsdivision  mellan tal1 och  tal 2 och skriv ut
        int result7 = tal1 % tal2;
        System.out.printf("%d kvarvarande %d är %d\n",
        tal1,
        tal2,
        result7);
    }
}
