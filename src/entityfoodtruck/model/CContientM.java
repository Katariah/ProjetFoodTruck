package entityfoodtruck.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fanny
 */
@Entity
@Table(name = "c_contient_m")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CContientM.findAll", query = "SELECT c FROM CContientM c")
    , @NamedQuery(name = "CContientM.findById", query = "SELECT c FROM CContientM c WHERE c.id = :id")
    , @NamedQuery(name = "CContientM.findByQuantite", query = "SELECT c FROM CContientM c WHERE c.quantite = :quantite")})
public class CContientM implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "quantite")
    private int quantite;
    @JoinColumn(name = "idCommande", referencedColumnName = "idCommande")
    @ManyToOne(optional = false)
    private Commande idCommande;
    @JoinColumn(name = "idMenu", referencedColumnName = "idMenu")
    @ManyToOne(optional = false)
    private Menu idMenu;

    public CContientM() {
    }

    public CContientM(Integer id) {
        this.id = id;
    }

    public CContientM(Integer id, int quantite) {
        this.id = id;
        this.quantite = quantite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Commande getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Commande idCommande) {
        this.idCommande = idCommande;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CContientM)) {
            return false;
        }
        CContientM other = (CContientM) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityfoodtruck.model.CContientM[ id=" + id + " ]";
    }

}
