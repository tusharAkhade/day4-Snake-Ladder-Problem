public class UC2 {
	public static void main(String[] args) {
		int playerPosition = 0;
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + die);		
	}
}