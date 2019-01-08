package com.system.wms.pojo;

import java.util.List;

public class Staff {
    private Integer id;

    private String realname;

    private String account;

    private String password;

    private Boolean sex;

    private String phone;

    private String detail;
    
    private List<OutList> outList;
    
    private List<InList> inList;
    
    private List<LostReport> lostReports;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

	public List<InList> getInList() {
		return inList;
	}

	public void setInList(List<InList> inList) {
		this.inList = inList;
	}

	public List<OutList> getOutList() {
		return outList;
	}

	public void setOutList(List<OutList> outList) {
		this.outList = outList;
	}

	public List<LostReport> getLostReports() {
		return lostReports;
	}

	public void setLostReports(List<LostReport> lostReports) {
		this.lostReports = lostReports;
	}
}