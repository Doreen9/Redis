package io.turntabl.springbootdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.turntabl.springbootdemo.model.ClientTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
public class ClientController {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @ApiOperation("clients")
    @GetMapping("/view")
    public List<ClientTO> view(){
        return this.jdbcTemplate.query("select contact_name from customers", BeanPropertyRowMapper.newInstance(ClientTO.class));
    }

    @ApiOperation("search")
    @GetMapping("/search")
    public List<ClientTO> search(@RequestParam(value = "cusName", defaultValue = "Maria")String cusName){
        return this.jdbcTemplate.query("select * from customers where contact_name like ?",
                new Object[]{cusName + '%'},
                BeanPropertyRowMapper.newInstance(ClientTO.class));

    }
    @ApiOperation("add")
    @PostMapping("/add")
    public void update(@RequestParam(value = "comName", defaultValue = "Maria")String comName,
                       @RequestParam(value = "conName", defaultValue = "Maria")String conName,
                       @RequestParam(value = "cusID", defaultValue = "Maria")String cusID,
                       @RequestParam(value = "city", defaultValue = "Maria")String city,
                       @RequestParam(value = "country", defaultValue = "Maria")String country){
        this.jdbcTemplate.update("insert into customers(customer_id, company_name, contact_name, city, country) values (?, ?, ?, ?, ?)",
                new Object[]{cusID, comName, conName, city, country});
        System.out.println("Customer successfully added!");
    }

    @ApiOperation("delete")
    @PostMapping("/delete")
    public void delete(@RequestParam(value = "cusID", defaultValue = "MAR")String cusID){
        this.jdbcTemplate.update("delete from customers where customer_id = ?",
                new Object[]{cusID});
        System.out.println("Customer successfully deleted!");

    }

    @ApiOperation("update")
    @PostMapping("/update")
    public void update(){
        

    }

}
