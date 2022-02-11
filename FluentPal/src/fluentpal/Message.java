
package fluentpal;

import java.util.Date;


public class Message {
    private int idMessage;
    private Date dateMessage;
    private String contenuMessage;

    private Membre membreRecevoir;
    private Membre membreEnvoyer;
    
    public Message(int idMessage, Date dateMessage, String contenuMessage) {
        this.idMessage = idMessage;
        this.dateMessage = dateMessage;
        this.contenuMessage = contenuMessage;
    }

    public Message(int idMessage, Date dateMessage, String contenuMessage, Membre membreRecevoir, Membre membreEnvoyer) {
        this.idMessage = idMessage;
        this.dateMessage = dateMessage;
        this.contenuMessage = contenuMessage;
        this.membreRecevoir = membreRecevoir;
        this.membreEnvoyer = membreEnvoyer;
    }

    public Membre getMembreEnvoyer() {
        return membreEnvoyer;
    }

    public void setMembreEnvoyer(Membre membreEnvoyer) {
        this.membreEnvoyer = membreEnvoyer;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public Date getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(Date dateMessage) {
        this.dateMessage = dateMessage;
    }

    public String getContenuMessage() {
        return contenuMessage;
    }

    public void setContenuMessage(String contenuMessage) {
        this.contenuMessage = contenuMessage;
    }

    public Membre getMembreRecevoir() {
        return membreRecevoir;
    }

    public void setMembreRecevoir(Membre membreRecevoir) {
        this.membreRecevoir = membreRecevoir;
    }
    
    
}
