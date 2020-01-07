import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Popup
{
	public static void win(String message)
	{
		//Declaring
		Stage window = new Stage();
		StackPane layout;
		Scene scene;
		Label mess;

		//Formatting Stage {window}
		window.setResizable(false);
		window.initModality(Modality.APPLICATION_MODAL);
		window.initStyle(StageStyle.UTILITY);

		//Formatting Label {mess}
		mess = new Label(message);

		//Finalizing StackPane {layout}
		layout = new StackPane();
		layout.getChildren().addAll(mess);
		layout.setAlignment(Pos.CENTER);

		//Finalizing Scene {scene}
		scene = new Scene(layout);

		//Final
		window.setScene(scene);
		window.showAndWait();
	}

	public static void win(String message, int width, int height)
	{
		//Declaring
		Stage window = new Stage();
		StackPane layout;
		Scene scene;
		Label mess;

		//Formatting Stage {window}
		window.setMinWidth(width);
		window.setMinHeight(height);
		window.setResizable(false);
		window.initModality(Modality.APPLICATION_MODAL);
		window.initStyle(StageStyle.UTILITY);

		//Formatting Label {mess}
		mess = new Label(message);

		//Finalizing StackPane {layout}
		layout = new StackPane();
		layout.getChildren().addAll(mess);
		layout.setAlignment(Pos.CENTER);

		//Finalizing Scene {scene}
		scene = new Scene(layout);

		//Final
		window.setScene(scene);
		window.showAndWait();
	}

	public static void win(String title, String message)
	{
		//Declaring
		Stage window = new Stage();
		StackPane layout;
		Scene scene;
		Label mess;

		//Formatting Stage {window}
		window.setTitle(title);
		window.setResizable(false);
		window.initModality(Modality.APPLICATION_MODAL);
		window.initStyle(StageStyle.UTILITY);

		//Formatting Label {mess}
		mess = new Label(message);

		//Finalizing StackPane {layout}
		layout = new StackPane();
		layout.getChildren().addAll(mess);
		layout.setAlignment(Pos.CENTER);

		//Finalizing Scene {scene}
		scene = new Scene(layout);

		//Final
		window.setScene(scene);
		window.showAndWait();
	}

	public static void win(String title, String message, int width, int height)
	{
		//Declaring
		Stage window = new Stage();
		StackPane layout;
		Scene scene;
		Label mess;

		//Formatting Stage {window}
		window.setTitle(title);
		window.setMinWidth(width);
		window.setMinHeight(height);
		window.setResizable(false);
		window.initModality(Modality.APPLICATION_MODAL);
		window.initStyle(StageStyle.UTILITY);

		//Formatting Label {mess}
		mess = new Label(message);

		//Finalizing StackPane {layout}
		layout = new StackPane();
		layout.getChildren().addAll(mess);
		layout.setAlignment(Pos.CENTER);

		//Finalizing Scene {scene}
		scene = new Scene(layout);

		//Final
		window.setScene(scene);
		window.showAndWait();
	}
}
