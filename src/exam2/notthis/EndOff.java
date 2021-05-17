package exam2.notthis;

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
    LoadGame loadGame = new LoadGame();
    SaveGame saveGame = new SaveGame();
    ExitGame exitGame = new ExitGame();
    Menu menu = new Menu();
    Fox fox = new Fox();


    public void startGame() {
        a=16;
        menu.menu();
        if (a == 14){
            loadGame.loadGame();
        }
        if (a == 15){
            saveGame.saveGame();
        }
        if (a == 13){
            return;
        }
        fox.fox();
        while (a != 13) {
            for (int i = 0; i < 17; i++) {
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
                    loadGame.loadGame();
                    saveGame.saveGame();
                    menu.menu();
                    break;
                }
            }
        }
        System.out.println("Спасибо за игру! Создатель Скороходов Семен.");
    }
}
