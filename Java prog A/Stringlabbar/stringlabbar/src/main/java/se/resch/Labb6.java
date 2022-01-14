package se.resch;

public class Labb6 {
/*D6 - Initialer

Write a function to convert a name into initials. You can assume the program takes in two words with one space in between them.
The output should be two capital letters with a dot separating them.

It should look like this:

Program Starts:  
Please enter name:
Sam Smith

Output: 
S.S */

    public void initialer(){
    System.out.println("Skriv in ditt för- och efternamn: ");
    String input = System.console().readLine();

    String []parts = input.split (" ");
    String result = parts[0].charAt(0) + " . " + parts[1].charAt(0);

    System.out.printf("initialer för %s är %s\n", input, result);
   }
}
