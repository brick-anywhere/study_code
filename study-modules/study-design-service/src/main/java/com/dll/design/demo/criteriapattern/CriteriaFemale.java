package com.dll.design.demo.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dll
 * @date 2021-05-19 16:09
 */
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
