package tianjin.wuqing.po;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * MortgageBackups entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_mortgagebackups"
    ,catalog="db_wuqing"
)

public class MortgageBackups  implements java.io.Serializable {


    // Fields    

     private String elecSupervisionNumber;
     private LandMortgageApply landMortgageApply;
     private ApplyCheck applyCheck;
     private MortgageContract mortgageContract;


    // Constructors

    /** default constructor */
    public MortgageBackups() {
    }

    
    /** full constructor */
    public MortgageBackups(LandMortgageApply landMortgageApply, ApplyCheck applyCheck, MortgageContract mortgageContract) {
        this.landMortgageApply = landMortgageApply;
        this.applyCheck = applyCheck;
        this.mortgageContract = mortgageContract;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="elecSupervisionNumber", unique=true, nullable=false, length=20)

    public String getElecSupervisionNumber() {
        return this.elecSupervisionNumber;
    }
    
    public void setElecSupervisionNumber(String elecSupervisionNumber) {
        this.elecSupervisionNumber = elecSupervisionNumber;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="applyInfo", nullable=false)

    public LandMortgageApply getLandMortgageApply() {
        return this.landMortgageApply;
    }
    
    public void setLandMortgageApply(LandMortgageApply landMortgageApply) {
        this.landMortgageApply = landMortgageApply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="applyCheckInfo", nullable=false)

    public ApplyCheck getApplyCheck() {
        return this.applyCheck;
    }
    
    public void setApplyCheck(ApplyCheck applyCheck) {
        this.applyCheck = applyCheck;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="contractAndPaymentInfo", nullable=false)

    public MortgageContract getMortgageContract() {
        return this.mortgageContract;
    }
    
    public void setMortgageContract(MortgageContract mortgageContract) {
        this.mortgageContract = mortgageContract;
    }
   








}