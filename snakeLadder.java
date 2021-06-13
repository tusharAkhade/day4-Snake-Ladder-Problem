import java.util.Scanner;
public class UC4 {
	public static final int winningPosition = 100;
	public static void main(String[] args) {
		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String playerName = s.next();
		int playerPosition = 0;
		System.out.println("Player name: " + playerName);
		
		while ( winningPosition > playerPosition ) {
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		switch (option) {
			case 0:
				System.out.println("No play : " + 0);
				playerPosition += 0;
				break;
			case 1:
				System.out.println("Ladder  : " + "+" + die);
				playerPosition += die;
				break;
			default:
				System.out.println("Snake   : " + "-" + die);
				playerPosition -= die;
				if (playerPosition < 0)
					playerPosition = 0;
		}
		}
		System.out.println("Player position: " + playerPosition);
	}
}