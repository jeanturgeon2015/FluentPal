
package fluentpal;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class JeuQuestionnaire {
    
    private int idJeuQuestionnaire;
    private Date dateCreationJQ;
    private String titre;
    private Langue langueJQ;
    
    Personne admin;
    private Set<Question> listeQuestions = new HashSet();

    public JeuQuestionnaire(int idJeuQuestionnaire, Date dateCreationJQ, String titre, Langue langueJQ) {
        this.idJeuQuestionnaire = idJeuQuestionnaire;
        this.dateCreationJQ = dateCreationJQ;
        this.titre = titre;
        this.langueJQ = langueJQ;
    }

    public Langue getLangueJQ() {
        return langueJQ;
    }

    public void setLangueJQ(Langue langueJQ) {
        this.langueJQ = langueJQ;
    }

    public int getIdJeuQuestionnaire() {
        return idJeuQuestionnaire;
    }

    public void setIdJeuQuestionnaire(int idJeuQuestionnaire) {
        this.idJeuQuestionnaire = idJeuQuestionnaire;
    }

    public Date getDateCreationJQ() {
        return dateCreationJQ;
    }

    public void setDateCreationJQ(Date dateCreationJQ) {
        this.dateCreationJQ = dateCreationJQ;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Set<Question> getListeQuestions() {
        return listeQuestions;
    }

    public void setListeQuestions(Set<Question> listeQuestions) {
        this.listeQuestions = listeQuestions;
    }
    
    
}
