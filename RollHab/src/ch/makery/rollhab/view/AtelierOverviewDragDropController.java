package ch.makery.rollhab.view;


import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class AtelierOverviewDragDropController {
	// Reference to the main application.
	private MainApp mainApp;
	@FXML
	private Button button;


    private double startDragX;
    private double startDragY;
	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public AtelierOverviewDragDropController() {
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after the fxml file has been loaded.
	 */
    public void initialize() {

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
	/*@FXML
	public void handleContinuer()
	{
		mainApp.showHomeLayout();
		mainApp.showHomeOverview();
	}*/
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

}
