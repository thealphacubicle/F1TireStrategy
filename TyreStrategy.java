//This project purpose is to select the best tyre strategy and fuel load for a Formula 1 Race for one GP
import java.util.*;

public class TyreStrategy
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

//variables
            //String location = "";
            String trackCondition; //If the track is soaked, damp or dry
            int raceLength; //the length of the race
            int wetLaps, interLaps, softLaps, mediumLaps, hardLaps; //the length of all the tyre stints on average
            //int startingPosition; //The position which the driver qualified
            //int pitNumber;
            String startingTyre; //which tire the racer qualified on
            int stint2; //number of laps remaining after 1st pitstop
            int stint3; //number of laps remaining after 2nd pitstop
            int dampstint2 = 0;
            int dampstint3 = 0;
            int dampstint4;
            int wetstint2;
            int wetstint3;
        
            String secondStintAnswer= ""; //what tyre the driver will be using for the 2nd stint
            String thirdStintAnswer= ""; //what tyre the driver will be using for the 3rd stint
            String fourthStintAnswer= ""; //what tyre the driver will be using for the 4th stint
    //Define the average laps a stint can take in
    softLaps = 15;
    mediumLaps = 30;
    hardLaps = 40;
    interLaps = 20;
    wetLaps = 30;
    //Welcome to project 
        System.out.println("Welcome to the Formula 1 Strategy Calculator! We will attempt to provide the best tyre strategy for a race!");
        System.out.println("You will first answer a set of questions which we will use to calculate your optimal tire strategies. Beware that approximate assumptions are made in this program and shouldn't be used in real-life!");

    /*Ask which GP the user would like to choose to evaluate
        System.out.println("Enter the track name that you will be racing on: ");
            location = input.nextLine();
    */
                    
    //Ask the track conditions (wet or dry)
        System.out.println("Is the condition of the track soaked, damp or dry? Type in either soaked, damp or dry:");
            trackCondition = input.next();
            
        //INPUT VALIDATION

    //Ask race length
        System.out.println("How many laps is the race?");
            raceLength = input.nextInt();

    //Ask how many pit stops do they want to do
        //System.out.println("How many pitstops do you want to do (type in 1)");
           // pitNumber = input.nextInt();
        
        /*INPUT VALIDATION
        
            while (pitNumber < 1)
            {
                System.out.println("You need to have atleast one pitstop in the race! Try again!");
                pitNumber = input.nextInt();
            }        
            while (pitNumber > 3)
            {
                System.out.println("That's too many predicted pitstops! Reduce and try again");
                pitNumber = input.nextInt();
            }
            while ((raceLength / pitNumber) > hardLaps)
            {
                System.out.println("That is too many laps on a single stint. Consider increasing the number of pitstops");
                pitNumber = input.nextInt();
            }

            while ((raceLength / pitNumber) < softLaps)
            {
                System.out.println("That is too many predicted pitstops. Try decreasing the number of pitstops!");
                pitNumber = input.nextInt();
            }
        */


    //Ask which tire they qualified on
        System.out.println("Which tire did you qualify on? Enter soft, medium, hard, inter, or wet");
            startingTyre = input.next();
        
    //!trackCondition.equals()

        

    //_____________________________________________________________________________________________________________________________________________________________________

    //Calculations for the tyre stint
    

    //Calculation for a 1 stop race DRY
        if (trackCondition.equals("dry"))
        {
            if(startingTyre.equals("soft"))
            {
                stint2 = raceLength - softLaps;
                
                    if(stint2 <= softLaps)
                    {
                        secondStintAnswer = "softs";
                    }

                    else if(stint2 > softLaps && stint2 <= mediumLaps)
                    {
                        secondStintAnswer = "mediums";
                    }

                    else
                    {
                        secondStintAnswer = "hards";
                    }

            }

            else if(startingTyre.equals("medium"))
            {
                stint2 = raceLength - mediumLaps; 

                    if(stint2 <= softLaps)
                    {
                        secondStintAnswer = "softs";
                    }

                    else if(stint2 > softLaps && stint2 <= mediumLaps)
                    {
                        secondStintAnswer = "mediums";
                    }

                    else
                    {
                        secondStintAnswer = "hards";
                    }   

            }

            else if(startingTyre.equals("hard"))
            {
                stint2 = raceLength - hardLaps;
                
                    if(stint2 <= softLaps)
                    {
                        secondStintAnswer = "softs";
                    }

                    if(stint2 > softLaps && stint2 <= mediumLaps)
                    {
                        secondStintAnswer = "mediums";
                    }

                    else
                    {
                        secondStintAnswer = "hards";
                    }
            }
        }
    //Calculations for DAMP race 
        if(trackCondition.equals("damp"))
        {
            if(startingTyre.equals("inter"))
            {
                
                dampstint2 = raceLength - interLaps;
                secondStintAnswer = "inter";
                
                if(dampstint2 > interLaps)
                {
                    System.out.println("Cannot use a one-stop strategy because your tires will be worn out. We will add another stint.");
                    dampstint3 = dampstint2 - interLaps;
                    thirdStintAnswer = "inter";
                }

                else
                {
                    System.out.println("A two-stop strategy will not be enough. We will add another stint");
                    dampstint4 = dampstint3 - interLaps;
                    fourthStintAnswer = "inter";

                }
                

            }
        }

    //Calculations for SOAKED race
        if(trackCondition.equals("soaked"))
        {
            if(startingTyre.equals("wet"))
            {
                wetstint2 = raceLength - wetLaps;
                secondStintAnswer = "wet";

                if(wetstint2 > wetLaps)
                {
                    System.out.println("A one-stop race will not be enough. We will add another stint.");
                    wetstint3 = wetstint2 - wetLaps;
                    thirdStintAnswer = "wet";
                }
            }

        }
    
    //Display final answers

    System.out.println("Here is your ideal pit strategy. Keep in mind that this program should be used for simulation purposes only!");
        System.out.println("Starting tyre:" + startingTyre);
        System.out.println("First stop: " + secondStintAnswer);
        System.out.println("Second stop: " + thirdStintAnswer);
        System.out.println("Third stint: " + fourthStintAnswer);
        


















        
    }
}