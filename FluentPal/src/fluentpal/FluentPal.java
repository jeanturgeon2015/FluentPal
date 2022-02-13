package fluentpal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FluentPal {

    static Set<Personne> personneEnregistrer = new HashSet(); // keep track tout les membres enregistrer
    static Personne personneConnecter; //keep track dune membre connecter
    //////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        enregistrerAdmin(999, "admin1", "password", "turg", "Jean", "jeanturg@gmail.com");
        seConnecter("admin1", "password");
        
        //Questionnaire en francais
        JeuQuestionnaire jeuQuestionnaireFrancais = creerJeuQuestionnaire(100, new Date(), "Questionnaire Francais", "Francais", personneConnecter);
        List<Question> questionsFr = new ArrayList();
        questionsFr.add(new Question(10, 25, "Question 1", "Vrai", jeuQuestionnaireFrancais));
        questionsFr.add(new Question(11, 25, "Question 2", "Vrai", jeuQuestionnaireFrancais));
        questionsFr.add(new Question(12, 25, "Question 3", "Vrai", jeuQuestionnaireFrancais));
        questionsFr.add(new Question(13, 25, "Question 4", "Vrai", jeuQuestionnaireFrancais));

        jeuQuestionnaireFrancais.setListeQuestions(questionsFr);
        
        //Questionnaire en anglais
        JeuQuestionnaire jeuQuestionnaireAnglais = creerJeuQuestionnaire(100, new Date(), "Questionnaire Anglais", "Anglais", personneConnecter);
        List<Question> questionsAng = new ArrayList();
        questionsAng.add(new Question(10, 25, "Question 1", "True", jeuQuestionnaireAnglais));
        questionsAng.add(new Question(11, 25, "Question 2", "True", jeuQuestionnaireAnglais));
        questionsAng.add(new Question(12, 25, "Question 3", "True", jeuQuestionnaireAnglais));
        questionsAng.add(new Question(13, 25, "Question 4", "True", jeuQuestionnaireAnglais));

        jeuQuestionnaireFrancais.setListeQuestions(questionsAng);

        //on enregistre 4 utilisateurs dans l application
        enregistrerMembre("male", new Date(), "Montreal", "anglais", "weekend", 1, "username1", "Abc123", "ekh", "alain", "alain@gmail.com", jeuQuestionnaireAnglais);
        enregistrerMembre("female", new Date(), "Montreal", "francais", "weekend", 1, "username2", "Abc123", "agh", "aline", "aline@gmail.com", jeuQuestionnaireFrancais);
        enregistrerMembre("male", new Date(), "Montreal", "anglais", "weekend", 1, "username3", "Abc123", "erra", "bbobe", "ffan@gmail.com", jeuQuestionnaireAnglais);
        enregistrerMembre("male", new Date(), "Montreal", "anglais", "weekend", 1, "username4", "Abc123", "etree", "caaa", "213@gmail.com", jeuQuestionnaireAnglais);

        //connect le user
        seConnecter("username1", "Abc123");

        Membre membreConnecter = (Membre) personneConnecter;

        //recherche les membres avec les criteres male anglais weekend de la liste 
        List<Membre> resultatMembreRechercher = rechercherMembre("male", "anglais", "weekend");

        //on sauvegarde un membre de la liste rechercher pour l'invitation
        Membre membreRecoieInvitation = resultatMembreRechercher.get(0);
        //on invite le membre qui a etait sauvegarder 
        inviterMembre(membreRecoieInvitation, (Membre)membreConnecter);

        //on deconnecte du username1 pour reconnecter avec le prochain user qui recois l'invitation
        seConnecter(membreRecoieInvitation.getUsername(), membreRecoieInvitation.getPassword());

        //on accpete tout les invitations du nouveau user connecter
        for (Invitation invitation : membreConnecter.getListeInvitations()) {
            if (invitation.getMembreRecois().getUsername().equals(membreConnecter.getUsername())) {
                invitation.setInvitationAcceptee(true);
            }
        }

        //on retourne dans le premier username1 pour verifier les invitations
        seConnecter("username1", "Abc123");

        //on envoie un message au perosnne qui a accepter l'invitation
        envoyerMessage(membreRecoieInvitation, (Membre)membreConnecter, "Hello World");

        //on sauvegarde un membre qui n'a pas recu d'invitation
        Membre nonInviter = resultatMembreRechercher.get(2);

        //on essaie d'envoyer un message qui n'a pas recu d'invitation
        envoyerMessage(nonInviter, (Membre) membreConnecter, "Hello World");

        signalerMembre("Reported", (Membre) membreConnecter, nonInviter);
        signalerMembre("Reported", (Membre) membreConnecter, nonInviter);
        signalerMembre("Reported", (Membre) membreConnecter, nonInviter);
        //preuve que username non inviter existe toujours
        ////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////
        //Testing Admin

        seConnecter("admin1", "password");

        for (Signalement signalement : nonInviter.getListeSignaleRecu()) {
            consulterSignalement(signalement, true);
        }

        seConnecter("username1", "Abc123");
        membreConnecter = (Membre) personneConnecter;
        JeuQuestionnaire questionnaire = membreConnecter.getJeuQuestionnaire();
        List<Question> listeQuestions = questionnaire.getListeQuestions();
        listeQuestions.get(0).setNbPoints(repondreQuestion(listeQuestions.get(0), "false"));
        listeQuestions.get(1).setNbPoints(repondreQuestion(listeQuestions.get(1), "true"));
        listeQuestions.get(2).setNbPoints(repondreQuestion(listeQuestions.get(2), "true"));
        listeQuestions.get(3).setNbPoints(repondreQuestion(listeQuestions.get(3), "true"));
        
        questionnaire.setTotalResultat(calculerResultat(questionnaire));
        

    }

    public static void enregistrerAdmin(int idPersonne, String username, String password, String nom, String prenom, String adresseCourriel) {
        Personne personne = new Personne(idPersonne, username, password, nom, prenom, adresseCourriel);
        personneEnregistrer.add(personne);
    }

    public static void consulterSignalement(Signalement signalement, boolean status) {
        if (personneConnecter instanceof Membre) {
            return;
        }

        signalement.setApproved(status);
        Membre membre = signalement.getMembreQuiEstSignaler();
        int cpt = 0;
        for (Signalement signalementMembre : membre.getListeSignaleRecu()) {
            if (signalementMembre.isApproved()) {
                cpt++;
            }
        }
        if (cpt >= 3) {
            personneConnecter.getMembreDesactiver().add(membre);
        }
    }

    public static void enregistrerMembre(String genre, Date dateNaissanceMembre, String ville, String langueChoisie, String disponibilite, int idPersonne, String username, String password, String nom, String prenom, String adresseCourriel, JeuQuestionnaire jeuQuestionnaire) {
        Membre membre = new Membre(genre, dateNaissanceMembre, ville, langueChoisie, disponibilite, idPersonne, username, password, nom, prenom, adresseCourriel, jeuQuestionnaire);
        personneEnregistrer.add(membre);
    }

    public static void seConnecter(String username, String password) {
        for (Personne membre : personneEnregistrer) {
            if (membre.getUsername().equals(username) && membre.getPassword().equals(password)) {
                personneConnecter = membre;
            }
        }
    }

    public static List<Membre> rechercherMembre(String genre, String langueChoisie, String disponibilite) {
        if (personneConnecter == null) {
            return null;
        }

        List<Membre> listeMembres = new ArrayList();
        for (Personne personne : personneEnregistrer) {
            if(!(personne instanceof Membre)){
                continue; //skip la personne si ce nest pas un membre aka admin restart loop
            }
            Membre membre = (Membre) personne;
            if (membre.getGenre().equals(genre) && membre.getLangueChoisie().equals(langueChoisie)
                    && membre.getDisponibilite().equals(disponibilite)) {
                listeMembres.add(membre);
            }
        }
        return listeMembres;
    }

    public static void inviterMembre(Membre recoie, Membre envoie) {
        if (personneConnecter == null) {
            return;
        }

        Invitation invitation = new Invitation(1, new Date(), false, recoie, envoie);
        recoie.getListeInvitations().add(invitation);
        envoie.getListeInvitations().add(invitation);
    }

    public static void reponseInvitation(Invitation invitation, boolean reponse) {
        if (personneConnecter == null) {
            return;
        }
        invitation.setInvitationAcceptee(reponse);
    }

    public static void envoyerMessage(Membre recoie, Membre envoie, String phrase) {
        if (personneConnecter == null || !peutEnvoyerMessage(recoie, envoie)) {
            return;
        }
        Message message = new Message(1, new Date(), phrase, recoie, envoie);
        recoie.getListeMessage().add(message);
        envoie.getListeMessage().add(message);
    }

    private static boolean peutEnvoyerMessage(Membre recoie, Membre envoie) {
        for (Invitation invitation : recoie.getListeInvitations()) {
            if (invitation.getMembreEnvoie().getUsername().equals(envoie.getUsername())
                    && invitation.getMembreRecois().getUsername().equals(recoie.getUsername())
                    && invitation.isInvitationAcceptee()) {
                return true;
            }
        }
        return false;
    }
    ////////////////////////////////////////////////

    public static void signalerMembre(String contenuMessage, Membre membreQuiSignale, Membre membreQuiEstSignaler) {
        if (personneConnecter == null) {
            return;
        }

        Signalement signalement = new Signalement(10, new Date(), contenuMessage, membreQuiSignale, membreQuiEstSignaler);
        membreQuiSignale.getListeSignaleEnvoyer().add(signalement);
        membreQuiEstSignaler.getListeSignaleRecu().add(signalement);
    }

    public static JeuQuestionnaire creerJeuQuestionnaire(int idJeuQuestionnaire, Date dateCreationJQ, String titre, String langueJQ, Personne admin) {
        if (personneConnecter instanceof Membre) {
            return null;
        }
        return new JeuQuestionnaire(idJeuQuestionnaire, dateCreationJQ, titre, langueJQ, admin);
    }
    
    public static int repondreQuestion(Question question, String reponse){
        if(question.getBonneReponse().equalsIgnoreCase(reponse)){
            return question.getNbPoints();
        }
        return 0;
    }

    public static int calculerResultat(JeuQuestionnaire jeuQuestionnaire){
        int cpt = 0;
        for(Question question : jeuQuestionnaire.getListeQuestions()){
            cpt += question.getNbPoints();
        }
        return cpt;
    }
   
}
