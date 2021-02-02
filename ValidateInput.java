package f1TyreStrategy;
import java.util.*;

import javax.swing.JOptionPane;
public class ValidateInput 
{
	Scanner input = new Scanner(System.in);
	
	//create instance data
	private String trackCondition, startingTyre, trackName;
	
	//constructor
	public ValidateInput(String trackCondition, String startingTyre) 
	{
		this.trackCondition = trackCondition;
		this.startingTyre = startingTyre;
	}
	
	public ValidateInput(String startingTyre) 
	{
		this.startingTyre = startingTyre;
	}
	
	
	
	
	//create methods
	
	public String CheckStartingTyre()
	{
		while(!startingTyre.equals("soft") && !startingTyre.trim().equals("medium") && !startingTyre.equals("hard") && !startingTyre.equals("inter") && !startingTyre.equals("wet"))
		{
				JOptionPane.showMessageDialog(null, "The compound entered is not a Pirelli tire compound.");
					this.startingTyre = JOptionPane.showInputDialog("Enter starting tyre again (soft, medium, hard, inter, or wet):");
				//System.out.println(this.startingTyre);
		}
		return this.startingTyre;
	}
	
	public String CheckWeatherInput()
	{
		do
		{
			
			 if(trackCondition.equalsIgnoreCase("dry") && startingTyre.equalsIgnoreCase("inter") || trackCondition.equalsIgnoreCase("dry") && startingTyre.equalsIgnoreCase("wet"))
			    {
				 	JOptionPane.showMessageDialog(null, "You cannot qualify on inters or wets when the weather is dry. Type in your starting tire again!");
			    		this.startingTyre = JOptionPane.showInputDialog("Enter starting tyre again (soft, medium, hard, inter, or wet):");

			    }
			    
			 else if(trackCondition.equalsIgnoreCase("damp") && !startingTyre.equalsIgnoreCase("inter"))
			    {
				 JOptionPane.showMessageDialog(null, "You cannot qualify on drys or wets when the weather is damp. Type in your starting tire again!");
			    		this.startingTyre = JOptionPane.showInputDialog("Enter starting tyre again (soft, medium, hard, inter, or wet):");
			    	
			    }
			    
			
			 else if(trackCondition.equalsIgnoreCase("soaked") && !startingTyre.equalsIgnoreCase("wet"))
			    {
				 JOptionPane.showMessageDialog(null, "It is too wet to qualify on drys or inters. Type in your starting tire again!");
			    	    this.startingTyre = JOptionPane.showInputDialog("Enter starting tyre again (soft, medium, hard, inter, or wet):");	
			    }    
		} while(trackCondition.equalsIgnoreCase("dry") && startingTyre.equalsIgnoreCase("inter") || trackCondition.equalsIgnoreCase("dry") && startingTyre.equalsIgnoreCase("wet")|| trackCondition.equalsIgnoreCase("damp")&& !startingTyre.equalsIgnoreCase("inter") || trackCondition.equalsIgnoreCase("soaked")&& !startingTyre.equalsIgnoreCase("wet"));
		return this.startingTyre;
	}
	
	

	


	
	
	
	
	
	
}
