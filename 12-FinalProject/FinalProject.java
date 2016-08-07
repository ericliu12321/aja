import javafx.application.Application; //Imports all necessary imports
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FinalProject extends Application
{
	Songs song1 = new Songs("Song1", "Bob Johnson", "10.55"); //Creates 5 new songs to be sold
	Songs song2 = new Songs("Song2", "John Smith", "9.55");
	Songs song3 = new Songs("Song3", "Eric Liu", "11.95");
	Songs song4 = new Songs("Song4", "Phil Michaelson", "12.00");
	Songs song5 = new Songs("Song5", "Stradlater Mahableshwarker", "11.01");
	
	RadioButton visa = new RadioButton("Visa "); //Creates the radio buttons for type of payment
	RadioButton masterCard = new RadioButton("Master Card ");
	RadioButton amex = new RadioButton("Amex ");
	
	Label payment = new Label(); //Adds a new label for displaying what type of payment is selected
	
	CheckBox first = new CheckBox(song1.getTitle() + " by " + song1.getArtist() + " ( $" + song1.getPrice() + " )");
	CheckBox second = new CheckBox(song2.getTitle() + " by " + song2.getArtist() + " ( $" + song2.getPrice() + " )");
	CheckBox third = new CheckBox(song3.getTitle() + " by " + song3.getArtist() + " ( $" + song3.getPrice() + " )");
	CheckBox fourth = new CheckBox(song4.getTitle() + " by " + song4.getArtist() + " ( $" + song4.getPrice() + " )");
	CheckBox fifth= new CheckBox(song5.getTitle() + " by " + song5.getArtist() + " ( $" + song5.getPrice() + " )");
	//Creates 5 check boxes so that the user gets to choose which songs that they want
	String display = " "; //Helps display songs in a label
	
	Boolean target1 = false; //For adding all the prices together
	Boolean target2 = false;
	Boolean target3 = false;
	Boolean target4 = false;
	Boolean target5 = false;
	
	Label songs = new Label(); //Song label
	
	Label cost = new Label(); //Cost label
	
	public void start( Stage myStage )
	{
		myStage.setTitle("Song Store"); //Names the stage "Song Store"
		
		GridPane rootNode = new GridPane(); //Creates a grid pane //Uses a grid pane
		rootNode.setPadding( new Insets( 30 )); //Sets padding of 30 pixels
		rootNode.setHgap( 5 ); //Horizontal gap as 5 pixels
		rootNode.setVgap( 5 ); //Vertical gap as 5 pixels
		rootNode.setAlignment( Pos.CENTER ); //All centered
		
		TextField name = new TextField(); //2 new text fields for the name and email
		TextField email = new TextField();
		
		ToggleGroup myGroup = new ToggleGroup(); //New toggle group
		
		visa.setToggleGroup(myGroup); //All types of payment are in the toggle group
		masterCard.setToggleGroup(myGroup);
		amex.setToggleGroup(myGroup);
		
		visa.setOnAction( new visaHandler()); //Set on action for radio buttons
		masterCard.setOnAction( new masterCardHandler());
		amex.setOnAction( new amexHandler());
		
		first.setOnAction( new checkBoxHandler() ); //Set on action for check boxes
		second.setOnAction( new checkBoxHandler() );
		third.setOnAction( new checkBoxHandler() );
		fourth.setOnAction( new checkBoxHandler() );
		fifth.setOnAction( new checkBoxHandler() );
		
		Button calculate = new Button("Calculate"); //Calculate button
		Button exit = new Button("Exit"); //Exit button
		
		calculate.setOnAction( new calculateHandler() ); //Calculates the price
		exit.setOnAction( new exitHandler() ); //Exits
		
		Scene myScene = new Scene( rootNode, 300, 200 ); //Creates the scene
		
		rootNode.add( new Label("Name: "), 0,0); //Adds everything
		rootNode.add( name, 1,0);
		rootNode.add( new Label("Email Address: "), 0,1);
		rootNode.add( email, 1,1);
		rootNode.add( new Label("Select your type of payment: "), 0,3);
		rootNode.add( payment, 1,3);
		rootNode.add( visa, 0,4);
		rootNode.add( masterCard, 1,4);
		rootNode.add( amex, 2,4);
		rootNode.add( new Label("What are the songs that you would like to purchase: "), 0,6);
		rootNode.add( first, 0,7);
		rootNode.add( second, 1,7);
		rootNode.add( third, 2,7);
		rootNode.add( fourth, 3,7);
		rootNode.add( fifth, 4,7);
		rootNode.add( new Label("Your shopping cart contains: "), 0,8);
		rootNode.add( songs, 1,8);
		rootNode.add( cost, 0,9);
		rootNode.add( calculate, 3,11);
		rootNode.add( exit, 4,11);
		rootNode.setHalignment( calculate, HPos.RIGHT ); //Positions the buttons to the right
		rootNode.setHalignment( exit, HPos.RIGHT );
		
		myStage.setScene( myScene ); //Sets the scene
		myStage.show(); //Shows the stage
		
	}
	
	class visaHandler implements EventHandler<ActionEvent> //If the radio button for a certain type of payment is
	{//														selected, then it will print out the type of payment
		
		public void handle(ActionEvent arg0)
		{
			
			payment.setText("Visa");
			
		}
		
	}
	
	class masterCardHandler implements EventHandler<ActionEvent>
	{
		
		public void handle(ActionEvent arg0)
		{
			
			payment.setText("MasterCard");
			
		}
		
	}
	
	class amexHandler implements EventHandler<ActionEvent>
	{
		
		public void handle(ActionEvent arg0)
		{
			
			payment.setText("Amex");
			
		}
		
	}
	
	class checkBoxHandler implements EventHandler<ActionEvent>
	{
		
		public void handle(ActionEvent arg0) //Displays the songs
		{
			
			display();
			
		}
		
	}
	
	public void display()
	{
		
		String s1 = null; //If the check box is selected, then use these strings to add onto the display string
		String s2 = null; //Which will then be printed
		String s3 = null;
		String s4 = null;
		String s5 = null;
		if(first.isSelected())
		{
			s1 = "Song1 ";
			target1 = true; //For calculating the price purposes
		}
		else
			target1 = false;
		if(second.isSelected())
		{
			s2 = "Song2 ";
			target2 = true;
		}
		else
			target2 = false;
		if(third.isSelected())
		{
			s3 = "Song3 ";
			target3 = true;
		}
		else
			target3 = false;
		if(fourth.isSelected())
		{
			s4 = "Song4 ";
			target4 = true;
		}
		else
			target4 = false;
		if(fifth.isSelected())
		{
			s5 = "Song5 ";
			target5 = true;
		}
		else
			target5 = false;
		if(s1 != null) //Adds all the strings to the display string to be displayed
		{
			display += s1;
		}
		if(s2 != null)
		{
			display += s2;
		}
		if(s3 != null)
		{
			display += s3;
		}
		if(s4 != null)
		{
			display += s4;
		}
		if(s5 != null)
		{
			display += s5;
		}
		songs.setText(display);
		display = " "; //Refreshes the method
		
	}
	
	class calculateHandler implements EventHandler<ActionEvent>
	{
		
		public void handle(ActionEvent arg0)
		{
			
			double price = 0; //Adds onto this price if the target is true
			if(target1 == true) //Target becomes true if the button is checked
			{
				double songCost = Double.parseDouble(song1.getPrice()); //Gets the song price
				price += songCost; //Adds it to the total price
			}
			if(target2 == true)
			{
				double songCost = Double.parseDouble(song2.getPrice());
				price += songCost;
			}
			if(target3 == true)
			{
				double songCost = Double.parseDouble(song3.getPrice());
				price += songCost;
			}
			if(target4 == true)
			{
				double songCost = Double.parseDouble(song4.getPrice());
				price += songCost;
			}
			if(target5 == true)
			{
				double songCost = Double.parseDouble(song5.getPrice());
				price += songCost;
			}
			
			String priceString = Double.toString(price); //Changes it into a string
			
			cost.setText("$" + priceString); //Adds a dollar sign to it
			
		}
		
	}
	
	class exitHandler implements EventHandler<ActionEvent>
	{
		
		public void handle(ActionEvent arg0)
		{
			
			System.exit(0); //Exits the program
			
		}
		
	}
	
}