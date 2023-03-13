package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private  int empid;
    private  String empname;
    private  double empsalary;
    private  String empmail;
    private  String emppassword;
    private  int empage;
    @JsonFormat(pattern = "dd-mm-yyyy")
    private Date empdob;


}
