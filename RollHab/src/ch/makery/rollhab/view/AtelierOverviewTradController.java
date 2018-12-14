package ch.makery.rollhab.view;

import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AtelierOverviewTradController {
	// Reference to the main application.
	private MainApp mainApp;
	@FXML
	private Button button;
	@FXML
	private Button button1;
	@FXML
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;
	@FXML
	private Button button5;
    private double startDragX;
    private double startDragY;
	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public AtelierOverviewTradController() {
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
	@FXML
	private void initialize() {
		
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
		mainApp.showAtelierOverviewQCM();
	}
	@FXML
	 public void handle(MouseEvent event)
	 
	 	    {
	            startDragX = event.getSceneX();
	            startDragY = event.getSceneY();
	        }
	// A fixer
	@FXML
	 public void dragging(MouseEvent event) {
	            button.setTranslateX(event.getSceneX() - startDragX);
	            button.setTranslateY(event.getSceneY() - startDragY);
	 	    }
	@FXML
	 public void dragging1(MouseEvent event) {
	            button1.setTranslateX(event.getSceneX() - startDragX);
	            button1.setTranslateY(event.getSceneY() - startDragY);
	 	    }
	@FXML
	 public void dragging2(MouseEvent event) {
	            button2.setTranslateX(event.getSceneX() - startDragX);
	            button2.setTranslateY(event.getSceneY() - startDragY);
	 	    }
	@FXML
	 public void dragging3(MouseEvent event) {
	            button3.setTranslateX(event.getSceneX() - startDragX);
	            button3.setTranslateY(event.getSceneY() - startDragY);
	 	    }
	@FXML
	 public void dragging4(MouseEvent event) {
	            button4.setTranslateX(event.getSceneX() - startDragX);
	            button4.setTranslateY(event.getSceneY() - startDragY);
	 	    }
	@FXML
	 public void dragging5(MouseEvent event) {
	            button5.setTranslateX(event.getSceneX() - startDragX);
	            button5.setTranslateY(event.getSceneY() - startDragY);
	 	    }
}
