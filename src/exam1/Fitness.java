package exam1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Formatter;

//implements GoToGroup, GoToGym, GoToPool, OutToGroup, OutToGym, OutToPool
public class Fitness {


    private Subscription[] gym;
    private Subscription[] pool;
    private Subscription[] group;

    public Fitness() {
        this.gym = new Subscription[20];
        this.pool = new Subscription[20];
        this.group = new Subscription[20];
    }

    public Subscription[] getGym() {
        return gym;
    }

    public Subscription[] getPool() {
        return pool;
    }

    public Subscription[] getGroup() {
        return group;
    }

    public void addFitness(Subscription people, String zone) {
        switch (zone) {
            case "group":
                if (people.getRegOff().isAfter(LocalDateTime.now())) {
                    if (LocalTime.now().getHour() > people.getTimeIn().getHour() && LocalTime.now().getHour() < people.getTimeOf().getHour()) {
                        if (people.isGroup1()) {
                            for (int i = 0; i < 20; i++) {
                                if (group[i] == null) {
                                    group[i] = people;
                                    people.setGroup1(false);
                                    people.setGym1(false);
                                    people.setPool1(false);
                                    people.setGroup3(true);
                                    System.out.println(people.getName() + " сейчас на групповом занятии");
                                    return;
                                }
                            }
                            System.out.println("Мест сейчас нет, нужно подождать");
                            return;
                        }
                        System.out.println(people.getName() + " не может посещать групповые занятия");
                        return;
                    }
                    System.out.println(people.getName() + " Сейчас не время посещения");
                    return;
                }
                System.out.println(people.getName() + " абонемент просрочен");

            case "gym":
                if (people.getRegOff().isAfter(LocalDateTime.now())) {
                    if (LocalTime.now().getHour() > people.getTimeIn().getHour() && LocalTime.now().getHour() < people.getTimeOf().getHour()) {
                        if (people.isGym1()) {
                            for (int i = 0; i < 20; i++) {
                                if (gym[i] == null) {
                                    gym[i] = people;
                                    people.setGroup1(false);
                                    people.setGym1(false);
                                    people.setPool1(false);
                                    people.setGym3(true);
                                    System.out.println(people.getName() + " сейчас в тренажерном зале");
                                    return;
                                }
                            }
                            System.out.println("Мест сейчас нет, нужно подождать");
                            return;
                        }
                        System.out.println(people.getName() + " не может посещать тренажерный зал");
                        return;
                    }
                    System.out.println(people.getName() + " Сейчас не время посещения");
                    return;
                }
                System.out.println(people.getName() + " абонемент просрочен");

            case "pool":
                if (people.getRegOff().isAfter(LocalDateTime.now())) {
                    if (LocalTime.now().getHour() > people.getTimeIn().getHour() && LocalTime.now().getHour() < people.getTimeOf().getHour()) {
                        if (people.isPool1()) {
                            for (int i = 0; i < 20; i++) {
                                if (pool[i] == null) {
                                    pool[i] = people;
                                    people.setGroup1(false);
                                    people.setGym1(false);
                                    people.setPool1(false);
                                    people.setPool3(true);
                                    System.out.println(people.getName() + " сейчас бассейне");
                                    return;
                                }
                            }
                            System.out.println(" Мест сейчас нет, нужно подождать");
                            return;
                        }
                        System.out.println(people.getName() + " не может посещать бассейн");
                        return;
                    }
                    System.out.println(people.getName() + " Сейчас не время посещения");
                    return;
                }
                System.out.println(people.getName() + " абонемент просрочен");
        }
    }


    public void outFitness(Subscription people, String zone) {
        switch (zone) {
            case "group":
                if (people.getRegOff().isAfter(LocalDateTime.now())) {
                    if (!(people.group1)) {
                        for (int i = 0; i < 20; i++) {
                            if (group[i] == people) {
                                group[i] = null;
                                people.setGroup1(people.isGroup2());
                                people.setGym1(people.isGym2());
                                people.setPool1(people.isPool2());
                                people.setGroup3(false);
                                System.out.println(people.getName() + " покинул групповое занятие");
                                return;
                            }
                        }
                        System.out.println(people.getName() + " не было на групповом занятии");
                        return;
                    }
                    System.out.println(people.getName() + " не было на групповом занятии");
                    return;
                }

            case "gym":
                if (people.getRegOff().isAfter(LocalDateTime.now())) {
                    if (!(people.gym1)) {
                        for (int i = 0; i < 20; i++) {
                            if (gym[i] == people) {
                                gym[i] = null;
                                people.setGroup1(people.isGroup2());
                                people.setGym1(people.isGym2());
                                people.setPool1(people.isPool2());
                                people.setGym3(false);
                                System.out.println(people.getName() + " покинул тренажерный зал");
                                return;
                            }
                        }
                        System.out.println(people.getName() + " не было в тренажерном зале");
                        return;
                    }
                    System.out.println(people.getName() + " не было в тренажерном зале");
                    return;
                }
                System.out.println(people.getName() + " абонемент просрочен");

            case "pool":
                if (people.getRegOff().isAfter(LocalDateTime.now())) {
                    if (!(people.pool1)) {
                        for (int i = 0; i < 20; i++) {
                            if (pool[i] == people) {
                                pool[i] = null;
                                people.setGroup1(people.isGroup2());
                                people.setGym1(people.isGym2());
                                people.setPool1(people.isPool2());
                                people.setPool3(false);
                                System.out.println(people.getName() + " покинул бассейн");
                                return;
                            }
                        }
                        System.out.println(people.getName() + " не было в бассейне");
                        return;
                    }
                    System.out.println(people.getName() + " не было бассейне");
                    return;
                }
                System.out.println(people.getName() + " абонемент просрочен");
        }
    }

