package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.HotelmenuModel;
import com.example.demo.Repository.HotelmenuRepository;

import jakarta.transaction.Transactional;

@Service

public class HotelmenuService 
{
@Autowired
HotelmenuRepository hrepo;
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
public List <HotelmenuModel> sortDesc (String oname)
{
	return hrepo.findAll(Sort.by(oname).descending());
}

public List<HotelmenuModel> sortAsc (String oname)
{
	return hrepo.findAll(Sort.by(oname).ascending());
}
public List<HotelmenuModel> paginationData (int pageNu,int pageSize)
{
	Page<HotelmenuModel> p=hrepo.findAll (PageRequest.of(pageNu, pageSize));
	return p.getContent();
}
@Transactional
public List<HotelmenuModel> get()
{
	return hrepo.GetAll();
}
@Transactional
public int delete(String dish)
{
	return hrepo.DeleteHotelmenuBydish(dish);
}
@Transactional

 public int update(String sh,int no)

 {

	 return hrepo.UpdateHotelmenuByNo(sh,no);

 }
}
