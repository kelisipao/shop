package tianjin.wuqing.po;
// default package

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * LandMortgageSupply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_landmortgagesupply"
    ,catalog="db_wuqing"
)

public class LandMortgageSupply  implements java.io.Serializable {


    // Fields    

     private String formId;
     private User user;
     private Date formDate;
     private String preparer;
     private String phone;
     private Integer status;
     private Set<SupplyCheck> supplyChecks = new HashSet<SupplyCheck>(0);
     private Set<SupplyPic> supplyPics = new HashSet<SupplyPic>(0);
     private Set<PlotSituation> plotSituations = new HashSet<PlotSituation>(0);
     private Set<TradeIntention> tradeIntentions = new HashSet<TradeIntention>(0);


    // Constructors

    /** default constructor */
    public LandMortgageSupply() {
    }

	/** minimal constructor */
    public LandMortgageSupply(User user, Date formDate, String preparer, String phone, Integer status) {
        this.user = user;
        this.formDate = formDate;
        this.preparer = preparer;
        this.phone = phone;
        this.status = status;
    }
    
    /** full constructor */
    public LandMortgageSupply(User user, Date formDate, String preparer, String phone, Integer status, Set<SupplyCheck> supplyChecks, Set<SupplyPic> supplyPics, Set<PlotSituation> plotSituations, Set<TradeIntention> tradeIntentions) {
        this.user = user;
        this.formDate = formDate;
        this.preparer = preparer;
        this.phone = phone;
        this.status = status;
        this.supplyChecks = supplyChecks;
        this.supplyPics = supplyPics;
        this.plotSituations = plotSituations;
        this.tradeIntentions = tradeIntentions;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="formId", unique=true, nullable=false, length=20)

    public String getFormId() {
        return this.formId;
    }
    
    public void setFormId(String formId) {
        this.formId = formId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="supplierId", nullable=false)

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="formDate", nullable=false, length=10)

    public Date getFormDate() {
        return this.formDate;
    }
    
    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }
    
    @Column(name="preparer", nullable=false, length=12)

    public String getPreparer() {
        return this.preparer;
    }
    
    public void setPreparer(String preparer) {
        this.preparer = preparer;
    }
    
    @Column(name="phone", nullable=false, length=11)

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landMortgageSupply")

    public Set<SupplyCheck> getSupplyChecks() {
        return this.supplyChecks;
    }
    
    public void setSupplyChecks(Set<SupplyCheck> supplyChecks) {
        this.supplyChecks = supplyChecks;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landMortgageSupply")

    public Set<SupplyPic> getSupplyPics() {
        return this.supplyPics;
    }
    
    public void setSupplyPics(Set<SupplyPic> supplyPics) {
        this.supplyPics = supplyPics;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landMortgageSupply")

    public Set<PlotSituation> getPlotSituations() {
        return this.plotSituations;
    }
    
    public void setPlotSituations(Set<PlotSituation> plotSituations) {
        this.plotSituations = plotSituations;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landMortgageSupply")

    public Set<TradeIntention> getTradeIntentions() {
        return this.tradeIntentions;
    }
    
    public void setTradeIntentions(Set<TradeIntention> tradeIntentions) {
        this.tradeIntentions = tradeIntentions;
    }
   








}