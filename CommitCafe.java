public class CommitCafe {

    private static String barista = "Jake"; // STUDENT_TODO_1A: Change name
    private static String nickname = "Main barista";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("cups brewed: " + cups);
        System.out.println(barista + " has brewed a coffee");
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}
