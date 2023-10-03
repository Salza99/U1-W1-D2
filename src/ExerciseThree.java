import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        Scanner input = new Scanner(System.in);
        System.out.println("inserisci una stringa per dividerla tra virgole");
        String stringaInserita = input.nextLine();
        String close = ":q";




       while (!stringaInserita.equals(close) ) {
           String newString = "";
           for (int i = 0; i <stringaInserita.length() ; i++) {
                newString += stringaInserita.charAt(i) + ",";



           }System.out.println(newString);
            System.out.println("inserisci una nuova stringa oppure digita :q per interrompere");

            stringaInserita = input.nextLine();


        }
       if (stringaInserita == close) {
           
            input.close();
        }

    }

}
