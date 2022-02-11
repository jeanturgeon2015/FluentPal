
package fluentpal;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Membre extends Personne {
    
    private String genre;
    private Date dateNaissanceMembre;
    private String ville;
    private Langue langueChoisie;
    private String disponibilite;
    
    private Set<Invitation> listeMembreRecois = new HashSet();
    private Set<Invitation> listeMembreEnvoie = new HashSet();
    
    private Set<Signalement> listeMembreSignaler = new HashSet();
    private Set<Signalement> listeMembreEtreSignaler = new HashSet();

    public Membre(String genre, Date dateNaissanceMembre, String ville, Langue langueChoisie, String disponibilite, int idPersonne, String nom, String prenom, String adresseCourriel) {
        super(idPersonne, nom, prenom, adresseCourriel);
        this.genre = genre;
        this.dateNaissanceMembre = dateNaissanceMembre;
        this.ville = ville;
        this.langueChoisie = langueChoisie;
        this.disponibilite = disponibilite;
    }

    public String getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(String disponibilite) {
        this.disponibilite = disponibilite;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDateNaissanceMembre() {
        return dateNaissanceMembre;
    }

    public void setDateNaissanceMembre(Date dateNaissanceMembre) {
        this.dateNaissanceMembre = dateNaissanceMembre;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Langue getLangueChoisie() {
        return langueChoisie;
    }

    public void setLangueChoisie(Langue langueChoisie) {
        this.langueChoisie = langueChoisie;
    }

    public Set<Invitation> getListeMembreRecois() {
        return listeMembreRecois;
    }

    public void setListeMembreRecois(Set<Invitation> listeMembreRecois) {
        this.listeMembreRecois = listeMembreRecois;
    }

    public Set<Invitation> getListeMembreEnvoie() {
        return listeMembreEnvoie;
    }

    public void setListeMembreEnvoie(Set<Invitation> listeMembreEnvoie) {
        this.listeMembreEnvoie = listeMembreEnvoie;
    }

    public Set<Signalement> getListeMembreSignaler() {
        return listeMembreSignaler;
    }

    public void setListeMembreSignaler(Set<Signalement> listeMembreSignaler) {
        this.listeMembreSignaler = listeMembreSignaler;
    }

    public Set<Signalement> getListeMembreEtreSignaler() {
        return listeMembreEtreSignaler;
    }

    public void setListeMembreEtreSignaler(Set<Signalement> listeMembreEtreSignaler) {
        this.listeMembreEtreSignaler = listeMembreEtreSignaler;
    }
    
    
}
