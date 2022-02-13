
package fluentpal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JeuQuestionnaire {
    
    private int idJeuQuestionnaire;
    private Date dateCreationJQ;
    private String titre;
    private String langueJQ;
    
    private Personne admin;
    private List<Question> listeQuestions = new ArrayList();
    private Set<Membre> membreJQ = new HashSet();

    public JeuQuestionnaire(int idJeuQuestionnaire, Date dateCreationJQ, String titre, String langueJQ, Personne admin) {
        this.idJeuQuestionnaire = idJeuQuestionnaire;
        this.dateCreationJQ = dateCreationJQ;
        this.titre = titre;
        this.langueJQ = langueJQ;
        this.admin = admin;
        
    }
    

    public String getLangueJQ() {
        return langueJQ;
    }

    public void setLangueJQ(String langueJQ) {
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

    public List<Question> getListeQuestions() {
        return listeQuestions;
    }

    public void setListeQuestions(List<Question> listeQuestions) {
        this.listeQuestions = listeQuestions;
    }

    public Personne getAdmin() {
        return admin;
    }

    public void setAdmin(Personne admin) {
        this.admin = admin;
    }

    public Set<Membre> getMembreJQ() {
        return membreJQ;
    }

    public void setMembreJQ(Set<Membre> membreJQ) {
        this.membreJQ = membreJQ;
    }

    @Override
    public String toString() {
        return "JeuQuestionnaire{" + "idJeuQuestionnaire=" + idJeuQuestionnaire + ", dateCreationJQ=" + dateCreationJQ + ", titre=" + titre + ", langueJQ=" + langueJQ + ", admin=" + admin + '}';
    }
    
}
