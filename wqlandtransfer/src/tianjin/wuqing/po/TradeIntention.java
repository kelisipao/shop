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
 * TradeIntention entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_tradeintention"
    ,catalog="db_wuqing"
)

public class TradeIntention  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private LandTransferSupply landTransferSupply;
     private User user;
     private LandMortgageSupply landMortgageSupply;
     private LandRentSupply landRentSupply;
     private Integer landId;
     private String supplyPayment;
     private String demandPayment;
     private String intentionContract;
     private String tradeContract;
     private Integer status;


    // Constructors

    /** default constructor */
    public TradeIntention() {
    }

	/** minimal constructor */
    public TradeIntention(User user, LandMortgageSupply landMortgageSupply, Integer landId, String supplyPayment, String demandPayment, String intentionContract, String tradeContract, Integer status) {
        this.user = user;
        this.landMortgageSupply = landMortgageSupply;
        this.landId = landId;
        this.supplyPayment = supplyPayment;
        this.demandPayment = demandPayment;
        this.intentionContract = intentionContract;
        this.tradeContract = tradeContract;
        this.status = status;
    }
    
    /** full constructor */
    public TradeIntention(LandTransferSupply landTransferSupply, User user, LandMortgageSupply landMortgageSupply, LandRentSupply landRentSupply, Integer landId, String supplyPayment, String demandPayment, String intentionContract, String tradeContract, Integer status) {
        this.landTransferSupply = landTransferSupply;
        this.user = user;
        this.landMortgageSupply = landMortgageSupply;
        this.landRentSupply = landRentSupply;
        this.landId = landId;
        this.supplyPayment = supplyPayment;
        this.demandPayment = demandPayment;
        this.intentionContract = intentionContract;
        this.tradeContract = tradeContract;
        this.status = status;
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
        @JoinColumn(name="transferSupplyId")

    public LandTransferSupply getLandTransferSupply() {
        return this.landTransferSupply;
    }
    
    public void setLandTransferSupply(LandTransferSupply landTransferSupply) {
        this.landTransferSupply = landTransferSupply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="demenderId", nullable=false)

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="mortgageSupplyId", nullable=false)

    public LandMortgageSupply getLandMortgageSupply() {
        return this.landMortgageSupply;
    }
    
    public void setLandMortgageSupply(LandMortgageSupply landMortgageSupply) {
        this.landMortgageSupply = landMortgageSupply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="rentSupplyId")

    public LandRentSupply getLandRentSupply() {
        return this.landRentSupply;
    }
    
    public void setLandRentSupply(LandRentSupply landRentSupply) {
        this.landRentSupply = landRentSupply;
    }
    
    @Column(name="landId", nullable=false)

    public Integer getLandId() {
        return this.landId;
    }
    
    public void setLandId(Integer landId) {
        this.landId = landId;
    }
    
    @Column(name="supplyPayment", nullable=false, length=50)

    public String getSupplyPayment() {
        return this.supplyPayment;
    }
    
    public void setSupplyPayment(String supplyPayment) {
        this.supplyPayment = supplyPayment;
    }
    
    @Column(name="demandPayment", nullable=false, length=50)

    public String getDemandPayment() {
        return this.demandPayment;
    }
    
    public void setDemandPayment(String demandPayment) {
        this.demandPayment = demandPayment;
    }
    
    @Column(name="intentionContract", nullable=false, length=50)

    public String getIntentionContract() {
        return this.intentionContract;
    }
    
    public void setIntentionContract(String intentionContract) {
        this.intentionContract = intentionContract;
    }
    
    @Column(name="tradeContract", nullable=false, length=50)

    public String getTradeContract() {
        return this.tradeContract;
    }
    
    public void setTradeContract(String tradeContract) {
        this.tradeContract = tradeContract;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
   








}