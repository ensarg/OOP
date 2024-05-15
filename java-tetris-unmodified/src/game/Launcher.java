package game;

public class Launcher {
	public static void main(String[] args) {			
		Game game1 = new Game("java tetris 1");
		game1.run();

		Game game2 = new Game("java tetris 2");
		game2.run();
	}
}
