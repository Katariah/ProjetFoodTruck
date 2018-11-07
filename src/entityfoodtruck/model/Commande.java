package entityfoodtruck.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fanny
 */
@Entity
@Table(name = "commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c")
    , @NamedQuery(name = "Commande.findByIdCommande", query = "SELECT c FROM Commande c WHERE c.idCommande = :idCommande")
    , @NamedQuery(name = "Commande.findByDateLiv", query = "SELECT c FROM Commande c WHERE c.dateLiv = :dateLiv")
    , @NamedQuery(name = "Commande.findByHeureLiv", query = "SELECT c FROM Commande c WHERE c.heureLiv = :heureLiv")
    , @NamedQuery(name = "Commande.findByDateCom", query = "SELECT c FROM Commande c WHERE c.dateCom = :dateCom")
    , @NamedQuery(name = "Commande.findByPrixTotal", query = "SELECT c FROM Commande c WHERE c.prixTotal = :prixTotal")})
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCommande")
    private Integer idCommande;
    @Basic(optional = false)
    @Column(name = "dateLiv")
    @Temporal(TemporalType.DATE)
    private Date dateLiv;
    @Basic(optional = false)
    @Column(name = "heureLiv")
    @Temporal(TemporalType.TIME)
    private Date heureLiv;
    @Basic(optional = false)
    @Column(name = "dateCom")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCom;
    @Basic(optional = false)
    @Column(name = "prixTotal")
    private float prixTotal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCommande")
    private Collection<CContientM> cContientMCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCommande")
    private Collection<CContientA> cContientACollection;
    @JoinColumn(name = "idUser", referencedColumnName = "idUser")
    @ManyToOne(optional = false)
    private Utilisateur idUser;

    public Commande() {
    }

    public Commande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Commande(Integer idCommande, Date dateLiv, Date heureLiv, Date dateCom, float prixTotal) {
        this.idCommande = idCommande;
        this.dateLiv = dateLiv;
        this.heureLiv = heureLiv;
        this.dateCom = dateCom;
        this.prixTotal = prixTotal;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateLiv() {
        return dateLiv;
    }

    public void setDateLiv(Date dateLiv) {
        this.dateLiv = dateLiv;
    }

    public Date getHeureLiv() {
        return heureLiv;
    }

    public void setHeureLiv(Date heureLiv) {
        this.heureLiv = heureLiv;
    }

    public Date getDateCom() {
        return dateCom;
    }

    public void setDateCom(Date dateCom) {
        this.dateCom = dateCom;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    @XmlTransient
    public Collection<CContientM> getCContientMCollection() {
        return cContientMCollection;
    }

    public void setCContientMCollection(Collection<CContientM> cContientMCollection) {
        this.cContientMCollection = cContientMCollection;
    }

    @XmlTransient
    public Collection<CContientA> getCContientACollection() {
        return cContientACollection;
    }

    public void setCContientACollection(Collection<CContientA> cContientACollection) {
        this.cContientACollection = cContientACollection;
    }

    public Utilisateur getIdUser() {
        return idUser;
    }

    public void setIdUser(Utilisateur idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCommande != null ? idCommande.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.idCommande == null && other.idCommande != null) || (this.idCommande != null && !this.idCommande.equals(other.idCommande))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityfoodtruck.model.Commande[ idCommande=" + idCommande + " ]";
    }

}
