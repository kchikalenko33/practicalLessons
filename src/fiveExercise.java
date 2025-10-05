public class fiveExercise {
    static void main(String[] args) {
        int ageMen = 15;
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

        int money = 100;
        int priceMilk = 20;

        int balanceOfMoney = money - priceMilk;
        int moneyBoy = balanceOfMoney > 70 ? 10 : 5;

        System.out.println("баланс мальчика: " + moneyBoy);

        int remainderMoney = balanceOfMoney - moneyBoy;

        System.out.println("Остаток: " + remainderMoney);

    }
}
