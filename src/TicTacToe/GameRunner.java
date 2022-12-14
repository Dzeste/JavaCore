package TicTacToe;

public class GameRunner {
    public static void main(String[] args) {
        System.out.println("Zapusk");

        Field field = new Field();
        GameLogic logic = new GameLogic();

        field.zapolnitmassiv();
        field.vivestiPole();

        System.out.println("Первые ходят \"Х\".");
        while (logic.pobida==false){
            logic.VvestiPole(field);
            System.out.println("Ход за "+"\"" +(logic.cheyHod()? "x":"o")+"\"");
        }
    }
}
