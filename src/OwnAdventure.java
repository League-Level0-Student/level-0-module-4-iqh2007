import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"One day in Africa, Lily was sitting in canoe floating and rowing down the Amazon River.");

		JOptionPane.showMessageDialog(null, "Suddenly, a large crocodile emerged. ");

		String crocodile = JOptionPane.showInputDialog("Should Lily get eaten or swim to shore?");
		if (crocodile.equals("Swim to shore")) {
			JOptionPane.showMessageDialog(null, "Lily swam to shore, and collapsed on the bank");

		} else {
			JOptionPane.showMessageDialog(null, "Lily, got eaten!");
			JOptionPane.showMessageDialog(null, "Game Over!");
			System.exit(1);
		}

		JOptionPane.showMessageDialog(null,
				"After Lily collapsed on the bank, she stood up and wandered cautiously into the forest.");

		JOptionPane.showMessageDialog(null, "As Lily walked, she became more and more aware of her surroundings.");

		JOptionPane.showMessageDialog(null, "The leaves on the trees rustled in the unnatural silence.");

		JOptionPane.showMessageDialog(null,
				"In the blink of an eye, as Lily rounded the corner, there stood a ancient temple covered in vines.");

		String tiger = JOptionPane
				.showInputDialog("Should Lily enter the temple or run away from the incoming angry tiger?");

		if (tiger.equals("Enter")) {
			JOptionPane.showMessageDialog(null, "Lily ran away from the slobbering tiger into the temple");
		} else {
			JOptionPane.showMessageDialog(null, "Lily got torn apart by the ravenous tiger!");
			System.exit(1);
		}
		
		JOptionPane.showMessageDialog(null, "Inside the temple, there were torches that suddenly lit as Lily walked passed.");		
		
		JOptionPane.showMessageDialog(null, " Suddenly an errie noise swept through the stone halls and Lily hugged herself in fear.");
		
		JOptionPane.showMessageDialog(null, "Then that errie noise transformed into a growl and the ravenous tiger reappeared.");
		
		JOptionPane.showMessageDialog(null, " THe tiger lunged at Lily and still to this day, the temple lies a monument to the death of Lily.");
		
		
	}
	
	
	
	

}
