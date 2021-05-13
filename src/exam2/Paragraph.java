package exam2;

public class Paragraph {
    String text;
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Paragraph(String text, int a, int b, int c) {
        this.text = text;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Paragraph(String text, int a) {
        this.text = text;
        this.a = a;
    }

    @Override
    public String toString() {
        return text;
    }
}
