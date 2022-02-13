
package fluentpal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Personne {
    
    protected int idPersonne;
    protected String username;
    protected String password;
    protected String nom;
    protected String prenom;
    protected String adresseCourriel;
    
//    private boolean isAdmin;   not sure if we need this
    private Set<Membre> membreDesactiver = new HashSet();
    private List<JeuQuestionnaire> listeJqCreer;

    public Personne(int idPersonne, String username, String password, String nom, String prenom, String adresseCourriel) {
        this.idPersonne = idPersonne;
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Personne{" + "idPersonne=" + idPersonne + ", username=" + username + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", adresseCourriel=" + adresseCourriel + '}';
    }
    
    
    
    
}
