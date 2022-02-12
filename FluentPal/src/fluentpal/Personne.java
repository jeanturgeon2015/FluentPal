
package fluentpal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Personne {
    
    protected int idPersonne;
    protected String nom;
    protected String prenom;
    protected String adresseCourriel;
    
//    private boolean isAdmin;   not sure if we need this
    private Set<Membre> membreDesactiver = new HashSet();
    private List<JeuQuestionnaire> listeJqCreer;
    

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

    public List<JeuQuestionnaire> getListeJqCreer() {
        return listeJqCreer;
    }

    public void setListeJqCreer(List<JeuQuestionnaire> listeJqCreer) {
        this.listeJqCreer = listeJqCreer;
    }

    public Set<Membre> getMembreDesactiver() {
        return membreDesactiver;
    }

    public void setMembreDesactiver(Set<Membre> membreDesactiver) {
        this.membreDesactiver = membreDesactiver;
    }
    
    
    
    
}
