import javafx.application.*; //All necessary imports
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.*;
import javafx.scene.layout.*;

public class Assignment10 extends Application //Extends application
{
	public void start( Stage myStage ) //Uses a stage called myStage
	{
		myStage.setTitle("Loan Calculator"); //Sets the title as loan calculator
	

		GridPane rootNode = new GridPane(); //Creates a grid pane
		rootNode.setPadding( new Insets( 30 )); //Sets padding of 30 pixels
		rootNode.setHgap( 5 ); //Horizontal gap as 5 pixels
		rootNode.setVgap( 5 ); //Vertical gap as 5 pixels
		rootNode.setAlignment( Pos.CENTER ); //All centered
	
		Scene myScene = new Scene( rootNode, 300, 200 ); //Creates the scene
	
		TextField interest = new TextField(); //Creates the text fields
		TextField years = new TextField();
		TextField loan = new TextField();
		TextField monthly = new TextField();
		TextField total = new TextField();
		total.setEditable( false ); //Total is un-editable
		
		Button calculate = new Button("Calculate"); //Creates a new button
		
		rootNode.add( new Label("Annual Interest Rate: "), 0,0); //Adds everything
		rootNode.add( interest, 1,0);
		rootNode.add( new Label("Number of Years: "), 0,1);
		rootNode.add( years, 1,1);
		rootNode.add( new Label("Loan Amount: "), 0,2);
		rootNode.add( loan, 1,2);
		rootNode.add( new Label("Monthly Payment: "), 0,3);
		rootNode.add( monthly, 1,3);
		rootNode.add( new Label("Total Payment: "), 0,4);
		rootNode.add( total, 1,4);
		rootNode.add( calculate, 1,5);
		rootNode.setHalignment( calculate, HPos.RIGHT ); //Positions the button to the right

		myStage.setScene( myScene ); //Sets the scene
		myStage.show(); //Shows the stage
	
		
	}

}
