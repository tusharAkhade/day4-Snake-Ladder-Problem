import java.util.Scanner;
public class UC6 {
	public static final int winningPosition = 100;
	public static void main(String[] args) {
		System.out.print("Enter player name: ");
		Scanner s = new Scanner(System.in);
		String playerName = s.next();
		int playerPosition = 0;
		int dieCounter = 0;
		System.out.println("Player name: " + playerName);
		while ( winningPosition > playerPosition ) {
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		dieCounter++;
		int remainingPosition = winningPosition - playerPosition;
		int option = (int) (Math.floor(Math.random() * 10) % 3);
		if( remainingPosition >= die ) {
		switch (option) {
			case 0:
				playerPosition += 0;
				break;
			case 1:
				playerPosition += die;
				break;
			default:
				playerPosition -= die;
				if (playerPosition < 0)
					playerPosition = 0;
		} // end of switch
		} // end of if
		System.out.println("Player position: " + playerPosition);
		} // end of while
		System.out.println("Dice rolled " + dieCounter + " times.");
	}
}