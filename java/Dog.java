public class Dog {
    public static int x = 1 + (int) Math.floor(6 * Math.random());
    public static int y = 0;
    
    public void fall() {
        while (Main.world[y][x] == 0) {
            y++;
        }
        y--;
    }
    
    public void spawn() {
        fall();
        if (Main.world[y + 1][x] == 4) {
            if (x == 0) {
                x++;
            } else {
                x--;
            }
            fall();
        }
        Main.world[y][x] = 3;
    }
}