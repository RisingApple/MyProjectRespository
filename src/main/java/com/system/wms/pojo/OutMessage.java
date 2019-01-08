package com.system.wms.pojo;

public class OutMessage {
  
    private Integer id;

    
    private String barcode;

    private Integer listId;

    private Integer goodsId;

    private OutList outList;
    
    
    
    public OutList getOutList() {
		return outList;
	}

	public void setOutList(OutList outList) {
		this.outList = outList;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
}