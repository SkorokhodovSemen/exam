package exam1;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class OneOff extends Subscription{
//    private boolean pool;
//    private boolean gym;
//    private boolean group;

    public OneOff(String name, String surName, int yearBurn) {
        super(name, surName, yearBurn);
        pool1 = true;
        gym1 = true;
        group1 = false;
        pool2 = true;
        gym2 = true;
        group2 = false;
        timeIn = LocalTime.of(8,0);
        timeOf = LocalTime.of(22,0);
        reg = LocalDateTime.of(2021,(int)(Math.random()*3+1),(int)(Math.random()*15),(int)(Math.random()*24),0);
        regOff = reg.plusDays((int)(Math.random()*365)).plusHours((int)(Math.random()*24));
    }

//    public void setPool(boolean pool) {
//        this.pool = pool;
//    }
//
//    public void setGym(boolean gym) {
//        this.gym = gym;
//    }
//
//    public void setGroup(boolean group) {
//        this.group = group;
//    }
//
//    public boolean isPool() {
//        return pool;
//    }
//
//    public boolean isGym() {
//        return gym;
//    }
//
//    public boolean isGroup() {
//        return group;
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
