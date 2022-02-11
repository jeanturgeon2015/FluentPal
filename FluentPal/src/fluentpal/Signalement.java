
package fluentpal;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Signalement {
    int idSignalement;
    Date dateSignalement;
    String contenuSignalement;
    
    Membre membreSignaler;
    Set<Membre> membreEtreSignaler = new HashSet();

    public Signalement(int idSignalement, Date dateSignalement, String contenuSignalement) {
        this.idSignalement = idSignalement;
        this.dateSignalement = dateSignalement;
        this.contenuSignalement = contenuSignalement;
    }
    
    
}
