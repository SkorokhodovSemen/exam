package exam2;

import exam2.notthis.SaveLoad;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.*;

public class Options2 {
    private int a;
    private int answer;
    ArrayList<Paragraph> paragraphArrayList = new ArrayList<>();

    private void allParagraphs() {
        paragraphArrayList.add(paragraph0);
        paragraphArrayList.add(paragraph1);
        paragraphArrayList.add(paragraph2);
        paragraphArrayList.add(paragraph3);
        paragraphArrayList.add(paragraph4);
        paragraphArrayList.add(paragraph5);
        paragraphArrayList.add(paragraph6);
        paragraphArrayList.add(paragraph7);
        paragraphArrayList.add(paragraph8);
        paragraphArrayList.add(paragraph9);
        paragraphArrayList.add(paragraph10);
        paragraphArrayList.add(paragraph11);
        paragraphArrayList.add(paragraph12);
        paragraphArrayList.add(menu13);
    }


    Scanner scanner = new Scanner(System.in);

    private final Paragraph paragraph0 = new Paragraph("Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком.\n" +
            "Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было.\n" +
            "Лисёнок ждал, ждал, но так и не смог дождаться своего друга.\n" +
            "Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\n" +
            "- подумал Лисёнок. Как поступить Лисенку?\n" +
            "1. Вернуться домой\n" +
            "2. Отправиться на поиски\n" +
            "3. Выйти в меню\n", 0,12,1);
    private final Paragraph paragraph1 = new Paragraph("Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему.\n " +
            "Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.\n" +
            "1. Попытаться разузнать о Бельчонке у лесных жителей\n" +
            "2. Искать Бельчонка в одиночку\n" +
            "3. Выйти в меню\n", 1,2,3);
    private final Paragraph paragraph2 = new Paragraph("Пока Лисёнок принимал решение, лесные жители разошлись кто куда.\n " +
            "Остались только Сова и Волк.\n " +
            "Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов.\n " +
            "Кого выбрать?\n" +
            "1. Расспросить Сову\n" +
            "2. Расспросить Волка\n" +
            "3. Выйти в меню\n", 2,4,5);
    private final Paragraph paragraph3 = new Paragraph("Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился.\n " +
            "Теперь его самого нужно искать. Игра завершилась неудачей", 3);
    private final Paragraph paragraph4 = new Paragraph("Волк оказался вполне дружелюбным, но помочь не смог. \n" +
            "Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. \n" +
            "1. Волк прав. Вернуться домой\n" +
            "2. Искать Бельчонка в одиночку\n" +
            "3. Выйти в меню\n", 4,12,3);
    private final Paragraph paragraph5 = new Paragraph("Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса.\n" +
            "Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.\n" +
            "1. Поверить Сове и отправиться вглубь леса\n" +
            "2. Сове не стоит верить. Искать Бельчонка в одиночку\n" +
            "3. Выйти в меню\n", 5,6,3);
    private final Paragraph paragraph6 = new Paragraph("В глубине леса Лисёнок встретил Медвежонка.\n " +
            "Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.\n" +
            "1. Нет, потрачено слишком много времени, нужно идти дальше. Искать Бельчонка в одиночку\n" +
            "2. Нужно воспользоваться шансом и раздобыть мёд\n" +
            "3. Выйти в меню\n", 6,3,7);
    private final Paragraph paragraph7 = new Paragraph("Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел.\n" +
            "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.\n" +
            "1. Подождать, вдруг пчёлы улетят\n" +
            "2. Нужно попытаться выкрасть мёд немедленно\n" +
            "3. Выйти в меню\n", 7,9,8);
    private final Paragraph paragraph8 = new Paragraph("Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь.\n " +
            "Игра завершилась неудачей", 8);
    private final Paragraph paragraph9 = new Paragraph("Лисёнок подождал немного, и пчёлы разлетелись.\n" +
            "Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден.\n" +
            "Что же делать?\n" +
            "1. Поесть немного и передохнуть\n" +
            "2. Скорее отнести мёд Медвежонку\n" +
            "3. Выйти в меню\n", 9,10,11);
    private final Paragraph paragraph10 = new Paragraph("Пока Лисёнок ел, злобные пчёлы вернулись и покусали его.\n" +
            "Лисёнку нужна помощь, он не сможет продолжить поиски.\n" +
            "Игра завершилась неудачей\n", 10);
    private final Paragraph paragraph11 = new Paragraph("Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен,\n" +
            "что Бельчонок никогда не пошёл бы в глубь леса.\n" +
            "Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить,\n" +
            "он также уговаривал Лисёнка вернуться домой.\n" +
            "1. Медвежонок ничего не знает, нужно продолжить поиски. Искать Бельчонка в одиночку\n" +
            "2. Может быть он прав и Лисёнок просто паникует. Вернуться домой\n" +
            "3. Выйти в меню\n", 11,3,12);
    private final Paragraph paragraph12 = new Paragraph("Вернувшись домой, Лисёнок нашёл там Бельчонка.\n" +
            "Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел.\n" +
            "Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга!\n" +
            "Игра завершилась успехом\n", 12);
    private final Paragraph menu13 = new Paragraph("1. Начать новую игру\n" +
            "2. Загрузить игру\n" +
            "3. Сохранить игру\n" +
            "4. Выйти из игры\n", 13);

    private void answerOpt(Paragraph paragraph, int answer){
        if (answer == 1) a = paragraph.getB();
        if (answer == 2) a = paragraph.getC();
        if (answer == 3) a = 13;
    }

    private void saveGame(Integer a){
        if (a !=0) {
            SaveLoad saveLoad = new SaveLoad(new File(scanner.next()));
            System.out.println(saveLoad.writeToFile(a.toString().getBytes()));
        }
    }

    private void loadGame(){
        String fromFile = new String(scanner.next());
        a = Integer.parseInt(fromFile);
        start3Game();
    }

    private void answerMenu(int answer){
        if (answer == 1) start2Game();
        if (answer == 2) loadGame();
        if (answer == 3) saveGame(a);
    }

    public void start1Game() {
        allParagraphs();
        a=0;
        System.out.println(menu13);
        answer = scanner.nextInt();
        if (answer == 4) return;
        answerMenu(answer);
    }

    public void start2Game() {
        allParagraphs();
        a=0;
        System.out.println(paragraph0);
        answer = scanner.nextInt();
        answerOpt(paragraph0,answer);
        while (a!=12) {
            if (a==3 || a == 8 || a == 10) return;
            if (a == 13) {
                System.out.println(menu13);
                answer = scanner.nextInt();
                answerMenu(answer);
            }
            if (answer == 4) return;
            for (Paragraph paragraph : paragraphArrayList) {
                if (a == paragraph.getA()) {
                    System.out.println(paragraph);
                    answer = scanner.nextInt();
                    answerOpt(paragraph,answer);
                    break;
                }
            }
        }
        System.out.println(paragraph12);
    }
    public void start3Game() {
        allParagraphs();
        while (a!=12) {
            if (a==3 || a == 8 || a == 10) return;
            if (a == 13) {
                System.out.println(menu13);
                answer = scanner.nextInt();
                answerMenu(answer);
            }
            if (answer == 4) return;
            for (Paragraph paragraph : paragraphArrayList) {
                if (a == paragraph.getA()) {
                    System.out.println(paragraph);
                    answer = scanner.nextInt();
                    answerOpt(paragraph,answer);
                    break;
                }
            }
        }
        System.out.println(paragraph12);
    }


}
