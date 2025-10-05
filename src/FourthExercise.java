public class FourthExercise {
    static public void main(String[] args) { // 1
        int x = 3; // 2
        while (x > 0) { // 3
            if (x>2) {
                System.out.print("a");
            } // 4
            x = x - 1;
            System.out.print("-"); // 5
            if (x == 2) {
                System.out.print("b c");
            } // 6
            if (x == 1) {
                System.out.print("d");
                x = x - 1; // 7
            }
        }
    }
}
