package exam2;

import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class Options2 {
    private int a;
    private int answer;
    TreeSet<Paragraph> paragraphTreeSet = new TreeSet<>();

    private void allParagraphs() {
        paragraphTreeSet.add(paragraph0);
        paragraphTreeSet.add(paragraph1);
        paragraphTreeSet.add(paragraph2);
        paragraphTreeSet.add(paragraph3);
        paragraphTreeSet.add(paragraph4);
        paragraphTreeSet.add(paragraph5);
        paragraphTreeSet.add(paragraph6);
        paragraphTreeSet.add(paragraph7);
        paragraphTreeSet.add(paragraph8);
        paragraphTreeSet.add(paragraph9);
        paragraphTreeSet.add(paragraph10);
        paragraphTreeSet.add(paragraph11);
        paragraphTreeSet.add(paragraph12);
        paragraphTreeSet.add(menu13);
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
    }

    public void start1Game() {
        allParagraphs();
        System.out.println(menu13);
        answer = scanner.nextInt();
        if (answer == 4) return;
        System.out.println(paragraph0);
        answer = scanner.nextInt();
        answerOpt(paragraph0,answer);
        while (a!=12) {
            for (Paragraph paragraph : paragraphTreeSet) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Options2)) return false;
        Options2 options2 = (Options2) o;
        return a == options2.a && answer == options2.answer && Objects.equals(paragraphTreeSet, options2.paragraphTreeSet) && Objects.equals(scanner, options2.scanner) && Objects.equals(paragraph0, options2.paragraph0) && Objects.equals(paragraph1, options2.paragraph1) && Objects.equals(paragraph2, options2.paragraph2) && Objects.equals(paragraph3, options2.paragraph3) && Objects.equals(paragraph4, options2.paragraph4) && Objects.equals(paragraph5, options2.paragraph5) && Objects.equals(paragraph6, options2.paragraph6) && Objects.equals(paragraph7, options2.paragraph7) && Objects.equals(paragraph8, options2.paragraph8) && Objects.equals(paragraph9, options2.paragraph9) && Objects.equals(paragraph10, options2.paragraph10) && Objects.equals(paragraph11, options2.paragraph11) && Objects.equals(paragraph12, options2.paragraph12) && Objects.equals(menu13, options2.menu13);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, answer, paragraphTreeSet, scanner, paragraph0, paragraph1, paragraph2, paragraph3, paragraph4, paragraph5, paragraph6, paragraph7, paragraph8, paragraph9, paragraph10, paragraph11, paragraph12, menu13);
    }
}
