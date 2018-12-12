package ch.makery.rollhab;

import java.io.IOException;

import ch.makery.rollhab.MainApp;
import ch.makery.rollhab.view.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
//import javafx.stage.Modality;
import javafx.stage.Stage;


public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	Controller controller ;
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Belingo");

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

			// Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setTop(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(ConnexionOverview);
			// Give the controller access to the main app.
			controller = loader.getController();
			controller.setMainApp(this);


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

			// Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setTop(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(ConnexionUserOverview);

			// Give the controller access to the main app.
			controller = loader.getController();
			controller.setMainApp(this);
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
			controller = loader.getController();
			controller.setMainApp(this);
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
			controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showAtelierLayout() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AtelierLayout.fxml"));
			AnchorPane AtelierLayout = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setTop(null);
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setTop(AtelierLayout);

			// Give the controller access to the main app.
			controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showAtelierOverviewRepeat() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/AtelierOverviewRepeat.fxml"));
			AnchorPane AtelierOverviewRepeat = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setBottom(AtelierOverviewRepeat);

			// Give the controller access to the main app.
			controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showHomeAtelierOverview() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/HomeAtelierOverview.fxml"));
			AnchorPane HomeAtelierOverview = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setBottom(HomeAtelierOverview);

			// Give the controller access to the main app.
			controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void showMagazineChoiceOverview() {
		try {
			// Load person overview.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/MagazineChoiceOverview.fxml"));
			AnchorPane MagazineChoiceOverview = (AnchorPane) loader.load();

			// Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
		
			rootLayout.setLeft(null);
			rootLayout.setRight(null);
			rootLayout.setCenter(MagazineChoiceOverview);

			// Give the controller access to the main app.
			controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void showToolsOverviewLexique() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ToolsOverviewLexique.fxml"));
            AnchorPane ToolsOverviewLexique = (AnchorPane) loader.load();
            
            // Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			
			rootLayout.setRight(null);
            rootLayout.setCenter(ToolsOverviewLexique);
            
            // Give the controller access to the main app.
	        controller = loader.getController();
	        controller.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void showToolsOverviewVerbes() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ToolsOverviewVerbes.fxml"));
            AnchorPane ToolsOverviewVerbes = (AnchorPane) loader.load();
            
            // Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			
			rootLayout.setRight(null);
            rootLayout.setCenter(ToolsOverviewVerbes);
            
            // Give the controller access to the main app.
	        controller = loader.getController();
	        controller.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void showToolsOverviewTemps() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/ToolsOverviewTemps.fxml"));
            AnchorPane ToolsOverviewTemps = (AnchorPane) loader.load();
            
            // Set person overview into the center of root layout.
			rootLayout.setCenter(null);
			rootLayout.setBottom(null);
			rootLayout.setLeft(null);
			
			rootLayout.setRight(null);
            rootLayout.setCenter(ToolsOverviewTemps);
            
            // Give the controller access to the main app.
	        controller = loader.getController();
	        controller.setMainApp(this);
            
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