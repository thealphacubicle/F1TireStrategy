
package f1TyreStrategy;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class f1panel extends JPanel 
{
	//create instance data
	private int width, height;
	
	
	//set up the variables for the images
	private ImageIcon abudhabi,australia, austria, azerbaijan, bahrain, belgium, brazil, britain, canada;
	private ImageIcon china, france, germany, hungary, italy, japan, mexico, monoco, russia, singapore, spain, usa;
	
	private main info = new main();
	//constructor
	public f1panel()
	{
		info.DoEverything();
		//set up image locations here
		abudhabi = new ImageIcon("src/f1TyreStrategy/abudhabi.png");
		australia = new ImageIcon("src/f1TyreStrategy/Australia.png");
		austria = new ImageIcon("src/f1TyreStrategy/Austria.png");
		azerbaijan = new ImageIcon("src/f1TyreStrategy/Azerbaijan.png");
		bahrain = new ImageIcon("src/f1TyreStrategy/Bahrain.png");
		belgium = new ImageIcon("src/f1TyreStrategy/Belgium.png");
		brazil = new ImageIcon("src/f1TyreStrategy/Brazil.jfif");
		britain = new ImageIcon("src/f1TyreStrategy/Britain.png");
		canada = new ImageIcon("src/f1TyreStrategy/Canada.png");
		china = new ImageIcon("src/f1TyreStrategy/China.jfif");
		france = new ImageIcon("src/f1TyreStrategy/France.png");
		germany = new ImageIcon("src/f1TyreStrategy/Germany.jfif");
		hungary = new ImageIcon("src/f1TyreStrategy/Hungary.jfif");
		italy = new ImageIcon("src/f1TyreStrategy/Italy.png");
		japan = new ImageIcon("src/f1TyreStrategy/Japan.png");
		mexico = new ImageIcon("src/f1TyreStrategy/Mexico.png");
		monoco = new ImageIcon("src/f1TyreStrategy/Monoco.png");
		russia = new ImageIcon("src/f1TyreStrategy/Russia.png");
		singapore = new ImageIcon("src/f1TyreStrategy/Singapore.png");
		spain = new ImageIcon("src/f1TyreStrategy/Spanish.png");
		usa = new ImageIcon("src/f1TyreStrategy/USA.jpg");
		
		width = 1000;
		height = 1000;
		this.setBackground(Color.lightGray);
		this.setPreferredSize(new Dimension(width, height));
		
		
	}
	
	
	
	
	//Draw the graph here
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//Circuit drawing here
		
		if(info.getTrackName().equalsIgnoreCase("Australia"))
		{
			australia.paintIcon(this, g, 370, 230);
			g.setFont(new Font("Times New Roman", Font.BOLD, 30));
				g.drawString("Track: Albert Park, Australia", 290, 560);
			g.setFont(new Font("Cambria", Font.PLAIN, 16));
				g.drawString("Average Tyre Wear: High", 390, 600);
				g.drawString("Track Distance: 5.303 km", 390, 620);
				g.drawString("Lap Record: 1:24.125", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Abu Dhabi"))
		{
			abudhabi.paintIcon(this, g, 370, 230);
			g.setFont(new Font("Times New Roman", Font.BOLD, 30));
				g.drawString("Track: Yas Marina, Abu Dhabi", 290, 560);
			g.setFont(new Font("Cambria", Font.PLAIN, 16));
				g.drawString("Average Tyre Wear: Low", 390, 600);
				g.drawString("Track Distance: 5.554 km", 390, 620);
				g.drawString("Lap Record: 1:39.283", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Austria"))
		{
			austria.paintIcon(this, g, 370, 230);
			g.setFont(new Font("Times New Roman", Font.BOLD, 30));
				g.drawString("Track: Red Bull Ring, Austria", 290, 560);
			g.setFont(new Font("Cambria", Font.PLAIN, 16));
				g.drawString("Average Tyre Wear: High", 390, 600);
				g.drawString("Track Distance: 4.318 km", 390, 620);
				g.drawString("Lap Record: 1:07.475", 390, 640);
		}
			
		if(info.getTrackName().equalsIgnoreCase("Azerbaijan"))
		{
		azerbaijan.paintIcon(this, g, 370, 230);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Baku City Circuit, Azerbaijan", 290, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Medium", 390, 600);
			g.drawString("Track Distance: 6.003 km", 390, 620);
			g.drawString("Lap Record: 1:43.009", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Bahrain"))
		{
		bahrain.paintIcon(this, g, 370, 230);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Bahrain International Circuit, Bahrain", 200, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 4.318 km", 390, 620);
			g.drawString("Lap Record: 1:07.475", 390, 640);
		
		}
		
		if(info.getTrackName().equalsIgnoreCase("Belgium"))
		{
		belgium.paintIcon(this, g, 370, 230);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Circuit de Spa-Francorchamps, Belgium", 200, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Medium", 390, 600);
			g.drawString("Track Distance: 7.004 km", 390, 620);
			g.drawString("Lap Record: 1:47.483", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Brazil"))
		{
		brazil.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Autódromo José Carlos Pace, Brazil", 200, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Medium", 390, 600);
			g.drawString("Track Distance: 4.309 km", 390, 620);
			g.drawString("Lap Record: 1:10.698", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Britain") || info.getTrackName().equalsIgnoreCase("UK"))
		{
		britain.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Silverstone Circuit, Great Britain", 200, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 5.891 km", 390, 620);
			g.drawString("Lap Record: 1:27.097", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Canada"))
		{
		canada.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Circuit Gilles Villeneuve, Canada", 200, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Low", 390, 600);
			g.drawString("Track Distance: 4.361 km", 390, 620);
			g.drawString("Lap Record: 1:13.078", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("China"))
		{
		china.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Shanghai International Circuit, China", 200, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 5.451 km", 390, 620);
			g.drawString("Lap Record: 1:34.742", 390, 640);
		}
			
		if(info.getTrackName().equalsIgnoreCase("France"))
		{
		france.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Circuit Paul Ricard, France", 245, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 5.842 km", 390, 620);
			g.drawString("Lap Record: 1:32.720", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Germany"))
		{
		germany.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Hockenheimring, Germany", 245, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Medium", 390, 600);
			g.drawString("Track Distance: 4.574 km", 390, 620);
			g.drawString("Lap Record: 1:16.645", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Hungary"))
		{
		hungary.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Hungaroring, Hungary", 260, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 4.381 km", 390, 620);
			g.drawString("Lap Record: 1:16.627", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Italy"))
		{
		italy.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Autodromo Nazionale di Monza\r\n"
					+ " Monza Circuit, Italy", 110, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Low", 390, 600);
			g.drawString("Track Distance: 5.793 km", 390, 620);
			g.drawString("Lap Record: 1:21.046", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Japan"))
		{
		japan.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Suzuka Circuit, Japan", 280, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Medium", 390, 600);
			g.drawString("Track Distance: 5.807 km", 390, 620);
			g.drawString("Lap Record: 1:30.983", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Mexico"))
		{
		mexico.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Autódromo Hermanos Rodríguez, Mexico City", 150, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 4.304 km", 390, 620);
			g.drawString("Lap Record: 1:19.232", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Monaco"))
		{
		monoco.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Circuit de Monaco, Monaco", 260, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Low", 390, 600);
			g.drawString("Track Distance: 3.337 km", 390, 620);
			g.drawString("Lap Record: 1:14.279", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Russia"))
		{
		russia.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Sochi Autodrom, Russia", 260, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: Medium", 390, 600);
			g.drawString("Track Distance: 5.848 km", 390, 620);
			g.drawString("Lap Record: 1:37.030", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Singapore"))
		{
		singapore.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Marina Bay Street Circuit, Singapore", 190, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 5.063 km", 390, 620);
			g.drawString("Lap Record: 1:36.217", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("Spain"))
		{
		spain.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Circuit de Barcelona-Catalunya, Spain", 190, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 4.655 km", 390, 620);
			g.drawString("Lap Record: 1:15.584", 390, 640);
		}
		
		if(info.getTrackName().equalsIgnoreCase("USA") || info.getTrackName().equalsIgnoreCase("United States"))
		{
		usa.paintIcon(this, g, 370, 250);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
			g.drawString("Track: Circuit of the Americas, USA", 190, 560);
		g.setFont(new Font("Cambria", Font.PLAIN, 16));
			g.drawString("Average Tyre Wear: High", 390, 600);
			g.drawString("Track Distance: 5.513 km", 390, 620);
			g.drawString("Lap Record: 1:32.029", 390, 640);
		}
	}
}

