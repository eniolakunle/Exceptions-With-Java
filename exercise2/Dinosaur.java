package exercise2;


public class Dinosaur {
    private double weight;
    private final String name;
    private int health = 100;

    public Dinosaur(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void changeHealth(int deltaHealth) {
        // Positive or negative
        this.health += deltaHealth;

        if (this.health > 100) {
            this.health = 100;
        } else if (this.health < 0) {
            this.health = 0;
        }

    }

    public double getWeight() {
        return this.weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

}
