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
 * RentBackups entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_rentbackups"
    ,catalog="db_wuqing"
)

public class RentBackups  implements java.io.Serializable {


    // Fields    

     private String electSupervisionNumber;
     private ApplyCheck applyCheck;
     private LandRentApply landRentApply;
     private RentContract rentContract;


    // Constructors

    /** default constructor */
    public RentBackups() {
    }

    
    /** full constructor */
    public RentBackups(ApplyCheck applyCheck, LandRentApply landRentApply, RentContract rentContract) {
        this.applyCheck = applyCheck;
        this.landRentApply = landRentApply;
        this.rentContract = rentContract;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="electSupervisionNumber", unique=true, nullable=false, length=20)

    public String getElectSupervisionNumber() {
        return this.electSupervisionNumber;
    }
    
    public void setElectSupervisionNumber(String electSupervisionNumber) {
        this.electSupervisionNumber = electSupervisionNumber;
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
        @JoinColumn(name="applyInfo", nullable=false)

    public LandRentApply getLandRentApply() {
        return this.landRentApply;
    }
    
    public void setLandRentApply(LandRentApply landRentApply) {
        this.landRentApply = landRentApply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="contractAndPaymentInfo", nullable=false)

    public RentContract getRentContract() {
        return this.rentContract;
    }
    
    public void setRentContract(RentContract rentContract) {
        this.rentContract = rentContract;
    }
   








}