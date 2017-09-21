/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1convertisseurdevise;

/**
 *
 * @author EMIEUX
 */
public class Devise {
    private String unNom;
    private double unTauxChange;
        
    public Devise (String nom, double tauxChange) throws Exception {
        if (nom.length() == 3 && tauxChange > 0.0){
            unNom = nom;
            unTauxChange = tauxChange;
        }
        else {
            throw new Exception ("Le nom " + unNom + " est incorrect");
        }
                   
    }
    public String getNom(){
        return unNom;
    }
    public double getTauxChange (){
        return unTauxChange;
    }
    
}
