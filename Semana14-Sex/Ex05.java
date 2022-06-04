import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char letra;
        boolean sair = false;
        int[][] M = new int[5][5];
        int x = 2;
        int y = 2;
        M[y][x] = 5;

        while (!sair) {
            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    System.out.print(M[i][j] + "  ");
                }
                System.out.println();
            }

            System.out.print("Movimento: ");
            letra = in.next().charAt(0);

            switch (letra) {
                case 'w': 
                    if (y > 0) {
                        M[y][x] = 0;
                        y--;
                        M[y][x] = 5;
                    } else {
                        System.out.println("Movimento invalido");
                    }
                    break;

                case 's': 
                    if (y < 4) {
                        M[y][x] = 0;
                        y++;
                        M[y][x] = 5;
                    } else {
                        System.out.println("Movimento invalido");
                    }
                    break;
                
                case 'a': 
                    if (x > 0) {
                        M[y][x] = 0;
                        x--;
                        M[y][x] = 5;
                    } else {
                        System.out.println("Movimento invalido");
                    }
                    break;

                case 'd':   
                    if (x < 4) {
                        M[y][x] = 0;
                        x++;
                        M[y][x] = 5;
                    } else {
                        System.out.println("Movimento invalido");
                    }
                    break;

                case 'f':
                    sair = true;
                    break;
                
                default:
                    System.out.println("Desculpe, nao entendo esse comando");
            }

        }
        
    }
}
