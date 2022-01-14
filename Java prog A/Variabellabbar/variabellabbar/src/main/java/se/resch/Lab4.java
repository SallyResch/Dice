package se.resch;

public class Lab4 {
    public void Do2() {
    /*Skriv ett program där man får mata in en temperatur i Fahrenheit
    Omvandla temperatur till Celsius (hur?? Googla)
    Skriv ut: 
    <f> grader Fahrenheit motsvarar <c> grader Celsius*/
    System.out.println("Ange temperatur i Farenheit");
    float f = Float.parseFloat(System.console().readLine());
    float c = (f-32)/1.8f;
    System.out.println(f + "grader Farenheit motsvarar" + c + " grader Celsius");
    }
}
