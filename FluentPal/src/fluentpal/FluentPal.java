
package fluentpal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FluentPal {

   static Set<Membre> membresEnregistrer = new HashSet();
   static Membre membreConnecter;
   
   
   
    public static void main(String[] args) {
        
       enregistrer("male", new Date(), "Montreal", new Langue(100, "anglais"),"weekend",1, "username1","Abc123", "ekh", "alain", "alain@gmail.com" );
       enregistrer("female", new Date(), "Montreal", new Langue(100, "francais"),"weekend",1, "username2","Abc123", "agh", "aline", "aline@gmail.com" );
       enregistrer("male", new Date(), "Montreal", new Langue(100, "anglais"),"weekend",1, "username3","Abc123", "erra", "bbobe", "ffan@gmail.com" );       
       
       seConnecter("username1", "Abc123");
       
       List<Membre> resultatMembreRechercher = rechercherMembre("male", "anglais", "weekend");
       Membre membreRecoie = resultatMembreRechercher.get(0);
       
       inviterMembre(membreRecoie, membreConnecter);
       seConnecter(membreRecoie.getUsername(), membreRecoie.getPassword());
       
       for(Invitation invitation : membreConnecter.getListeInvitations()){
           if (invitation.getMembreRecois().getUsername().equals(membreConnecter.getUsername())){
               invitation.setInvitationAcceptee(true);
           }
       }
       
       seConnecter("username1", "Abc123");
       

       System.out.println("COnnected");       

    }
    
    public static void enregistrer(String genre, Date dateNaissanceMembre, String ville, Langue langueChoisie, String disponibilite, int idPersonne, String username, String password, String nom, String prenom, String adresseCourriel){
        Membre membre = new Membre(genre, dateNaissanceMembre, ville, langueChoisie, disponibilite, idPersonne, username, password, nom, prenom, adresseCourriel);
        membresEnregistrer.add(membre);
    }
    
    public static void seConnecter(String username, String password){
        for(Membre membre : membresEnregistrer){
            if(membre.getUsername().equals(username) && membre.getPassword().equals(password)){
                membreConnecter = membre;
            }
        }
    }
    
    public static List<Membre> rechercherMembre(String genre, String langueChoisie, String disponibilite){
        if(membreConnecter == null){
            return null;
        }
        
        List<Membre> listeMembres = new ArrayList();
        for(Membre membre : membresEnregistrer){
            if(membre.getGenre().equals(genre) && membre.getLangueChoisieString().equals(langueChoisie) && membre.getDisponibilite().equals(disponibilite)){
                listeMembres.add(membre);
            }
        } 
        return listeMembres;
    }
    
    public static void inviterMembre(Membre recoie, Membre envoie){
        if(membreConnecter == null){
            return;
        }
        
        Invitation invitation = new Invitation(1, new Date(), false, recoie, envoie);
        recoie.getListeInvitations().add(invitation);
        envoie.getListeInvitations().add(invitation);
    }
    
    public static void reponseInvitation(Invitation invitation, boolean reponse){
        if(membreConnecter == null){
            return;
        }
        
        invitation.setInvitationAcceptee(reponse);
    }
    
}
