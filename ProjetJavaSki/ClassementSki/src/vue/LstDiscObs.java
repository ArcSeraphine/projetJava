/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import java.util.Observer;
import java.util.Observable;
import java.awt.List;
import java.awt.Label;
import metier.Modele;
/**
 *
 * @author melanie.manivanh
 */
public class LstDiscObs implements Observer{
    
     private List lst; 
 
    public LstDiscObs (List lst) {this.lst = lst; }
    
    public void update(Observable m, Object arg) {
        
        lst.removeAll();
        for (int i = 0; i<((Modele)m).nbDisc(); i++){
            lst.add((((Modele)m).getDisc(i)).toString());
        }
    
    }
    
}
