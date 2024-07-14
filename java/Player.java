import java.util.Scanner;

public class Player {
    static int x = 1 + (int) Math.floor(6 * Math.random());
    static int y = 0;
    
    public void fall() {
        while (Main.world[y][x] == 0) {
            y++;
        }
        y--;
    }

    public void spawn() {
        fall();
        Main.world[y][x] = 4;
    }
    
    public void movePlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which way would you like to move? (LEFT/RIGHT/LEFTUP/RIGHTUP)");
        //System.out.println("(Please use lowercase!)");
        String Direction = scan.nextLine();
        int oldX = x, oldY = y;
        switch(Direction) {
            case "4":
            if (x - 1 >= 0) {
                x--;
                if (Main.world[y][x] == 0) {
                    fall();
                    Main.world[oldY][oldX] = 0;
                    Main.world[y][x] = 4;
                } else {
                    if (Main.world[y][x] == 3) {
                        System.out.println("'Woof woof!!' wolfie says");
                    }
                    x++;
                }
            }
            break;
            case "6":
            if (x + 1 <= 6) {
                x++;
                if (Main.world[y][x] == 0) {
                    fall();
                    Main.world[oldY][oldX] = 0;
                    Main.world[y][x] = 4;
                } else {
                    if (Main.world[y][x] == 3) {
                        System.out.println("'Woof woof!!' wolfie says");
                    }
                    x--;
                }
            }
            break;
            case "7":
            if (x - 1 >= 0) {
                x--;
                if (y > 0) {
                    y--;
                }
                if (Main.world[y][x] == 0) {
                    fall();
                    Main.world[oldY][oldX] = 0;
                    Main.world[y][x] = 4;
                } else {
                    x = oldX;
                    y = oldY;
                }
            }
            break;
            case "9":
            if (x + 1 <= 6) {
                x++;
                if (y > 0) {
                    y--;
                }
                if (Main.world[y][x] == 0) {
                    fall();
                    Main.world[oldY][oldX] = 0;
                    Main.world[y][x] = 4;
                } else {
                    x = oldX;
                    y = oldY;
                }
            }
        }
    }
}
