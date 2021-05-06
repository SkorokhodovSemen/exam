package exam2;

import java.util.Scanner;

public class Options {
    private int a;
    private int answer;
    Scanner scanner = new Scanner(System.in);

    private void Fox() {            //0
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

    private void goToFind() {           //1
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
                // Команда меню
            }
        }
    }

    private void goToFindOne() {            //3
        if (a == 3) {
            System.out.println("Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. " +
                    "Теперь его самого нужно искать. Игра завершилась неудачей");
            a = 13;
        }
    }

    private void talkWithAnimal() {         //2
        if (a == 2) {
            System.out.println("Пока Лисёнок принимал решение, лесные жители разошлись кто куда. " +
                    "Остались только Сова и Волк. " +
                    "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. " +
                    "Кого выбрать?");
            System.out.println("1. Расспросить Сову");
            System.out.println("2. Расспросить Волка");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 5;
            }
            if (answer == 2) {
                a = 4;
            }
            if (answer == 3) {
                // Команда меню
            }
        }
    }

    private void talkWithWolf() {           //4
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
                // Команда меню
            }
        }
    }

    private void talkWithOwl() {            //5
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

    private void goToForest() {                 //6
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
                // Команда меню
            }
        }
    }

    private void takeHoney() {              //7
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
                // Команда меню
            }
        }
    }

    private void stealHoney() {             //8
        if (a == 8) {
            System.out.println("Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. " +
                    "Игра завершилась неудачей");
            a = 13;
        }
    }

    private void waitBee() {                //9
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
                // Команда меню
            }
        }
    }

    private void eatHoney() {               //10
        if (a == 10) {
            System.out.println("Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. " +
                    "Лисёнку нужна помощь, он не сможет продолжить поиски. " +
                    "Игра завершилась неудачей");
            a = 13;
        }
    }

    private void giftHoney() {              //11
        if (a == 11) {
            System.out.println("Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен," +
                    " что Бельчонок никогда не пошёл бы в глубь леса. " +
                    "Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, " +
                    "он также уговаривал Лисёнка вернуться домой.");
            System.out.println("1. Медвежонок ничего не знает, нужно продолжить поиски. Искать Бельчонка в одиночку");
            System.out.println("2. Может быть он прав и Лисёнок просто паникует. Вернуться домой");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 3;
            }
            if (answer == 2) {
                a = 12;
            }
            if (answer == 3) {
                // Команда меню
            }
        }
    }

    private void goToHome() {           //12
        if (a == 12) {
            System.out.println("Вернувшись домой, Лисёнок нашёл там Бельчонка. " +
                    "Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. " +
                    "Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! " +
                    "Игра завершилась успехом");
            a += 1;          // Выйти из игры
        }
    }

    private void exitGame() {            //13
        if (a == 13) {

        }
    }

    public void startGame() {
        Fox();
        while (a != 13) {
            for (int i = 0; i < 13; i++) {
                if (a == i) {
                    goToFind();
                    goToFindOne();
                    talkWithAnimal();
                    talkWithWolf();
                    talkWithOwl();
                    goToForest();
                    takeHoney();
                    stealHoney();
                    waitBee();
                    eatHoney();
                    giftHoney();
                    goToHome();
                    break;
                }
            }
        }
        System.out.println("Спасибо за игру! Создатель Скороходов Семен.");
    }

    // Раскомитеть, когда сделаю загрузку из файла. Логика вроде правильная - выкинет тот пункт, которому будет равно число a,
    // сохраненное в файл, его мы прочитаем из файла. Надеюсь правильно.
//    public void loadGame(int a) {
//        while (a != 13) {
//            for (int i = 0; i < 13; i++) {
//                if (a == i) {
//                    goToFind();
//                    goToFindOne();
//                    talkWithAnimal();
//                    talkWithWolf();
//                    talkWithOwl();
//                    goToForest();
//                    takeHoney();
//                    stealHoney();
//                    waitBee();
//                    eatHoney();
//                    giftHoney();
//                    goToHome();
//                    break;
//                }
//            }
//        }
//        System.out.println("Спасибо за игру! Создатель Скороходов Семен.");
//    }


}
