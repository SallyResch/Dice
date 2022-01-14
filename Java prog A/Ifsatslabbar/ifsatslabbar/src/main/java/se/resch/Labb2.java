package se.resch;

public class Labb2 {
    public void largNR(){
        int tal1, tal2, tal3;
        System.out.println("Skriv in ett tal:");
        tal1 = Integer.parseInt(System.console().readLine());
    
        System.out.println("Skriv in ett till tal:");
        tal2 = Integer.parseInt(System.console().readLine());

        System.out.println("Skriv in ytterligare ett tal:");
        tal3 = Integer.parseInt(System.console().readLine());
    
        int largest;{
        if(tal1 > tal2){
            if(tal1>tal3)
            largest= tal1;
            else
            largest=tal3;
        }
        else{
            if(tal2>tal3)
            largest = tal2;
            else
            largest = tal3;

        }    
        
        }
        System.out.println("Det största talet av dessa är: " + largest);
    }
}   
