public class Main {

    public static void main(String[] args) {

        // Стоимость одного билета
        int priceTicket = 13783;

        // Хранение количества рублей для одной бонусной милли
        int mileCost = 20;

        int bonusMiles = priceTicket / mileCost;

        System.out.println("Количество начисленных мили за один билет: " + bonusMiles);
    }

}