package com.csi.controller;

import com.csi.exception.RunTimeExceptoin;
import com.csi.model.Employee;
import com.csi.service.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmpController {
    @Autowired
    EmpServiceImpl empService;
@PostMapping("/savedata")
    public ResponseEntity<Employee> savedata(@RequestBody Employee employee){
       return  ResponseEntity.ok(empService.savedata(employee));

    }
    @GetMapping("/getdat/{empid}")
    public ResponseEntity<Optional<Employee>> getdatabyid(@PathVariable int empid){
        return  ResponseEntity.ok(empService.getdatabyid(empid));
    }
   @GetMapping("/getalldata")
    public ResponseEntity<Employee> getalldata(){
        return  ResponseEntity.ok((Employee) empService.getalldata());
   }
   @PutMapping("/updatedata/{empid}")
    public  ResponseEntity<Employee> updatedata(@PathVariable int empid,@RequestBody Employee employee){
        Employee employee1 = empService.getdatabyid(empid).orElseThrow(()->new RunTimeExceptoin("Employee id Does not found"));
        employee1.setEmpsalary(employee.getEmpsalary());
        employee1.setEmpname(employee.getEmpname());
        employee1.setEmpage(employee.getEmpage());
        return ResponseEntity.ok(empService.updatedata(employee1));
   }
   @DeleteMapping("/deletealldata")
    public ResponseEntity<String> deletedata(){
        empService.deletedata();
       return ResponseEntity.ok("delete data");
   }

}
