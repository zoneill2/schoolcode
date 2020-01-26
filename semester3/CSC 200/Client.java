import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.*;
import java.net.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Client extends Application {
  // IO streams
  DataOutputStream toServer = null;
  DataInputStream fromServer = null;

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Panel p to hold the label and text field
    VBox vbox = new VBox();
    int PLAYER1 = 0;
    
   Label lblPly = new Label("Player" + PLAYER1);
   Label lblPly2 = new Label("Chat:");
   GridPane gp = new GridPane();
   Button btn = new Button("Yes");
   Button btn2 = new Button("No");
   Button btn3 = new Button("Sometimes");
   Button btn4 = new Button("Got it");
   btn.setPrefSize(100, 25);
   btn2.setPrefSize(100, 25);
   btn3.setPrefSize(100, 25);
   btn4.setPrefSize(100, 25);
   TextField tfChat = new TextField();
   tfChat.setPrefSize(325,25);
	gp.add(lblPly, 0, 0);
	gp.add(btn, 2, 1);
   gp.add(btn2, 3, 1);
   gp.add(btn3, 4, 1);
   gp.add(btn4, 3, 2);
   HBox box = new HBox();
   box.getChildren().addAll(lblPly2, tfChat);
   TextArea ta = new TextArea();
   ta.setPrefSize(350,50);
   vbox.getChildren().addAll(lblPly, gp, ta, box);
    
     
    // Create a scene and place it in the stage
    Scene scene = new Scene(vbox);
    primaryStage.setTitle("Client"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
   // btn.setOnAction(e-> {
     // try {
      
      /*
        // Get the radius from the text field
        double rate = Double.parseDouble(tfRate.getText().trim());
        double years = Double.parseDouble(tfYrs.getText().trim());
        double loan = Double.parseDouble(tfAmt.getText().trim());
  
        // Send the radius to the server
        toServer.writeDouble(rate);
        toServer.writeDouble(years);
        toServer.writeDouble(loan);
        toServer.flush();
  
        // Get area from the server
        double ans2 = fromServer.readDouble();
  
        // Display to the text area
               ta.appendText("MP received from the server is "
          + ans2 + '\n');
          */
         // System.out.println("hi");
          
     // }
      //catch (IOException ex) {
       // System.err.println(ex);
     // }
   // });
  
    try {
      // Create a socket to connect to the server
      Socket socket = new Socket("localhost" , 8200);
      // Socket socket = new Socket("130.254.204.36", 8000);
      // Socket socket = new Socket("drake.Armstrong.edu", 8000);

      // Create an input stream to receive data from the server
      fromServer = new DataInputStream(socket.getInputStream());

      // Create an output stream to send data to the server
      toServer = new DataOutputStream(socket.getOutputStream());
    }
    catch (IOException ex) {
      ta.appendText(ex.toString() + '\n');
    }
  }
  
  
  

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
   
  public static void main(String[] args) {
    launch(args);
  }
  

}