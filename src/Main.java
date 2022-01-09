public class Main {
    public static void main(String[] args) {
        // Входные данные

        int startingBalance = 10; // стартовый баланс
        int replenishmentAmount = 1582; // сумма пополнения
        boolean bonusAccrualCondition = replenishmentAmount > 1000; // условие для начисления бонусов

        // Логика
        int bonus = 0;
        if (bonusAccrualCondition) {
            bonus = replenishmentAmount / 100;
        }

        int amount = startingBalance + replenishmentAmount + bonus;

        System.out.println("Ваш баланс: " + amount);
        System.out.println("Начисленных бонусов: " + bonus);

    }
}