package ch.makery.rollhab;

import java.io.IOException;

import ch.makery.rollhab.MainApp;
import ch.makery.rollhab.view.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
//import javafx.stage.Modality;
import javafx.stage.Stage;


public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	

	AtelierOverviewDragDropController atelierOverviewDragDropController;
	AtelierOverviewQCMController atelierOverviewQCMController;
	AtelierOverviewTradController atelierOverviewTradController;
	MagazineOverviewController magazineOverviewController;
	

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Belingo");
		this.primaryStage.setResizable(false);

		initRootLayout();
		showConnexionOverview();
	}

	/**
	 * Initializes the connexion layout.
	 */
	public void initRootLayout() {
		try {
			// Load connexion layout from fxml file.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/rootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the connexion layout.
			Scene scene = new Scene(rootLayout);


			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * Shows the connexion overview inside the root layout.
	 */
	public void showConnexionOverview() {
		try {
			// Load connexion overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ConnexionOverview.fxml"));
			AnchorPane ConnexionOverview = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setTop(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(ConnexionOverview);
			// Give the controller access to the main app.
			ConnexionOverviewController connexionOverviewController= loader.getController();
			connexionOverviewController.setMainApp(this);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showConnexionUserOverview() {
		try {
			// Load connexion user overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ConnexionUserOverview.fxml"));
			AnchorPane ConnexionUserOverview = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setTop(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(ConnexionUserOverview);

			// Give the controller access to the main app.
			ConnexionUserOverviewController connexionUserOverviewController = loader.getController();
			connexionUserOverviewController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showHomeLayout() {
		try {
			// Load connexion user overview.
			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/HomeLayout.fxml"));
			AnchorPane HomeLayout = (AnchorPane) loader.load();
			
			//rootLayout.clearConstraints();
			//BorderPane.clearConstraints(rootLayout);
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setTop(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			
			rootLayout.setTop(HomeLayout);
			
			// Give the controller access to the main app.
			HomeLayoutController homeLayoutController= loader.getController();
			homeLayoutController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showHomeOverview() {
		try {
			// Load connexion user overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/HomeOverview.fxml"));
			AnchorPane HomeOverview = (AnchorPane) loader.load();
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(HomeOverview);
			
			// Give the controller access to the main app.
			HomeOverviewController homeOverviewController = loader.getController();
			homeOverviewController.setMainApp(this);
			// Give to controller access to the model user
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showAtelierLayout() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AtelierLayout.fxml"));
			AnchorPane AtelierLayout = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setTop(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setTop(AtelierLayout);

			// Give the controller access to the main app.
			AtelierLayoutController atellierLayoutController = loader.getController();
			atellierLayoutController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showAtelierOverviewRepeat() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AtelierOverviewRepeat.fxml"));
			AnchorPane AtelierOverviewRepeat = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setBottom(AtelierOverviewRepeat);

			// Give the controller access to the main app.
			AtelierOverviewRepeatController atelierOverviewRepeatController = loader.getController();
			atelierOverviewRepeatController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void showAtelierOverviewTrad() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AtelierOverviewTrad.fxml"));
			AnchorPane AtelierOverviewTrad = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setBottom(AtelierOverviewTrad);

			// Give the controller access to the main app.
			AtelierOverviewTradController atelierOverviewTradController = loader.getController();
			atelierOverviewTradController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showAtelierOverviewQCM() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AtelierOverviewQCM.fxml"));
			AnchorPane AtelierOverviewQCM = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setBottom(AtelierOverviewQCM);

			// Give the controller access to the main app.
			AtelierOverviewQCMController atelierOverviewQCMController = loader.getController();
			atelierOverviewQCMController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showAtelierOverviewDragDrop() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AtelierOverviewDragDrop.fxml"));
			AnchorPane AtelierOverviewDragDrop = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setBottom(AtelierOverviewDragDrop);

			// Give the controller access to the main app.
			AtelierOverviewDragDropController atelierOverviewDragDropController = loader.getController();
			atelierOverviewDragDropController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showHomeAtelierOverview() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/HomeAtelierOverview.fxml"));
			AnchorPane HomeAtelierOverview = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setBottom(HomeAtelierOverview);

			// Give the controller access to the main app.
			HomeAtelierOverviewController homeAtelierOverviewController = loader.getController();
			homeAtelierOverviewController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public void showMagazineChoiceOverview() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/MagazineChoiceOverview.fxml"));
			AnchorPane MagazineChoiceOverview = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
		
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(MagazineChoiceOverview);

			// Give the controller access to the main app.
			MagazineChoiceOverviewController magazineChoiceOverviewController = loader.getController();
			magazineChoiceOverviewController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showMagazineOverview() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/MagazineOverview.fxml"));
			AnchorPane MagazineOverview = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
		
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(MagazineOverview);

			// Give the controller access to the main app.
			MagazineOverviewController magazineOverviewController = loader.getController();
			magazineOverviewController.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showMagazineOverviewSecond() {
		try {
			// Load User overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/MagazineOverviewSecond.fxml"));
			AnchorPane MagazineOverviewSecond = (AnchorPane) loader.load();

			// Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
		
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(MagazineOverviewSecond);

			// Give the controller access to the main app.
			MagazineOverviewControllerSecond magazineOverviewControllerSecond = loader.getController();
			magazineOverviewControllerSecond.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void showToolsOverviewLexique() {
        try {
            // Load User overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ToolsOverviewLexique.fxml"));
            AnchorPane ToolsOverviewLexique = (AnchorPane) loader.load();
            
            // Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			
			rootLayout.setRight(null);
            rootLayout.setCenter(ToolsOverviewLexique);
            
            // Give the controller access to the main app.
            ToolsOverviewLexiqueController toolsOverviewLexiqueController = loader.getController();
	        toolsOverviewLexiqueController.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void showToolsOverviewVerbes() {
        try {
            // Load User overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ToolsOverviewVerbes.fxml"));
            AnchorPane ToolsOverviewVerbes = (AnchorPane) loader.load();
            
            // Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			
			rootLayout.setRight(null);
            rootLayout.setCenter(ToolsOverviewVerbes);
            
            // Give the controller access to the main app.
        	ToolsOverviewVerbesController toolsOverviewVerbesController = loader.getController();
	        toolsOverviewVerbesController.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void showToolsOverviewTemps() {
        try {
            // Load User overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ToolsOverviewTemps.fxml"));
            AnchorPane ToolsOverviewTemps = (AnchorPane) loader.load();
            
            // Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			
			rootLayout.setRight(null);
            rootLayout.setCenter(ToolsOverviewTemps);
            
            // Give the controller access to the main app.
            ToolsOverviewTempsController toolsOverviewTempsController = loader.getController();
           toolsOverviewTempsController.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void showAtelierOverviewEnd() {
        try {
            // Load User overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/AtelierOverviewEnd.fxml"));
            AnchorPane AtelierOverviewEnd = (AnchorPane) loader.load();
            
            // Set User overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			
			rootLayout.setRight(null);
            rootLayout.setCenter(AtelierOverviewEnd);
            
            // Give the controller access to the main app.
            AtelierOverviewEndController AtelierOverviewEndController = loader.getController();
            AtelierOverviewEndController.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
	
	/**
	 * Returns the main stage.
	 * @return
	 */
	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}
}