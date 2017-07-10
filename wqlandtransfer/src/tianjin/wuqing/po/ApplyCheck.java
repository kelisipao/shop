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
 * ApplyCheck entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_applycheck"
    ,catalog="db_wuqing"
)

public class ApplyCheck  implements java.io.Serializable {


    // Fields    

     private String formId;
     private Government government;
     private LandTransferApply landTransferApply;
     private LandMortgageApply landMortgageApply;
     private LandActualityReplaceApply landActualityReplaceApply;
     private LandRentApply landRentApply;
     private Integer applyType;
     private Date windowCheckDate;
     private String windowOpinion;
     private Date handleDate;
     private String handleOpinion;
     private Date sectionchiefDate;
     private String sectionchiefOpinion;
     private Date deputydirectorDate;
     private String deputydirectorOpinion;
     private Date directorDate;
     private String directorOpinion;
     private Set<TransferBackups> transferBackupses = new HashSet<TransferBackups>(0);
     private Set<MortgageBackups> mortgageBackupses = new HashSet<MortgageBackups>(0);
     private Set<RentBackups> rentBackupses = new HashSet<RentBackups>(0);


    // Constructors

    /** default constructor */
    public ApplyCheck() {
    }

	/** minimal constructor */
    public ApplyCheck(Integer applyType) {
        this.applyType = applyType;
    }
    
    /** full constructor */
    public ApplyCheck(Government government, LandTransferApply landTransferApply, LandMortgageApply landMortgageApply, LandActualityReplaceApply landActualityReplaceApply, LandRentApply landRentApply, Integer applyType, Date windowCheckDate, String windowOpinion, Date handleDate, String handleOpinion, Date sectionchiefDate, String sectionchiefOpinion, Date deputydirectorDate, String deputydirectorOpinion, Date directorDate, String directorOpinion, Set<TransferBackups> transferBackupses, Set<MortgageBackups> mortgageBackupses, Set<RentBackups> rentBackupses) {
        this.government = government;
        this.landTransferApply = landTransferApply;
        this.landMortgageApply = landMortgageApply;
        this.landActualityReplaceApply = landActualityReplaceApply;
        this.landRentApply = landRentApply;
        this.applyType = applyType;
        this.windowCheckDate = windowCheckDate;
        this.windowOpinion = windowOpinion;
        this.handleDate = handleDate;
        this.handleOpinion = handleOpinion;
        this.sectionchiefDate = sectionchiefDate;
        this.sectionchiefOpinion = sectionchiefOpinion;
        this.deputydirectorDate = deputydirectorDate;
        this.deputydirectorOpinion = deputydirectorOpinion;
        this.directorDate = directorDate;
        this.directorOpinion = directorOpinion;
        this.transferBackupses = transferBackupses;
        this.mortgageBackupses = mortgageBackupses;
        this.rentBackupses = rentBackupses;
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
        @JoinColumn(name="windowCheckPerson")

    public Government getGovernment() {
        return this.government;
    }
    
    public void setGovernment(Government government) {
        this.government = government;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="transferApply")

    public LandTransferApply getLandTransferApply() {
        return this.landTransferApply;
    }
    
    public void setLandTransferApply(LandTransferApply landTransferApply) {
        this.landTransferApply = landTransferApply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="mortgageApplyId")

    public LandMortgageApply getLandMortgageApply() {
        return this.landMortgageApply;
    }
    
    public void setLandMortgageApply(LandMortgageApply landMortgageApply) {
        this.landMortgageApply = landMortgageApply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="ctualityrePlaceApplyId")

    public LandActualityReplaceApply getLandActualityReplaceApply() {
        return this.landActualityReplaceApply;
    }
    
    public void setLandActualityReplaceApply(LandActualityReplaceApply landActualityReplaceApply) {
        this.landActualityReplaceApply = landActualityReplaceApply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="rentApplyId")

    public LandRentApply getLandRentApply() {
        return this.landRentApply;
    }
    
    public void setLandRentApply(LandRentApply landRentApply) {
        this.landRentApply = landRentApply;
    }
    
    @Column(name="applyType", nullable=false)

    public Integer getApplyType() {
        return this.applyType;
    }
    
    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="windowCheckDate", length=10)

    public Date getWindowCheckDate() {
        return this.windowCheckDate;
    }
    
    public void setWindowCheckDate(Date windowCheckDate) {
        this.windowCheckDate = windowCheckDate;
    }
    
    @Column(name="windowOpinion", length=50)

    public String getWindowOpinion() {
        return this.windowOpinion;
    }
    
    public void setWindowOpinion(String windowOpinion) {
        this.windowOpinion = windowOpinion;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="handleDate", length=10)

    public Date getHandleDate() {
        return this.handleDate;
    }
    
    public void setHandleDate(Date handleDate) {
        this.handleDate = handleDate;
    }
    
    @Column(name="handleOpinion", length=50)

    public String getHandleOpinion() {
        return this.handleOpinion;
    }
    
    public void setHandleOpinion(String handleOpinion) {
        this.handleOpinion = handleOpinion;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="sectionchiefDate", length=10)

    public Date getSectionchiefDate() {
        return this.sectionchiefDate;
    }
    
    public void setSectionchiefDate(Date sectionchiefDate) {
        this.sectionchiefDate = sectionchiefDate;
    }
    
    @Column(name="sectionchiefOpinion", length=50)

    public String getSectionchiefOpinion() {
        return this.sectionchiefOpinion;
    }
    
    public void setSectionchiefOpinion(String sectionchiefOpinion) {
        this.sectionchiefOpinion = sectionchiefOpinion;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="deputydirectorDate", length=10)

    public Date getDeputydirectorDate() {
        return this.deputydirectorDate;
    }
    
    public void setDeputydirectorDate(Date deputydirectorDate) {
        this.deputydirectorDate = deputydirectorDate;
    }
    
    @Column(name="deputydirectorOpinion", length=50)

    public String getDeputydirectorOpinion() {
        return this.deputydirectorOpinion;
    }
    
    public void setDeputydirectorOpinion(String deputydirectorOpinion) {
        this.deputydirectorOpinion = deputydirectorOpinion;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="directorDate", length=10)

    public Date getDirectorDate() {
        return this.directorDate;
    }
    
    public void setDirectorDate(Date directorDate) {
        this.directorDate = directorDate;
    }
    
    @Column(name="directorOpinion", length=50)

    public String getDirectorOpinion() {
        return this.directorOpinion;
    }
    
    public void setDirectorOpinion(String directorOpinion) {
        this.directorOpinion = directorOpinion;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="applyCheck")

    public Set<TransferBackups> getTransferBackupses() {
        return this.transferBackupses;
    }
    
    public void setTransferBackupses(Set<TransferBackups> transferBackupses) {
        this.transferBackupses = transferBackupses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="applyCheck")

    public Set<MortgageBackups> getMortgageBackupses() {
        return this.mortgageBackupses;
    }
    
    public void setMortgageBackupses(Set<MortgageBackups> mortgageBackupses) {
        this.mortgageBackupses = mortgageBackupses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="applyCheck")

    public Set<RentBackups> getRentBackupses() {
        return this.rentBackupses;
    }
    
    public void setRentBackupses(Set<RentBackups> rentBackupses) {
        this.rentBackupses = rentBackupses;
    }
   








}