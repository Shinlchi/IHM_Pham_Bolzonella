package ch.makery.rollhab.view;


import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class AtelierOverviewDragDropController {
	// Reference to the main application.
	private MainApp mainApp;
	private double startDragX;
	private double startDragY;
	@FXML
	private Button button;
	@FXML 
	private Button buttonContinu;
	@FXML
	private Label labelAnswer;

	public AtelierOverviewDragDropController() {}

	public void initialize() {
		buttonContinu.setVisible(false);
	}


	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	public void handleAnswer()
	{
		labelAnswer.getStyleClass().removeAll(); 
		labelAnswer.getStyleClass().add("label_confirmation_DragDrop_Rest");
		buttonContinu.setVisible(true);
	}
	@FXML
	public void handleTerminer()
	{
		mainApp.showAtelierOverviewEnd();
	}
	@FXML
	public void handle(MouseEvent event)

	{


		startDragX = event.getSceneX();
		startDragY = event.getSceneY();
	}
	@FXML
	public void dragging(MouseEvent event) {

		button.setTranslateX(event.getSceneX() - startDragX);
		button.setTranslateY(event.getSceneY() - startDragY);

	}
	@FXML
	public void onLabelDroped(MouseEvent event)
	{
		button.setTranslateX(0);
		button.setTranslateY(0);
		// Work in progress
	}
}
