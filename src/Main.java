public class Main {
    public static void main(String[] args) {
        int incomeBalance = 100;//входящий остаток на счете
        int payment = 1100; // сумма пополнения счета
        int balance = incomeBalance + payment; //баланс после пополнения
        int bonus; //бонусные рубли от оператора
        int bonusBalance = 0;

        if (payment > 1000) {
            bonus = (payment / 100);
        } else {
            bonus = 0;
        }
        bonusBalance = balance + bonus;//итоговый баланс

        System.out.println("Ваш бонус " + bonus + " рублей");
        System.out.println("На счете " + bonusBalance + " рублей");
    }
}



