// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ExerciseOne {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println(stringaPariDispari(("ciaoo")));
        System.out.println(annoBisestile(2000));


    }

    public static boolean stringaPariDispari(String a) {
        if (a.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 100 == 0 && anno % 400 == 0 ) {
                return true;
        }
        else {
            return false;
        }
    }


}
