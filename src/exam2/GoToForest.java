package exam2;

public class GoToForest extends Options{

    public void goToForest() {                 //6
        if (a == 6) {
            System.out.println("В глубине леса Лисёнок встретил Медвежонка. " +
                    "Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.");
            System.out.println("1. Нет, потрачено слишком много времени, нужно идти дальше. Искать Бельчонка в одиночку");
            System.out.println("2. Нужно воспользоваться шансом и раздобыть мёд");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 3;
            }
            if (answer == 2) {
                a = 7;
            }
            if (answer == 3) {
                 a =16;
                // Команда меню
            }
        }
    }
}
