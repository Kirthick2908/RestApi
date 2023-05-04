package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.HotelmenuModel;
import com.example.demo.Service.HotelmenuService;

@RestController
public class HotelmenuController
{
@Autowired
public HotelmenuService hser;

@PostMapping("/savepost")
public HotelmenuModel addDetails (@RequestBody HotelmenuModel hm)
{
	return hser.saveInfo(hm);
}
@GetMapping("/gethm")
public List <HotelmenuModel> getDetails()
{
	return hser.getInfo();
}
@PutMapping("/puthm")
public HotelmenuModel updateDetails(@RequestBody HotelmenuModel menuno)
{
	return hser.updateInfo(menuno);
}
@DeleteMapping("/delhm/{cid}")
public String deleteDetails(@PathVariable ("cid") int menuno)
{
	hser.deleteInfo(menuno);
	return "Hotel number "+menuno+" is deleted";
}
@DeleteMapping("/deleteByreq")
public String deleteByRequestPara(@RequestParam ("cid") int menuno)
{
	hser.deleteInfo(menuno);
	return "Hotel number "+menuno+" is deleted";
}

@GetMapping("/sortDesc/{oname}")
public List<HotelmenuModel> sortOwner(@PathVariable("oname") String dish)
{
	return hser.sortDesc(dish);
}

@GetMapping("/sortAsc/{oname}")
public List<HotelmenuModel> sortOwnerasc(@PathVariable ("oname") String dish)
{
	return hser.sortAsc(dish);
}


@GetMapping("/pagination/{pnu}/{psize}")
public List <HotelmenuModel> paginationData(@PathVariable ("pnu") int pnu, @PathVariable("psize")int psize)
{
	return hser.paginationData(pnu, psize);
}
@DeleteMapping("/deleteStudentByName/{dish}")
public String DeleteHotelmenuBydish(@PathVariable String dish)
{
int result=hser.delete(dish)	;
if(result >0)
	return " record deleted";
else
	return "Problem occured while deleting";
}
@GetMapping("/get")
public List<HotelmenuModel>get()
{
	return hser.get();
}
@PutMapping("/update/{sh}/{no}")

public String update(@PathVariable String sh,@PathVariable int no)

{

	int result=hser.update(sh,no);

	if(result>0)

		return "Updated Successfully";

	else

		return "Problem occur while updating";

}

}
