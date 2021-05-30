package exam2;

public class LoadGame implements Command{
    private SaveLoad saveLoad;

    public LoadGame(SaveLoad saveLoad) {
        this.saveLoad = saveLoad;
    }

    @Override
    public void execute() {
        saveLoad.readFromFile();
    }
}
