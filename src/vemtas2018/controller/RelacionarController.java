package vemtas2018.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class RelacionarController implements Initializable  {
private static EntityManagerFactory emFactoryObj;
    private static final String PERSISTENCE_UNIT_NAME = "Ventas2018PU";
   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
         //To change body of generated methods, choose Tools | Templates.
    }
    
    public static EntityManager getEntityManager() {
        return emFactoryObj.createEntityManager();
    }

    public void relacionar(){
        emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager entityMgr = getEntityManager();        
	entityMgr.getTransaction().begin();
        
            entityMgr.getTransaction().commit();
            entityMgr.clear();
           
        }
    }