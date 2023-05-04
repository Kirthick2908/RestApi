package com.example.demo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.HotelmenuLoginmod;
import com.example.demo.Repository.HotelmenuLoginrepo;

@Service

public class HotelmenuLoginser {
	@Autowired
	private HotelmenuLoginrepo lrepo;
	public String checkLogin(String usrname,String psword)
	{
		HotelmenuLoginmod user= lrepo.findByusrname(usrname);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPsword().equals(psword))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	} 
	public HotelmenuLoginmod addUser(HotelmenuLoginmod cl)
	{
		return lrepo.save(cl);
	}
	public List <HotelmenuLoginmod> getUser()
	{
		return lrepo.findAll();
	}

}
