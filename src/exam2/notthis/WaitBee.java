package exam2.notthis;

public class WaitBee extends Options{


    public void waitBee() {                //9
        if (a == 9) {
            System.out.println("Лисёнок подождал немного, и пчёлы разлетелись. " +
                    "Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. " +
                    "Что же делать?");
            System.out.println("1. Поесть немного и передохнуть");
            System.out.println("2. Скорее отнести мёд Медвежонку");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 10;
            }
            if (answer == 2) {
                a = 11;
            }
            if (answer == 3) {
                a = 16;
                // Команда меню
            }
        }
    }
}
