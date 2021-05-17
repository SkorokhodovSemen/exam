package exam2.notthis;

public class TalkWithAnimal extends Options {

    public void talkWithAnimal() {
        if (a == 2) {
            System.out.println("Пока Лисёнок принимал решение, лесные жители разошлись кто куда. " +
                    "Остались только Сова и Волк. " +
                    "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. " +
                    "Кого выбрать?");
            System.out.println("1. Расспросить Сову");
            System.out.println("2. Расспросить Волка");
            System.out.println("3. Выйти в меню");
            answer = scanner.nextInt();
            if (answer == 1) {
                a = 5;
            }
            if (answer == 2) {
                a = 4;
            }
            if (answer == 3) {
                a = 16;
                // Команда меню
            }
        }
    }
}


