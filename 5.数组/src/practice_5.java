import java.util.Scanner;

public class practice_5 {

    static char map[][] = new char[11][11];
    static boolean chess = false;
    static int pX;
    static int pY;

    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        while (true) {
            paintGame();
            int cmd = sc.nextInt();
            pX = cmd / 10 % 10;
            pY = cmd % 10;
            if (map[pX + 1][pY + 1] == '-')
                map[++pY][++pX] = chess ? 'o' : '*';
            else
                continue;
            if (gameover()) {
                System.out.printf("%c棋胜！！！\n",chess ? 'o' : '*');
                break;
            }
            chess = !chess;
        }
        sc.close();

    }

    static void init() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                map[i][j] = '-';
            }
        }
        for (int i = 0; i <= 9; i++) {
            map[i + 1][0] = map[0][i + 1] = (char) (48 + i);
        }
        map[0][0] = ' ';

    }

    static void paintGame() {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(" " + map[i][j]);
            }
            System.out.println();
        }
    }

    static boolean gameover() {
        int x = pX;
        int y = pY;
        for (int i = 0; i < 5; i++, y--) {
            if (y >= 1 && y <= 10 && y + 4 >= 1 && y + 4 <= 10)
                if (map[y + 1][x] == map[y][x] && map[y + 2][x] == map[y][x] && map[y + 3][x] == map[y][x]
                        && map[y + 4][x] == map[y][x]) {
                    return true;
                }
        }
        x = pX;
        y = pY;
        for (int i = 0; i < 5; i++, x--) {
            if (x >= 1 && x <= 10 && x + 4 >= 1 && x + 4 <= 10)
                if (map[y][x + 1] == map[y][x] && map[y][x + 2] == map[y][x] && map[y][x + 3] == map[y][x]
                        && map[y][x + 4] == map[y][x]) {
                    return true;
                }
        }

        x = pX;
        y = pY;
        for (int i = 0; i < 5; i++, x--, y--) {
            if (x >= 1 && x <= 10 && x + 4 >= 1 && x + 4 <= 10 && y >= 1 && y <= 10 && y + 4 >= 1 && y + 4 <= 10)
                if (map[y + 1][x + 1] == map[y][x] && map[y + 2][x + 2] == map[y][x] && map[y + 3][x + 3] == map[y][x]
                        && map[y + 4][x + 4] == map[y][x]) {
                    return true;
                }
        }

        x = pX;
        y = pY;
        for (int i = 0; i < 5; i++, x++, y--) {
            if (x >= 1 && x <= 10 && x - 4 >= 1 && x - 4 <= 10 && y >= 1 && y <= 10 && y + 4 >= 1 && y + 4 <= 10)
                if (map[y + 1][x - 1] == map[y][x] && map[y + 2][x - 2] == map[y][x] && map[y + 3][x - 3] == map[y][x]
                        && map[y + 4][x - 4] == map[y][x]) {
                    return true;
                }
        }

        return false;
    }

}
