/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;
import domaine.Skieur;
import java.util.Comparator;

/**
 *
 * @author melanie.manivanh
 */
import java.util.ArrayList;
import domaine.Discipline;
import java.util.Observable;
public class Modele extends Observable {
    
    private ArrayList aLstSkieurs = new ArrayList();
    private ArrayList aLstDisc = new ArrayList();
    private Discipline discCourante;
    private boolean hommeCourant;
    
    public void chargerDonnees() {
        aLstDisc = dao.ClassementSkiDao.getListeDisciplines();
        discCourante = (Discipline)aLstDisc.get(0);
        recharger();
    }
    
    public void chargerLstDisc() {
         setChanged(); notifyObservers();
    }
    public int nbSkieurs() { return aLstSkieurs.size();}
    public Skieur getSkieur(int pos){ return (Skieur)aLstSkieurs.get(pos);}
    
    public int nbDisc() {return aLstDisc.size();}
    public Discipline getDisc(int pos){ return (Discipline)aLstDisc.get(pos);}
    public String getDiscCourante() {return discCourante.getNom();}
    
    private Comparator compRang = new Comparator() { public int compare (Object o1, Object o2) {return ((Skieur)o1).compareParRang(o2);}};
    private Comparator compNat = new Comparator() { public int compare (Object o1, Object o2) {return ((Skieur)o1).compareParNat(o2);}};
    private Comparator compNom = new Comparator() { public int compare (Object o1, Object o2) {return ((Skieur)o1).compareParNom(o2);}};
    public void triParRang() {aLstSkieurs.sort(compRang); setChanged(); notifyObservers();}
    public void triParNat() {aLstSkieurs.sort(compNat);setChanged(); notifyObservers();}
    public void triParNom() {aLstSkieurs.sort(compNom);setChanged(); notifyObservers();}
    
    public void changerSexe(boolean h) {
        hommeCourant = h;
        recharger();
        
    }
    
    public void changerDiscipline(int pos){
        discCourante = (Discipline)aLstDisc.get(pos);
        recharger();
    }
    
    private void recharger() {
        aLstSkieurs = dao.ClassementSkiDao.getListeSkieurs(discCourante, hommeCourant);
        aLstSkieurs.sort(null);
        setChanged(); notifyObservers();
    }
}
