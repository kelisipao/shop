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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * LandMortgageApply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_landmortgageapply"
    ,catalog="db_wuqing"
)

public class LandMortgageApply  implements java.io.Serializable {


    // Fields    

     private String lmformId;
     private Person personByLmpledgeeAgent;
     private User userByLmpledger;
     private Agency agencyByLmpledgerAgency;
     private User userByLmpledgee;
     private PlotSituation plotSituation;
     private Person personByLmpledgerAgent;
     private Agency agencyByLmpledgeeAgency;
     private Date lmformDate;
     private String lmmortgageContract;
     private Integer lmstatus;
     private Set<ApplyCheck> applyChecks = new HashSet<ApplyCheck>(0);
     private MortgageContract mortgageContract;
     private Set<MortgageBackups> mortgageBackupses = new HashSet<MortgageBackups>(0);


    // Constructors

    /** default constructor */
    public LandMortgageApply() {
    }

	/** minimal constructor */
    public LandMortgageApply(User userByLmpledgee, Date lmformDate, String lmmortgageContract, Integer lmstatus) {
        this.userByLmpledgee = userByLmpledgee;
        this.lmformDate = lmformDate;
        this.lmmortgageContract = lmmortgageContract;
        this.lmstatus = lmstatus;
    }
    
    /** full constructor */
    public LandMortgageApply(Person personByLmpledgeeAgent, User userByLmpledger, Agency agencyByLmpledgerAgency, User userByLmpledgee, PlotSituation plotSituation, Person personByLmpledgerAgent, Agency agencyByLmpledgeeAgency, Date lmformDate, String lmmortgageContract, Integer lmstatus, Set<ApplyCheck> applyChecks, MortgageContract mortgageContract, Set<MortgageBackups> mortgageBackupses) {
        this.personByLmpledgeeAgent = personByLmpledgeeAgent;
        this.userByLmpledger = userByLmpledger;
        this.agencyByLmpledgerAgency = agencyByLmpledgerAgency;
        this.userByLmpledgee = userByLmpledgee;
        this.plotSituation = plotSituation;
        this.personByLmpledgerAgent = personByLmpledgerAgent;
        this.agencyByLmpledgeeAgency = agencyByLmpledgeeAgency;
        this.lmformDate = lmformDate;
        this.lmmortgageContract = lmmortgageContract;
        this.lmstatus = lmstatus;
        this.applyChecks = applyChecks;
        this.mortgageContract = mortgageContract;
        this.mortgageBackupses = mortgageBackupses;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="lmformId", unique=true, nullable=false, length=20)

    public String getLmformId() {
        return this.lmformId;
    }
    
    public void setLmformId(String lmformId) {
        this.lmformId = lmformId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lmpledgeeAgent")

    public Person getPersonByLmpledgeeAgent() {
        return this.personByLmpledgeeAgent;
    }
    
    public void setPersonByLmpledgeeAgent(Person personByLmpledgeeAgent) {
        this.personByLmpledgeeAgent = personByLmpledgeeAgent;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lmpledger")

    public User getUserByLmpledger() {
        return this.userByLmpledger;
    }
    
    public void setUserByLmpledger(User userByLmpledger) {
        this.userByLmpledger = userByLmpledger;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lmpledgerAgency")

    public Agency getAgencyByLmpledgerAgency() {
        return this.agencyByLmpledgerAgency;
    }
    
    public void setAgencyByLmpledgerAgency(Agency agencyByLmpledgerAgency) {
        this.agencyByLmpledgerAgency = agencyByLmpledgerAgency;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lmpledgee", nullable=false)

    public User getUserByLmpledgee() {
        return this.userByLmpledgee;
    }
    
    public void setUserByLmpledgee(User userByLmpledgee) {
        this.userByLmpledgee = userByLmpledgee;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lmplotId")

    public PlotSituation getPlotSituation() {
        return this.plotSituation;
    }
    
    public void setPlotSituation(PlotSituation plotSituation) {
        this.plotSituation = plotSituation;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lmpledgerAgent")

    public Person getPersonByLmpledgerAgent() {
        return this.personByLmpledgerAgent;
    }
    
    public void setPersonByLmpledgerAgent(Person personByLmpledgerAgent) {
        this.personByLmpledgerAgent = personByLmpledgerAgent;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lmpledgeeAgency")

    public Agency getAgencyByLmpledgeeAgency() {
        return this.agencyByLmpledgeeAgency;
    }
    
    public void setAgencyByLmpledgeeAgency(Agency agencyByLmpledgeeAgency) {
        this.agencyByLmpledgeeAgency = agencyByLmpledgeeAgency;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="lmformDate", nullable=false, length=10)

    public Date getLmformDate() {
        return this.lmformDate;
    }
    
    public void setLmformDate(Date lmformDate) {
        this.lmformDate = lmformDate;
    }
    
    @Column(name="lmmortgageContract", nullable=false, length=50)

    public String getLmmortgageContract() {
        return this.lmmortgageContract;
    }
    
    public void setLmmortgageContract(String lmmortgageContract) {
        this.lmmortgageContract = lmmortgageContract;
    }
    
    @Column(name="lmstatus", nullable=false)

    public Integer getLmstatus() {
        return this.lmstatus;
    }
    
    public void setLmstatus(Integer lmstatus) {
        this.lmstatus = lmstatus;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landMortgageApply")

    public Set<ApplyCheck> getApplyChecks() {
        return this.applyChecks;
    }
    
    public void setApplyChecks(Set<ApplyCheck> applyChecks) {
        this.applyChecks = applyChecks;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="landMortgageApply")

    public MortgageContract getMortgageContract() {
        return this.mortgageContract;
    }
    
    public void setMortgageContract(MortgageContract mortgageContract) {
        this.mortgageContract = mortgageContract;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landMortgageApply")

    public Set<MortgageBackups> getMortgageBackupses() {
        return this.mortgageBackupses;
    }
    
    public void setMortgageBackupses(Set<MortgageBackups> mortgageBackupses) {
        this.mortgageBackupses = mortgageBackupses;
    }
   








}