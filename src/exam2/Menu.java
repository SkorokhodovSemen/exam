package exam2;

public class Menu extends Options{              //16

    void menu() {
        if (a == 16) {
            System.out.println("1. Начать новую игру");
            System.out.println("2. Загрузить игру");
            System.out.println("3. Сохранить игру");
            System.out.println("4. Выйти из игры");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 0;
            }
            if (answer == 2) {
                a = 14;
            }
            if (answer == 3) {
                a = 15;
            }
            if (answer == 4) {
                a = 13;
            }
        }
    }
}
