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
 * LandTransferDemand entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_landtransferdemand"
    ,catalog="db_wuqing"
)

public class LandTransferDemand  implements java.io.Serializable {


    // Fields    

     private String formId;
     private User user;
     private Date formDate;
     private String province;
     private String city;
     private String county;
     private Integer landType;
     private String purpose;
     private String deliveryWay;
     private String area;
     private Float period;


    // Constructors

    /** default constructor */
    public LandTransferDemand() {
    }

	/** minimal constructor */
    public LandTransferDemand(Date formDate, String province, Integer landType, String deliveryWay, String area) {
        this.formDate = formDate;
        this.province = province;
        this.landType = landType;
        this.deliveryWay = deliveryWay;
        this.area = area;
    }
    
    /** full constructor */
    public LandTransferDemand(User user, Date formDate, String province, String city, String county, Integer landType, String purpose, String deliveryWay, String area, Float period) {
        this.user = user;
        this.formDate = formDate;
        this.province = province;
        this.city = city;
        this.county = county;
        this.landType = landType;
        this.purpose = purpose;
        this.deliveryWay = deliveryWay;
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
    
    @Column(name="city", length=20)

    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    @Column(name="county", length=20)

    public String getCounty() {
        return this.county;
    }
    
    public void setCounty(String county) {
        this.county = county;
    }
    
    @Column(name="landType", nullable=false)

    public Integer getLandType() {
        return this.landType;
    }
    
    public void setLandType(Integer landType) {
        this.landType = landType;
    }
    
    @Column(name="purpose", length=10)

    public String getPurpose() {
        return this.purpose;
    }
    
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    
    @Column(name="deliveryWay", nullable=false, length=30)

    public String getDeliveryWay() {
        return this.deliveryWay;
    }
    
    public void setDeliveryWay(String deliveryWay) {
        this.deliveryWay = deliveryWay;
    }
    
    @Column(name="area", nullable=false, length=30)

    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    
    @Column(name="period", precision=12, scale=0)

    public Float getPeriod() {
        return this.period;
    }
    
    public void setPeriod(Float period) {
        this.period = period;
    }
   








}