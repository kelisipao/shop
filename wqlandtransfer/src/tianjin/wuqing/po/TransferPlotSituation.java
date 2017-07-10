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
 * TransferPlotSituation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_transferplotsituation"
    ,catalog="db_wuqing"
)

public class TransferPlotSituation  implements java.io.Serializable {


    // Fields    

     private Integer tlandId;
     private PlotSituation plotSituation;
     private Double tlandArea;
     private Double tbuildArea;
     private Long tgrossAmount;
     private Float tperiod;
     private Integer tpayType;
     private String teast;
     private String twest;
     private String tsouth;
     private String tnorth;
     private String tremark;
     private Double tvolumeRate;
     private Double tbuildingHight;
     private Double tgreenRate;
     private Double tbuildingDensity;
     private Integer tsupplyWater;
     private Integer tdrainWater;
     private Integer theat;
     private Integer tgas;
     private Integer tcommunication;
     private Integer telectricity;
     private Integer troad;
     private String tfacilities;
     private String ttraffic;
     private Integer tdispute;
     private Integer tpledge;
     private Integer thire;
     private Integer tseal;
     private Integer tidle;
     private Integer tstore;
     private Integer tpayProof;
     private Integer tsource;
     private Integer tconsent;
     private Integer taudit;


    // Constructors

    /** default constructor */
    public TransferPlotSituation() {
    }

	/** minimal constructor */
    public TransferPlotSituation(PlotSituation plotSituation, Integer tpayType, String teast, String twest, String tsouth, String tnorth, String tremark, Double tvolumeRate, Double tbuildingHight, Double tgreenRate, Double tbuildingDensity, Integer tsupplyWater, Integer tdrainWater, Integer theat, Integer tgas, Integer tcommunication, Integer telectricity, Integer troad, String tfacilities, String ttraffic, Integer tdispute, Integer tpledge, Integer thire, Integer tseal, Integer tidle, Integer tstore, Integer tpayProof, Integer tsource, Integer tconsent, Integer taudit) {
        this.plotSituation = plotSituation;
        this.tpayType = tpayType;
        this.teast = teast;
        this.twest = twest;
        this.tsouth = tsouth;
        this.tnorth = tnorth;
        this.tremark = tremark;
        this.tvolumeRate = tvolumeRate;
        this.tbuildingHight = tbuildingHight;
        this.tgreenRate = tgreenRate;
        this.tbuildingDensity = tbuildingDensity;
        this.tsupplyWater = tsupplyWater;
        this.tdrainWater = tdrainWater;
        this.theat = theat;
        this.tgas = tgas;
        this.tcommunication = tcommunication;
        this.telectricity = telectricity;
        this.troad = troad;
        this.tfacilities = tfacilities;
        this.ttraffic = ttraffic;
        this.tdispute = tdispute;
        this.tpledge = tpledge;
        this.thire = thire;
        this.tseal = tseal;
        this.tidle = tidle;
        this.tstore = tstore;
        this.tpayProof = tpayProof;
        this.tsource = tsource;
        this.tconsent = tconsent;
        this.taudit = taudit;
    }
    
    /** full constructor */
    public TransferPlotSituation(PlotSituation plotSituation, Double tlandArea, Double tbuildArea, Long tgrossAmount, Float tperiod, Integer tpayType, String teast, String twest, String tsouth, String tnorth, String tremark, Double tvolumeRate, Double tbuildingHight, Double tgreenRate, Double tbuildingDensity, Integer tsupplyWater, Integer tdrainWater, Integer theat, Integer tgas, Integer tcommunication, Integer telectricity, Integer troad, String tfacilities, String ttraffic, Integer tdispute, Integer tpledge, Integer thire, Integer tseal, Integer tidle, Integer tstore, Integer tpayProof, Integer tsource, Integer tconsent, Integer taudit) {
        this.plotSituation = plotSituation;
        this.tlandArea = tlandArea;
        this.tbuildArea = tbuildArea;
        this.tgrossAmount = tgrossAmount;
        this.tperiod = tperiod;
        this.tpayType = tpayType;
        this.teast = teast;
        this.twest = twest;
        this.tsouth = tsouth;
        this.tnorth = tnorth;
        this.tremark = tremark;
        this.tvolumeRate = tvolumeRate;
        this.tbuildingHight = tbuildingHight;
        this.tgreenRate = tgreenRate;
        this.tbuildingDensity = tbuildingDensity;
        this.tsupplyWater = tsupplyWater;
        this.tdrainWater = tdrainWater;
        this.theat = theat;
        this.tgas = tgas;
        this.tcommunication = tcommunication;
        this.telectricity = telectricity;
        this.troad = troad;
        this.tfacilities = tfacilities;
        this.ttraffic = ttraffic;
        this.tdispute = tdispute;
        this.tpledge = tpledge;
        this.thire = thire;
        this.tseal = tseal;
        this.tidle = tidle;
        this.tstore = tstore;
        this.tpayProof = tpayProof;
        this.tsource = tsource;
        this.tconsent = tconsent;
        this.taudit = taudit;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="tlandId", unique=true, nullable=false)

