package exam2.notthis;

public class TakeHoney extends Options{

    public void takeHoney() {              //7
        if (a == 7) {
            System.out.println("Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. " +
                    "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.");
            System.out.println("1. Подождать, вдруг пчёлы улетят");
            System.out.println("2. Нужно попытаться выкрасть мёд немедленно");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 9;
            }
            if (answer == 2) {
                a = 8;
            }
            if (answer == 3) {
                a = 16;
                // Команда меню
            }
        }
    }
}
