package guisolitaire;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * The main class that manages the launching of the game window
 * @author Ashley Allen
 */
public class GUISolitaire extends Application {

	@Override
	public void start(Stage primaryStage) {
		Canvas canvas = new Canvas(1300, 900);
		
		Pane root = new Pane(canvas);
		
		Scene scene = new Scene(root, Color.GREEN);
		
		Game game = new Game(canvas.getGraphicsContext2D());
		
		canvas.setOnMouseClicked(game::handleMouseClicked);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Later Bitches");
		primaryStage.setResizable(false);
		primaryStage.getIcons().add(new Image("src/guisolitaire/cards/logo.png"));
		primaryStage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
