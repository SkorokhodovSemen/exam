package exam2;

public class Menu {
    private SaveGame saveGame;
    private LoadGame loadGame;

    public Menu(SaveGame saveGame, LoadGame loadGame) {
        this.saveGame = saveGame;
        this.loadGame = loadGame;
    }
    public void saveGame(){
        saveGame.execute();
    }
    public void loadGame(){
        loadGame.execute();
    }
}
