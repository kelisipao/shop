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
 * HouseOwnershipCard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_houseownershipcard"
    ,catalog="db_wuqing"
)

public class HouseOwnershipCard  implements java.io.Serializable {


    // Fields    

     private String license;
     private String holder;
     private String common;
     private String location;
     private Date registerTime;
     private String purpose;
     private Double buildingArea;
     private String pic;
     private Set<PlotSituation> plotSituations = new HashSet<PlotSituation>(0);


    // Constructors

    /** default constructor */
    public HouseOwnershipCard() {
    }

	/** minimal constructor */
    public HouseOwnershipCard(String holder, String common, String location, Date registerTime, String purpose, Double buildingArea) {
        this.holder = holder;
        this.common = common;
        this.location = location;
        this.registerTime = registerTime;
        this.purpose = purpose;
        this.buildingArea = buildingArea;
    }
    
    /** full constructor */
    public HouseOwnershipCard(String holder, String common, String location, Date registerTime, String purpose, Double buildingArea, String pic, Set<PlotSituation> plotSituations) {
        this.holder = holder;
        this.common = common;
        this.location = location;
        this.registerTime = registerTime;
        this.purpose = purpose;
        this.buildingArea = buildingArea;
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
    
    @Column(name="holder", nullable=false, length=8)

    public String getHolder() {
        return this.holder;
    }
    
    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    @Column(name="common", nullable=false, length=8)

    public String getCommon() {
        return this.common;
    }
    
    public void setCommon(String common) {
        this.common = common;
    }
    
    @Column(name="location", nullable=false, length=20)

    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="registerTime", nullable=false, length=10)

    public Date getRegisterTime() {
        return this.registerTime;
    }
    
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
    
    @Column(name="purpose", nullable=false, length=8)

    public String getPurpose() {
        return this.purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    @Column(name="buildingArea", nullable=false, precision=22, scale=0)

    public Double getBuildingArea() {
        return this.buildingArea;
    }
    
    public void setBuildingArea(Double buildingArea) {
        this.buildingArea = buildingArea;
    }
    
    @Column(name="pic", length=50)

    public String getPic() {
        return this.pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="houseOwnershipCard")

    public Set<PlotSituation> getPlotSituations() {
        return this.plotSituations;
    }
    
    public void setPlotSituations(Set<PlotSituation> plotSituations) {
        this.plotSituations = plotSituations;
    }
   








}