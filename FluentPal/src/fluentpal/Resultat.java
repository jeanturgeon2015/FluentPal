
package fluentpal;


public class Resultat {
    
    private int nbrPoint;
    
    private Membre pointMembre;
    private Question pointQuestion;

    public Resultat(int nbrPoint, Membre pointMembre, Question pointQuestion) {
        this.nbrPoint = nbrPoint;
        this.pointMembre = pointMembre;
        this.pointQuestion = pointQuestion;
    }

    public Question getPointQuestion() {
        return pointQuestion;
    }

    public void setPointQuestion(Question pointQuestion) {
        this.pointQuestion = pointQuestion;
    }

    public int getNbrPoint() {
        return nbrPoint;
    }

    public void setNbrPoint(int nbrPoint) {
        this.nbrPoint = nbrPoint;
    }

    public Membre getPointMembre() {
        return pointMembre;
    }

    public void setPointMembre(Membre pointMembre) {
        this.pointMembre = pointMembre;
    }
    
    
    
}
