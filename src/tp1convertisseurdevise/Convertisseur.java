/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1convertisseurdevise;

import java.util.HashMap;

/**
 *
 * @author VIDAL
 */
public class Convertisseur {
    private HashMap<String,Devise> listeDevises=new HashMap<String,Devise>();
    public Devise getDevise(String unNomDevise) throws Exception
    {   
        if(listeDevises.containsKey(unNomDevise)){
            return listeDevises.get(unNomDevise);
        }
        else{
            throw new Exception ("Devise inconnue");
        }
    }
    public void ajouterDevise(String unNomDevise,double unTauxChange) throws Exception
    {
        
            Devise d = new Devise(unNomDevise,unTauxChange);
            
            if(!listeDevises.containsKey(unNomDevise)){
                listeDevises.put(unNomDevise,d);                
            }
            else
            {
                throw new Exception("Devise déjà présente");
            }
        
        
    }
    public double convertir (double unNombre, String nomDeviseDepart,String nomDeviseCible) throws Exception
    {   
        if(!listeDevises.containsKey(nomDeviseDepart) || !listeDevises.containsKey(nomDeviseCible) )
        {   
            throw new Exception("Devise inconnue");        
        }
        unNombre = unNombre * this.getDevise(nomDeviseDepart).getTauxChange();
        if(nomDeviseCible.equals("USD"))
        {
            return unNombre;
        }
        else
        {
            return unNombre/this.getDevise(nomDeviseCible).getTauxChange();
        }
    }
    
}
