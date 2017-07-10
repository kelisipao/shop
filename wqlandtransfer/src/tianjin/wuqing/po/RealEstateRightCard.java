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
 * RealEstateRightCard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_realestaterightcard"
    ,catalog="db_wuqing"
)

public class RealEstateRightCard  implements java.io.Serializable {


    // Fields    

     private String license;
     private String holder;
     private String location;
     private String landId;
     private String purpose;
     private String mapId;
     private String rightType;
     private String ownershipNature;
     private Double useArea;
     private Date endTime;
     private String pic;
     private Set<PlotSituation> plotSituations = new HashSet<PlotSituation>(0);


    // Constructors

    /** default constructor */
    public RealEstateRightCard() {
    }

	/** minimal constructor */
    public RealEstateRightCard(String holder, String location, String landId, String purpose, String mapId, String rightType, String ownershipNature, Double useArea, Date endTime) {
        this.holder = holder;
        this.location = location;
        this.landId = landId;
        this.purpose = purpose;
        this.mapId = mapId;
        this.rightType = rightType;
        this.ownershipNature = ownershipNature;
        this.useArea = useArea;
        this.endTime = endTime;
    }
    
    /** full constructor */
    public RealEstateRightCard(String holder, String location, String landId, String purpose, String mapId, String rightType, String ownershipNature, Double useArea, Date endTime, String pic, Set<PlotSituation> plotSituations) {
        this.holder = holder;
        this.location = location;
        this.landId = landId;
        this.purpose = purpose;
        this.mapId = mapId;
        this.rightType = rightType;
        this.ownershipNature = ownershipNature;
        this.useArea = useArea;
        this.endTime = endTime;
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
    
    @Column(name="location", nullable=false, length=20)

    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    @Column(name="landId", nullable=false, length=20)

    public String getLandId() {
        return this.landId;
    }
    
    public void setLandId(String landId) {
        this.landId = landId;
    }
    
    @Column(name="purpose", nullable=false, length=8)

    public String getPurpose() {
        return this.purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    @Column(name="mapId", nullable=false, length=20)

    public String getMapId() {
        return this.mapId;
    }
    
    public void setMapId(String mapId) {
        this.mapId = mapId;
    }
    
    @Column(name="rightType", nullable=false, length=10)

    public String getRightType() {
        return this.rightType;
    }
    
    public void setRightType(String rightType) {
        this.rightType = rightType;
    }
    
    @Column(name="ownershipNature", nullable=false, length=10)

    public String getOwnershipNature() {
        return this.ownershipNature;
    }
    
    public void setOwnershipNature(String ownershipNature) {
        this.ownershipNature = ownershipNature;
    }
    
    @Column(name="useArea", nullable=false, precision=22, scale=0)

    public Double getUseArea() {
        return this.useArea;
    }
    
    public void setUseArea(Double useArea) {
        this.useArea = useArea;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="endTime", nullable=false, length=10)

    public Date getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    @Column(name="pic", length=50)

    public String getPic() {
        return this.pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="realEstateRightCard")

    public Set<PlotSituation> getPlotSituations() {
        return this.plotSituations;
    }
    
    public void setPlotSituations(Set<PlotSituation> plotSituations) {
        this.plotSituations = plotSituations;
    }
   








}