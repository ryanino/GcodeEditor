import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Main extends
		Application
{

	@Override
	public void start(Stage mainWindow)
	{
		//Declaring
		GridPane mainLay;
		Scene mainScene;
		Label filePathLabel;
		TextField filePathInput;
		Button edit, fileSelect;

		//Formatting Stage {mainWindow}
		mainWindow.setTitle("Gcode Editor");
		mainWindow.setMinWidth(210);
		mainWindow.setMinHeight(210);
		mainWindow.setResizable(true);

		//Formatting GridPane {mainLay}
		mainLay = new GridPane();
		mainLay.setPadding(new Insets(20, 20, 20, 20));
		mainLay.setVgap(8);
		mainLay.setHgap(10);

		//Formatting Label {filePathLabel}
		filePathLabel = new Label("File Path:");
		GridPane.setConstraints(filePathLabel, 0, 0);

		//Formatting TextField {filePathInput}
		filePathInput = new TextField();
		filePathInput.setPromptText("C:\\Path\\To\\File");
		GridPane.setConstraints(filePathInput, 1, 0);

		//Formatting Buttons {edit, fileSelect}
		fileSelect = new Button("...");
		fileSelect.setOnAction(e ->
		{
			File gcodeFile = new FileChooser().showOpenDialog(mainWindow);
			if(gcodeFile != null)
			{
				filePathInput.setText(gcodeFile.getPath());
			}
		});
		GridPane.setConstraints(fileSelect, 2, 0);

		//

		edit = new Button("Edit Gcode");
		edit.setOnAction(e ->
		{
			try
			{
				EditGcodeZ.edit(filePathInput.getText());
				Popup.win("File Has Been Edited :)", 210, 105);
			} catch(IOException ex)
			{
				Popup.win("Error", "Error Has Occurred :(", 210, 105);
			}
		});
		GridPane.setConstraints(edit, 1, 1);

		//Finalizing GridPane {mainLay}
		mainLay.getChildren().addAll(filePathLabel, filePathInput, fileSelect, edit);
		mainLay.setAlignment(Pos.CENTER);

		//Finalizing Scene {mainScene}
		mainScene = new Scene(mainLay);

		//Final
		mainWindow.setScene(mainScene);
		mainWindow.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
