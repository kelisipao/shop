package tianjin.wuqing.po;
// default package

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * MortgagePlotSituation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_mortgageplotsituation"
    ,catalog="db_wuqing"
)

public class MortgagePlotSituation  implements java.io.Serializable {


    // Fields    

     private Integer mlandId;
     private PlotSituation plotSituation;
     private Double mlandArea;
     private Double mbuildArea;
     private Long mvaluation;
     private Date mstartTime;
     private Date mendTime;
     private Integer mseparationPledge;
     private Integer munderconstruction;
     private Integer mfirstPledge;
     private Integer msurfaceObject;
     private String meast;
     private String mwest;
     private String msouth;
     private String mnorth;
     private String mremark;
     private Double mvolumeRate;
     private Double mbuildingHight;
     private Double mgreenRate;
     private Double mbuildingDensity;
     private String mindustryType;
     private String minvestmentIntensity;
     private Long mlandOutput;
     private Long mlandTax;
     private Integer msupplyWater;
     private Integer mdrainWater;
     private Integer mheat;
     private Integer mgas;
     private Integer mcommunication;
     private Integer melectricity;
     private Integer mroad;
     private String mfacilities;
     private String mtraffic;


    // Constructors

    /** default constructor */
    public MortgagePlotSituation() {
    }

	/** minimal constructor */
    public MortgagePlotSituation(PlotSituation plotSituation, Integer mseparationPledge, Integer munderconstruction, Integer mfirstPledge, Integer msurfaceObject, String meast, String mwest, String msouth, String mnorth, String mremark, Double mvolumeRate, Double mbuildingHight, Double mgreenRate, Double mbuildingDensity, String mindustryType, String minvestmentIntensity, Long mlandOutput, Long mlandTax, Integer msupplyWater, Integer mdrainWater, Integer mheat, Integer mgas, Integer mcommunication, Integer melectricity, Integer mroad, String mfacilities, String mtraffic) {
        this.plotSituation = plotSituation;
        this.mseparationPledge = mseparationPledge;
        this.munderconstruction = munderconstruction;
        this.mfirstPledge = mfirstPledge;
        this.msurfaceObject = msurfaceObject;
        this.meast = meast;
        this.mwest = mwest;
        this.msouth = msouth;
        this.mnorth = mnorth;
        this.mremark = mremark;
        this.mvolumeRate = mvolumeRate;
        this.mbuildingHight = mbuildingHight;
        this.mgreenRate = mgreenRate;
        this.mbuildingDensity = mbuildingDensity;
        this.mindustryType = mindustryType;
        this.minvestmentIntensity = minvestmentIntensity;
        this.mlandOutput = mlandOutput;
        this.mlandTax = mlandTax;
        this.msupplyWater = msupplyWater;
        this.mdrainWater = mdrainWater;
        this.mheat = mheat;
        this.mgas = mgas;
        this.mcommunication = mcommunication;
        this.melectricity = melectricity;
        this.mroad = mroad;
        this.mfacilities = mfacilities;
        this.mtraffic = mtraffic;
    }
    
    /** full constructor */
    public MortgagePlotSituation(PlotSituation plotSituation, Double mlandArea, Double mbuildArea, Long mvaluation, Date mstartTime, Date mendTime, Integer mseparationPledge, Integer munderconstruction, Integer mfirstPledge, Integer msurfaceObject, String meast, String mwest, String msouth, String mnorth, String mremark, Double mvolumeRate, Double mbuildingHight, Double mgreenRate, Double mbuildingDensity, String mindustryType, String minvestmentIntensity, Long mlandOutput, Long mlandTax, Integer msupplyWater, Integer mdrainWater, Integer mheat, Integer mgas, Integer mcommunication, Integer melectricity, Integer mroad, String mfacilities, String mtraffic) {
        this.plotSituation = plotSituation;
        this.mlandArea = mlandArea;
        this.mbuildArea = mbuildArea;
        this.mvaluation = mvaluation;
        this.mstartTime = mstartTime;
        this.mendTime = mendTime;
        this.mseparationPledge = mseparationPledge;
        this.munderconstruction = munderconstruction;
        this.mfirstPledge = mfirstPledge;
        this.msurfaceObject = msurfaceObject;
        this.meast = meast;
        this.mwest = mwest;
        this.msouth = msouth;
        this.mnorth = mnorth;
        this.mremark = mremark;
        this.mvolumeRate = mvolumeRate;
        this.mbuildingHight = mbuildingHight;
        this.mgreenRate = mgreenRate;
        this.mbuildingDensity = mbuildingDensity;
        this.mindustryType = mindustryType;
        this.minvestmentIntensity = minvestmentIntensity;
        this.mlandOutput = mlandOutput;
        this.mlandTax = mlandTax;
        this.msupplyWater = msupplyWater;
        this.mdrainWater = mdrainWater;
        this.mheat = mheat;
        this.mgas = mgas;
        this.mcommunication = mcommunication;
        this.melectricity = melectricity;
        this.mroad = mroad;
        this.mfacilities = mfacilities;
        this.mtraffic = mtraffic;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="mlandId", unique=true, nullable=false)

