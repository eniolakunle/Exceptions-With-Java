package Exercise_3;

import Exercise_2.Dinosaur;
import Exercise_2.DinosaurIllegalArgument;

public class DailyAudit {

    public static void main(String[] args) {
        System.out.println("Performing Daily Audit:\n--------------");
        Dinosaur healthyDinosaur = new Dinosaur("Immanuel", 777);
        try{
            DinosaurIllegalArgument.updateDinosaurWeight(-666, healthyDinosaur);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("----------\nAudit Results: ");
            System.out.print("Name: " + healthyDinosaur.getName());
            System.out.print(" | Weight: " + healthyDinosaur.getWeight());
        }
    }
}
