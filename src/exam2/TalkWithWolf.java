package exam2;

public class TalkWithWolf extends Options{

    public void talkWithWolf() {           //4
        if (a == 4) {
            System.out.println("Волк оказался вполне дружелюбным, но помочь не смог. " +
                    "Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. " +
                    "И как теперь поступить?");
            System.out.println("1. Волк прав. Вернуться домой");
            System.out.println("2. Искать Бельчонка в одиночку");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 12;
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
