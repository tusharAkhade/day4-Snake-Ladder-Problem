import java.util.Scanner;
public class UC3 {
	public static void main(String[] args) {
		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String playerName = s.next();
		int playerPosition = 0;
		System.out.println("Player name: " + playerName);
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + die);
		
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		switch (option) {
			case 0:
				System.out.println("No play");
				playerPosition += 0;
				break;
			case 1:
				System.out.println("Ladder");
				playerPosition += die;
				break;
			default:
				System.out.println("Snake");
				playerPosition -= die;
				if (playerPosition < 0)
					playerPosition = 0;		
		}
		System.out.println("Player position: " + playerPosition);
	}
}