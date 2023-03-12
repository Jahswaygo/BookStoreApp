/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;


/**
 *
 * @author Jahmil
 */
public class ScreenController implements Initializable 
{
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
  //Login Screen

    //Password
    @FXML
    private PasswordField tfPassword;

    //Username
    @FXML
    private TextField tfUsername;

    //Showing Password
    @FXML
    private TextField ViewPassword;
    
    //Show-Password CheckBox
    @FXML
    private CheckBox pass_toggle;

    //Incorrect Password Text
    @FXML
    private Text IncorPass;

    //Show-Password Method
    @FXML
    void ShowPassword(ActionEvent event) 
    {
        if (pass_toggle.isSelected()) 
        {
            ViewPassword.setText(tfPassword.getText());
            ViewPassword.setVisible(true);
            tfPassword.setVisible(false);

            return;
        }
        tfPassword.setText(ViewPassword.getText());
        tfPassword.setVisible(true);
        ViewPassword.setVisible(false);

    }
   
    //Login Method
    @FXML
    public void VerifyUser(ActionEvent event) throws Exception
    {
        //Admin Check
        if (tfUsername.getText().equals("admin")&& (tfPassword.getText().equals("admin")||ViewPassword.getText().equals("admin")))
        {
            Parent root = FXMLLoader.load(getClass().getResource("OwnerSS.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene= new Scene(root);
            stage.setScene(scene);
            stage.show();            
        }
        //Customer Check
        else if (tfUsername.getText().equals("jon")&& (tfPassword.getText().equals("snow")||ViewPassword.getText().equals("snow")))
        {
        Parent root = FXMLLoader.load(getClass().getResource("CustomerSS.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
        
        //Wrong Password
        }else
        {
        IncorPass.setText("Incorrect Password. Try Again.");
        }
    }
    
  //Owner Start Screen 

    //Logout Method (returns to login screen)
    @FXML
    public void Logout(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //View Owner-Books Screen Method
    @FXML
    public void ViewOBS(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("OwnerBS.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    //View Owner Customers Screen
    @FXML
    void ViewOCS(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("OwnerCS.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

  //Owner Book Screen

    //Book name Column
    @FXML
    private TableColumn<?, ?> bkname;

    //Book price Column
    @FXML
    private TableColumn<?, ?> bkprice;

    //New Book name 
    @FXML
    private TextField newbkname;
    
    //New Book price
    @FXML
    private TextField newbkprice;

    //Method to add new book to list
    @FXML
    void addnewbook(ActionEvent event) 
    {

    }

    //Method to remove book from list
    @FXML
    void removebook(ActionEvent event) 
    {

    }

    //Back Button (returns to Owner Start Screen)
    @FXML
    void returnToOSS(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("OwnerSS.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
  //Owner Customer Screen
    //Customer Username
    @FXML
    private TableColumn<?, ?> Username;  
      
    //Customer Password
    @FXML
    private TableColumn<?, ?> UserPassword;

    //Customer Points
    @FXML
    private TableColumn<?, ?> UserPoints;
    
    //New Customer Password
    @FXML
    private TextField newUserPassword;

    //New Customer Username
    @FXML
    private TextField newUsername;

    //Method to Create a new Customer User
    @FXML
    void newUser(ActionEvent event) 
    {

    }
    //Method to remove a Customer User
    @FXML
    void removeUser(ActionEvent event) 
    {

    }
    
    
  //Customer Start Screen
    @FXML
    private TableColumn<?, ?> AddtoCart;

    //Customer points
    @FXML
    private Label Userpoints;

    //Customer points Rank
    @FXML
    private Label UserStatus;

    //Welcome Statement (Welcome + username.)
    @FXML
    private Label Welcome;
    
    //Distance to next rank
    @FXML
    private ProgressBar fromNextRank;
    
    //Buy books
    @FXML
    void Buy(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("CustomerCS.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    //Redeem Points then Buy Books
    @FXML
    void RedeemBuy(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("CustomerCS.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
  //Customer Cart Screen
    
    //Customer Points Rank
    @FXML
    private Label CartUserStatus;

    //Customer Points
    @FXML
    private Label CartUserpoints;

    //Total Cost of books in cart
    @FXML
    private Label TotalCost;

    //View books in Cart
    @FXML
    private TableView<?> bkInCart;

    //Distance until the next rank
    @FXML
    private ProgressBar fromNextRan2;

    //checkout cart
    @FXML
    void Checkout(ActionEvent event) 
    {

    }

    //Back Button (returns to Customer Start Screen)
    @FXML
    void returnToCSS(ActionEvent event) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("CustomerSS.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
}
