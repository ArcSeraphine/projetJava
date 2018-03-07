package domaine;
import java.util.StringTokenizer;
/** Un Skieur est identifié par son prenomNom, ainsi que par une Discipline. */
public class Skieur implements Comparable{
    private Discipline discipline;
    private boolean homme;
    private int rang;
    private String prenomNom;
    private String nationalite;
    private int points;
    private String nomPrenom;
    
    public Skieur(Discipline discipline, boolean homme, int rang, String prenomNom, String nationalite, int points) { 
        this.discipline=discipline; this.homme=homme; this.rang=rang; this.prenomNom=prenomNom; this.nationalite=nationalite; this.points=points; 
        StringTokenizer strT = new StringTokenizer (prenomNom); String prenom = strT.nextToken();String nom = strT.nextToken(); nomPrenom = nom+prenom;
    }
    
    public Discipline getDiscipline() { return discipline; }
    public boolean isHomme() { return homme; }
    public int getRang() { return rang; }
    public String getPrenomNom() { return prenomNom; }
    public String getNationalite() { return nationalite; }
    public int getPoints() { return points; }
    
    public boolean equals(Object obj) { return this.discipline.equals(((Skieur)obj).discipline) && this.prenomNom.equals(((Skieur)obj).prenomNom); }
    public String toString() { return rang+"  "+nationalite+"  "+prenomNom+"  "+points; }

    public int compareTo (Object obj) {return rang-((Skieur)obj).rang;}
    public int compareParRang (Object obj) {return rang-((Skieur)obj).rang;}
    public int compareParNat (Object obj) {return nationalite.compareToIgnoreCase(((Skieur)obj).nationalite);}
    public int compareParNom(Object obj) {return nomPrenom.compareToIgnoreCase(((Skieur)obj).nomPrenom);}
}