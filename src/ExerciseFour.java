import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner input = new Scanner(System.in);
        System.out.println("inserisci un numero da cui far partire un countdown");
        int n1 = input.nextInt();


        for (int i=n1; n1 >= 0; n1-- ) {
                System.out.println(n1);
            if (n1 == 0) {
                input.close();
            }

        }

    }

}
