package com.photapp.organization.dto;

import com.photapp.organization.entity.Address;
import com.photapp.organization.entity.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class EmployeeDTO {


    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dob;
    private Date doj;
    private Date dot;
    private int addressId;
    private int positionId;
    private String status;
    private String userName;
    private String password;
    private String employeeNo;
    private Date createdAt;
    private Date updatedAt;
    private int createdBy;
    private int updatedBy;
    private List<Address> addresses;
    private List<Position> positions;

}
