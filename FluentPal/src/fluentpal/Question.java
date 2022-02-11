
package fluentpal;


public class Question {
    private int idQuestion;
    private int nbPoints;
    private String contenuQuestion;
    
    private JeuQuestionnaire quizz;

    public Question(int idQuestion, int nbPoints, String contenuQuestion, JeuQuestionnaire quizz) {
        this.idQuestion = idQuestion;
        this.nbPoints = nbPoints;
        this.contenuQuestion = contenuQuestion;
        this.quizz = quizz;
    }

    public JeuQuestionnaire getQuizz() {
        return quizz;
    }

    public void setQuizz(JeuQuestionnaire quizz) {
        this.quizz = quizz;
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
    
    
}
