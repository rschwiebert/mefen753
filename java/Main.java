public class Main {
    public static int[][] world = {{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0},{0,0,0,0,0,0,0}};
    static char[] key = {' ','g','d','p','y'};
    
    static void drawWorld() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(key[world[i][j]]);
            }
            System.out.print("\n");
        }
    }
    
	public static void main(String[] args) {
		int ground;
		for (int i = 0; i < 7; i++) {
		    ground = (int) Math.round(2 + Math.random());   //Random ground level
		    world[ground][i] = 1;
		    for (int j = 4; j > ground; j--) {
		        world[j][i] = 2;   //Fills the area beneath with dirt.
		    }
		}
		Player Steve = new Player();
		Steve.spawn();
		Dog wolfie = new Dog();
		wolfie.spawn();
		drawWorld();
		while (true) {
		    Steve.movePlayer();
		    drawWorld();
		}
	}
}