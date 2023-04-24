package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
