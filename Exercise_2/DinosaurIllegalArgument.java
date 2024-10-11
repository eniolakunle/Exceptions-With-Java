package Exercise_2;

class Dinosaur{
    private double weight;
    private final String name;

    Dinosaur(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    String getName(){ return this.name; }
    void setWeight(double weight){ this.weight = weight; }

}
public class DinosaurIllegalArgument {

    static void updateDinosaurWeight(double weight, Dinosaur dinosaur) throws IllegalArgumentException{
        if (weight < 0){
            throw new IllegalArgumentException("Dinosaur should weigh more than zero!");
        } else {
            dinosaur.setWeight(weight);
            System.out.println("New weight for " + dinosaur.getName() +
                    ": " + weight + " lbs");
        }
    }

    public static void main(String[] args) {
        Dinosaur tRex = new Dinosaur("Bitey", 20);
        try {
            updateDinosaurWeight(-1, tRex);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        updateDinosaurWeight(25, tRex);
    }
}
