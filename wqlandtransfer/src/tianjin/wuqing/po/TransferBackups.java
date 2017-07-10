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
 * TransferBackups entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_transferbackups"
    ,catalog="db_wuqing"
)

public class TransferBackups  implements java.io.Serializable {


    // Fields    

     private String elecSupervisionNumber;
     private LandTransferApply landTransferApply;
     private ApplyCheck applyCheck;
     private TransferContract transferContract;
     private String applyInfo;
     private String column6;


    // Constructors

    /** default constructor */
    public TransferBackups() {
    }

	/** minimal constructor */
    public TransferBackups(ApplyCheck applyCheck, TransferContract transferContract, String applyInfo) {
        this.applyCheck = applyCheck;
        this.transferContract = transferContract;
        this.applyInfo = applyInfo;
    }
    
    /** full constructor */
    public TransferBackups(LandTransferApply landTransferApply, ApplyCheck applyCheck, TransferContract transferContract, String applyInfo, String column6) {
        this.landTransferApply = landTransferApply;
        this.applyCheck = applyCheck;
        this.transferContract = transferContract;
        this.applyInfo = applyInfo;
        this.column6 = column6;
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
        @JoinColumn(name="formId")

    public LandTransferApply getLandTransferApply() {
        return this.landTransferApply;
    }
    
    public void setLandTransferApply(LandTransferApply landTransferApply) {
        this.landTransferApply = landTransferApply;
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

    public TransferContract getTransferContract() {
        return this.transferContract;
    }
    
    public void setTransferContract(TransferContract transferContract) {
        this.transferContract = transferContract;
    }
    
    @Column(name="applyInfo", nullable=false, length=20)

    public String getApplyInfo() {
        return this.applyInfo;
    }
    
    public void setApplyInfo(String applyInfo) {
        this.applyInfo = applyInfo;
    }
    
    @Column(name="Column_6", length=10)

    public String getColumn6() {
        return this.column6;
    }
    
    public void setColumn6(String column6) {
        this.column6 = column6;
    }
   








}