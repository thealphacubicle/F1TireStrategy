package f1TyreStrategy;
import java.util.*;

import javax.swing.JOptionPane;
public class main 
{
	String startingTyre, trackName, trackCondition;
	int raceLength;  
	@SuppressWarnings("unused")
	public void DoEverything() 
	{
	Scanner user = new Scanner(System.in);
	
	

	//Welcome to project 
	JOptionPane.showMessageDialog(null, "Welcome to the Formula 1 Strategy Calculator! We will attempt to provide the best tyre strategy for a race!");
	JOptionPane.showMessageDialog(null, "You will first answer a set of questions which we will use to calculate your optimal tire strategies.");
	JOptionPane.showMessageDialog(null, "Please remember that this program assumes that weather conditions remain the same throughout the entire race. We are currently working to support multiweather strategies");
    	trackName = JOptionPane.showInputDialog("Enter the country where you are racing: ");	
    	trackCondition = JOptionPane.showInputDialog("Enter track condition (either soaked, damp or dry):");
    	raceLength = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of laps is the race:"));
	    startingTyre = JOptionPane.showInputDialog("Enter track condition (soft, medium, hard, inter, or wet):");

	    //Input validation here:
	    	ValidateInput objValidateTyre = new ValidateInput(startingTyre);
	    		startingTyre = objValidateTyre.CheckStartingTyre();
	    
	    	ValidateInput objValidateWeather = new ValidateInput(trackCondition,startingTyre);
	        	startingTyre = objValidateWeather.CheckWeatherInput();   
	        
	        
	    //Define the average laps a stint can take in
	   int softLaps = 15, mediumLaps = 30, hardLaps = 40, interLaps = 20, wetLaps = 30;
	   
       
    //print the calculations' results out
	   
	   RaceCalc objDryCalc = new RaceCalc(trackCondition, raceLength, startingTyre);
	   JOptionPane.showMessageDialog(null, objDryCalc.getResult());
	   
	//Get Methods for f1Panel	
	}

	public String getTrackName()
	{
		return trackName;
		
	}
	
	public String getStartingTyre()
	{
		return startingTyre;
		
	}
	
	public String getTrackCondition()
	{
		return trackCondition;
		
	}
	
	public int getraceLength()
	{
		return raceLength;
		
	}
}
