// Description: Generic window management for songlib, loads fxml + songcontroller
package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import view.SongController;

public class SongLib extends Application{
	@Override
	public void start(Stage primaryStage)
		throws IOException {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/view/SongLib.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			Scene scene = new Scene(root);
			// SongController songController = loader.getController(); // TODO implement songcontroller methods
			// songController.start(primaryStage);
			// primaryStage.setScene(scene);
			// primaryStage.setTitle("Song Library");
			// primaryStage.setResizable(false);
			// primaryStage.show();
		}
	public static void main(String[] args) 
	{
		launch(args);
	}
}