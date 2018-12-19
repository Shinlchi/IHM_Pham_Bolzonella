package ch.makery.rollhab.view;

import java.util.concurrent.TimeUnit;

import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class AtelierOverviewQCMController {
	// Reference to the main application.
	private MainApp mainApp;
	private Boolean isFinish;
	@FXML
	private Label label1;
	@FXML
	private Label label2;
	@FXML
	private Label label3;
	@FXML
	private Label label4;
	@FXML
	private Label labelgridpane;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button buttonContinu;

	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public AtelierOverviewQCMController() {
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		isFinish =false;
		buttonContinu.setVisible(false);
	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	/**
	 * Called when the user clicks the connexion button. Opens a overview.
	 */
	@FXML
	public void handleContinuer()
	{
		mainApp.showAtelierOverviewDragDrop();
	}

	@FXML 
	public void handleLabel1() throws InterruptedException
	{
		
			labelgridpane.setText(" ");
			labelgridpane.setText(label1.getText());
			labelgridpane.getStyleClass().removeAll();
			labelgridpane.getStyleClass().add("label_trad_blue");
			isFinish=true;
			button1.getStyleClass().removeAll(); 
			button1.getStyleClass().add("label_confirmation_QCM_yes");
			
			buttonContinu.setVisible(true);
		
	}
	@FXML 
	public void handleLabel2()
	{
		
			labelgridpane.setText(" ");
			labelgridpane.setText(label2.getText());
			labelgridpane.getStyleClass().add("label_trad_blue");
			
			button2.getStyleClass().removeAll(); 
			button2.getStyleClass().add("label_confirmation_QCM_no");
			
		
	}
	@FXML 
	public void handleLabel3()
	{
		
			labelgridpane.setText(" ");
			labelgridpane.setText(label3.getText());
			labelgridpane.getStyleClass().add("label_trad_blue");
			
			button3.getStyleClass().removeAll(); 
			button3.getStyleClass().add("label_confirmation_QCM_no");
		
		
	}
	@FXML 
	public void handleLabel4()
	{
		
			labelgridpane.setText(" ");
			labelgridpane.setText(label4.getText());
			labelgridpane.getStyleClass().add("label_trad_blue");
			button4.getStyleClass().removeAll(); 
			button4.getStyleClass().add("label_confirmation_QCM_no");
		
		
	}
}
