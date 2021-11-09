import java.util.Scanner;

public class Animals {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the animal name: ");
        String s = scanner.nextLine().toLowerCase();


        new AnimalSounds().AnimalSounds(s);


    }

}
