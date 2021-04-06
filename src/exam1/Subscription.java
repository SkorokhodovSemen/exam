package exam1;

abstract public class Subscription  {

    private String name;
    private String surName;
    private int yearBurn;

    protected boolean pool1;
    protected boolean gym1;
    protected boolean group1;
    protected boolean pool2;
    protected boolean gym2;
    protected boolean group2;

    public Subscription(String name, String surName, int yearBurn) {
        this.name = name;
        this.surName = surName;
        this.yearBurn = yearBurn;
    }

    public void setPool1(boolean pool1) {
        this.pool1 = pool1;
    }

    public void setGym1(boolean gym1) {
        this.gym1 = gym1;
    }

    public void setGroup1(boolean group1) {
        this.group1 = group1;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getYearBurn() {
        return yearBurn;
    }

    public boolean isPool1() {
        return pool1;
    }

    public boolean isGym1() {
        return gym1;
    }

    public boolean isGroup1() {
        return group1;
    }

    public boolean isPool2() {
        return pool2;
    }

    public boolean isGym2() {
        return gym2;
    }

    public boolean isGroup2() {
        return group2;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", yearBurn=" + yearBurn +
                '}';
    }

    //    Создаем абонемент. Заносим Имя, Фамилия, год рождения
//    Делаем 3 класса наследников. Разовый, дневной, полный
//    Создаем условия для зон посещения и времени посещения
//    В родительском классе еще создаем информацию о регистрации и окончании
//    А также инфу о выходе из тренажера (чтобы регистрировать время нахождения)

//    Или информацию в одном сделать
//    я думаю надо флаг ставить
//как про животных
//и делать 2 интерфейса
//типо интерфейс идти в зал
//флаг поставился фалсе
//    ты пишешь идти в басик
//он такой тут фалсе нельзя
//делаем интерфейс выйти
//флажок делается тру

}
