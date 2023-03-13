package com.csi.dao;

import com.csi.model.Employee;
import com.csi.reposit.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmpDaoImpl {
    @Autowired
    EmpRepository empDaoImpl;
    public Employee signup(Employee employee){
        return  empDaoImpl.save(employee);
    }
    public Optional<Employee> getdatabyid(int empid){
        return  empDaoImpl.findById(empid);
    }
    public List<Employee> getalldata(){
        return  empDaoImpl.findAll();
    }
    public Employee updatedata(Employee employee){
        return empDaoImpl.save(employee);
    }
    public void deletedata() {
        empDaoImpl.deleteAll();
    }
}
