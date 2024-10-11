package Exercise_2;

public class Dinosaur{
    private double weight;
    private final String name;

    public Dinosaur(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() { return this.name; }
    public double getWeight() { return this.weight; }
    void setWeight(double weight) { this.weight = weight; }

}
