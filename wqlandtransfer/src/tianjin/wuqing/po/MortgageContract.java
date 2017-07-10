package tianjin.wuqing.po;
// default package

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * MortgageContract entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_mortgagecontract"
    ,catalog="db_wuqing"
)

public class MortgageContract  implements java.io.Serializable {


    // Fields    

     private String applyId;
     private LandMortgageApply landMortgageApply;
     private String taxPayment;
     private String mortgageContract;
     private Set<MortgageBackups> mortgageBackupses = new HashSet<MortgageBackups>(0);


    // Constructors

    /** default constructor */
    public MortgageContract() {
    }

	/** minimal constructor */
    public MortgageContract(LandMortgageApply landMortgageApply) {
        this.landMortgageApply = landMortgageApply;
    }
    
    /** full constructor */
    public MortgageContract(LandMortgageApply landMortgageApply, String taxPayment, String mortgageContract, Set<MortgageBackups> mortgageBackupses) {
        this.landMortgageApply = landMortgageApply;
        this.taxPayment = taxPayment;
        this.mortgageContract = mortgageContract;
        this.mortgageBackupses = mortgageBackupses;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="applyId", unique=true, nullable=false, length=20)

    public String getApplyId() {
        return this.applyId;
    }
    
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }
	@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn

    public LandMortgageApply getLandMortgageApply() {
        return this.landMortgageApply;
    }
    
    public void setLandMortgageApply(LandMortgageApply landMortgageApply) {
        this.landMortgageApply = landMortgageApply;
    }
    
    @Column(name="taxPayment", length=50)

    public String getTaxPayment() {
        return this.taxPayment;
    }
    
    public void setTaxPayment(String taxPayment) {
        this.taxPayment = taxPayment;
    }
    
    @Column(name="mortgageContract", length=50)

    public String getMortgageContract() {
        return this.mortgageContract;
    }
    
    public void setMortgageContract(String mortgageContract) {
        this.mortgageContract = mortgageContract;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="mortgageContract")

    public Set<MortgageBackups> getMortgageBackupses() {
        return this.mortgageBackupses;
    }
    
    public void setMortgageBackupses(Set<MortgageBackups> mortgageBackupses) {
        this.mortgageBackupses = mortgageBackupses;
    }
   








}