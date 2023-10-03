public class ExerciseTwo {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(stampaInLettere(2));

    }
    public static String stampaInLettere (int n1) {
        switch (n1) {
            case 0: {
                return "zero";
                
            }
            case 1: {
                return "uno";
            }
            case 2: {
                return "due";
            }
            case 3: {
                return "tre";
            }
            default:{
                return "numero maggiore di 3";
            }
        }
    }
}
