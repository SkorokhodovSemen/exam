package exam1;

import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

abstract public class Subscription  {

    private String name;
    private String surName;
    private int yearBurn;

    protected LocalDateTime reg;
    protected LocalDateTime regOff;
    protected LocalTime timeIn;
    protected LocalTime timeOf;
    protected boolean pool1;
    protected boolean gym1;
    protected boolean group1;
    protected boolean pool2;
    protected boolean gym2;
    protected boolean group2;
    protected boolean pool3;
    protected boolean gym3;
    protected boolean group3;


    public Subscription(String name, String surName, int yearBurn) {
        this.name = name;
        this.surName = surName;
        this.yearBurn = yearBurn;
    }

    public LocalTime getTimeIn() {
        return timeIn;
    }

    public LocalTime getTimeOf() {
        return timeOf;
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

    public LocalDateTime getRegOff() {
        return regOff;
    }

    public boolean isPool3() {
        return pool3;
    }

    public void setPool3(boolean pool3) {
        this.pool3 = pool3;
    }

    public boolean isGym3() {
        return gym3;
    }

    public void setGym3(boolean gym3) {
        this.gym3 = gym3;
    }

    public boolean isGroup3() {
        return group3;
    }

    public void setGroup3(boolean group3) {
        this.group3 = group3;
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
