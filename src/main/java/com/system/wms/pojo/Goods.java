package com.system.wms.pojo;

public class Goods {
 
    private Integer id;

    private String barcode;

    private Integer inMessageId;

    private Integer inventoryId;
    
    private InMessage inMessage;
    
    private Inventory inventory;
    

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

    public Integer getInMessageId() {
        return inMessageId;
    }

    public void setInMessageId(Integer inMessageId) {
        this.inMessageId = inMessageId;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

	public InMessage getInMessage() {
		return inMessage;
	}

	public void setInMessage(InMessage inMessage) {
		this.inMessage = inMessage;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}