    public Integer getTlandId() {
        return this.tlandId;
    }
    
    public void setTlandId(Integer tlandId) {
        this.tlandId = tlandId;
    }
	@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn

    public PlotSituation getPlotSituation() {
        return this.plotSituation;
    }
    
    public void setPlotSituation(PlotSituation plotSituation) {
        this.plotSituation = plotSituation;
    }
    
    @Column(name="tlandArea", precision=22, scale=0)

    public Double getTlandArea() {
        return this.tlandArea;
    }
    
    public void setTlandArea(Double tlandArea) {
        this.tlandArea = tlandArea;
    }
    
    @Column(name="tbuildArea", precision=22, scale=0)

    public Double getTbuildArea() {
        return this.tbuildArea;
    }
    
    public void setTbuildArea(Double tbuildArea) {
        this.tbuildArea = tbuildArea;
    }
    
    @Column(name="tgrossAmount", precision=10, scale=0)

    public Long getTgrossAmount() {
        return this.tgrossAmount;
    }
    
    public void setTgrossAmount(Long tgrossAmount) {
        this.tgrossAmount = tgrossAmount;
    }
    
    @Column(name="tperiod", precision=12, scale=0)

    public Float getTperiod() {
        return this.tperiod;
    }
    
    public void setTperiod(Float tperiod) {
        this.tperiod = tperiod;
    }
    
    @Column(name="tpayType", nullable=false)

    public Integer getTpayType() {
        return this.tpayType;
    }
    
    public void setTpayType(Integer tpayType) {
        this.tpayType = tpayType;
    }
    
    @Column(name="teast", nullable=false, length=20)

    public String getTeast() {
        return this.teast;
    }
    
    public void setTeast(String teast) {
        this.teast = teast;
    }
    
    @Column(name="twest", nullable=false, length=20)

    public String getTwest() {
        return this.twest;
    }
    
    public void setTwest(String twest) {
        this.twest = twest;
    }
    
    @Column(name="tsouth", nullable=false, length=20)

    public String getTsouth() {
        return this.tsouth;
    }
    
    public void setTsouth(String tsouth) {
        this.tsouth = tsouth;
    }
    
    @Column(name="tnorth", nullable=false, length=20)

    public String getTnorth() {
        return this.tnorth;
    }
    
    public void setTnorth(String tnorth) {
        this.tnorth = tnorth;
    }
    
    @Column(name="tremark", nullable=false, length=20)

    public String getTremark() {
        return this.tremark;
    }
    
    public void setTremark(String tremark) {
        this.tremark = tremark;
    }
    
    @Column(name="tvolumeRate", nullable=false, precision=22, scale=0)

    public Double getTvolumeRate() {
        return this.tvolumeRate;
    }
    
    public void setTvolumeRate(Double tvolumeRate) {
        this.tvolumeRate = tvolumeRate;
    }
    
    @Column(name="tbuildingHight", nullable=false, precision=22, scale=0)

    public Double getTbuildingHight() {
        return this.tbuildingHight;
    }
    
    public void setTbuildingHight(Double tbuildingHight) {
        this.tbuildingHight = tbuildingHight;
    }
    
    @Column(name="tgreenRate", nullable=false, precision=22, scale=0)

    public Double getTgreenRate() {
        return this.tgreenRate;
    }
    
    public void setTgreenRate(Double tgreenRate) {
        this.tgreenRate = tgreenRate;
    }
    
    @Column(name="tbuildingDensity", nullable=false, precision=22, scale=0)

