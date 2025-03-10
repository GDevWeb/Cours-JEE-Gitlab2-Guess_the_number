import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;


        System.out.print("Choississez un nombre entre 0 et 100: ");
        System.out.println("J'ai choissi " + guess + "."+ "Peux-tu le deviner?");

        while (guess != targetNumber) {
            System.out.print("Entres un nombre: (ou tapes 0 pour quitter)");
            guess = scanner.nextInt();
            attempts++;

            if(guess == 0){
                System.out.println("❌ Game over! Tu as choissi de quitter la partie!");
                break;
            }else if(guess < targetNumber){
                System.out.println("⬆️ Trop bas! Essayes encore.");
            }else if(guess > targetNumber){
                System.out.println("⬇️ Trop haut! Essayes encore.");
            }else{
                System.out.println("🎉Bravo:! Tu as trouvé le bon nombre " + guess + ".");
            }
        }
        scanner.close();
    }

}
