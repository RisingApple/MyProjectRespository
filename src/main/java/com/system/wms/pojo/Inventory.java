package com.system.wms.pojo;

import java.util.Date;
import java.util.List;

public class Inventory {
    private Integer id;

    private String name;

    private String model;

    private String vender;

    private String specifications;

    private Integer count;

    private Date firstInTime;

    private Date lastChangeTime;
    
    private List<Goods> goods;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender == null ? null : vender.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getFirstInTime() {
        return firstInTime;
    }

    public void setFirstInTime(Date firstInTime) {
        this.firstInTime = firstInTime;
    }

    public Date getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(Date lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }

	public List<Goods> getGoods() {
		return goods;
	}

	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
}