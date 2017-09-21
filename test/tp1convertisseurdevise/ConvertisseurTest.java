/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1convertisseurdevise;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConvertisseurTest extends TestCase {
    private Convertisseur c;

    @Override
    protected void setUp() throws Exception {
        c = new Convertisseur();
        c.ajouterDevise("EUR",1.36);
        c.ajouterDevise("USD",1.0);
        c.ajouterDevise("GBP",1.6);
    }
    public ConvertisseurTest() {
    }

    @Test
    public void testAjouterDevise() throws Exception {
        
        try{
            c.ajouterDevise("EUR",1.36);
            fail ("Erreur non détectée (devise déjà ajoutée)");
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void testConvertir() throws Exception {
        
        
        
        
        double res = c.convertir(1.0,"EUR","EUR");
        assertEquals(1.0,res,0.1);
        
        res = c.convertir(1.0,"GBP","USD");
        assertEquals(1.6,res,0.1);
        
        res= c.convertir(20,"EUR","GBP");
        assertEquals(17.0,res,0.1);
        
        try{
            c.convertir(1.0,"YEN","USD");
            fail("erreur non encore détectée : devise inconnue");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
