package tianjin.wuqing.po;
// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * SupplyCheck entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_supplycheck"
    ,catalog="db_wuqing"
)

public class SupplyCheck  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private LandTransferSupply landTransferSupply;
     private LandMortgageSupply landMortgageSupply;
     private Government government;
     private LandRentSupply landRentSupply;
     private Integer type;
     private Integer result;
     private String notification;
     private Date date;


    // Constructors

    /** default constructor */
    public SupplyCheck() {
    }

	/** minimal constructor */
    public SupplyCheck( Integer result, String notification, Date date) {
        this.result = result;
        this.notification = notification;
        this.date = date;
    }
    
    /** full constructor */
    public SupplyCheck(LandTransferSupply landTransferSupply, LandMortgageSupply landMortgageSupply, Government government, LandRentSupply landRentSupply, Integer type,  Integer result, String notification, Date date) {
        this.landTransferSupply = landTransferSupply;
        this.landMortgageSupply = landMortgageSupply;
        this.government = government;
        this.landRentSupply = landRentSupply;
        this.type = type;
        this.result = result;
        this.notification = notification;
        this.date = date;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="transferSupplyID")

    public LandTransferSupply getLandTransferSupply() {
        return this.landTransferSupply;
    }
    
    public void setLandTransferSupply(LandTransferSupply landTransferSupply) {
        this.landTransferSupply = landTransferSupply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="mortgageSupplyID")

    public LandMortgageSupply getLandMortgageSupply() {
        return this.landMortgageSupply;
    }
    
    public void setLandMortgageSupply(LandMortgageSupply landMortgageSupply) {
        this.landMortgageSupply = landMortgageSupply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="inspector")

    public Government getGovernment() {
        return this.government;
    }
    
    public void setGovernment(Government government) {
        this.government = government;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="rentSupplyID")

    public LandRentSupply getLandRentSupply() {
        return this.landRentSupply;
    }
    
    public void setLandRentSupply(LandRentSupply landRentSupply) {
        this.landRentSupply = landRentSupply;
    }
    
    @Column(name="type")

    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }
    
   
    
    @Column(name="result", nullable=false)

    public Integer getResult() {
        return this.result;
    }
    
    public void setResult(Integer result) {
        this.result = result;
    }
    
    @Column(name="notification", nullable=false, length=30)

    public String getNotification() {
        return this.notification;
    }
    
    public void setNotification(String notification) {
        this.notification = notification;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="date", nullable=false, length=10)

    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
   








}