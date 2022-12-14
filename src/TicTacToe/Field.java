package TicTacToe;

public class Field {
   public String[][] fields = new String[3][3];

    void zapolnitmassiv() {
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++) {
                fields[i][j] = "*";
            }
        }
    }


    public void vivestiPole() {
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++) {
                System.out.print(fields[i][j]+" ");
            }
            System.out.println();
        }

    }

}
