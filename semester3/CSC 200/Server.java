 
import java.io.*;
import java.net.*;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Server extends Application {
   private int sessionNo = 1;
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Text area for displaying contents
    TextArea ta = new TextArea();

    // Create a scene and place it in the stage
    Scene scene = new Scene(new ScrollPane(ta), 450, 200);
    primaryStage.setTitle("Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    new Thread( () -> {
      try {
        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(8000);
        Platform.runLater(() ->
          ta.appendText("Server started at " + new Date() + '\n'));
  
        // Listen for a connection request
        Socket socket = serverSocket.accept();
  
        // Create data input and output streams
        DataInputStream inputFromClient = new DataInputStream(
          socket.getInputStream());
        DataOutputStream outputToClient = new DataOutputStream(
          socket.getOutputStream());
  
        while (true) {
          Platform.runLater(() -> ta.appendText(new Date() + ": Wait for players to join session " + sessionNo + '\n'));
  
          // Connect to player 1
          Socket player1 = serverSocket.accept();
  
          Platform.runLater(() -> {
            ta.appendText(new Date() + ": Player 1 joined session " 
              + sessionNo + '\n');
            ta.appendText("Player 1's IP address" +
              player1.getInetAddress().getHostAddress() + '\n');
           });   
              
              /*
          new DataOutputStream(
            player1.getOutputStream()).writeInt(PLAYER);
  */
          // Connect to player 2
          Socket player2 = serverSocket.accept();
  
          Platform.runLater(() -> {
            ta.appendText(new Date() +
              ": Player 2 joined session " + sessionNo + '\n');
            ta.appendText("Player 2's IP address" +
              player2.getInetAddress().getHostAddress() + '\n');
          });
  
          // Notify that the player is Player 2
          /*
          new DataOutputStream(
            player2.getOutputStream()).writeInt(PLAYER2);
  */
          // Display this session and increment session number
          Platform.runLater(() -> 
            ta.appendText(new Date() + 
              ": Start a thread for session " + sessionNo++ + '\n'));
  
          // Launch a new thread for this session of two players
          //new Thread(new HandleASession(player1, player2)).start();

        }
      }
      catch(IOException ex) {
        ex.printStackTrace();
      }
    }).start();
    
    /*
        new Thread( () -> {
      try {
        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(8000);
        Platform.runLater(() ->
          ta.appendText("Server started at " + new Date() + '\n'));
  
        // Listen for a connection request
        Socket socket = serverSocket.accept();
  
        // Create data input and output streams
        DataInputStream inputFromClient = new DataInputStream(
          socket.getInputStream());
        DataOutputStream outputToClient = new DataOutputStream(
          socket.getOutputStream());
  
        while (true) {
          // Receive radius from the client
          double rate = inputFromClient.readDouble();
          double years = inputFromClient.readDouble();
          double loan = inputFromClient.readDouble();
          
       
       rate = rate / 100 / 12;
		 years = years * 12;
		 double ans2 = ((loan * rate) * Math.pow(1+rate,years)) / (Math.pow(1+rate,years) - 1);
      
  
          // Send area back to the client
          outputToClient.writeDouble(ans2);
  
          Platform.runLater(() -> {
            ta.appendText("Monthly Payment is: $" + ans2 + '\n'); 
          });
        }
      }
      catch(IOException ex) {
        ex.printStackTrace();
      }
    }).start();
    
    */
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}