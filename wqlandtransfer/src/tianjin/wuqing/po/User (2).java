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
import javax.persistence.Table;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_user"
    ,catalog="db_wuqing"
)

public class User  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private String userName;
     private String password;
     private String phone;
     private String email;
     private Integer userType;
     private Boolean registered;
     private Set<LandTransferSupply> landTransferSupplies = new HashSet<LandTransferSupply>(0);
     private Set<TradeIntention> tradeIntentions = new HashSet<TradeIntention>(0);
     private Agency agency;
     private Set<LandRentDemand> landRentDemands = new HashSet<LandRentDemand>(0);
     private Set<LandRentSupply> landRentSupplies = new HashSet<LandRentSupply>(0);
     private Set<LandMortgageApply> landMortgageAppliesForLmpledger = new HashSet<LandMortgageApply>(0);
     private Set<LandTransferDemand> landTransferDemands = new HashSet<LandTransferDemand>(0);
     private Person person;
     private Finance finance;
     private Set<LandTransferApply> landTransferAppliesForTransferor = new HashSet<LandTransferApply>(0);
     private Set<LandActualityReplaceApply> landActualityReplaceApplies = new HashSet<LandActualityReplaceApply>(0);
     private Set<LandMortgageSupply> landMortgageSupplies = new HashSet<LandMortgageSupply>(0);
     private Unit unit;
     private Set<LandRentApply> landRentAppliesForLrlessor = new HashSet<LandRentApply>(0);
     private Set<LandRentApply> landRentAppliesForLrleasee = new HashSet<LandRentApply>(0);
     private Set<LandTransferApply> landTransferAppliesForTransferee = new HashSet<LandTransferApply>(0);
     private Set<LandMortgageApply> landMortgageAppliesForLmpledgee = new HashSet<LandMortgageApply>(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String userName, String password, String phone, String email, Integer userType, Boolean registered) {
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.userType = userType;
        this.registered = registered;
    }
    
    /** full constructor */
    public User(String userName, String password, String phone, String email, Integer userType, Boolean registered, Set<LandTransferSupply> landTransferSupplies, Set<TradeIntention> tradeIntentions, Agency agency, Set<LandRentDemand> landRentDemands, Set<LandRentSupply> landRentSupplies, Set<LandMortgageApply> landMortgageAppliesForLmpledger, Set<LandTransferDemand> landTransferDemands, Person person, Finance finance, Set<LandTransferApply> landTransferAppliesForTransferor, Set<LandActualityReplaceApply> landActualityReplaceApplies, Set<LandMortgageSupply> landMortgageSupplies, Unit unit, Set<LandRentApply> landRentAppliesForLrlessor, Set<LandRentApply> landRentAppliesForLrleasee, Set<LandTransferApply> landTransferAppliesForTransferee, Set<LandMortgageApply> landMortgageAppliesForLmpledgee) {
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.userType = userType;
        this.registered = registered;
        this.landTransferSupplies = landTransferSupplies;
        this.tradeIntentions = tradeIntentions;
        this.agency = agency;
        this.landRentDemands = landRentDemands;
        this.landRentSupplies = landRentSupplies;
        this.landMortgageAppliesForLmpledger = landMortgageAppliesForLmpledger;
        this.landTransferDemands = landTransferDemands;
        this.person = person;
        this.finance = finance;
        this.landTransferAppliesForTransferor = landTransferAppliesForTransferor;
        this.landActualityReplaceApplies = landActualityReplaceApplies;
        this.landMortgageSupplies = landMortgageSupplies;
        this.unit = unit;
        this.landRentAppliesForLrlessor = landRentAppliesForLrlessor;
        this.landRentAppliesForLrleasee = landRentAppliesForLrleasee;
        this.landTransferAppliesForTransferee = landTransferAppliesForTransferee;
        this.landMortgageAppliesForLmpledgee = landMortgageAppliesForLmpledgee;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="userId", unique=true, nullable=false)

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    @Column(name="userName", nullable=false, length=20)

    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="password", nullable=false, length=20)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="phone", nullable=false, length=11)

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Column(name="email", nullable=false, length=30)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="userType", nullable=false)

    public Integer getUserType() {
        return this.userType;
    }
    
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    
    @Column(name="registered", nullable=false)

    public Boolean getRegistered() {
        return this.registered;
    }
    
    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<LandTransferSupply> getLandTransferSupplies() {
        return this.landTransferSupplies;
    }
    
    public void setLandTransferSupplies(Set<LandTransferSupply> landTransferSupplies) {
        this.landTransferSupplies = landTransferSupplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<TradeIntention> getTradeIntentions() {
        return this.tradeIntentions;
    }
    
    public void setTradeIntentions(Set<TradeIntention> tradeIntentions) {
        this.tradeIntentions = tradeIntentions;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="user")

    public Agency getAgency() {
        return this.agency;
    }
    
    public void setAgency(Agency agency) {
        this.agency = agency;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<LandRentDemand> getLandRentDemands() {
        return this.landRentDemands;
    }
    
    public void setLandRentDemands(Set<LandRentDemand> landRentDemands) {
        this.landRentDemands = landRentDemands;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<LandRentSupply> getLandRentSupplies() {
        return this.landRentSupplies;
    }
    
    public void setLandRentSupplies(Set<LandRentSupply> landRentSupplies) {
        this.landRentSupplies = landRentSupplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userByLmpledger")

    public Set<LandMortgageApply> getLandMortgageAppliesForLmpledger() {
        return this.landMortgageAppliesForLmpledger;
    }
    
    public void setLandMortgageAppliesForLmpledger(Set<LandMortgageApply> landMortgageAppliesForLmpledger) {
        this.landMortgageAppliesForLmpledger = landMortgageAppliesForLmpledger;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<LandTransferDemand> getLandTransferDemands() {
        return this.landTransferDemands;
    }
    
    public void setLandTransferDemands(Set<LandTransferDemand> landTransferDemands) {
        this.landTransferDemands = landTransferDemands;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="user")

    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="user")

    public Finance getFinance() {
        return this.finance;
    }
    
    public void setFinance(Finance finance) {
        this.finance = finance;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userByTransferor")

    public Set<LandTransferApply> getLandTransferAppliesForTransferor() {
        return this.landTransferAppliesForTransferor;
    }
    
    public void setLandTransferAppliesForTransferor(Set<LandTransferApply> landTransferAppliesForTransferor) {
        this.landTransferAppliesForTransferor = landTransferAppliesForTransferor;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<LandActualityReplaceApply> getLandActualityReplaceApplies() {
        return this.landActualityReplaceApplies;
    }
    
    public void setLandActualityReplaceApplies(Set<LandActualityReplaceApply> landActualityReplaceApplies) {
        this.landActualityReplaceApplies = landActualityReplaceApplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="user")

    public Set<LandMortgageSupply> getLandMortgageSupplies() {
        return this.landMortgageSupplies;
    }
    
    public void setLandMortgageSupplies(Set<LandMortgageSupply> landMortgageSupplies) {
        this.landMortgageSupplies = landMortgageSupplies;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="user")

    public Unit getUnit() {
        return this.unit;
    }
    
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userByLrlessor")

    public Set<LandRentApply> getLandRentAppliesForLrlessor() {
        return this.landRentAppliesForLrlessor;
    }
    
    public void setLandRentAppliesForLrlessor(Set<LandRentApply> landRentAppliesForLrlessor) {
        this.landRentAppliesForLrlessor = landRentAppliesForLrlessor;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userByLrleasee")

    public Set<LandRentApply> getLandRentAppliesForLrleasee() {
        return this.landRentAppliesForLrleasee;
    }
    
    public void setLandRentAppliesForLrleasee(Set<LandRentApply> landRentAppliesForLrleasee) {
        this.landRentAppliesForLrleasee = landRentAppliesForLrleasee;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userByTransferee")

    public Set<LandTransferApply> getLandTransferAppliesForTransferee() {
        return this.landTransferAppliesForTransferee;
    }
    
    public void setLandTransferAppliesForTransferee(Set<LandTransferApply> landTransferAppliesForTransferee) {
        this.landTransferAppliesForTransferee = landTransferAppliesForTransferee;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="userByLmpledgee")

    public Set<LandMortgageApply> getLandMortgageAppliesForLmpledgee() {
        return this.landMortgageAppliesForLmpledgee;
    }
    
    public void setLandMortgageAppliesForLmpledgee(Set<LandMortgageApply> landMortgageAppliesForLmpledgee) {
        this.landMortgageAppliesForLmpledgee = landMortgageAppliesForLmpledgee;
    }
   








}