    public Double getTbuildingDensity() {
        return this.tbuildingDensity;
    }
    
    public void setTbuildingDensity(Double tbuildingDensity) {
        this.tbuildingDensity = tbuildingDensity;
    }
    
    @Column(name="tsupplyWater", nullable=false)

    public Integer getTsupplyWater() {
        return this.tsupplyWater;
    }
    
    public void setTsupplyWater(Integer tsupplyWater) {
        this.tsupplyWater = tsupplyWater;
    }
    
    @Column(name="tdrainWater", nullable=false)

    public Integer getTdrainWater() {
        return this.tdrainWater;
    }
    
    public void setTdrainWater(Integer tdrainWater) {
        this.tdrainWater = tdrainWater;
    }
    
    @Column(name="theat", nullable=false)

    public Integer getTheat() {
        return this.theat;
    }
    
    public void setTheat(Integer theat) {
        this.theat = theat;
    }
    
    @Column(name="tgas", nullable=false)

    public Integer getTgas() {
        return this.tgas;
    }
    
    public void setTgas(Integer tgas) {
        this.tgas = tgas;
    }
    
    @Column(name="tcommunication", nullable=false)

    public Integer getTcommunication() {
        return this.tcommunication;
    }
    
    public void setTcommunication(Integer tcommunication) {
        this.tcommunication = tcommunication;
    }
    
    @Column(name="telectricity", nullable=false)

    public Integer getTelectricity() {
        return this.telectricity;
    }
    
    public void setTelectricity(Integer telectricity) {
        this.telectricity = telectricity;
    }
    
    @Column(name="troad", nullable=false)

    public Integer getTroad() {
        return this.troad;
    }
    
    public void setTroad(Integer troad) {
        this.troad = troad;
    }
    
    @Column(name="tfacilities", nullable=false, length=20)

    public String getTfacilities() {
        return this.tfacilities;
    }
    
    public void setTfacilities(String tfacilities) {
        this.tfacilities = tfacilities;
    }
    
    @Column(name="ttraffic", nullable=false, length=20)

    public String getTtraffic() {
        return this.ttraffic;
    }
    
    public void setTtraffic(String ttraffic) {
        this.ttraffic = ttraffic;
    }
    
    @Column(name="tdispute", nullable=false)

    public Integer getTdispute() {
        return this.tdispute;
    }
    
    public void setTdispute(Integer tdispute) {
        this.tdispute = tdispute;
    }
    
    @Column(name="tpledge", nullable=false)

    public Integer getTpledge() {
        return this.tpledge;
    }
    
    public void setTpledge(Integer tpledge) {
        this.tpledge = tpledge;
    }
    
    @Column(name="thire", nullable=false)

    public Integer getThire() {
        return this.thire;
    }
    
    public void setThire(Integer thire) {
        this.thire = thire;
    }
    
    @Column(name="tseal", nullable=false)

    public Integer getTseal() {
        return this.tseal;
    }
    
    public void setTseal(Integer tseal) {
        this.tseal = tseal;
    }
    
    @Column(name="tidle", nullable=false)

    public Integer getTidle() {
        return this.tidle;
    }
    
    public void setTidle(Integer tidle) {
        this.tidle = tidle;
    }
    
    @Column(name="tstore", nullable=false)

    public Integer getTstore() {
        return this.tstore;
    }
    
    public void setTstore(Integer tstore) {
        this.tstore = tstore;
    }
    
    @Column(name="tpayProof", nullable=false)

    public Integer getTpayProof() {
        return this.tpayProof;
    }
    
    public void setTpayProof(Integer tpayProof) {
        this.tpayProof = tpayProof;
    }
    
    @Column(name="tsource", nullable=false)

    public Integer getTsource() {
        return this.tsource;
    }
    
    public void setTsource(Integer tsource) {
        this.tsource = tsource;
    }
    
    @Column(name="tconsent", nullable=false)

    public Integer getTconsent() {
        return this.tconsent;
    }
    
    public void setTconsent(Integer tconsent) {
        this.tconsent = tconsent;
    }
    
    @Column(name="taudit", nullable=false)

    public Integer getTaudit() {
        return this.taudit;
    }
    
    public void setTaudit(Integer taudit) {
        this.taudit = taudit;
    }
   








}