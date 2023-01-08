public class Main {
    public static void main(String[] args) {
        int balance = 100; // Баланс
        int replenishment = 500; // Сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        int fullBalance = bonus + balance + replenishment;

        System.out.println("Пополнение: " + replenishment);
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговая сумма: " + fullBalance);
    }
}