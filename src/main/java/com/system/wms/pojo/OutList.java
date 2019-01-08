package com.system.wms.pojo;

import java.util.Date;
import java.util.List;

public class OutList {
   
    private Integer id;

    private Integer staffId;

    private String sendeeName;

    private Date time;

    private String detail;
    
    private Staff staff;
    
    private List<OutMessage> outMessages;
    
    

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

    public String getSendeeName() {
        return sendeeName;
    }

    public void setSendeeName(String sendeeName) {
        this.sendeeName = sendeeName == null ? null : sendeeName.trim();
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

	public List<OutMessage> getOutMessages() {
		return outMessages;
	}

	public void setOutMessages(List<OutMessage> outMessages) {
		this.outMessages = outMessages;
	}
}