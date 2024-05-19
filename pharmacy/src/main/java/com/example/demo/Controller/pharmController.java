package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.pharmModel;
import com.example.demo.Service.pharmService;
@CrossOrigin("http://localhost:3000")
@RestController

public class pharmController
{
	
		@Autowired

		public pharmService cser;
		
		@PostMapping( "post2")
		public pharmModel addDetails(@RequestBody pharmModel cr)
		{
			return cser.saveInfoo(cr);
		}

		
		@GetMapping("/get2")
		public List <pharmModel> getDetails()
		{
			return cser.getInfo();
		} 
        
		@GetMapping("get1/{medicineno}")
		public Optional <pharmModel> getByde (@PathVariable int medicineno)
		{
			return cser.getByid(medicineno);
		}
		
		@PutMapping("/put2")
		public pharmModel updateDetails(@RequestBody pharmModel medicineno)
		{
			return cser.updateInfo(medicineno);
		}

		
		@DeleteMapping("/del2/{cid}")
		public String deleteDetails(@PathVariable ("cid") int medicineno)
		{
			cser.deleteInfo(medicineno);
			return "medStore Number "+medicineno+" is deleted";
		}
		@GetMapping("/sortDesc/{medicinename}")
		public List<pharmModel> sortOwner(@PathVariable("medicinename") String medicinename)
		{
			return cser.sortDesc(medicinename);
		}

		@GetMapping("/sortAsc/{medicinename}")
		public List<pharmModel> sortOwnerasc(@PathVariable ("medicinename") String medicinename)
		{
			return cser.sortAsc(medicinename);
		}


		@GetMapping("/pagination/{pnu}/{psize}")
		public List <pharmModel> paginationData(@PathVariable ("pnu") int pnu, @PathVariable("psize")int psize)
		{
			return cser.paginationData(pnu, psize);
		}
		@GetMapping("/get")
		public List<pharmModel>get()
		{
			return cser.get();
		}
		@PutMapping("/update/{sh}/{no}")

		public String update(@PathVariable String sh,@PathVariable int no)

		{

			int result=cser.update(sh,no);

			if(result>0)

				return "Updated Successfully";

			else

				return "Problem occur while updating";

		}
}