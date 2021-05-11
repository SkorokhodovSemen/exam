package exam2;

public class GoToFind extends Options {

    public void goToFind() {
        if (a == 1) {
            System.out.println("Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. " +
                    "Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.");
            System.out.println("1. Попытаться разузнать о Бельчонке у лесных жителей");
            System.out.println("2. Искать Бельчонка в одиночку");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 2;
            }
            if (answer == 2) {
                a = 3;
            }
            if (answer == 3) {
                a = 16;
                // Команда меню
            }
        }
    }
}
