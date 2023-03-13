package com.csi.service;

import com.csi.dao.EmpDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImpl {
    @Autowired
    EmpDaoImpl empserviceimpl;
    public Employee savedata(Employee employee){
        return  empserviceimpl.signup(employee);
    }
    public Optional<Employee> getdatabyid(int empid){
        return  empserviceimpl.getdatabyid(empid);
    }
    public List<Employee> getalldata(){
        return empserviceimpl.getalldata();
    }
    public Employee updatedata(Employee employee){
        return  empserviceimpl.updatedata(employee);
    }
    public void deletedata(){
         empserviceimpl.deletedata();
    }
}