    public Integer getMlandId() {
        return this.mlandId;
    }
    
    public void setMlandId(Integer mlandId) {
        this.mlandId = mlandId;
    }
	@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn

    public PlotSituation getPlotSituation() {
        return this.plotSituation;
    }
    
    public void setPlotSituation(PlotSituation plotSituation) {
        this.plotSituation = plotSituation;
    }
    
    @Column(name="mlandArea", precision=22, scale=0)

    public Double getMlandArea() {
        return this.mlandArea;
    }
    
    public void setMlandArea(Double mlandArea) {
        this.mlandArea = mlandArea;
    }
    
    @Column(name="mbuildArea", precision=22, scale=0)

    public Double getMbuildArea() {
        return this.mbuildArea;
    }
    
    public void setMbuildArea(Double mbuildArea) {
        this.mbuildArea = mbuildArea;
    }
    
    @Column(name="mvaluation", precision=10, scale=0)

    public Long getMvaluation() {
        return this.mvaluation;
    }
    
    public void setMvaluation(Long mvaluation) {
        this.mvaluation = mvaluation;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="mstartTime", length=10)

    public Date getMstartTime() {
        return this.mstartTime;
    }
    
    public void setMstartTime(Date mstartTime) {
        this.mstartTime = mstartTime;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="mendTime", length=10)

    public Date getMendTime() {
        return this.mendTime;
    }
    
    public void setMendTime(Date mendTime) {
        this.mendTime = mendTime;
    }
    
    @Column(name="mseparationPledge", nullable=false)

    public Integer getMseparationPledge() {
        return this.mseparationPledge;
    }
    
    public void setMseparationPledge(Integer mseparationPledge) {
        this.mseparationPledge = mseparationPledge;
    }
    
    @Column(name="munderconstruction", nullable=false)

    public Integer getMunderconstruction() {
        return this.munderconstruction;
    }
    
    public void setMunderconstruction(Integer munderconstruction) {
        this.munderconstruction = munderconstruction;
    }
    
    @Column(name="mfirstPledge", nullable=false)

    public Integer getMfirstPledge() {
        return this.mfirstPledge;
    }
    
    public void setMfirstPledge(Integer mfirstPledge) {
        this.mfirstPledge = mfirstPledge;
    }
    
    @Column(name="mSurfaceObject", nullable=false)

    public Integer getMsurfaceObject() {
        return this.msurfaceObject;
    }
    
    public void setMsurfaceObject(Integer msurfaceObject) {
        this.msurfaceObject = msurfaceObject;
    }
    
    @Column(name="meast", nullable=false, length=20)

    public String getMeast() {
        return this.meast;
    }
    
    public void setMeast(String meast) {
        this.meast = meast;
    }
    
    @Column(name="mwest", nullable=false, length=20)

    public String getMwest() {
        return this.mwest;
    }
    
    public void setMwest(String mwest) {
        this.mwest = mwest;
    }
    
    @Column(name="msouth", nullable=false, length=20)

    public String getMsouth() {
        return this.msouth;
    }
    
    public void setMsouth(String msouth) {
        this.msouth = msouth;
    }
    
    @Column(name="mnorth", nullable=false, length=20)

    public String getMnorth() {
        return this.mnorth;
    }
    
    public void setMnorth(String mnorth) {
        this.mnorth = mnorth;
    }
    
    @Column(name="mremark", nullable=false, length=20)

    public String getMremark() {
        return this.mremark;
    }
    
