package tianjin.wuqing.po;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


/**
 * RentPlotSituation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_rentplotsituation"
    ,catalog="db_wuqing"
)

public class RentPlotSituation  implements java.io.Serializable {


    // Fields    

     private Integer rlandId;
     private PlotSituation plotSituation;
     private Double rlandArea;
     private Double rbuildArea;
     private Float rperiod;
     private String reast;
     private String rwest;
     private String rsouth;
     private String rnorth;
     private Integer rdispute;
     private Integer rpledge;


    // Constructors

    /** default constructor */
    public RentPlotSituation() {
    }

	/** minimal constructor */
    public RentPlotSituation(PlotSituation plotSituation) {
        this.plotSituation = plotSituation;
    }
    
    /** full constructor */
    public RentPlotSituation(PlotSituation plotSituation, Double rlandArea, Double rbuildArea, Float rperiod, String reast, String rwest, String rsouth, String rnorth, Integer rdispute, Integer rpledge) {
        this.plotSituation = plotSituation;
        this.rlandArea = rlandArea;
        this.rbuildArea = rbuildArea;
        this.rperiod = rperiod;
        this.reast = reast;
        this.rwest = rwest;
        this.rsouth = rsouth;
        this.rnorth = rnorth;
        this.rdispute = rdispute;
        this.rpledge = rpledge;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="rlandId", unique=true, nullable=false)

    public Integer getRlandId() {
        return this.rlandId;
    }
    
    public void setRlandId(Integer rlandId) {
        this.rlandId = rlandId;
    }
	@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn

    public PlotSituation getPlotSituation() {
        return this.plotSituation;
    }
    
    public void setPlotSituation(PlotSituation plotSituation) {
        this.plotSituation = plotSituation;
    }
    
    @Column(name="rlandArea", precision=22, scale=0)

    public Double getRlandArea() {
        return this.rlandArea;
    }
    
    public void setRlandArea(Double rlandArea) {
        this.rlandArea = rlandArea;
    }
    
    @Column(name="rbuildArea", precision=22, scale=0)

    public Double getRbuildArea() {
        return this.rbuildArea;
    }
    
    public void setRbuildArea(Double rbuildArea) {
        this.rbuildArea = rbuildArea;
    }
    
    @Column(name="rperiod", precision=12, scale=0)

    public Float getRperiod() {
        return this.rperiod;
    }
    
    public void setRperiod(Float rperiod) {
        this.rperiod = rperiod;
    }
    
    @Column(name="reast", length=20)

    public String getReast() {
        return this.reast;
    }
    
    public void setReast(String reast) {
        this.reast = reast;
    }
    
    @Column(name="rwest", length=20)

    public String getRwest() {
        return this.rwest;
    }
    
    public void setRwest(String rwest) {
        this.rwest = rwest;
    }
    
    @Column(name="rsouth", length=20)

    public String getRsouth() {
        return this.rsouth;
    }
    
    public void setRsouth(String rsouth) {
        this.rsouth = rsouth;
    }
    
    @Column(name="rnorth", length=20)

    public String getRnorth() {
        return this.rnorth;
    }
    
    public void setRnorth(String rnorth) {
        this.rnorth = rnorth;
    }
    
    @Column(name="rdispute")

    public Integer getRdispute() {
        return this.rdispute;
    }
    
    public void setRdispute(Integer rdispute) {
        this.rdispute = rdispute;
    }
    
    @Column(name="rpledge")

    public Integer getRpledge() {
        return this.rpledge;
    }
    
    public void setRpledge(Integer rpledge) {
        this.rpledge = rpledge;
    }
   








}