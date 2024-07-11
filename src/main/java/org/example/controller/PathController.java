package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("path")
public class PathController {

    String marek = "marek";
    String pepa = "pepa";

    private String findUserById(Long idFromUser){
        if(idFromUser == 1){
            return marek;
        }if(idFromUser == 2){
            return pepa;
        }else {
            return "User neexistuje";
        }
    }

    private String findCountry(String country){

        String countryAnswerd = "Neexistuje";
        if(Objects.equals(country, "DE")){
            countryAnswerd = "Nemecko";
        }
        if(Objects.equals(country, "EN")){
            countryAnswerd = "Anglie";
        }
        return countryAnswerd;
    }

    @GetMapping("v1/employee")
    public String getEmployeeName(){
        return findUserById(1l);
    }

    @GetMapping("v2/employee/{userId}")
    public String getEmployeeById(@PathVariable Long userId){
        return findUserById(userId);
    }

    @GetMapping("v3/employee/{id}")
    public String getEmployeeByIdWithName(
            @PathVariable("id")  String thisIsTheIdFromUser
    ){
        return findUserById(Long.parseLong(thisIsTheIdFromUser));
    }

    @GetMapping("v4/employee/{id}")
    public String getEmployeeByIdWithNameAsValue(
            @PathVariable(value = "id") Long userId
    ){
        return findUserById(userId);
    }

    @GetMapping("v5/employee/{id}/{country}")
    public String getEmployeeByIdAndCountry(
            @PathVariable(value = "id") Long userId,
            @PathVariable(value = "country") String country
    ){
        String answerId = findUserById(userId);
        String answerCountry = findCountry(country);

        return answerId.concat(" ").concat(answerCountry);

    }

    @GetMapping("v6/employee/{id}/{country}")
    public String getEmployeeInMap(
            @PathVariable Map<String,String> pathVariables
    ){
        String id = pathVariables.get("id");
        String country = pathVariables.get("country");
        return findUserById(Long.parseLong(id)).concat(" ").concat(findCountry(country));

    }

    @GetMapping(value = {
            "v7/employee",
            "v7/employee/{id}"
    }
    )
    public String getEmployeeByIdNotRequired(
            @PathVariable(value = "id", required = false) String employeeId
    ){
        return employeeId;
    }

}
