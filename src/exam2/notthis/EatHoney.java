package exam2.notthis;

public class EatHoney extends Options{
    public void eatHoney() {               //10
        if (a == 10) {
            System.out.println("Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. " +
                    "Лисёнку нужна помощь, он не сможет продолжить поиски. " +
                    "Игра завершилась неудачей");
            a = 13;
        }
    }
}
