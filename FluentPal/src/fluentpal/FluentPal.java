
package fluentpal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FluentPal {

   static Set<Membre> membresEnregistrer = new HashSet(); // keep track tout les membres enregistrer
   static Membre membreConnecter; //keep track dune membre connecter
   
    public static void main(String[] args) {
       
        //on enregistre 4 utilisateurs dans l application
       enregistrer("male", new Date(), "Montreal", new Langue(100, "anglais"),"weekend",1, "username1","Abc123", "ekh", "alain", "alain@gmail.com" );
       enregistrer("female", new Date(), "Montreal", new Langue(100, "francais"),"weekend",1, "username2","Abc123", "agh", "aline", "aline@gmail.com" );
       enregistrer("male", new Date(), "Montreal", new Langue(100, "anglais"),"weekend",1, "username3","Abc123", "erra", "bbobe", "ffan@gmail.com" );       
       enregistrer("male", new Date(), "Montreal", new Langue(100, "anglais"),"weekend",1, "username4","Abc123", "etree", "caaa", "213@gmail.com" );       
       
       //connect le user
       seConnecter("username1", "Abc123");
       
       //recherche les membres avec les criteres male anglais weekend de la liste 
       List<Membre> resultatMembreRechercher = rechercherMembre("male", "anglais", "weekend");
      
       //on sauvegarde un membre de la liste rechercher pour l'invitation
       Membre membreRecoieInvitation = resultatMembreRechercher.get(0);
       //on invite le membre qui a etait sauvegarder 
       inviterMembre(membreRecoieInvitation, membreConnecter);
       
       //on deconnecte du username1 pour reconnecter avec le prochain user qui recois l'invitation
       seConnecter(membreRecoieInvitation.getUsername(), membreRecoieInvitation.getPassword());
       
       //on accpete tout les invitations du nouveau user connecter
       for(Invitation invitation : membreConnecter.getListeInvitations()){
           if (invitation.getMembreRecois().getUsername().equals(membreConnecter.getUsername())){
               invitation.setInvitationAcceptee(true);
           }
       }
       
       //on retourne dans le premier username1 pour verifier les invitations
       seConnecter("username1", "Abc123");
       
       //on envoie un message au perosnne qui a accepter l'invitation
       envoyerMessage(membreRecoieInvitation, membreConnecter, "Hello World");
       
       //on sauvegarde un membre qui n'a pas recu d'invitation
       Membre nonInviter = resultatMembreRechercher.get(1);
       
       //on essaie d'envoyer un message qui n'a pas recu d'invitation
       envoyerMessage(nonInviter, membreConnecter, "Hello World");
       
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
    
    public static void envoyerMessage(Membre recoie, Membre envoie, String phrase){
        if(membreConnecter == null || !peutEnvoyerMessage(recoie, envoie)){
            return;
        }
        Message message = new Message(1, new Date(), phrase, recoie, envoie);
        recoie.getListeMessage().add(message);
        envoie.getListeMessage().add(message);
    }
    
    private static boolean peutEnvoyerMessage(Membre recoie, Membre envoie){
        for(Invitation invitation : recoie.getListeInvitations()){
            if(invitation.getMembreEnvoie().getUsername().equals(envoie.getUsername()) && 
               invitation.getMembreRecois().getUsername().equals(recoie.getUsername()) && 
               invitation.isInvitationAcceptee()){
               return true;
            }
        }
        return false;
    }
    
    
    
}
