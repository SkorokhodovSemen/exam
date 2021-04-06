package exam1;

public class Application {
    public static void main(String[] args) {

        OneOff oneOff = new OneOff("Семен", "Скороходов", 1996);
        Full full = new Full("Елизавета", "Соболева", 2000);
        Day day = new Day("Андрей", "Лобанов", 1995);

        Fitness fitness = new Fitness();

        fitness.goToGroup(oneOff);
        fitness.goToGroup(full);
        fitness.goToGroup(day);
        fitness.goToGym(oneOff);
        fitness.goToGym(full);
        fitness.goToGym(day);
        fitness.outToGroup(oneOff);
        fitness.outToGroup(full);
        fitness.outToGroup(day);
        fitness.outToGym(oneOff);
        fitness.outToGym(full);
        fitness.outToGym(day);






    }
}
