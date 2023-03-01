package raffle_toys;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToysCollection toysCollection = new ToysCollection();
        toysCollection.addToy("Машинка", 10, 20);
        toysCollection.addToy("Кукла", 5, 15);
        toysCollection.addToy("Танк", 11, 30);
        toysCollection.addToy("Конструктор", 20, 5);


        try (FileWriter writer = new FileWriter("prizes.txt", false)) {
            while (toysCollection.isPrizesAvailable()) {
                writer.write(toysCollection.getPrize() + '\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}