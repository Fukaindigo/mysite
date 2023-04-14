package com.site.enitity;

import java.util.Date;

public class SiteOrder {
	private long orderId;
	private long userId;
	private long itemCode;

	private int itemPrice;
	private int itemNum;
	private int itemAmount;
	private int itemTax;

	private int status = 1;
	private Date regDate;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getItemCode() {
		return itemCode;
	}

	public void setItemCode(long itemCode) {
		this.itemCode = itemCode;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public int getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(int itemAmount) {
		this.itemAmount = itemAmount;
	}

	public int getItemTax() {
		return itemTax;
	}

	public void setItemTax(int itemTax) {
		this.itemTax = itemTax;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
