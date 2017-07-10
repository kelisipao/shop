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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * PlotSituation entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_plotsituation"
    ,catalog="db_wuqing"
)

public class PlotSituation  implements java.io.Serializable {


    // Fields    

     private Integer plotId;
     private HouseOwnershipCard houseOwnershipCard;
     private RealEstateRightCard realEstateRightCard;
     private LandTransferSupply landTransferSupply;
     private LandMortgageSupply landMortgageSupply;
     private ImmovablePropertyRightCard immovablePropertyRightCard;
     private LandUserRightCard landUserRightCard;
     private LandRentSupply landRentSupply;
     private String landLocation;
     private String landuserightcard;
     private String immovablepropertyrightcard;
     private String houseownershipcard;
     private String realestaterightcard;
     private Set<LandMortgageApply> landMortgageApplies = new HashSet<LandMortgageApply>(0);
     private Set<LandActualityReplaceApply> landActualityReplaceApplies = new HashSet<LandActualityReplaceApply>(0);
     private MortgagePlotSituation mortgagePlotSituation;
     private TransferPlotSituation transferPlotSituation;
     private Set<LandRentApply> landRentApplies = new HashSet<LandRentApply>(0);
     private RentPlotSituation rentPlotSituation;
     private Set<LandTransferApply> landTransferApplies = new HashSet<LandTransferApply>(0);


    // Constructors

    /** default constructor */
    public PlotSituation() {
    }

    
    /** full constructor */
    public PlotSituation(HouseOwnershipCard houseOwnershipCard, RealEstateRightCard realEstateRightCard, LandTransferSupply landTransferSupply, LandMortgageSupply landMortgageSupply, ImmovablePropertyRightCard immovablePropertyRightCard, LandUserRightCard landUserRightCard, LandRentSupply landRentSupply, String landLocation, String landuserightcard, String immovablepropertyrightcard, String houseownershipcard, String realestaterightcard, Set<LandMortgageApply> landMortgageApplies, Set<LandActualityReplaceApply> landActualityReplaceApplies, MortgagePlotSituation mortgagePlotSituation, TransferPlotSituation transferPlotSituation, Set<LandRentApply> landRentApplies, RentPlotSituation rentPlotSituation, Set<LandTransferApply> landTransferApplies) {
        this.houseOwnershipCard = houseOwnershipCard;
        this.realEstateRightCard = realEstateRightCard;
        this.landTransferSupply = landTransferSupply;
        this.landMortgageSupply = landMortgageSupply;
        this.immovablePropertyRightCard = immovablePropertyRightCard;
        this.landUserRightCard = landUserRightCard;
        this.landRentSupply = landRentSupply;
        this.landLocation = landLocation;
        this.landuserightcard = landuserightcard;
        this.immovablepropertyrightcard = immovablepropertyrightcard;
        this.houseownershipcard = houseownershipcard;
        this.realestaterightcard = realestaterightcard;
        this.landMortgageApplies = landMortgageApplies;
        this.landActualityReplaceApplies = landActualityReplaceApplies;
        this.mortgagePlotSituation = mortgagePlotSituation;
        this.transferPlotSituation = transferPlotSituation;
        this.landRentApplies = landRentApplies;
        this.rentPlotSituation = rentPlotSituation;
        this.landTransferApplies = landTransferApplies;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="plotId", unique=true, nullable=false)

    public Integer getPlotId() {
        return this.plotId;
    }
    
    public void setPlotId(Integer plotId) {
        this.plotId = plotId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="hocLicense")

    public HouseOwnershipCard getHouseOwnershipCard() {
        return this.houseOwnershipCard;
    }
    
    public void setHouseOwnershipCard(HouseOwnershipCard houseOwnershipCard) {
        this.houseOwnershipCard = houseOwnershipCard;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="rsrcLicense")

    public RealEstateRightCard getRealEstateRightCard() {
        return this.realEstateRightCard;
    }
    
    public void setRealEstateRightCard(RealEstateRightCard realEstateRightCard) {
        this.realEstateRightCard = realEstateRightCard;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="transferSupplyId")

    public LandTransferSupply getLandTransferSupply() {
        return this.landTransferSupply;
    }
    
    public void setLandTransferSupply(LandTransferSupply landTransferSupply) {
        this.landTransferSupply = landTransferSupply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="mortgageSupplyId")

