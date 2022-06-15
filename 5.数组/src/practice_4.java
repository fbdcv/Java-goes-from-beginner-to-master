import java.io.IOException;
import java.util.Scanner;

public class practice_4 {
    static char map[][] = new char[8][10];
    static int pX = 1;
    static int pY = 1;
    static boolean gameover = false;

    public static void main(String[] args) throws InterruptedException, IOException {
        init();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\033[H");
            paintGame();
            String cmd = sc.nextLine();
            switch (cmd.toLowerCase()) {
                case "w":
                    if(map[pY-1][pX]=='H');
                    else if(map[pY-1][pX]=='o'){
                        if(map[pY-2][pX]=='H');
                        else if(map[pY-2][pX]==' '){
                            map[pY][pX] =' ';
                            map[pY-1][pX] ='&';
                            map[pY-2][pX] ='o';
                            pY--;
                        }
                        else if(map[pY-2][pX]=='*'){
                            map[pY][pX] =' ';
                            map[pY-1][pX] ='&';
                            map[pY-2][pX] ='o';
                            pY--;
                            gameover = true;
                        }
                    }
                    else{
                        map[pY][pX]=' ';
                        map[--pY][pX]='&';
                    }
                    break;
                case "s":
                    if(map[pY+1][pX]=='H');
                    else if(map[pY+1][pX]=='o'){
                        if(map[pY+2][pX]=='H');
                        else if(map[pY+2][pX]==' '){
                            map[pY][pX] =' ';
                            map[pY+1][pX] ='&';
                            map[pY+2][pX] ='o';
                            pY++;
                        }
                        else if(map[pY+2][pX]=='*'){
                            map[pY][pX] =' ';
                            map[pY+1][pX] ='&';
                            map[pY+2][pX] ='o';
                            pY++;
                            gameover = true;
                        }
                    }
                    else{
                        map[pY][pX]=' ';
                        map[++pY][pX]='&';
                    }
                    break;
                case "a":
                    if(map[pY][pX-1]=='H');
                    else if(map[pY][pX-1]=='o'){
                        if(map[pY][pX-2]=='H');
                        else if(map[pY][pX-2]==' '){
                            map[pY][pX] =' ';
                            map[pY][pX-1] ='&';
                            map[pY][pX-2] ='o';
                            pX--;
                        }
                        else if(map[pY][pX-2]=='*'){
                            map[pY][pX] =' ';
                            map[pY][pX-1] ='&';
                            map[pY][pX-2] ='o';
                            pX--;
                            gameover = true;
                        }
                    }
                    else{
                        map[pY][pX]=' ';
                        map[pY][--pX]='&';
                    }
                    break;
                    case "d":
                    if(map[pY][pX+1]=='H');
                    else if(map[pY][pX+1]=='o'){
                        if(map[pY][pX+2]=='H');
                        else if(map[pY][pX+2]==' '){
                            map[pY][pX] =' ';
                            map[pY][pX+1] ='&';
                            map[pY][pX+2] ='o';
                            pX++;
                        }
                        else if(map[pY][pX+2]=='*'){
                            map[pY][pX] =' ';
                            map[pY][pX+1] ='&';
                            map[pY][pX+2] ='o';
                            pX++;
                            gameover = true;
                        }
                    }
                    else{
                        map[pY][pX]=' ';
                        map[pY][++pX]='&';
                    }
                    break;
                }
            if(gameover){
                break;
            }
        }

        sc.close();
        System.out.println("GameOver!!!");
    }

    private static void init() {
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 10; j++)
                map[i][j] = ' ';
        for (int i = 0; i < 8; i++) {
            map[i][0] = map[i][9] = 'H';
        }
        for (int i = 0; i < 10; i++) {
            map[0][i] = map[7][i] = 'H';
        }
        map[1][3] = 'H';
        map[2][3] = 'H';
        map[3][3] = 'H';
        map[2][5] = 'H';
        map[3][5] = 'H';
        map[3][6] = 'H';
        map[3][8] = 'H';
        map[4][8] = 'H';
        map[5][4] = 'H';
        map[5][5] = 'H';
        map[5][6] = 'H';
        map[6][4] = 'H';
        map[6][5] = '*';
        map[1][1] = '&';
        map[2][2] = 'o';

    }

    private static void paintGame() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + map[i][j]);
            }
            System.out.println();
        }

    }

}
