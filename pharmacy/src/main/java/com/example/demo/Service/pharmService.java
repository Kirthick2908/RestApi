package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.Model.pharmModel;
import com.example.demo.Repository.pharmRepository;

import jakarta.transaction.Transactional;

@Service
	
	public class pharmService 
	{
		@Autowired
		public pharmRepository crepo;
		public pharmModel saveInfoo(pharmModel c)
		{
			return crepo.save(c);
		}

		public List<pharmModel> getInfo()
		{
			return crepo.findAll();
		}
		
		public Optional <pharmModel> getByid(int medicinenum)
		{
			return crepo.findById(medicinenum);
		}

		public pharmModel updateInfo(pharmModel iu)
		{
			return crepo.saveAndFlush(iu);
		}

		public void deleteInfo(int medicinenum)
		{
			crepo.deleteById(medicinenum); 
		}
		public List <pharmModel> sortDesc (String medicinename)
		{
			return crepo.findAll(Sort.by(medicinename).descending());
		}

		public List<pharmModel> sortAsc (String medicinename)
		{
			return crepo.findAll(Sort.by(medicinename).ascending());
		}
		public List<pharmModel> paginationData (int pageNu,int pageSize)
		{
			Page<pharmModel> p=crepo.findAll (PageRequest.of(pageNu, pageSize));
			return p.getContent();
		}
		@Transactional
		public List<pharmModel> get()
		{
			return crepo.GetAll();
		}
		@Transactional
		public int delete(String dish)
		{
			return crepo.DeleteHotelmenuBydish(dish);
		}
		@Transactional

		 public int update(String sh,int no)

		 {

			 return crepo.UpdateHotelmenuByNo(sh,no);

		 }
	}