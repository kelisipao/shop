package tianjin.wuqing.po;
// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * LandRentDemand entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_landrentdemand"
    ,catalog="db_wuqing"
)

public class LandRentDemand  implements java.io.Serializable {


    // Fields    

     private String formId;
     private User user;
     private Date formDate;
     private String province;
     private String city;
     private String county;
     private String landType;
     private Integer area;
     private Float period;


    // Constructors

    /** default constructor */
    public LandRentDemand() {
    }

	/** minimal constructor */
    public LandRentDemand(Date formDate, String province, String city, String county, String landType, Integer area, Float period) {
        this.formDate = formDate;
        this.province = province;
        this.city = city;
        this.county = county;
        this.landType = landType;
        this.area = area;
        this.period = period;
    }
    
    /** full constructor */
    public LandRentDemand(User user, Date formDate, String province, String city, String county, String landType, Integer area, Float period) {
        this.user = user;
        this.formDate = formDate;
        this.province = province;
        this.city = city;
        this.county = county;
        this.landType = landType;
        this.area = area;
        this.period = period;
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
        @JoinColumn(name="userid")

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="formDate", nullable=false, length=10)

    public Date getFormDate() {
        return this.formDate;
    }
    
    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }
    
    @Column(name="province", nullable=false, length=20)

    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    
    @Column(name="city", nullable=false, length=20)

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    @Column(name="county", nullable=false, length=20)

    public String getCounty() {
        return this.county;
    }
    
    public void setCounty(String county) {
        this.county = county;
    }
    
    @Column(name="landType", nullable=false, length=30)

    public String getLandType() {
        return this.landType;
    }
    
    public void setLandType(String landType) {
        this.landType = landType;
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
   








}