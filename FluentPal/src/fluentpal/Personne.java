
package fluentpal;

import java.util.List;


public class Personne {
    
    protected int idPersonne;
    protected String nom;
    protected String prenom;
    protected String adresseCourriel;
    
//    private boolean isAdmin;   not sure if we need this
    private List<JeuQuestionnaire> listeJQ;

    public Personne(int idPersonne, String nom, String prenom, String adresseCourriel) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseCourriel = adresseCourriel;
    }

    public String getAdresseCourriel() {
        return adresseCourriel;
    }

    public void setAdresseCourriel(String adresseCourriel) {
        this.adresseCourriel = adresseCourriel;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

//    Not sure if we need this.
//    public boolean isIsAdmin() {
//        return isAdmin;
//    }
//
//    public void setIsAdmin(boolean isAdmin) {
//        this.isAdmin = isAdmin;
//    }

    public List<JeuQuestionnaire> getListeJQ() {
        return listeJQ;
    }

    public void setListeJQ(List<JeuQuestionnaire> listeJQ) {
        this.listeJQ = listeJQ;
    }
    
    
    
    
}
