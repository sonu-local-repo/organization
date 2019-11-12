package com.photapp.organization.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "POSITION")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ORG_ID")
    private int organizationId;
    @Column(name = "PARENT_POSITION_ID")
    private int parentPositionId;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CREATED_AT", updatable = false)
    private Date createdAt;
    @Column(name = "UPDATED_AT")
    private Date updatedAt;
    @Column(name = "CREATED_BY", updatable = false)
    private int createdBy;
    @Column(name = "UPDATED_BY")
    private int updatedBy;
}
