package ch.makery.rollhab.view;

import ch.makery.rollhab.MainApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class AtelierOverviewTradController {
	// Reference to the main application.
	private MainApp mainApp;
	private Boolean isLabel0Empty;
	private Boolean isLabel1Empty;
	private Boolean isLabel2Empty;
	private Boolean isLabel3Empty;
	private Boolean isLabel4Empty;
	private Boolean isLabel5Empty;
	private Boolean isFinished;
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
    @FXML
    private Label label0;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Label buttonLabel0;
    @FXML
    private Label buttonLabel1;
    @FXML
    private Label buttonLabel2;
    @FXML
    private Label buttonLabel3;
    @FXML
    private Label buttonLabel4;
    @FXML
    private Label buttonLabel5;
    @FXML
    private Button buttonContinu;
    
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
		isLabel0Empty = true;
		isLabel1Empty = false;
		isLabel2Empty = false;
		isLabel3Empty = false;
		isLabel4Empty = false;
		isLabel5Empty = false;
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
	
	@FXML
	public void onLabelDroped(MouseEvent event)
	{
		  button.setTranslateX(0);
		  button.setTranslateY(0);
		  button1.setTranslateX(0);
		  button1.setTranslateY(0);
		  button2.setTranslateX(0);
		  button2.setTranslateY(0);
		  button3.setTranslateX(0);
		  button3.setTranslateY(0);
		  button4.setTranslateX(0);
		  button4.setTranslateY(0);
		  button5.setTranslateX(0);
		  button5.setTranslateY(0);
		// Work in progress
	}
	
	@FXML
	public void onLabel0Clicked()
	{
		if (isLabel1Empty==true)
		{
			label1.setText(buttonLabel0.getText());
			isLabel2Empty=true;
			button.setVisible(false);
		}
	}
	
	@FXML
	public void onLabel1Clicked()
	{
		 if (isLabel2Empty==true)
		{
			label2.setText(buttonLabel1.getText());
			isLabel3Empty=true;
			button1.setVisible(false);
		}
	}
	
	@FXML
	public void onLabel2Clicked()
	{
		if (isLabel0Empty==true)
		{
			label0.setText(buttonLabel2.getText());
			isLabel1Empty=true;
			button2.setVisible(false);
		}
	}
	
	@FXML
	public void onLabel3Clicked()
	{
		if (isLabel5Empty==true)
		{
			label5.setText(buttonLabel3.getText());
			buttonContinu.setVisible(true);
			button3.setVisible(false);
		}
	}
	
	@FXML
	public void onLabel4Clicked()
	{
		 if (isLabel4Empty==true)
		{
			label4.setText(buttonLabel4.getText());
			isLabel5Empty=true;
			button4.setVisible(false);
		}
		 
	}
	
	@FXML
	public void onLabel5Clicked()
	{
		 if (isLabel3Empty==true)
		{
			label3.setText(buttonLabel5.getText());
			isLabel4Empty=true;
			button5.setVisible(false);
		}
	
	}
	
}
