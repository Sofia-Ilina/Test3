public class Main {
    public static void main(String[] args) {
        int amountOfMoney = 800; // начальный счет
        int replenishmentAmount = 200; // сумма пополнения
        int oneRuble = 100; // 1 рубль = 100 бонусам

        int bonus = 0;
        if (replenishmentAmount  > 1000) {
            bonus = replenishmentAmount  / 1000;
        }
        int finalBalance = amountOfMoney + replenishmentAmount + bonus;
        System.out.println("Итог:" + amountOfMoney);
        System.out.println(bonus);

        // в итоге на экрпне получилось 800
    }
}
