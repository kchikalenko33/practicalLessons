public class SecondExercise {
    public static void main(String[] args) {
        int beerNum = 3;
        String word = "бутылки";

        while (beerNum > 0){

            if (beerNum == 1){
                word = "бутылка";
            }

            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну - пусти по кругу.");

            beerNum = beerNum - 1;
        }
        System.out.println("Нет пива");
    }
}
