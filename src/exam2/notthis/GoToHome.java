package exam2.notthis;

public class GoToHome extends Options{

    public void goToHome() {           //12
        if (a == 12) {
            System.out.println("Вернувшись домой, Лисёнок нашёл там Бельчонка. " +
                    "Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. " +
                    "Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! " +
                    "Игра завершилась успехом");
            a += 1;          // Выйти из игры
        }
    }
}
