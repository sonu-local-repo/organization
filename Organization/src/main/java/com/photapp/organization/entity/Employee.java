package com.photapp.organization.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "DOB")
    private Date dob;
    @Column(name = "DOJ")
    private Date doj;
    @Column(name = "DOT")
    private Date dot;
    @Column(name = "ADDRESS_ID")
    private int addressId;
    @Column(name = "POSITION_ID")
    private int positionId;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "USER_ID")
    private String userName;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "EMPLOYEE_NO", updatable = false)
    private String employeeNo;
    @Column(name = "CREATED_AT", updatable = false)
    private Date createdAt;
    @Column(name = "UPDATED_AT")
    private Date updatedAt;
    @Column(name = "CREATED_BY", updatable = false)
    private int createdBy;
    @Column(name = "UPDATED_BY")
    private int updatedBy;



//    @JsonIgnore
//    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name="EMPLOYEE_ADDRESS", joinColumns={@JoinColumn(referencedColumnName="id")}
            , inverseJoinColumns={@JoinColumn(referencedColumnName="id")})
    private List<Address> addresses = new ArrayList<>();
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "EMPLOYEE_POSITION", joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
            inverseJoinColumns = {@JoinColumn(name = "POSITION_ID")})
    private List<Position> positions = new ArrayList<>();

}