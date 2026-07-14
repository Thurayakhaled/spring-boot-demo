package com.project.springBoot.curddemo.rest;

import com.project.springBoot.curddemo.EmployeeService.EmployeeServices;
import com.project.springBoot.curddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeRestCon {
    private EmployeeServices employeeServices;
    //for patch mapping
    private JsonMapper jsonMapper;


    @Autowired
    public EmployeeRestCon(EmployeeServices employeeServices,JsonMapper jsonMapper) {

        this.employeeServices = employeeServices;
        this.jsonMapper = jsonMapper;
    }


    @GetMapping("/emp")
    public List<Employee> getEmployees() {
        return employeeServices.findAll();
    }

    @GetMapping("/empfind/{empid}")
    public Employee getEmployee(@PathVariable Integer empid) {
        Employee emp = employeeServices.findById(empid);
        if (emp == null) {
            throw new RuntimeException("emp not found");
        }
        return emp;

    }

    @DeleteMapping("/empdelete/{empid}")
    public String deleteEmployee(@PathVariable  Integer empid) {
        Employee emp = employeeServices.findById(empid);
        if (emp == null) {
            throw new RuntimeException("employee not found");
        }
        employeeServices.delete(empid);
        return "Employee deleted successfully";
    }
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee emp) {
      Employee employee=  employeeServices.save(emp);
      return employee;
    }

   // @GetMapping("/saveemp/{}")
   @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee emp) {
        emp.setId(null);
        Employee newEmp= employeeServices.save(emp);
        return newEmp;

   }

   @PatchMapping("update/{id}")
   public Employee updateEmployee(@PathVariable Integer id, @RequestBody Map<String,Object> patchPayLoad) {
        Employee employee = employeeServices.findById(id);
        if(employee == null) {
            throw new RuntimeException("employee not found");
        }
        if(patchPayLoad.containsKey("id")) {
            throw new RuntimeException("cant update the employee id");
        }
        Employee UpdatedEmployee = jsonMapper.updateValue(employee, patchPayLoad);
        Employee newEmpUpdated = employeeServices.save(UpdatedEmployee);
        return newEmpUpdated;
   }




}
