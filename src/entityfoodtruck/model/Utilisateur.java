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
@Table(name = "utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u")
    , @NamedQuery(name = "Utilisateur.findByIdUser", query = "SELECT u FROM Utilisateur u WHERE u.idUser = :idUser")
    , @NamedQuery(name = "Utilisateur.findByNomUser", query = "SELECT u FROM Utilisateur u WHERE u.nomUser = :nomUser")
    , @NamedQuery(name = "Utilisateur.findByPrenomUser", query = "SELECT u FROM Utilisateur u WHERE u.prenomUser = :prenomUser")
    , @NamedQuery(name = "Utilisateur.findByAdresse", query = "SELECT u FROM Utilisateur u WHERE u.adresse = :adresse")
    , @NamedQuery(name = "Utilisateur.findByCodePostal", query = "SELECT u FROM Utilisateur u WHERE u.codePostal = :codePostal")
    , @NamedQuery(name = "Utilisateur.findByVille", query = "SELECT u FROM Utilisateur u WHERE u.ville = :ville")
    , @NamedQuery(name = "Utilisateur.findByMail", query = "SELECT u FROM Utilisateur u WHERE u.mail = :mail")
    , @NamedQuery(name = "Utilisateur.findByMdp", query = "SELECT u FROM Utilisateur u WHERE u.mdp = :mdp")
    , @NamedQuery(name = "Utilisateur.findByTel", query = "SELECT u FROM Utilisateur u WHERE u.tel = :tel")
    , @NamedQuery(name = "Utilisateur.findByDateNaiss", query = "SELECT u FROM Utilisateur u WHERE u.dateNaiss = :dateNaiss")
    , @NamedQuery(name = "Utilisateur.findByTypeCompte", query = "SELECT u FROM Utilisateur u WHERE u.typeCompte = :typeCompte")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUser")
    private Integer idUser;
    @Basic(optional = false)
    @Column(name = "nomUser")
    private String nomUser;
    @Basic(optional = false)
    @Column(name = "prenomUser")
    private String prenomUser;
    @Basic(optional = false)
    @Column(name = "adresse")
    private String adresse;
    @Basic(optional = false)
    @Column(name = "codePostal")
    private int codePostal;
    @Basic(optional = false)
    @Column(name = "ville")
    private String ville;
    @Basic(optional = false)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @Column(name = "mdp")
    private String mdp;
    @Basic(optional = false)
    @Column(name = "tel")
    private String tel;
    @Column(name = "dateNaiss")
    @Temporal(TemporalType.DATE)
    private Date dateNaiss;
    @Basic(optional = false)
    @Column(name = "typeCompte")
    private String typeCompte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUser")
    private Collection<Commande> commandeCollection;

    public Utilisateur() {
    }

    public Utilisateur(Integer idUser) {
        this.idUser = idUser;
    }

    public Utilisateur(Integer idUser, String nomUser, String prenomUser, String adresse, int codePostal, String ville, String mail, String mdp, String tel, String typeCompte) {
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.prenomUser = prenomUser;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.mail = mail;
        this.mdp = mdp;
        this.tel = tel;
        this.typeCompte = typeCompte;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPrenomUser() {
        return prenomUser;
    }

    public void setPrenomUser(String prenomUser) {
        this.prenomUser = prenomUser;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    @XmlTransient
    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityfoodtruck.model.Utilisateur[ idUser=" + idUser + " ]";
    }

}
