package exam2;

public class Fox extends Options{
    public void fox() {            //0
        System.out.println("Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. " +
                "Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. " +
                "Лисёнок ждал, ждал, но так и не смог дождаться своего друга." +
                " \" Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду." +
                "\" - подумал Лисёнок. Как поступить Лисенку?");
        System.out.println("1. Вернуться домой");
        System.out.println("2. Отправиться на поиски");
        System.out.println("3. Выйти в меню");
        answer = scanner.nextInt();
        if (answer == 1) {
            a = 12;
        }
        if (answer == 2) {
            a = 1;
        }
        if (answer == 3) {
            // Команда меню
        }
    }
}