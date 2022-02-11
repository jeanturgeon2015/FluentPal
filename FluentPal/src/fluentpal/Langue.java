
package fluentpal;

import java.util.HashSet;
import java.util.Set;


public class Langue {
    
    private int idLangue;
    private String nomLangue;
    
    private Set<Membre> listeMembresLangue = new HashSet();
    private Set<JeuQuestionnaire> listeJQ = new HashSet();

    public Langue(int idLangue, String nomLangue) {
        this.idLangue = idLangue;
        this.nomLangue = nomLangue;
    }

    public String getNomLangue() {
        return nomLangue;
    }

    public void setNomLangue(String nomLangue) {
        this.nomLangue = nomLangue;
    }

    public int getIdLangue() {
        return idLangue;
    }

    public void setIdLangue(int idLangue) {
        this.idLangue = idLangue;
    }

    public Set<Membre> getListeMembresLangue() {
        return listeMembresLangue;
    }

    public void setListeMembresLangue(Set<Membre> listeMembresLangue) {
        this.listeMembresLangue = listeMembresLangue;
    }

    public Set<JeuQuestionnaire> getListeJQ() {
        return listeJQ;
    }

    public void setListeJQ(Set<JeuQuestionnaire> listeJQ) {
        this.listeJQ = listeJQ;
    }
    
}