    public void info(Subscription[] zone) {
        for (int i = 0; i < 20; i++) {
            if (!(zone[i] == null)) {
                if (zone[i].isPool3()) {
                    System.out.println(zone[i].getName() + " посещает бассейн");
                }
                if (zone[i].isGym3()) {
                    System.out.println(zone[i].getName() + " посещает тренажерный зал");
                }
                if (zone[i].isGroup3()) {
                    System.out.println(zone[i].getName() + " посещает групповые занятия");
                }
            }
        }
    }
}


//    @Override
//    public void goToGroup(Subscription people) {
//        if (people.getRegOff().isAfter(LocalDateTime.now())) {
//            if (people.isGroup1()) {
//                for (int i = 0; i < 20; i++) {
//                    if (group[i] == null) {
//                        group[i] = people;
//                        group[i].setGroup1(false);
//                        group[i].setGym1(false);
//                        group[i].setPool1(false);
//                        System.out.println(people.getName() + " сейчас на групповом занятии");
//                        return;
//                    }
//                }
//                System.out.println("Мест сейчас нет, нужно подождать");
//            }
//            System.out.println(people.getName() + " не может посещать групповые занятия");
//        }
//        System.out.println(people.getName() + "абонемент просрочен");
//    }
//
//    @Override
//    public void goToGym(Subscription people) {
//        if (people.getRegOff().isAfter(LocalDateTime.now())) {
//            if (people.isGym1()) {
//                for (int i = 0; i < 20; i++) {
//                    if (gym[i] == null) {
//                        gym[i] = people;
//                        people.setGroup1(false);
//                        people.setGym1(false);
//                        people.setPool1(false);
//                        System.out.println(people.getName() + " сейчас в тренажерном");
//                        return;
//                    }
//                }
//                System.out.println("Мест сейчас нет, нужно подождать");
//            }
//            System.out.println(people.getName() + " не может посещать тренажерный зал");
//        }
//        System.out.println(people.getName() + "абонемент просрочен");
//    }
//
//
//    @Override
//    public void goToPool(Subscription people) {
//        if (people.getRegOff().isAfter(LocalDateTime.now())) {
//            if (people.isPool1()) {
//                for (int i = 0; i < 20; i++) {
//                    if (pool[i] == null) {
//                        pool[i] = people;
//                        people.setGroup1(false);
//                        people.setGym1(false);
//                        people.setPool1(false);
//                        System.out.println(people.getName() + " сейчас в тренажерном");
//                        return;
//                    }
//                }
//                System.out.println("Мест сейчас нет, нужно подождать");
//            }
//            System.out.println(people.getName() + " не может посещать тренажерный зал");
//        }
//        System.out.println(people.getName() + "абонемент просрочен");
//    }
//
//    @Override
//    public void outToGroup(Subscription people) {
//        if (people.getRegOff().isAfter(LocalDateTime.now())) {
//            if (!(people.group1)) {
//                for (int i = 0; i < 20; i++) {
//                    if (group[i] == people) {
//                        group[i] = null;
//                        people.setGroup1(people.isGroup2());
//                        people.setGym1(people.isGym2());
//                        people.setPool1(people.isPool2());
//                        System.out.println(people.getName() + " покинул тренажерный зал");
//                        return;
//                    }
//                }
//                System.out.println(people.getName() + " не было в тренажерном зале");
//                return;
//            }
//            System.out.println(people.getName() + " не было в тренажерном зале");
//        }
//        System.out.println(people.getName() + "абонемент просрочен");
//    }
//
//    @Override
//    public void outToGym(Subscription people) {
//        if (people.getRegOff().isAfter(LocalDateTime.now())) {
//            if (!(people.gym1)) {
//                for (int i = 0; i < 20; i++) {
//                    if (gym[i] == people) {
//                        gym[i] = null;
//                        people.setGroup1(people.isGroup2());
//                        people.setGym1(people.isGym2());
//                        people.setPool1(people.isPool2());
//                        System.out.println(people.getName() + " покинул тренажерный зал");
//                        return;
//                    }
//                }
//                System.out.println(people.getName() + " не было в тренажерном зале");
//                return;
//            }
//            System.out.println(people.getName() + " не было в тренажерном зале");
//        }
//        System.out.println(people.getName() + "абонемент просрочен");
//    }
//
//    @Override
//    public void outToPool(Subscription people) {
//        if (people.getRegOff().isAfter(LocalDateTime.now())) {
//            if (!(people.pool1)) {
//                for (int i = 0; i < 20; i++) {
//                    if (pool[i] == people) {
//                        pool[i] = null;
//                        people.setGroup1(people.isGroup2());
//                        people.setGym1(people.isGym2());
//                        people.setPool1(people.isPool2());
//                        System.out.println(people.getName() + " покинул тренажерный зал");
//                        return;
//                    }
//                }
//                System.out.println(people.getName() + " не было в тренажерном зале");
//                return;
//            }
//            System.out.println(people.getName() + " не было в тренажерном зале");
//        }
//        System.out.println(people.getName() + "абонемент просрочен");
//    }

