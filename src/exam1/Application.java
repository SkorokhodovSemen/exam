package exam1;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        OneOff oneOff = new OneOff("Семен", "Скороходов", 1996);
        Full full = new Full("Елизавета", "Соболева", 2000);
        Day day = new Day("Андрей", "Лобанов", 1995);

        Fitness fitness = new Fitness();
        fitness.addFitness(oneOff,"pool");
        fitness.addFitness(oneOff,"pool");
        fitness.addFitness(full,"gym");
        fitness.addFitness(day,"group");
        fitness.info(fitness.getGroup());       //Инфо о людях в определенной зоне
        fitness.outFitness(oneOff,"pool");
        fitness.outFitness(full,"pool");
        fitness.outFitness(full,"gym");
        fitness.outFitness(day,"gym");
        fitness.outFitness(day,"group");


//        System.out.println(oneOff.getRegOff());
//        fitness.goToGroup(oneOff);
//        fitness.goToGroup(full);
//        fitness.goToGroup(day);
//        fitness.goToGym(oneOff);
//        fitness.goToGym(full);
//        fitness.goToGym(day);
//        fitness.outToGroup(oneOff);
//        fitness.outToGroup(full);
//        fitness.outToGroup(day);
//        fitness.outToGym(oneOff);
//        fitness.outToGym(full);
//        fitness.outToGym(day);






    }
}
