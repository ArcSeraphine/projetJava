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
public class LstSkieursObs implements Observer {
    
    private List lst; 
    private Label lbl;
    public LstSkieursObs (List lst, Label lbl) {this.lst = lst; this.lbl = lbl;}
    public void update(Observable m, Object arg) {
        lbl.setText(((Modele)m).getDiscCourante());
        lst.removeAll();
        for (int i = 0; i<((Modele)m).nbSkieurs(); i++){
            lst.add((((Modele)m).getSkieur(i)).toString());
        }
    
    }
}
