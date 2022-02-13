
package fluentpal;

import java.util.Date;


public class Invitation {
    private int idInvitation;
    private Date dateInvitation;
    private boolean invitationAcceptee;
    
    private Membre membreRecois;
    private Membre membreEnvoie;

    public Invitation(int idInvitation, Date dateInvitation, boolean invitationAcceptee, Membre membreRecois, Membre membreEnvoie) {
        this.idInvitation = idInvitation;
        this.dateInvitation = dateInvitation;
        this.invitationAcceptee = invitationAcceptee;
        this.membreRecois = membreRecois;
        this.membreEnvoie = membreEnvoie;
    }

    public Membre getMembreEnvoie() {
        return membreEnvoie;
    }

    public void setMembreEnvoie(Membre membreEnvoie) {
        this.membreEnvoie = membreEnvoie;
    }

    public int getIdInvitation() {
        return idInvitation;
    }

    public void setIdInvitation(int idInvitation) {
        this.idInvitation = idInvitation;
    }

    public Date getDateInvitation() {
        return dateInvitation;
    }

    public void setDateInvitation(Date dateInvitation) {
        this.dateInvitation = dateInvitation;
    }

    public boolean isInvitationAcceptee() {
        return invitationAcceptee;
    }

    public void setInvitationAcceptee(boolean invitationAcceptee) {
        this.invitationAcceptee = invitationAcceptee;
    }

    public Membre getMembreRecois() {
        return membreRecois;
    }

    public void setMembreRecois(Membre membreRecois) {
        this.membreRecois = membreRecois;
    }

    @Override
    public String toString() {
        return "Invitation{" + "idInvitation=" + idInvitation + ", dateInvitation=" + dateInvitation + ", invitationAcceptee=" + invitationAcceptee + ", membreRecois=" + membreRecois + ", membreEnvoie=" + membreEnvoie + '}';
    }
    
    
}
