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

        int money = 100;
        int priceMilk = 21;

        int balanceOfMoney = money - priceMilk;
        int moneyBoy = balanceOfMoney > 70 ? 10 : 5;

        System.out.println("баланс мальчика: " + moneyBoy);

        int remainderMoney = balanceOfMoney - moneyBoy;

        System.out.println("Остаток: " + remainderMoney);

    }
}
