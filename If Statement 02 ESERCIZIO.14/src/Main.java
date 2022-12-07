public class Main {
    public static void main(String[] args) {

        String mySurname = "Fiaccabrino";

        String containsNI = mySurname.contains("ni") ? "contains" : "doesn't contain";

        System.out.println("Your surname " + containsNI + " the sequence of letters 'ni'");


    }
}