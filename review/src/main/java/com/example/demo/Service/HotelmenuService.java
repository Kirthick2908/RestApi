package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.HotelmenuModel;
import com.example.demo.Repository.HotelmenuRepository;

@Service

public class HotelmenuService 
{
@Autowired
public HotelmenuRepository hrepo;
public HotelmenuModel saveInfo(HotelmenuModel h)
{
	return hrepo.save(h);
}
public List <HotelmenuModel> getInfo()
{
	return hrepo.findAll();
}
public HotelmenuModel updateInfo(HotelmenuModel iu)
{
	return hrepo.saveAndFlush(iu);
}
public void deleteInfo(int menuno)
{
	hrepo.deleteById(menuno);
}
}
