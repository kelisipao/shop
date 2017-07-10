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
 * RentContract entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_rentcontract"
    ,catalog="db_wuqing"
)

public class RentContract  implements java.io.Serializable {


    // Fields    

     private String applyId;
     private LandRentApply landRentApply;
     private String incomePayment1;
     private String incomePayment2;
     private String rentContract;
     private Set<RentBackups> rentBackupses = new HashSet<RentBackups>(0);


    // Constructors

    /** default constructor */
    public RentContract() {
    }

	/** minimal constructor */
    public RentContract(LandRentApply landRentApply) {
        this.landRentApply = landRentApply;
    }
    
    /** full constructor */
    public RentContract(LandRentApply landRentApply, String incomePayment1, String incomePayment2, String rentContract, Set<RentBackups> rentBackupses) {
        this.landRentApply = landRentApply;
        this.incomePayment1 = incomePayment1;
        this.incomePayment2 = incomePayment2;
        this.rentContract = rentContract;
        this.rentBackupses = rentBackupses;
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

    public LandRentApply getLandRentApply() {
        return this.landRentApply;
    }
    
    public void setLandRentApply(LandRentApply landRentApply) {
        this.landRentApply = landRentApply;
    }
    
    @Column(name="incomePayment1", length=50)

    public String getIncomePayment1() {
        return this.incomePayment1;
    }
    
    public void setIncomePayment1(String incomePayment1) {
        this.incomePayment1 = incomePayment1;
    }
    
    @Column(name="incomePayment2", length=50)

    public String getIncomePayment2() {
        return this.incomePayment2;
    }
    
    public void setIncomePayment2(String incomePayment2) {
        this.incomePayment2 = incomePayment2;
    }
    
    @Column(name="rentContract", length=50)

    public String getRentContract() {
        return this.rentContract;
    }
    
    public void setRentContract(String rentContract) {
        this.rentContract = rentContract;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="rentContract")

    public Set<RentBackups> getRentBackupses() {
        return this.rentBackupses;
    }
    
    public void setRentBackupses(Set<RentBackups> rentBackupses) {
        this.rentBackupses = rentBackupses;
    }
   








}