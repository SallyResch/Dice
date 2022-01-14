package se.resch;

public class Labb2 {
    public void replace(){
    
    String replaceThis = ("Det var en gång en gång och den gången var lång");

    replaceThis = replaceThis.replace(' ','*');
    
    int antalStars = 0;

    for(int i = 0; i<replaceThis.length();i++){
        if(replaceThis.charAt(i) == '*')
        antalStars++;
        }
    System.out.printf("There is %s stars\n",antalStars);
    }


/*D2 - Replace and count
Du har en sträng med texten ”Detta är en sträng som du skall ändra”. Ersätt via kod

alla blanktecken i strängen med tecknet * . Räkna sedan ut via kod hur många

förekomster det finns av tecknet * i strängen. */
}
