package com.photapp.organization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ORGANIZATION")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name="NAME")
    private String name;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "DISPLAY_NAME")
    private String displayName;
    @Column(name = "ADDRESS_ID")
    private int addressId;
    @Column(name = "PARENT_ORG_ID")
    private int parentOrganizationId;
    @Column(name = "INTEGRATION_ID")
    private int integrationId;
    @Column(name = "CREATED_AT", updatable = false)
    private Date createdAt;
    @Column(name = "UPDATED_AT")
    private Date updatedAt;
    @Column(name = "CREATED_BY", updatable = false)
    private int createdBy;
    @Column(name = "UPDATED_BY")
    private int updatedBy;

}
