
package fluentpal;


public class Question {
    private int idQuestion;
    private int nbPoints;
    private String contenuQuestion;
    private String bonneReponse;
    
    private JeuQuestionnaire jeuQuestion;

    public Question(int idQuestion, int nbPoints, String contenuQuestion, String bonneReponse, JeuQuestionnaire jeuQuestion) {
        this.idQuestion = idQuestion;
        this.nbPoints = nbPoints;
        this.contenuQuestion = contenuQuestion;
        this.bonneReponse = bonneReponse;
        this.jeuQuestion = jeuQuestion;
        
        this.jeuQuestion.getListeQuestions().add(this);
    }


    public JeuQuestionnaire getJeuQuestion() {
        return jeuQuestion;
    }

    public void setJeuQuestion(JeuQuestionnaire jeuQuestion) {
        this.jeuQuestion = jeuQuestion;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(int nbPoints) {
        this.nbPoints = nbPoints;
    }

    public String getContenuQuestion() {
        return contenuQuestion;
    }

    public void setContenuQuestion(String contenuQuestion) {
        this.contenuQuestion = contenuQuestion;
    }

    public String getBonneReponse() {
        return bonneReponse;
    }

    public void setBonneReponse(String bonneReponse) {
        this.bonneReponse = bonneReponse;
    }

    @Override
    public String toString() {
        return "Question{" + "idQuestion=" + idQuestion + ", nbPoints=" + nbPoints + ", contenuQuestion=" + contenuQuestion + ", bonneReponse=" + bonneReponse + ", jeuQuestion=" + jeuQuestion + '}';
    }
    
    
}
