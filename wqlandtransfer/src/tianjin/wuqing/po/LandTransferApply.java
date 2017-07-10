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
 * LandTransferApply entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_landtransferapply"
    ,catalog="db_wuqing"
)

public class LandTransferApply  implements java.io.Serializable {


    // Fields    

     private String formId;
     private Agency agency;
     private User userByTransferor;
     private Person personByTransferorAgent;
     private User userByTransferee;
     private Person personByTransfereeAgent;
     private PlotSituation plotSituation;
     private Date formDate;
     private Integer landId;
     private String transferContract;
     private String transfereeQualifaction;
     private String authorization;
     private String agentIdentity;
     private Integer status;
     private Set<TransferBackups> transferBackupses = new HashSet<TransferBackups>(0);
     private Set<TransferContract> transferContracts = new HashSet<TransferContract>(0);
     private Set<ApplyCheck> applyChecks = new HashSet<ApplyCheck>(0);


    // Constructors

    /** default constructor */
    public LandTransferApply() {
    }

	/** minimal constructor */
    public LandTransferApply(User userByTransferor, User userByTransferee, Date formDate, Integer landId, String transferContract, String transfereeQualifaction, String authorization, String agentIdentity, Integer status) {
        this.userByTransferor = userByTransferor;
        this.userByTransferee = userByTransferee;
        this.formDate = formDate;
        this.landId = landId;
        this.transferContract = transferContract;
        this.transfereeQualifaction = transfereeQualifaction;
        this.authorization = authorization;
        this.agentIdentity = agentIdentity;
        this.status = status;
    }
    
    /** full constructor */
    public LandTransferApply(Agency agency, User userByTransferor, Person personByTransferorAgent, User userByTransferee, Person personByTransfereeAgent, PlotSituation plotSituation, Date formDate, Integer landId, String transferContract, String transfereeQualifaction, String authorization, String agentIdentity, Integer status, Set<TransferBackups> transferBackupses, Set<TransferContract> transferContracts, Set<ApplyCheck> applyChecks) {
        this.agency = agency;
        this.userByTransferor = userByTransferor;
        this.personByTransferorAgent = personByTransferorAgent;
        this.userByTransferee = userByTransferee;
        this.personByTransfereeAgent = personByTransfereeAgent;
        this.plotSituation = plotSituation;
        this.formDate = formDate;
        this.landId = landId;
        this.transferContract = transferContract;
        this.transfereeQualifaction = transfereeQualifaction;
        this.authorization = authorization;
        this.agentIdentity = agentIdentity;
        this.status = status;
        this.transferBackupses = transferBackupses;
        this.transferContracts = transferContracts;
        this.applyChecks = applyChecks;
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
        @JoinColumn(name="agency")

    public Agency getAgency() {
        return this.agency;
    }
    
    public void setAgency(Agency agency) {
        this.agency = agency;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="transferor", nullable=false)

    public User getUserByTransferor() {
        return this.userByTransferor;
    }
    
    public void setUserByTransferor(User userByTransferor) {
        this.userByTransferor = userByTransferor;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="transferorAgent")

    public Person getPersonByTransferorAgent() {
        return this.personByTransferorAgent;
    }
    
    public void setPersonByTransferorAgent(Person personByTransferorAgent) {
        this.personByTransferorAgent = personByTransferorAgent;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="transferee", nullable=false)

    public User getUserByTransferee() {
        return this.userByTransferee;
    }
    
    public void setUserByTransferee(User userByTransferee) {
        this.userByTransferee = userByTransferee;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="transfereeAgent")

    public Person getPersonByTransfereeAgent() {
        return this.personByTransfereeAgent;
    }
    
    public void setPersonByTransfereeAgent(Person personByTransfereeAgent) {
        this.personByTransfereeAgent = personByTransfereeAgent;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="plotId")

    public PlotSituation getPlotSituation() {
        return this.plotSituation;
    }
    
    public void setPlotSituation(PlotSituation plotSituation) {
        this.plotSituation = plotSituation;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="formDate", nullable=false, length=10)

    public Date getFormDate() {
        return this.formDate;
    }
    
    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }
    
    @Column(name="landId", nullable=false)

    public Integer getLandId() {
        return this.landId;
    }
    
    public void setLandId(Integer landId) {
        this.landId = landId;
    }
    
    @Column(name="transferContract", nullable=false, length=50)

    public String getTransferContract() {
        return this.transferContract;
    }
    
    public void setTransferContract(String transferContract) {
        this.transferContract = transferContract;
    }
    
    @Column(name="transfereeQualifaction", nullable=false, length=50)

    public String getTransfereeQualifaction() {
        return this.transfereeQualifaction;
    }
    
    public void setTransfereeQualifaction(String transfereeQualifaction) {
        this.transfereeQualifaction = transfereeQualifaction;
    }
    
    @Column(name="authorization", nullable=false, length=50)

    public String getAuthorization() {
        return this.authorization;
    }
    
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
    
    @Column(name="agentIdentity", nullable=false, length=50)

    public String getAgentIdentity() {
        return this.agentIdentity;
    }
    
    public void setAgentIdentity(String agentIdentity) {
        this.agentIdentity = agentIdentity;
    }
    
    @Column(name="status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landTransferApply")

    public Set<TransferBackups> getTransferBackupses() {
        return this.transferBackupses;
    }
    
    public void setTransferBackupses(Set<TransferBackups> transferBackupses) {
        this.transferBackupses = transferBackupses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landTransferApply")

    public Set<TransferContract> getTransferContracts() {
        return this.transferContracts;
    }
    
    public void setTransferContracts(Set<TransferContract> transferContracts) {
        this.transferContracts = transferContracts;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landTransferApply")

    public Set<ApplyCheck> getApplyChecks() {
        return this.applyChecks;
    }
    
    public void setApplyChecks(Set<ApplyCheck> applyChecks) {
        this.applyChecks = applyChecks;
    }
   








}