    public void setMremark(String mremark) {
        this.mremark = mremark;
    }
    
    @Column(name="mvolumeRate", nullable=false, precision=22, scale=0)

    public Double getMvolumeRate() {
        return this.mvolumeRate;
    }
    
    public void setMvolumeRate(Double mvolumeRate) {
        this.mvolumeRate = mvolumeRate;
    }
    
    @Column(name="mbuildingHight", nullable=false, precision=22, scale=0)

    public Double getMbuildingHight() {
        return this.mbuildingHight;
    }
    
    public void setMbuildingHight(Double mbuildingHight) {
        this.mbuildingHight = mbuildingHight;
    }
    
    @Column(name="mgreenRate", nullable=false, precision=22, scale=0)

    public Double getMgreenRate() {
        return this.mgreenRate;
    }
    
    public void setMgreenRate(Double mgreenRate) {
        this.mgreenRate = mgreenRate;
    }
    
    @Column(name="mbuildingDensity", nullable=false, precision=22, scale=0)

    public Double getMbuildingDensity() {
        return this.mbuildingDensity;
    }
    
    public void setMbuildingDensity(Double mbuildingDensity) {
        this.mbuildingDensity = mbuildingDensity;
    }
    
    @Column(name="mindustryType", nullable=false, length=20)

    public String getMindustryType() {
        return this.mindustryType;
    }
    
    public void setMindustryType(String mindustryType) {
        this.mindustryType = mindustryType;
    }
    
    @Column(name="minvestmentIntensity", nullable=false, length=20)

    public String getMinvestmentIntensity() {
        return this.minvestmentIntensity;
    }
    
    public void setMinvestmentIntensity(String minvestmentIntensity) {
        this.minvestmentIntensity = minvestmentIntensity;
    }
    
    @Column(name="mlandOutput", nullable=false, precision=10, scale=0)

    public Long getMlandOutput() {
        return this.mlandOutput;
    }
    
    public void setMlandOutput(Long mlandOutput) {
        this.mlandOutput = mlandOutput;
    }
    
    @Column(name="mlandTax", nullable=false, precision=10, scale=0)

    public Long getMlandTax() {
        return this.mlandTax;
    }
    
    public void setMlandTax(Long mlandTax) {
        this.mlandTax = mlandTax;
    }
    
    @Column(name="msupplyWater", nullable=false)

    public Integer getMsupplyWater() {
        return this.msupplyWater;
    }
    
    public void setMsupplyWater(Integer msupplyWater) {
        this.msupplyWater = msupplyWater;
    }
    
    @Column(name="mdrainWater", nullable=false)

    public Integer getMdrainWater() {
        return this.mdrainWater;
    }
    
    public void setMdrainWater(Integer mdrainWater) {
        this.mdrainWater = mdrainWater;
    }
    
    @Column(name="mheat", nullable=false)

    public Integer getMheat() {
        return this.mheat;
    }
    
    public void setMheat(Integer mheat) {
        this.mheat = mheat;
    }
    
    @Column(name="mgas", nullable=false)

    public Integer getMgas() {
        return this.mgas;
    }
    
    public void setMgas(Integer mgas) {
        this.mgas = mgas;
    }
    
    @Column(name="mcommunication", nullable=false)

    public Integer getMcommunication() {
        return this.mcommunication;
    }
    
    public void setMcommunication(Integer mcommunication) {
        this.mcommunication = mcommunication;
    }
    
    @Column(name="melectricity", nullable=false)

    public Integer getMelectricity() {
        return this.melectricity;
    }
    
    public void setMelectricity(Integer melectricity) {
        this.melectricity = melectricity;
    }
    
    @Column(name="mroad", nullable=false)

    public Integer getMroad() {
        return this.mroad;
    }
    
    public void setMroad(Integer mroad) {
        this.mroad = mroad;
    }
    
    @Column(name="mfacilities", nullable=false, length=30)

    public String getMfacilities() {
        return this.mfacilities;
    }
    
    public void setMfacilities(String mfacilities) {
        this.mfacilities = mfacilities;
    }
    
    @Column(name="mtraffic", nullable=false, length=30)

    public String getMtraffic() {
        return this.mtraffic;
    }
    
    public void setMtraffic(String mtraffic) {
        this.mtraffic = mtraffic;
    }
   








}