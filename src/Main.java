import transport.Car;

public class Main {
    public static void main(String[] args) {
        Flower[] flowers = new Flower[10];
        Flower rose = new Flower()
        Flower chrisantema = new Flower("Хризантема", null,  15, 5);
        flowers[0] = rose;
        flowers[1] = chrisantema;

        calculate(flowers);
        System.out.println(Character.isDigit('0'));
        System.out.println(Character.isDigit('1'));

        System.out.println(Car.checkNomerAuto("а789ср000"));
    }
    private static void calculate(Flower[] flowers) {
        int lifeSpan = Integer.MAX_VALUE;
        double sum = 0;
        String text = "В букете есть: \n";
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] != null) {
                text += " " + flowers[i].getName() + " " + "на " + flowers[i].getCountry() + " \n";
                if (flowers[i].getLifeSpan() < lifeSpan) {
                    lifeSpan = flowers[i].getLifeSpan();
                }
                sum += flowers[i].getCost();
            }
        }
        sum = sum * 1.18;
        text += "\n";
        text += "Сумма букета = " + String.format(" %.2f", sum);
        text += "\n";
        text += "Срок годности: " + lifeSpan;
        System.out.println(text);
    }
}