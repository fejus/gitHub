package com.ssm.service;

import com.ssm.entity.People;

import java.util.List;

public interface PeopleService {

    int addPeople(People people);

    List<People> getPeopleList();
}
