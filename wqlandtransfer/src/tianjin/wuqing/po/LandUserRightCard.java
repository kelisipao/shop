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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * LandUserRightCard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_landuserightcard"
    ,catalog="db_wuqing"
)

public class LandUserRightCard  implements java.io.Serializable {


    // Fields    

     private String license;
     private String location;
     private String holder;
     private String purpose;
     private String useType;
     private Date endTime;
     private Double useArea;
     private String pic;
     private Set<PlotSituation> plotSituations = new HashSet<PlotSituation>(0);


    // Constructors

    /** default constructor */
    public LandUserRightCard() {
    }

	/** minimal constructor */
    public LandUserRightCard(String location, String holder, String purpose, String useType, Date endTime, Double useArea) {
        this.location = location;
        this.holder = holder;
        this.purpose = purpose;
        this.useType = useType;
        this.endTime = endTime;
        this.useArea = useArea;
    }
    
    /** full constructor */
    public LandUserRightCard(String location, String holder, String purpose, String useType, Date endTime, Double useArea, String pic, Set<PlotSituation> plotSituations) {
        this.location = location;
        this.holder = holder;
        this.purpose = purpose;
        this.useType = useType;
        this.endTime = endTime;
        this.useArea = useArea;
        this.pic = pic;
        this.plotSituations = plotSituations;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="license", unique=true, nullable=false, length=20)

    public String getLicense() {
        return this.license;
    }
    
    public void setLicense(String license) {
        this.license = license;
    }
    
    @Column(name="location", nullable=false, length=20)

    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    @Column(name="holder", nullable=false, length=8)

    public String getHolder() {
        return this.holder;
    }
    
    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    @Column(name="purpose", nullable=false, length=8)

    public String getPurpose() {
        return this.purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    @Column(name="useType", nullable=false, length=8)

    public String getUseType() {
        return this.useType;
    }
    
    public void setUseType(String useType) {
        this.useType = useType;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="endTime", nullable=false, length=10)

    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    @Column(name="useArea", nullable=false, precision=22, scale=0)

    public Double getUseArea() {
        return this.useArea;
    }
    
    public void setUseArea(Double useArea) {
        this.useArea = useArea;
    }
    
    @Column(name="pic", length=50)

    public String getPic() {
        return this.pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="landUserRightCard")

    public Set<PlotSituation> getPlotSituations() {
        return this.plotSituations;
    }
    
    public void setPlotSituations(Set<PlotSituation> plotSituations) {
        this.plotSituations = plotSituations;
    }
   








}