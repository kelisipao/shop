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
 * LandRentApply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_landrentapply"
    ,catalog="db_wuqing"
)

public class LandRentApply  implements java.io.Serializable {


    // Fields    

     private String lrformId;
     private PlotSituation plotSituation;
     private Person personByLrleaseeAgent;
     private Person personByLrlessorAgent;
     private User userByLrleasee;
     private User userByLrlessor;
     private Agency agency;
     private Date lrformDate;
     private String lrrentContract;
     private Integer lrstatus;
     private RentContract rentContract;
     private Set<RentBackups> rentBackupses = new HashSet<RentBackups>(0);
     private Set<ApplyCheck> applyChecks = new HashSet<ApplyCheck>(0);


    // Constructors

    /** default constructor */
    public LandRentApply() {
    }

	/** minimal constructor */
    public LandRentApply(PlotSituation plotSituation, User userByLrleasee, User userByLrlessor, Date lrformDate, String lrrentContract, Integer lrstatus) {
        this.plotSituation = plotSituation;
        this.userByLrleasee = userByLrleasee;
        this.userByLrlessor = userByLrlessor;
        this.lrformDate = lrformDate;
        this.lrrentContract = lrrentContract;
        this.lrstatus = lrstatus;
    }
    
    /** full constructor */
    public LandRentApply(PlotSituation plotSituation, Person personByLrleaseeAgent, Person personByLrlessorAgent, User userByLrleasee, User userByLrlessor, Agency agency, Date lrformDate, String lrrentContract, Integer lrstatus, RentContract rentContract, Set<RentBackups> rentBackupses, Set<ApplyCheck> applyChecks) {
        this.plotSituation = plotSituation;
        this.personByLrleaseeAgent = personByLrleaseeAgent;
        this.personByLrlessorAgent = personByLrlessorAgent;
        this.userByLrleasee = userByLrleasee;
        this.userByLrlessor = userByLrlessor;
        this.agency = agency;
        this.lrformDate = lrformDate;
        this.lrrentContract = lrrentContract;
        this.lrstatus = lrstatus;
        this.rentContract = rentContract;
        this.rentBackupses = rentBackupses;
        this.applyChecks = applyChecks;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="lrformId", unique=true, nullable=false, length=20)

    public String getLrformId() {
        return this.lrformId;
    }
    
    public void setLrformId(String lrformId) {
        this.lrformId = lrformId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lrplotId", nullable=false)

    public PlotSituation getPlotSituation() {
        return this.plotSituation;
    }
    
    public void setPlotSituation(PlotSituation plotSituation) {
        this.plotSituation = plotSituation;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lrleasee_Agent")

    public Person getPersonByLrleaseeAgent() {
        return this.personByLrleaseeAgent;
    }
    
    public void setPersonByLrleaseeAgent(Person personByLrleaseeAgent) {
        this.personByLrleaseeAgent = personByLrleaseeAgent;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lrlessorAgent")

    public Person getPersonByLrlessorAgent() {
        return this.personByLrlessorAgent;
    }
    
    public void setPersonByLrlessorAgent(Person personByLrlessorAgent) {
        this.personByLrlessorAgent = personByLrlessorAgent;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lrleasee", nullable=false)

    public User getUserByLrleasee() {
        return this.userByLrleasee;
    }
    
    public void setUserByLrleasee(User userByLrleasee) {
        this.userByLrleasee = userByLrleasee;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lrlessor", nullable=false)

    public User getUserByLrlessor() {
        return this.userByLrlessor;
    }
    
    public void setUserByLrlessor(User userByLrlessor) {
        this.userByLrlessor = userByLrlessor;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lragency")

    public Agency getAgency() {
        return this.agency;
    }
    
    public void setAgency(Agency agency) {
        this.agency = agency;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="lrformDate", nullable=false, length=10)

    public Date getLrformDate() {
        return this.lrformDate;
    }
    
    public void setLrformDate(Date lrformDate) {
        this.lrformDate = lrformDate;
    }
    
    @Column(name="lrrentContract", nullable=false, length=50)

    public String getLrrentContract() {
        return this.lrrentContract;
    }
    
    public void setLrrentContract(String lrrentContract) {
        this.lrrentContract = lrrentContract;
    }
    
    @Column(name="lrstatus", nullable=false)

    public Integer getLrstatus() {
        return this.lrstatus;
    }
    
    public void setLrstatus(Integer lrstatus) {
        this.lrstatus = lrstatus;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="landRentApply")

    public RentContract getRentContract() {
        return this.rentContract;
    }
    
    public void setRentContract(RentContract rentContract) {
        this.rentContract = rentContract;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landRentApply")

    public Set<RentBackups> getRentBackupses() {
        return this.rentBackupses;
    }
    
    public void setRentBackupses(Set<RentBackups> rentBackupses) {
        this.rentBackupses = rentBackupses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landRentApply")

    public Set<ApplyCheck> getApplyChecks() {
        return this.applyChecks;
    }
    
    public void setApplyChecks(Set<ApplyCheck> applyChecks) {
        this.applyChecks = applyChecks;
    }
   








}