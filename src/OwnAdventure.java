import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {

	JOptionPane.showMessageDialog(null, "One day, a girl went canoeing on the Amazon River. ");	
	JOptionPane.showMessageDialog(null, "Suddenly, a crocodile emerged and started to swim sneakily to the canoe.");
	String crocodile = JOptionPane.showInputDialog("Should she jump from the canow and swim to shore or take her chances in the boat?");
	
	if (crocodile.equals("swim to shore")) {
		JOptionPane.showMessageDialog(null, "The girl jumped from the canoe and swam to shore.");
		
	}
	else {JOptionPane.showMessageDialog(null, "She stayed in the boat and the crocodile creeped closer and ramed into the side, the girl fell into the water and didn't resurface.");
	System.exit(0);}
	JOptionPane.showMessageDialog(null, "She lay on the bank out of breath, but stood up and walked deep into the jungle.");
	
	JOptionPane.showMessageDialog(null, "As the girl walked deeper into the jungle, the trees grew eerily taller and vines covered the floor more heavily.");
	JOptionPane.showMessageDialog(null, "A ravenous tiger appeared from out behind the tree, its head perked as the girl tried to move away silently.");
	 String tiger = JOptionPane.showInputDialog("Should the girl run or stay still and hope it goes away?");
	 
	 if (tiger.equals("run")) {
	JOptionPane.showMessageDialog(null, "She ran through the jungle as the tiger looked away for the slightest second, and escaped the tiger's plausible wrath.");
	 }
	 else {
		 JOptionPane.showMessageDialog(null, "The tiger saw the girl as vulnerable prey and chased her just as she tried to run. Eventually the tiger caught up to her and that was the girl's most unfortunate accident.");
			System.exit(0);
	 }
	 
	 JOptionPane.showMessageDialog(null, "");
	 }
	}

	
	
