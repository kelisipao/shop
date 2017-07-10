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
 * RegisterCheck entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_registercheck"
    ,catalog="db_wuqing"
)

public class RegisterCheck  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Agency agency;
     private Person person;
     private Government government;
     private Finance finance;
     private Unit unit;
     private Integer type;
     private Integer status;
     private Integer result;
     private String notification;
     private Date date;


    // Constructors

    /** default constructor */
    public RegisterCheck() {
    }

	/** minimal constructor */
    public RegisterCheck(Integer type) {
        this.type = type;
    }
    
    /** full constructor */
    public RegisterCheck(Agency agency, Person person, Government government, Finance finance, Unit unit, Integer type, Integer status, Integer result, String notification, Date date) {
        this.agency = agency;
        this.person = person;
        this.government = government;
        this.finance = finance;
        this.unit = unit;
        this.type = type;
        this.status = status;
        this.result = result;
        this.notification = notification;
        this.date = date;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="agency")

    public Agency getAgency() {
        return this.agency;
    }
    
    public void setAgency(Agency agency) {
        this.agency = agency;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="person")

    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="inspector")

    public Government getGovernment() {
        return this.government;
    }
    
    public void setGovernment(Government government) {
        this.government = government;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="finance")

    public Finance getFinance() {
        return this.finance;
    }
    
    public void setFinance(Finance finance) {
        this.finance = finance;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="unit")

    public Unit getUnit() {
        return this.unit;
    }
    
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    
    @Column(name="type", nullable=false)

    public Integer getType() {
        return this.type;
    }
    
    public void setType(Integer type) {
        this.type = type;
    }
    
    @Column(name="status")

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    @Column(name="result")

    public Integer getResult() {
        return this.result;
    }
    
    public void setResult(Integer result) {
        this.result = result;
    }
    
    @Column(name="notification", length=30)

    public String getNotification() {
        return this.notification;
    }
    
    public void setNotification(String notification) {
        this.notification = notification;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="date", length=10)

    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
   








}