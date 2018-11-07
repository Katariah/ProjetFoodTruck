package entityfoodtruck.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Fanny
 */
@Entity
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")
    , @NamedQuery(name = "Menu.findByIdMenu", query = "SELECT m FROM Menu m WHERE m.idMenu = :idMenu")
    , @NamedQuery(name = "Menu.findByNomMenu", query = "SELECT m FROM Menu m WHERE m.nomMenu = :nomMenu")
    , @NamedQuery(name = "Menu.findByDescription", query = "SELECT m FROM Menu m WHERE m.description = :description")
    , @NamedQuery(name = "Menu.findByPrixMenu", query = "SELECT m FROM Menu m WHERE m.prixMenu = :prixMenu")
    , @NamedQuery(name = "Menu.findByUrlMenu", query = "SELECT m FROM Menu m WHERE m.urlMenu = :urlMenu")})
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMenu")
    private Integer idMenu;
    @Basic(optional = false)
    @Column(name = "nomMenu")
    private String nomMenu;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "prixMenu")
    private float prixMenu;
    @Column(name = "urlMenu")
    private String urlMenu;
    @ManyToMany(mappedBy = "menuCollection")
    private Collection<Article> articleCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMenu")
    private Collection<CContientM> cContientMCollection;

    public Menu() {
    }

    public Menu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public Menu(Integer idMenu, String nomMenu, String description, float prixMenu) {
        this.idMenu = idMenu;
        this.nomMenu = nomMenu;
        this.description = description;
        this.prixMenu = prixMenu;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    public String getNomMenu() {
        return nomMenu;
    }

    public void setNomMenu(String nomMenu) {
        this.nomMenu = nomMenu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrixMenu() {
        return prixMenu;
    }

    public void setPrixMenu(float prixMenu) {
        this.prixMenu = prixMenu;
    }

    public String getUrlMenu() {
        return urlMenu;
    }

    public void setUrlMenu(String urlMenu) {
        this.urlMenu = urlMenu;
    }

    @XmlTransient
    public Collection<Article> getArticleCollection() {
        return articleCollection;
    }

    public void setArticleCollection(Collection<Article> articleCollection) {
        this.articleCollection = articleCollection;
    }

    @XmlTransient
    public Collection<CContientM> getCContientMCollection() {
        return cContientMCollection;
    }

    public void setCContientMCollection(Collection<CContientM> cContientMCollection) {
        this.cContientMCollection = cContientMCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMenu != null ? idMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idMenu == null && other.idMenu != null) || (this.idMenu != null && !this.idMenu.equals(other.idMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityfoodtruck.model.Menu[ idMenu=" + idMenu + " ]";
    }

}
