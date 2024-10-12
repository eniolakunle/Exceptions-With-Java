package Exercise_2;

public class DinosaurIllegalArgument {

    public static void updateDinosaurWeight(double weight, Dinosaur dinosaur) throws IllegalArgumentException {
        if (weight < 0) {
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
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        updateDinosaurWeight(25, tRex);
    }
}
