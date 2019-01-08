package com.system.wms.pojo;

import java.util.Date;
import java.util.List;

public class InList {
    
    private Integer id;

    
    private Integer staffId;

    
    private Date time;

    
    private String detail;
    
    private Staff staff;
    
    private List<InMessage> inMessage;
    
    
    
	public Staff getStaff() {
		return staff;
	}


	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Integer getStaffId() {
        return staffId;
    }

    
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

   
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}