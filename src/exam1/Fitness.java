package exam1;

public class Fitness implements GoToGroup, GoToGym, GoToPool, OutToGroup, OutToGym, OutToPool {

    private Subscription[] gym;
    private Subscription[] pool;
    private Subscription[] group;

    public Fitness() {
        this.gym = new Subscription[20];
        this.pool = new Subscription[20];
        this.group = new Subscription[20];
    }

    @Override
    public void goToGroup(Subscription people) {
        if (people.isGroup1()) {
            for (int i = 0; i < 20; i++) {
                if (group[i] == null) {
                    group[i] = people;
                    group[i].setGroup1(false);
                    group[i].setGym1(false);
                    group[i].setPool1(false);
                    System.out.println(people.getName() + " сейчас на групповом занятии");
                    return;
                }
            }
            System.out.println("Мест сейчас нет, нужно подождать");
        }
        System.out.println(people.getName() + " не может посещать групповые занятия");
    }

    @Override
    public void goToGym(Subscription people) {
        if (people.isGym1()) {
            for (int i = 0; i < 20; i++) {
                if (gym[i] == null) {
                    gym[i] = people;
                    people.setGroup1(false);
                    people.setGym1(false);
                    people.setPool1(false);
                    System.out.println(people.getName() + " сейчас в тренажерном");
                    return;
                }
            }
            System.out.println("Мест сейчас нет, нужно подождать");
        }
        System.out.println(people.getName() + " не может посещать тренажерный зал");
    }


    @Override
    public void goToPool(Subscription people) {
        if (people.isPool1()) {
            for (int i = 0; i < 20; i++) {
                if (pool[i] == null) {
                    pool[i] = people;
                    people.setGroup1(false);
                    people.setGym1(false);
                    people.setPool1(false);
                    System.out.println(people.getName() + " сейчас в тренажерном");
                    return;
                }
            }
            System.out.println("Мест сейчас нет, нужно подождать");
        }
        System.out.println(people.getName() + " не может посещать тренажерный зал");
    }

    @Override
    public void outToGroup(Subscription people) {
        if (!(people.group1)) {
            for (int i = 0; i < 20; i++) {
                if (group[i] == people) {
                    group[i] = null;
                    people.setGroup1(people.isGroup2());
                    people.setGym1(people.isGym2());
                    people.setPool1(people.isPool2());
                    System.out.println(people.getName() + " покинул тренажерный зал");
                    return;
                }
            }
            System.out.println(people.getName() + " не было в тренажерном зале");
            return;
        }
        System.out.println(people.getName() + " не было в тренажерном зале");
    }

    @Override
    public void outToGym(Subscription people) {
        if (!(people.gym1)) {
            for (int i = 0; i < 20; i++) {
                if (gym[i] == people) {
                    gym[i] = null;
                    people.setGroup1(people.isGroup2());
                    people.setGym1(people.isGym2());
                    people.setPool1(people.isPool2());
                    System.out.println(people.getName() + " покинул тренажерный зал");
                    return;
                }
            }
            System.out.println(people.getName() + " не было в тренажерном зале");
            return;
        }
        System.out.println(people.getName() + " не было в тренажерном зале");
    }

    @Override
    public void outToPool(Subscription people) {
        if (!(people.pool1)) {
            for (int i = 0; i < 20; i++) {
                if (pool[i] == people) {
                    pool[i] = null;
                    people.setGroup1(people.isGroup2());
                    people.setGym1(people.isGym2());
                    people.setPool1(people.isPool2());
                    System.out.println(people.getName() + " покинул тренажерный зал");
                    return;
                }
            }
            System.out.println(people.getName() + " не было в тренажерном зале");
            return;
        }
        System.out.println(people.getName() + " не было в тренажерном зале");
    }


}
