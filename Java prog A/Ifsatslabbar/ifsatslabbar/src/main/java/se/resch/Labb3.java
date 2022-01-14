package se.resch;

public class Labb3 {
    public void dagar(){
        System.out.println("Skriv in veckodag som nummer(1 måndag, 2 tisdag..osv):");
        int veckoDagNr = Integer.parseInt(System.console().readLine());

        String dayName;{
            if(veckoDagNr == 1)
                dayName = "Måndag ";
            else if(veckoDagNr == 2)
                dayName = "Tisdag ";
            else if(veckoDagNr == 3)
                dayName = "Onsdag ";
            else if(veckoDagNr == 4)
                dayName = "Torsdag ";
            else if(veckoDagNr == 5)
                dayName = "Fredag ";
            else if(veckoDagNr == 6)
                dayName = "Lördag ";
            else if(veckoDagNr == 7)
                dayName = "Söndag ";
            else 
                dayName = "Finns ingen dag kopplat till den siffran!";

            System.out.println("Dagen du skrev in är: " + dayName);
        }

    }
}
