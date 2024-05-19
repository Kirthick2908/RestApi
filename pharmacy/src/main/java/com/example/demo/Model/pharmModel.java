
package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class pharmModel {
	@Id
	private int medicineno;
	private String medicinename;
	private String pharmacystorename;
    private String ownername;
    private String expdate;
    private String opentime;
    private String closetime;
	public int getMedicineno() {
		return medicineno;
	}
	public void setMedicineno(int medicineno) {
		this.medicineno = medicineno;
	}
	public String getMedicinename() {
		return medicinename;
	}
	public void setMedicinename(String medicinename) {
		this.medicinename = medicinename;
	}
	public String getPharmacystorename() {
		return pharmacystorename;
	}
	public void setPharmacystorename(String pharmacystorename) {
		this.pharmacystorename = pharmacystorename;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}
	public String getOpentime() {
		return opentime;
	}
	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}
	public String getClosetime() {
		return closetime;
	}
	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}
    
}
