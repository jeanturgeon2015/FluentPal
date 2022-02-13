
package fluentpal;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Membre extends Personne {
    
    private String genre;
    private Date dateNaissanceMembre;
    private String ville;
    private String langueChoisie;
    private String disponibilite;
    private String niveau;
    
    private Personne admin;
    
    private Set<Invitation> listeInvitations = new HashSet();
    
    private Set<Signalement> listeSignaleEnvoyer = new HashSet();
    private Set<Signalement> listeSignaleRecu = new HashSet();
    
    private Set<Message> listeMessage = new HashSet();
    
    private JeuQuestionnaire jeuQuestionnaire;

    public Membre(String genre, Date dateNaissanceMembre, String ville, String langueChoisie, String disponibilite, int idPersonne, String username, String password, String nom, String prenom, String adresseCourriel, JeuQuestionnaire jeuQuestionnaire) {
        super(idPersonne, username, password, nom, prenom, adresseCourriel);
        this.genre = genre;
        this.dateNaissanceMembre = dateNaissanceMembre;
        this.ville = ville;
        this.langueChoisie = langueChoisie;
        this.disponibilite = disponibilite;
        this.jeuQuestionnaire = jeuQuestionnaire;
        
        this.jeuQuestionnaire.getMembreJQ().add(this);
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

    public Set<Invitation> getListeInvitations() {
        return listeInvitations;
    }

    public void setListeInvitations(Set<Invitation> listeInvitations) {
        this.listeInvitations = listeInvitations;
    }

    
    public Personne getAdmin() {
        return admin;
    }

    public void setAdmin(Personne admin) {
        this.admin = admin;
    }

    public Set<Message> getListeMessage() {
        return listeMessage;
    }

    public void setListeMessage(Set<Message> listeMessage) {
        this.listeMessage = listeMessage;
    }

    public String getLangueChoisie() {
        return langueChoisie;
    }

    public void setLangueChoisie(String langueChoisie) {
        this.langueChoisie = langueChoisie;
    }

    public Set<Signalement> getListeSignaleEnvoyer() {
        return listeSignaleEnvoyer;
    }

    public void setListeSignaleEnvoyer(Set<Signalement> listeSignaleEnvoyer) {
        this.listeSignaleEnvoyer = listeSignaleEnvoyer;
    }

    public Set<Signalement> getListeSignaleRecu() {
        return listeSignaleRecu;
    }

    public void setListeSignaleRecu(Set<Signalement> listeSignaleRecu) {
        this.listeSignaleRecu = listeSignaleRecu;
    }

    public JeuQuestionnaire getJeuQuestionnaire() {
        return jeuQuestionnaire;
    }

    public void setJeuQuestionnaire(JeuQuestionnaire jeuQuestionnaire) {
        this.jeuQuestionnaire = jeuQuestionnaire;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Membre{"+" nom= "+ nom + " prenom= " + prenom + " username= " + username +" adresseCourriel= " + adresseCourriel + "genre=" + genre + ", dateNaissanceMembre=" + dateNaissanceMembre + ", ville=" + ville + ", langueChoisie=" + langueChoisie + ", disponibilite=" + disponibilite + ", niveau=" + niveau + '}';
    }

    


   
}
