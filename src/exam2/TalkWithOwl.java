package exam2;

public class TalkWithOwl extends Options{

    public void talkWithOwl() {            //5
        if (a == 5) {
            System.out.println("Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. " +
                    "Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.");
            System.out.println("1. Поверить Сове и отправиться вглубь леса");
            System.out.println("2. Сове не стоит верить. Искать Бельчонка в одиночку");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 6;
            }
            if (answer == 2) {
                a = 3;
            }
            if (answer == 3) {
                // Команда меню
            }
        }
    }
}
