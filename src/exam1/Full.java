package exam1;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Full extends Subscription{
//    private boolean pool1;
//    private boolean gym1;
//    private boolean group1;

    public Full(String name, String surName, int yearBurn) {
        super(name, surName, yearBurn);
        pool1 = true;
        gym1 = true;
        group1 = true;
        pool2 = true;
        gym2 = true;
        group2 = true;
        timeIn = LocalTime.of(8,0);
        timeOf = LocalTime.of(22,0);
        reg = LocalDateTime.of(2021,(int)(Math.random()*3+1),(int)(Math.random()*15),(int)(Math.random()*24),0);
        regOff = reg.plusDays((int)(Math.random()*365)).plusHours((int)(Math.random()*24));
    }

//    public void setPool1(boolean pool1) {
//        this.pool1 = pool1;
//    }
//
//    public void setGym1(boolean gym1) {
//        this.gym1 = gym1;
//    }
//
//    public void setGroup1(boolean group1) {
//        this.group1 = group1;
//    }
//
//    public boolean isPool1() {
//        return pool1;
//    }
//
//    public boolean isGym1() {
//        return gym1;
//    }
//
//    public boolean isGroup1() {
//        return group1;
//    }

    //    @Override
//    public void goToGroup() {
//
//    }
//
//    @Override
//    public void goToGym() {
//
//    }
//
//    @Override
//    public void goToPool() {
//
//    }
//
//    @Override
//    public void outToGroup() {
//
//    }
//
//    @Override
//    public void outToGym() {
//
//    }
//
//    @Override
//    public void outToPool() {
//
//    }
}
