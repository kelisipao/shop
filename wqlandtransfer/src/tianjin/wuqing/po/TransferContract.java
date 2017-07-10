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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * TransferContract entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_transfercontract"
    ,catalog="db_wuqing"
)

public class TransferContract  implements java.io.Serializable {


    // Fields    

     private String applyId;
     private LandTransferApply landTransferApply;
     private String supplementaryContract;
     private String supplementaryPayment;
     private String dealPayment;
     private String taxPayment;
     private String transferContract;
     private Set<TransferBackups> transferBackupses = new HashSet<TransferBackups>(0);


    // Constructors

    /** default constructor */
    public TransferContract() {
    }

    
    /** full constructor */
    public TransferContract(LandTransferApply landTransferApply, String supplementaryContract, String supplementaryPayment, String dealPayment, String taxPayment, String transferContract, Set<TransferBackups> transferBackupses) {
        this.landTransferApply = landTransferApply;
        this.supplementaryContract = supplementaryContract;
        this.supplementaryPayment = supplementaryPayment;
        this.dealPayment = dealPayment;
        this.taxPayment = taxPayment;
        this.transferContract = transferContract;
        this.transferBackupses = transferBackupses;
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
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="formId")

    public LandTransferApply getLandTransferApply() {
        return this.landTransferApply;
    }
    
    public void setLandTransferApply(LandTransferApply landTransferApply) {
        this.landTransferApply = landTransferApply;
    }
    
    @Column(name="supplementaryContract", length=50)

    public String getSupplementaryContract() {
        return this.supplementaryContract;
    }
    
    public void setSupplementaryContract(String supplementaryContract) {
        this.supplementaryContract = supplementaryContract;
    }
    
    @Column(name="supplementaryPayment", length=50)

    public String getSupplementaryPayment() {
        return this.supplementaryPayment;
    }
    
    public void setSupplementaryPayment(String supplementaryPayment) {
        this.supplementaryPayment = supplementaryPayment;
    }
    
    @Column(name="dealPayment", length=50)

    public String getDealPayment() {
        return this.dealPayment;
    }
    
    public void setDealPayment(String dealPayment) {
        this.dealPayment = dealPayment;
    }
    
    @Column(name="taxPayment", length=50)

    public String getTaxPayment() {
        return this.taxPayment;
    }
    
    public void setTaxPayment(String taxPayment) {
        this.taxPayment = taxPayment;
    }
    
    @Column(name="transferContract", length=50)

    public String getTransferContract() {
        return this.transferContract;
    }
    
    public void setTransferContract(String transferContract) {
        this.transferContract = transferContract;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="transferContract")

    public Set<TransferBackups> getTransferBackupses() {
        return this.transferBackupses;
    }
    
    public void setTransferBackupses(Set<TransferBackups> transferBackupses) {
        this.transferBackupses = transferBackupses;
    }
   








}