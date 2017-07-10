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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Person entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_person"
    ,catalog="db_wuqing"
)

public class Person  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private User user;
     private String formId;
     private Date formDate;
     private String name;
     private String phone;
     private String identityType;
     private String ientityNumber;
     private String address;
     private String postcode;
     private String idCordPhoto;
     private Set<LandActualityReplaceApply> landActualityReplaceApplies = new HashSet<LandActualityReplaceApply>(0);
     private Set<RegisterCheck> registerChecks = new HashSet<RegisterCheck>(0);
     private Set<LandTransferApply> landTransferAppliesForTransfereeAgent = new HashSet<LandTransferApply>(0);
     private Set<LandRentApply> landRentAppliesForLrleaseeAgent = new HashSet<LandRentApply>(0);
     private Set<LandMortgageApply> landMortgageAppliesForLmpledgerAgent = new HashSet<LandMortgageApply>(0);
     private Set<LandTransferApply> landTransferAppliesForTransferorAgent = new HashSet<LandTransferApply>(0);
     private Set<LandRentApply> landRentAppliesForLrlessorAgent = new HashSet<LandRentApply>(0);
     private Set<LandMortgageApply> landMortgageAppliesForLmpledgeeAgent = new HashSet<LandMortgageApply>(0);


    // Constructors

    /** default constructor */
    public Person() {
    }

	/** minimal constructor */
    public Person(User user, String formId, Date formDate, String name, String phone, String identityType, String ientityNumber, String address, String postcode, String idCordPhoto) {
        this.user = user;
        this.formId = formId;
        this.formDate = formDate;
        this.name = name;
        this.phone = phone;
        this.identityType = identityType;
        this.ientityNumber = ientityNumber;
        this.address = address;
        this.postcode = postcode;
        this.idCordPhoto = idCordPhoto;
    }
    
    /** full constructor */
    public Person(User user, String formId, Date formDate, String name, String phone, String identityType, String ientityNumber, String address, String postcode, String idCordPhoto, Set<LandActualityReplaceApply> landActualityReplaceApplies, Set<RegisterCheck> registerChecks, Set<LandTransferApply> landTransferAppliesForTransfereeAgent, Set<LandRentApply> landRentAppliesForLrleaseeAgent, Set<LandMortgageApply> landMortgageAppliesForLmpledgerAgent, Set<LandTransferApply> landTransferAppliesForTransferorAgent, Set<LandRentApply> landRentAppliesForLrlessorAgent, Set<LandMortgageApply> landMortgageAppliesForLmpledgeeAgent) {
        this.user = user;
        this.formId = formId;
        this.formDate = formDate;
        this.name = name;
        this.phone = phone;
        this.identityType = identityType;
        this.ientityNumber = ientityNumber;
        this.address = address;
        this.postcode = postcode;
        this.idCordPhoto = idCordPhoto;
        this.landActualityReplaceApplies = landActualityReplaceApplies;
        this.registerChecks = registerChecks;
        this.landTransferAppliesForTransfereeAgent = landTransferAppliesForTransfereeAgent;
        this.landRentAppliesForLrleaseeAgent = landRentAppliesForLrleaseeAgent;
        this.landMortgageAppliesForLmpledgerAgent = landMortgageAppliesForLmpledgerAgent;
        this.landTransferAppliesForTransferorAgent = landTransferAppliesForTransferorAgent;
        this.landRentAppliesForLrlessorAgent = landRentAppliesForLrlessorAgent;
        this.landMortgageAppliesForLmpledgeeAgent = landMortgageAppliesForLmpledgeeAgent;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="userId", unique=true, nullable=false)

    public Integer getUserId() {
        return this.userId;
    }
    
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
	@OneToOne(fetch=FetchType.LAZY)@PrimaryKeyJoinColumn

    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    @Column(name="formId", nullable=false, length=20)

    public String getFormId() {
        return this.formId;
    }
    
    public void setFormId(String formId) {
        this.formId = formId;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="formDate", nullable=false, length=10)

    public Date getFormDate() {
        return this.formDate;
    }
    
    public void setFormDate(Date formDate) {
        this.formDate = formDate;
    }
    
    @Column(name="name", nullable=false, length=20)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="phone", nullable=false, length=11)

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Column(name="identityType", nullable=false, length=20)

    public String getIdentityType() {
        return this.identityType;
    }
    
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }
    
    @Column(name="ientityNumber", nullable=false, length=20)

    public String getIentityNumber() {
        return this.ientityNumber;
    }
    
    public void setIentityNumber(String ientityNumber) {
        this.ientityNumber = ientityNumber;
    }
    
    @Column(name="address", nullable=false, length=20)

    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Column(name="postcode", nullable=false, length=6)

    public String getPostcode() {
        return this.postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    @Column(name="idCordPhoto", nullable=false, length=20)

    public String getIdCordPhoto() {
        return this.idCordPhoto;
    }
    
    public void setIdCordPhoto(String idCordPhoto) {
        this.idCordPhoto = idCordPhoto;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="person")

    public Set<LandActualityReplaceApply> getLandActualityReplaceApplies() {
        return this.landActualityReplaceApplies;
    }
    
    public void setLandActualityReplaceApplies(Set<LandActualityReplaceApply> landActualityReplaceApplies) {
        this.landActualityReplaceApplies = landActualityReplaceApplies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="person")

    public Set<RegisterCheck> getRegisterChecks() {
        return this.registerChecks;
    }
    
    public void setRegisterChecks(Set<RegisterCheck> registerChecks) {
        this.registerChecks = registerChecks;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="personByTransfereeAgent")

    public Set<LandTransferApply> getLandTransferAppliesForTransfereeAgent() {
        return this.landTransferAppliesForTransfereeAgent;
    }
    
    public void setLandTransferAppliesForTransfereeAgent(Set<LandTransferApply> landTransferAppliesForTransfereeAgent) {
        this.landTransferAppliesForTransfereeAgent = landTransferAppliesForTransfereeAgent;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="personByLrleaseeAgent")

    public Set<LandRentApply> getLandRentAppliesForLrleaseeAgent() {
        return this.landRentAppliesForLrleaseeAgent;
    }
    
    public void setLandRentAppliesForLrleaseeAgent(Set<LandRentApply> landRentAppliesForLrleaseeAgent) {
        this.landRentAppliesForLrleaseeAgent = landRentAppliesForLrleaseeAgent;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="personByLmpledgerAgent")

    public Set<LandMortgageApply> getLandMortgageAppliesForLmpledgerAgent() {
        return this.landMortgageAppliesForLmpledgerAgent;
    }
    
    public void setLandMortgageAppliesForLmpledgerAgent(Set<LandMortgageApply> landMortgageAppliesForLmpledgerAgent) {
        this.landMortgageAppliesForLmpledgerAgent = landMortgageAppliesForLmpledgerAgent;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="personByTransferorAgent")

    public Set<LandTransferApply> getLandTransferAppliesForTransferorAgent() {
        return this.landTransferAppliesForTransferorAgent;
    }
    
    public void setLandTransferAppliesForTransferorAgent(Set<LandTransferApply> landTransferAppliesForTransferorAgent) {
        this.landTransferAppliesForTransferorAgent = landTransferAppliesForTransferorAgent;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="personByLrlessorAgent")

    public Set<LandRentApply> getLandRentAppliesForLrlessorAgent() {
        return this.landRentAppliesForLrlessorAgent;
    }
    
    public void setLandRentAppliesForLrlessorAgent(Set<LandRentApply> landRentAppliesForLrlessorAgent) {
        this.landRentAppliesForLrlessorAgent = landRentAppliesForLrlessorAgent;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="personByLmpledgeeAgent")

    public Set<LandMortgageApply> getLandMortgageAppliesForLmpledgeeAgent() {
        return this.landMortgageAppliesForLmpledgeeAgent;
    }
    
    public void setLandMortgageAppliesForLmpledgeeAgent(Set<LandMortgageApply> landMortgageAppliesForLmpledgeeAgent) {
        this.landMortgageAppliesForLmpledgeeAgent = landMortgageAppliesForLmpledgeeAgent;
    }
   








}