package exam1;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Day extends Subscription{
//    private boolean pool2;
//    private boolean gym2;
//    private boolean group2;

    public Day(String name, String surName, int yearBurn) {
        super(name, surName, yearBurn);
        pool1 = false;
        gym1 = true;
        group1 = true;
        pool2 = false;
        gym2 = true;
        group2 = true;
        timeIn = LocalTime.of(8,0);
        timeOf = LocalTime.of(16,0);
        reg = LocalDateTime.of(2021,(int)(Math.random()*3+1),(int)(Math.random()*15),(int)(Math.random()*24),0);
        regOff = reg.plusDays((int)(Math.random()*365)).plusHours((int)(Math.random()*24));
    }

//    public void setPool2(boolean pool2) {
//        this.pool2 = pool2;
//    }
//
//    public void setGym2(boolean gym2) {
//        this.gym2 = gym2;
//    }
//
//    public void setGroup2(boolean group2) {
//        this.group2 = group2;
//    }
//
//    public boolean isPool2() {
//        return pool2;
//    }
//
//    public boolean isGym2() {
//        return gym2;
//    }
//
//    public boolean isGroup2() {
//        return group2;
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
