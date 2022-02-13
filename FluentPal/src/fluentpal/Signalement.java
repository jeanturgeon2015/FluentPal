
package fluentpal;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Signalement {
    private int idSignalement;
    private Date dateSignalement;
    private String contenuSignalement;
    
    private Membre membreQuiSignale;
    private Membre membreQuiEstSignaler;
    
    private boolean approved;

    public Signalement(int idSignalement, Date dateSignalement, String contenuSignalement, Membre membreQuiSignale, Membre membreQuiEstSignaler) {
        this.idSignalement = idSignalement;
        this.dateSignalement = dateSignalement;
        this.contenuSignalement = contenuSignalement;
        this.membreQuiSignale = membreQuiSignale;
        this.membreQuiEstSignaler = membreQuiEstSignaler;
    }

    
    public String getContenuSignalement() {
        return contenuSignalement;
    }

    public void setContenuSignalement(String contenuSignalement) {
        this.contenuSignalement = contenuSignalement;
    }

    public int getIdSignalement() {
        return idSignalement;
    }

    public void setIdSignalement(int idSignalement) {
        this.idSignalement = idSignalement;
    }

    public Date getDateSignalement() {
        return dateSignalement;
    }

    public void setDateSignalement(Date dateSignalement) {
        this.dateSignalement = dateSignalement;
    }

    public Membre getMembreQuiSignale() {
        return membreQuiSignale;
    }

    public void setMembreQuiSignale(Membre membreQuiSignale) {
        this.membreQuiSignale = membreQuiSignale;
    }

    public Membre getMembreQuiEstSignaler() {
        return membreQuiEstSignaler;
    }

    public void setMembreQuiEstSignaler(Membre membreQuiEstSignaler) {
        this.membreQuiEstSignaler = membreQuiEstSignaler;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "Signalement{" + "idSignalement=" + idSignalement + ", dateSignalement=" + dateSignalement + ", contenuSignalement=" + contenuSignalement + ", membreQuiSignale=" + membreQuiSignale + ", membreQuiEstSignaler=" + membreQuiEstSignaler + '}';
    }

    
}
