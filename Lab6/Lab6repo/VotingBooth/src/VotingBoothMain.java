
import java.awt.BorderLayout;

import javax.swing.JFrame;
public class VotingBoothMain
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Voting Booth");
		VotingBooth myVoter = new VotingBooth();
		
		frame.getContentPane().add(myVoter.getContent1(), BorderLayout.NORTH);
		frame.getContentPane().add(myVoter.getContent2(),BorderLayout.CENTER);
		frame.getContentPane().add(myVoter.getContent3(),BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}

}