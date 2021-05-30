package exam2;

public class SaveGame implements Command{
    private SaveLoad saveLoad;

    public SaveGame(SaveLoad saveLoad) {
        this.saveLoad = saveLoad;
    }

    @Override
    public void execute() {
        saveLoad.writeToFile(System.out.println(saveLoad.writeToFile(b.toString().getBytes())));
    }


}
