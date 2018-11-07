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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "article")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a")
    , @NamedQuery(name = "Article.findByIdArticle", query = "SELECT a FROM Article a WHERE a.idArticle = :idArticle")
    , @NamedQuery(name = "Article.findByNomArticle", query = "SELECT a FROM Article a WHERE a.nomArticle = :nomArticle")
    , @NamedQuery(name = "Article.findByDescriptionArticle", query = "SELECT a FROM Article a WHERE a.descriptionArticle = :descriptionArticle")
    , @NamedQuery(name = "Article.findByPrixArticle", query = "SELECT a FROM Article a WHERE a.prixArticle = :prixArticle")
    , @NamedQuery(name = "Article.findByUrlArticle", query = "SELECT a FROM Article a WHERE a.urlArticle = :urlArticle")})
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idArticle")
    private Integer idArticle;
    @Basic(optional = false)
    @Column(name = "nomArticle")
    private String nomArticle;
    @Column(name = "descriptionArticle")
    private String descriptionArticle;
    @Basic(optional = false)
    @Column(name = "prixArticle")
    private float prixArticle;
    @Column(name = "urlArticle")
    private String urlArticle;
    @JoinTable(name = "appartient", joinColumns = {
        @JoinColumn(name = "idArticle", referencedColumnName = "idArticle")}, inverseJoinColumns = {
        @JoinColumn(name = "idMenu", referencedColumnName = "idMenu")})
    @ManyToMany
    private Collection<Menu> menuCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArticle")
    private Collection<CContientA> cContientACollection;
    @JoinColumn(name = "idCat", referencedColumnName = "idCat")
    @ManyToOne(optional = false)
    private Categorie idCat;

    public Article() {
    }

    public Article(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public Article(Integer idArticle, String nomArticle, float prixArticle) {
        this.idArticle = idArticle;
        this.nomArticle = nomArticle;
        this.prixArticle = prixArticle;
    }

    public Integer getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public String getDescriptionArticle() {
        return descriptionArticle;
    }

    public void setDescriptionArticle(String descriptionArticle) {
        this.descriptionArticle = descriptionArticle;
    }

    public float getPrixArticle() {
        return prixArticle;
    }

    public void setPrixArticle(float prixArticle) {
        this.prixArticle = prixArticle;
    }

    public String getUrlArticle() {
        return urlArticle;
    }

    public void setUrlArticle(String urlArticle) {
        this.urlArticle = urlArticle;
    }

    @XmlTransient
    public Collection<Menu> getMenuCollection() {
        return menuCollection;
    }

    public void setMenuCollection(Collection<Menu> menuCollection) {
        this.menuCollection = menuCollection;
    }

    @XmlTransient
    public Collection<CContientA> getCContientACollection() {
        return cContientACollection;
    }

    public void setCContientACollection(Collection<CContientA> cContientACollection) {
        this.cContientACollection = cContientACollection;
    }

    public Categorie getIdCat() {
        return idCat;
    }

    public void setIdCat(Categorie idCat) {
        this.idCat = idCat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArticle != null ? idArticle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.idArticle == null && other.idArticle != null) || (this.idArticle != null && !this.idArticle.equals(other.idArticle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityfoodtruck.model.Article[ idArticle=" + idArticle + " ]";
    }

}
