public class fiveExercise {
    static void main(String[] args) {
        int ageMan = 16;
        var ageWoman = 18;

        if (ageMan > ageWoman) {
            System.out.println("Девушка младше парня");
        }
        else if (ageMan == ageWoman) {
            System.out.println("Девушка и парень - одногодки");
        }
        else {
            System.out.println("Девушка старше парня");
        }
    }
}
