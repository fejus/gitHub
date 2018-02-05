package com.ssm.service.impl;

import com.ssm.dao.PeopleMapper;
import com.ssm.entity.People;
import com.ssm.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService{

	@Autowired
	private PeopleMapper peopleMapper;

    public int addPeople(People people) {
        return 0;
    }

	public List<People> getPeopleList() {
		return peopleMapper.selectByExample(null);
	}
}
