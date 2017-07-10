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
 * LandActualityReplaceApply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_landactualityreplaceapply"
    ,catalog="db_wuqing"
)

public class LandActualityReplaceApply  implements java.io.Serializable {


    // Fields    

     private String lapformId;
     private PlotSituation plotSituation;
     private Person person;
     private User user;
     private Date lapformDate;
     private Integer lapdeclarant;
     private Integer lapstatus;
     private Set<ApplyCheck> applyChecks = new HashSet<ApplyCheck>(0);


    // Constructors

    /** default constructor */
    public LandActualityReplaceApply() {
    }

	/** minimal constructor */
    public LandActualityReplaceApply(User user, Date lapformDate, Integer lapdeclarant, Integer lapstatus) {
        this.user = user;
        this.lapformDate = lapformDate;
        this.lapdeclarant = lapdeclarant;
        this.lapstatus = lapstatus;
    }
    
    /** full constructor */
    public LandActualityReplaceApply(PlotSituation plotSituation, Person person, User user, Date lapformDate, Integer lapdeclarant, Integer lapstatus, Set<ApplyCheck> applyChecks) {
        this.plotSituation = plotSituation;
        this.person = person;
        this.user = user;
        this.lapformDate = lapformDate;
        this.lapdeclarant = lapdeclarant;
        this.lapstatus = lapstatus;
        this.applyChecks = applyChecks;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="lapformID", unique=true, nullable=false, length=20)

    public String getLapformId() {
        return this.lapformId;
    }
    
    public void setLapformId(String lapformId) {
        this.lapformId = lapformId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="laplotId")

    public PlotSituation getPlotSituation() {
        return this.plotSituation;
    }
    
    public void setPlotSituation(PlotSituation plotSituation) {
        this.plotSituation = plotSituation;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lapagent")

    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="laporganization", nullable=false)

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="lapformDate", nullable=false, length=10)

    public Date getLapformDate() {
        return this.lapformDate;
    }
    
    public void setLapformDate(Date lapformDate) {
        this.lapformDate = lapformDate;
    }
    
    @Column(name="lapdeclarant", nullable=false)

    public Integer getLapdeclarant() {
        return this.lapdeclarant;
    }
    
    public void setLapdeclarant(Integer lapdeclarant) {
        this.lapdeclarant = lapdeclarant;
    }
    
    @Column(name="lapstatus", nullable=false)

    public Integer getLapstatus() {
        return this.lapstatus;
    }
    
    public void setLapstatus(Integer lapstatus) {
        this.lapstatus = lapstatus;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landActualityReplaceApply")

    public Set<ApplyCheck> getApplyChecks() {
        return this.applyChecks;
    }
    
    public void setApplyChecks(Set<ApplyCheck> applyChecks) {
        this.applyChecks = applyChecks;
    }
   








}