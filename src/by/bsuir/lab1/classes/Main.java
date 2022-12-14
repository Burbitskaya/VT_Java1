package by.bsuir.lab1.classes;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(4, Color.Yellow);
        basket.addBall(6, Color.Red);
        basket.addBall(7, Color.Black);
        basket.addBall(5, Color.Blue);
        basket.addBall(8, Color.Black);
        basket.addBall(1, Color.Yellow);
        basket.addBall(2, Color.Blue);

        int totalWight = basket.getWeight();
        System.out.println("Total weight of basket: " + totalWight);
        int totalBlue = basket.getNumBalls(Color.Blue);
        System.out.println("Num of blue balls: " + totalBlue);
    }
}
