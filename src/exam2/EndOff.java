package exam2;

public class EndOff extends Options {

    GoToFind goToFind = new GoToFind();
    GoToFindOne goToFindOne = new GoToFindOne();
    TalkWithAnimal talkWithAnimal = new TalkWithAnimal();
    TalkWithWolf talkWithWolf = new TalkWithWolf();
    TalkWithOwl talkWithOwl = new TalkWithOwl();
    GoToForest goToForest = new GoToForest();
    TakeHoney takeHoney = new TakeHoney();
    StealHoney stealHoney = new StealHoney();
    WaitBee waitBee = new WaitBee();
    EatHoney eatHoney = new EatHoney();
    GiftHoney giftHoney = new GiftHoney();
    GoToHome goToHome = new GoToHome();
    Fox fox = new Fox();

    public void startGame() {
        fox.fox();
        while (a != 13) {
            for (int i = 0; i < 13; i++) {
                if (a == i) {
                    goToFind.goToFind();
                    goToFindOne.goToFindOne();
                    talkWithAnimal.talkWithAnimal();
                    talkWithWolf.talkWithWolf();
                    talkWithOwl.talkWithOwl();
                    goToForest.goToForest();
                    takeHoney.takeHoney();
                    stealHoney.stealHoney();
                    waitBee.waitBee();
                    eatHoney.eatHoney();
                    giftHoney.giftHoney();
                    goToHome.goToHome();
                    break;
                }
            }
        }
        System.out.println("Спасибо за игру! Создатель Скороходов Семен.");
    }

}
