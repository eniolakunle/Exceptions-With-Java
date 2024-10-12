package exercise5;

import exercise2.Dinosaur;
import exercise2.DinosaurHealth;

import java.time.Instant;
import java.util.Random;

class CriticalHealthException extends Exception {
    CriticalHealthException(String message) {
        super(message);
    }
};

public class CriticalDinosaurHealth {
    public static void main(String[] args) {
        Dinosaur dino = new Dinosaur("Judas", 123);
        Random random = new Random();
        DinosaurHealth dinoHealth;
        int randomNumber;
        Instant startTime = Instant.now();
        Instant endTime = startTime.plusSeconds(5);

        try {
            while (Instant.now().isBefore(endTime)) {
                randomNumber = random.nextInt(50) - 25;
                dino.changeHealth(randomNumber);

                dinoHealth = DinosaurHealth.giveHealthStatus(dino.getHealth());

                System.out.println(Instant.now() + ": Health status for " + dino.getName()
                        + ": " + dinoHealth);
                if (dinoHealth.equals(DinosaurHealth.CRITICAL)) {
                    throw new CriticalHealthException("CRITICAL HEALTH: PERFORMING EMERGENCY TREATMENT");
                }
                Thread.sleep(100);
            }
        } catch (CriticalHealthException e) {
            System.out.println(e.getMessage());

            // Magical life saving treatment performed.
            dino.changeHealth(100);
            dinoHealth = DinosaurHealth.giveHealthStatus(dino.getHealth());
            System.out.print(dino.getName() + " is all better! Health: " + dinoHealth);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
