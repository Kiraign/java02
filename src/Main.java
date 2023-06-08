public class Main {

    public static void main(String[] args) {

        int initial = 200; // текущий счёт клиента
        int replenishment = 800; // сумма пополнения
        int bonus = replenishment / 100;// начислено бонусов

        if (replenishment > 1000) {
            System.out.println((bonus = replenishment / 100) + " бонусов. Сумма привысила порог поплнения");
        } else {
            System.out.println((bonus = 0) + " бонусов. Сумма НЕ привысила порог поплнения");
        }

        System.out.println((initial + replenishment + bonus) + " Итоговая сумма на счету клиента");

    }
}