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
 * Government entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_government"
    ,catalog="db_wuqing"
)

public class Government  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String username;
     private String password;
     private String duty;
     private String department;
     private Set<ApplyCheck> applyChecks = new HashSet<ApplyCheck>(0);
     private Set<SupplyCheck> supplyChecks = new HashSet<SupplyCheck>(0);
     private Set<RegisterCheck> registerChecks = new HashSet<RegisterCheck>(0);


    // Constructors

    /** default constructor */
    public Government() {
    }

    
    /** full constructor */
    public Government(String username, String password, String duty, String department, Set<ApplyCheck> applyChecks, Set<SupplyCheck> supplyChecks, Set<RegisterCheck> registerChecks) {
        this.username = username;
        this.password = password;
        this.duty = duty;
        this.department = department;
        this.applyChecks = applyChecks;
        this.supplyChecks = supplyChecks;
        this.registerChecks = registerChecks;
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
    
    @Column(name="username", length=20)

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    @Column(name="password", length=20)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="duty", length=10)

    public String getDuty() {
        return this.duty;
    }
    
    public void setDuty(String duty) {
        this.duty = duty;
    }
    
    @Column(name="department", length=10)

    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="government")

    public Set<ApplyCheck> getApplyChecks() {
        return this.applyChecks;
    }
    
    public void setApplyChecks(Set<ApplyCheck> applyChecks) {
        this.applyChecks = applyChecks;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="government")

    public Set<SupplyCheck> getSupplyChecks() {
        return this.supplyChecks;
    }
    
    public void setSupplyChecks(Set<SupplyCheck> supplyChecks) {
        this.supplyChecks = supplyChecks;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="government")

    public Set<RegisterCheck> getRegisterChecks() {
        return this.registerChecks;
    }
    
    public void setRegisterChecks(Set<RegisterCheck> registerChecks) {
        this.registerChecks = registerChecks;
    }
   








}