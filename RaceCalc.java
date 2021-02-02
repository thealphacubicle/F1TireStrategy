package f1TyreStrategy;
public class RaceCalc 
{

	private String startingTyre, secondStintAnswer, thirdStintAnswer, fourthStintAnswer, fifthStintAnswer, result;
	private int raceLength, stint2, stint3, dampstint2, dampstint3, dampstint4, wetstint2, wetstint3, wetstint4;
	
	int softLaps = 15, mediumLaps = 30, hardLaps = 40, interLaps = 20, wetLaps = 30;
	public RaceCalc(String trackCondition, int raceLength, String startingTyre) 
	{
		this.raceLength = raceLength;
		this.startingTyre = startingTyre;
		if (trackCondition.equalsIgnoreCase("dry"))
        {
			result = this.DryCalc();
        }
		
		if(trackCondition.equalsIgnoreCase("damp"))
		{
			result = this.DampCalc();
		}
		
		if(trackCondition.equalsIgnoreCase("soaked"))
		{
			result = this.SoakedCalc();
		}
	}
	
    public String getResult()
    {
    	return result;
    }


	public String DryCalc()
	{

      if(startingTyre.equalsIgnoreCase("soft"))
           {
                stint2 = raceLength - softLaps;
                
                    if(stint2 <= softLaps)
                    {
                        secondStintAnswer = "softs";
                        stint3 = stint2 - softLaps;
                    }

                    else if(stint2 > softLaps && stint2 <= mediumLaps)
                    {
                        secondStintAnswer = "mediums";
                        stint3 = stint2 - mediumLaps;
                    }

                    else
                    {
                        secondStintAnswer = "hards";
                        stint3 = stint2 - hardLaps;
                       
                    }
                    
                
                if(stint3 <= softLaps)
                {
                    thirdStintAnswer = "softs";
                }

                else if(stint3 > softLaps && stint3 <= mediumLaps)
                {
                    thirdStintAnswer = "mediums";
                }

                else
                {
                    thirdStintAnswer = "hards";
                   
                }     
            }

            else if(startingTyre.equalsIgnoreCase("medium"))
            {
                stint2 = raceLength - mediumLaps; 

                    if(stint2 <= softLaps)
                    {
                        secondStintAnswer = "softs";
                        stint3 = stint2 - softLaps;
                    }

                   
                    else if(stint2 > softLaps && stint2 <= mediumLaps)
                    {
                        secondStintAnswer = "mediums";
                        stint3 = stint2 - mediumLaps;
                    }

                    else
                    {
                        secondStintAnswer = "hards";
                        stint3 = stint2 - hardLaps;
                    } 
                    
                    if(stint3 <= softLaps)
                    {
                        thirdStintAnswer = "softs";
                        
                    }

                    else if(stint3 > softLaps && stint3 <= mediumLaps)
                    {
                        thirdStintAnswer = "mediums";
                        
                    }

                    else
                    {
                        thirdStintAnswer = "hards";
                        
                    } 
            }

            else if(startingTyre.equalsIgnoreCase("hard"))
            {
                stint2 = raceLength - hardLaps;
                
                    if(stint2 <= softLaps)
                    {
                        secondStintAnswer = "softs";
                        stint3 = stint2 - softLaps;
                    }

                    if(stint2 > softLaps && stint2 <= mediumLaps)
                    {
                        secondStintAnswer = "mediums";
                        stint3 = stint2 - mediumLaps;
                    }
                    

                    else
                    {
                        secondStintAnswer = "hards";
                        stint3 = stint2 - hardLaps;
                    }
                    
                    if(stint3 <= softLaps)
                    {
                        thirdStintAnswer = "softs";
                        
                    }

                    else if(stint3 > softLaps && stint3 <= mediumLaps)
                    {
                        thirdStintAnswer = "mediums";
                        
                    }
                    

                    else
                    {
                        thirdStintAnswer = "hards";
                        
                    }
            }
      
      		return "Starting Tyre: " + startingTyre + " \nFirst Stop onto: " + secondStintAnswer + " \nSecond stop onto: " + thirdStintAnswer + " \nThird stop onto: " + fourthStintAnswer + "\nFourth Stint onto: " + fifthStintAnswer;
        }
	
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String DampCalc()
	{
		if(startingTyre.equalsIgnoreCase("inter"))
        {
            
            dampstint2 = raceLength - interLaps;
            secondStintAnswer = "inter";
            
            if(dampstint2 > interLaps)
            { 
                dampstint3 = dampstint2 - interLaps;
                thirdStintAnswer = "inter";
            }

            if(dampstint3 > interLaps)
            {
                dampstint4 = dampstint3 - interLaps;
                fourthStintAnswer = "inter";

            }
            
            if(dampstint4 > interLaps)
            {
                fifthStintAnswer = "inter";
            } 

        }
		
  		return "Starting Tyre: " + startingTyre + " \nFirst Stop onto: " + secondStintAnswer + " \nSecond stop onto: " + thirdStintAnswer + " \nThird stop onto: " + fourthStintAnswer + "\nFourth Stint onto: " + fifthStintAnswer;

	}
	
	private String SoakedCalc() 
	{
		if(startingTyre.equalsIgnoreCase("wet"))
        {
			wetstint2 = raceLength - wetLaps;
            secondStintAnswer = "wet";

            if(wetstint2 > wetLaps)
            {
               wetstint3 = wetstint2 - wetLaps;
               thirdStintAnswer = "wet";
            }
            
           
            if(wetstint3 > wetLaps)
            {
               wetstint4 = wetstint3 - wetLaps;
               fourthStintAnswer = "wet";
            }
            
            if(wetstint4 > wetLaps)
            {
               fifthStintAnswer = "wet";
            }
            
        }    
		return "Starting Tyre: " + startingTyre + " \nFirst Stop onto: " + secondStintAnswer + " \nSecond stop onto: " + thirdStintAnswer + " \nThird stop onto: " + fourthStintAnswer + "\nFourth Stint onto: " + fifthStintAnswer;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
