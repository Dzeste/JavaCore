package TicTacToe;

import java.util.Scanner;

public class GameLogic {
  private boolean xMove = true;
  public boolean pobida = false;
  private final Scanner scanner = new Scanner(System.in);

  public boolean cheyHod() {
    return xMove;
  }

  private Integer getUserInput() {
    System.out.println(": ");
    Integer value = scanner.nextInt() ;
    return value;
  }

  public void VvestiPole(Field field) {
    boolean vvelikorretno = false;
    while (!vvelikorretno){
      System.out.print("Выбирите положение по вертикали (Значение от 1 до 3)  ");
      int i = getUserInput();
      System.out.print("Выбирите положение по горизонтали (Значение от 1 до 3)  ");
      int j = getUserInput();
      if (i < 3 & i >= 0 & j < 3 & j >= 0) {
        if (proverkaPolya(i, j, field)) {
          field.fields[i][j] = xMove ? "x" : "o";
          field.vivestiPole();
          if (proverkaPobeditelya(field)) {
            pobida = true;
            System.out.println("Ура побiда "+(this.cheyHod()? "x":"o"));
          }
          xMove = !xMove;
          vvelikorretno = true;
        }
      } else {
        System.out.println("Вы ввели не корректное число, Введите ешё раз");
      }
    }
  }

  private boolean proverkaPobeditelya(Field field) {
    if ((field.fields[0][0] == field.fields[0][1] & field.fields[0][0] == field.fields[0][2]) & ( field.fields[0][0] != "*" & field.fields[0][1] != "*" & field.fields[0][2] != "*")
            | (field.fields[1][0] == field.fields[1][1] & field.fields[1][0] == field.fields[1][2]) & ( field.fields[1][0] != "*" & field.fields[1][1] != "*" & field.fields[1][2] != "*")
            | (field.fields[2][0] == field.fields[2][1] & field.fields[2][0] == field.fields[2][2]) & ( field.fields[2][0] != "*" & field.fields[2][1] != "*" & field.fields[2][2] != "*") // строки
            | (field.fields[0][0] == field.fields[1][0] & field.fields[1][0] == field.fields[2][0]) & ( field.fields[0][0] != "*" & field.fields[1][0] != "*" & field.fields[2][0] != "*")
            | (field.fields[0][1] == field.fields[1][1] & field.fields[1][1] == field.fields[2][1]) & ( field.fields[0][1] != "*" & field.fields[1][1] != "*" & field.fields[2][1] != "*")
            | (field.fields[0][2] == field.fields[1][2] & field.fields[1][2] == field.fields[2][2]) & ( field.fields[0][2] != "*" & field.fields[1][2] != "*" & field.fields[2][2] != "*") // Стролбцы
            | (field.fields[0][0] == field.fields[1][1] & field.fields[0][0] == field.fields[2][2]) & ( field.fields[0][0] != "*" & field.fields[1][1] != "*" & field.fields[2][2] != "*")
            | (field.fields[0][2] == field.fields[1][1] & field.fields[0][2] == field.fields[2][0]) & ( field.fields[0][2] != "*" & field.fields[1][1] != "*" & field.fields[2][0] != "*"))// диагональ
    {
      return true;
    } else
      return false;
  }


  private boolean proverkaPolya(int i, int j,Field field){
    if(field.fields[i][j] == "*"){
      return true;
    }
    else {
      System.out.println("Поле занято");
      return false;
    }
  }

}
