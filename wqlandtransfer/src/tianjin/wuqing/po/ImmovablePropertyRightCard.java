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
import javax.persistence.Table;


/**
 * ImmovablePropertyRightCard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_immovablepropertyrightcard"
    ,catalog="db_wuqing"
)

public class ImmovablePropertyRightCard  implements java.io.Serializable {


    // Fields    

     private String license;
     private String holder;
     private String common;
     private String location;
     private String unitnumber;
     private String rightType;
     private String rightNature;
     private String purpose;
     private Integer area;
     private Float period;
     private String remark;
     private String pic;
     private Set<PlotSituation> plotSituations = new HashSet<PlotSituation>(0);


    // Constructors

    /** default constructor */
    public ImmovablePropertyRightCard() {
    }

	/** minimal constructor */
    public ImmovablePropertyRightCard(String holder, String common, String location, String unitnumber, String rightType, String rightNature, String purpose, Integer area, Float period) {
        this.holder = holder;
        this.common = common;
        this.location = location;
        this.unitnumber = unitnumber;
        this.rightType = rightType;
        this.rightNature = rightNature;
        this.purpose = purpose;
        this.area = area;
        this.period = period;
    }
    
    /** full constructor */
    public ImmovablePropertyRightCard(String holder, String common, String location, String unitnumber, String rightType, String rightNature, String purpose, Integer area, Float period, String remark, String pic, Set<PlotSituation> plotSituations) {
        this.holder = holder;
        this.common = common;
        this.location = location;
        this.unitnumber = unitnumber;
        this.rightType = rightType;
        this.rightNature = rightNature;
        this.purpose = purpose;
        this.area = area;
        this.period = period;
        this.remark = remark;
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
    
    @Column(name="unitnumber", nullable=false, length=20)

    public String getUnitnumber() {
        return this.unitnumber;
    }
    
    public void setUnitnumber(String unitnumber) {
        this.unitnumber = unitnumber;
    }
    
    @Column(name="rightType", nullable=false, length=8)

    public String getRightType() {
        return this.rightType;
    }
    
    public void setRightType(String rightType) {
        this.rightType = rightType;
    }
    
    @Column(name="rightNature", nullable=false, length=8)

    public String getRightNature() {
        return this.rightNature;
    }
    
    public void setRightNature(String rightNature) {
        this.rightNature = rightNature;
    }
    
    @Column(name="purpose", nullable=false, length=8)

    public String getPurpose() {
        return this.purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    @Column(name="area", nullable=false)

    public Integer getArea() {
        return this.area;
    }
    
    public void setArea(Integer area) {
        this.area = area;
    }
    
    @Column(name="period", nullable=false, precision=12, scale=0)

    public Float getPeriod() {
        return this.period;
    }
    
    public void setPeriod(Float period) {
        this.period = period;
    }
    
    @Column(name="remark", length=20)

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="pic", length=50)

    public String getPic() {
        return this.pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="immovablePropertyRightCard")

    public Set<PlotSituation> getPlotSituations() {
        return this.plotSituations;
    }
    
    public void setPlotSituations(Set<PlotSituation> plotSituations) {
        this.plotSituations = plotSituations;
    }
   








}