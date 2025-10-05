public class fiveExercise {
    static void main(String[] args) {
        int ageMen = 16;
        var ageWomen = 18;

        if (ageMen > ageWomen) {
            System.out.println("Девушка младше парня");
        }
        else if (ageMen == ageWomen) {
            System.out.println("Девушка и парень - одногодки");
        }
        else {
            System.out.println("Девушка старше парня");
        }
    }
}
