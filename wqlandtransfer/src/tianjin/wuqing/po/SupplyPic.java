package tianjin.wuqing.po;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * SupplyPic entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_supplypic"
    ,catalog="db_wuqing"
)

public class SupplyPic  implements java.io.Serializable {


    // Fields    

     private Integer saccessoryId;
     private LandRentSupply landRentSupply;
     private LandMortgageSupply landMortgageSupply;
     private LandTransferSupply landTransferSupply;
     private Integer stype;
     private String spic;
     private String spicPath;


    // Constructors

    /** default constructor */
    public SupplyPic() {
    }

	/** minimal constructor */
    public SupplyPic(Integer stype, String spic, String spicPath) {
        this.stype = stype;
        this.spic = spic;
        this.spicPath = spicPath;
    }
    
    /** full constructor */
    public SupplyPic(LandRentSupply landRentSupply, LandMortgageSupply landMortgageSupply, LandTransferSupply landTransferSupply, Integer stype, String spic, String spicPath) {
        this.landRentSupply = landRentSupply;
        this.landMortgageSupply = landMortgageSupply;
        this.landTransferSupply = landTransferSupply;
        this.stype = stype;
        this.spic = spic;
        this.spicPath = spicPath;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="saccessoryId", unique=true, nullable=false)

    public Integer getSaccessoryId() {
        return this.saccessoryId;
    }
    
    public void setSaccessoryId(Integer saccessoryId) {
        this.saccessoryId = saccessoryId;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="srentSupplyId")

    public LandRentSupply getLandRentSupply() {
        return this.landRentSupply;
    }
    
    public void setLandRentSupply(LandRentSupply landRentSupply) {
        this.landRentSupply = landRentSupply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="smortgageSupplyId")

    public LandMortgageSupply getLandMortgageSupply() {
        return this.landMortgageSupply;
    }
    
    public void setLandMortgageSupply(LandMortgageSupply landMortgageSupply) {
        this.landMortgageSupply = landMortgageSupply;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="stransferSupplyId")

    public LandTransferSupply getLandTransferSupply() {
        return this.landTransferSupply;
    }
    
    public void setLandTransferSupply(LandTransferSupply landTransferSupply) {
        this.landTransferSupply = landTransferSupply;
    }
    
    @Column(name="stype", nullable=false)

    public Integer getStype() {
        return this.stype;
    }
    
    public void setStype(Integer stype) {
        this.stype = stype;
    }
    
    @Column(name="spic", nullable=false, length=20)

    public String getSpic() {
        return this.spic;
    }
    
    public void setSpic(String spic) {
        this.spic = spic;
    }
    
    @Column(name="spicPath", nullable=false, length=20)

    public String getSpicPath() {
        return this.spicPath;
    }
    
    public void setSpicPath(String spicPath) {
        this.spicPath = spicPath;
    }
   








}