    public LandMortgageSupply getLandMortgageSupply() {
        return this.landMortgageSupply;
    }
    
    public void setLandMortgageSupply(LandMortgageSupply landMortgageSupply) {
        this.landMortgageSupply = landMortgageSupply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="iprcLicense")

    public ImmovablePropertyRightCard getImmovablePropertyRightCard() {
        return this.immovablePropertyRightCard;
    }
    
    public void setImmovablePropertyRightCard(ImmovablePropertyRightCard immovablePropertyRightCard) {
        this.immovablePropertyRightCard = immovablePropertyRightCard;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="lurcLicense")

    public LandUserRightCard getLandUserRightCard() {
        return this.landUserRightCard;
    }
    
    public void setLandUserRightCard(LandUserRightCard landUserRightCard) {
        this.landUserRightCard = landUserRightCard;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="rentSupplyId")

    public LandRentSupply getLandRentSupply() {
        return this.landRentSupply;
    }
    
    public void setLandRentSupply(LandRentSupply landRentSupply) {
        this.landRentSupply = landRentSupply;
    }
    
    @Column(name="landLocation", length=50)

    public String getLandLocation() {
        return this.landLocation;
    }
    
    public void setLandLocation(String landLocation) {
        this.landLocation = landLocation;
    }
    
    @Column(name="landuserightcard", length=20)

    public String getLanduserightcard() {
        return this.landuserightcard;
    }
    
    public void setLanduserightcard(String landuserightcard) {
        this.landuserightcard = landuserightcard;
    }
    
    @Column(name="immovablepropertyrightcard", length=20)

    public String getImmovablepropertyrightcard() {
        return this.immovablepropertyrightcard;
    }
    
    public void setImmovablepropertyrightcard(String immovablepropertyrightcard) {
        this.immovablepropertyrightcard = immovablepropertyrightcard;
    }
    
    @Column(name="houseownershipcard", length=20)

    public String getHouseownershipcard() {
        return this.houseownershipcard;
    }
    
    public void setHouseownershipcard(String houseownershipcard) {
        this.houseownershipcard = houseownershipcard;
    }
    
    @Column(name="realestaterightcard", length=20)

    public String getRealestaterightcard() {
        return this.realestaterightcard;
    }
    
    public void setRealestaterightcard(String realestaterightcard) {
        this.realestaterightcard = realestaterightcard;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="plotSituation")

    public Set<LandMortgageApply> getLandMortgageApplies() {
        return this.landMortgageApplies;
    }
    
    public void setLandMortgageApplies(Set<LandMortgageApply> landMortgageApplies) {
        this.landMortgageApplies = landMortgageApplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="plotSituation")

    public Set<LandActualityReplaceApply> getLandActualityReplaceApplies() {
        return this.landActualityReplaceApplies;
    }
    
    public void setLandActualityReplaceApplies(Set<LandActualityReplaceApply> landActualityReplaceApplies) {
        this.landActualityReplaceApplies = landActualityReplaceApplies;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="plotSituation")

    public MortgagePlotSituation getMortgagePlotSituation() {
        return this.mortgagePlotSituation;
    }
    
    public void setMortgagePlotSituation(MortgagePlotSituation mortgagePlotSituation) {
        this.mortgagePlotSituation = mortgagePlotSituation;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="plotSituation")

    public TransferPlotSituation getTransferPlotSituation() {
        return this.transferPlotSituation;
    }
    
    public void setTransferPlotSituation(TransferPlotSituation transferPlotSituation) {
        this.transferPlotSituation = transferPlotSituation;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="plotSituation")

    public Set<LandRentApply> getLandRentApplies() {
        return this.landRentApplies;
    }
    
    public void setLandRentApplies(Set<LandRentApply> landRentApplies) {
        this.landRentApplies = landRentApplies;
    }
	@OneToOne(fetch=FetchType.LAZY, mappedBy="plotSituation")

    public RentPlotSituation getRentPlotSituation() {
        return this.rentPlotSituation;
    }
    
    public void setRentPlotSituation(RentPlotSituation rentPlotSituation) {
        this.rentPlotSituation = rentPlotSituation;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="plotSituation")

    public Set<LandTransferApply> getLandTransferApplies() {
        return this.landTransferApplies;
    }
    
    public void setLandTransferApplies(Set<LandTransferApply> landTransferApplies) {
        this.landTransferApplies = landTransferApplies;
    }
   








}