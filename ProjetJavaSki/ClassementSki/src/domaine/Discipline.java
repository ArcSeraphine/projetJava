package domaine;

/** Une Discipline a un nom, et est identifiée par un no */
public class Discipline {
    private int no;
    private String nom;
    
    public Discipline(int no, String nom) { this.no=no; this.nom=nom; }
    public Discipline(String nom) { this.nom=nom; }
    
    public int getNo() { return no; }
    public String getNom() { return nom; }
    
    public boolean equals(Object obj) { return no == ((Discipline)obj).no; }
    public String toString() { return nom; }
}