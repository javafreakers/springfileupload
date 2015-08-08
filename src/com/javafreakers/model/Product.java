package com.javafreakers.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1573730377131288476L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_id")
	private long productIdint;

	@Column(name="product_name")
	private String productNameStr;

	@Column(name="date_of_manufacture")
	private Date domDate;

	@Column(name="date_of_expiration")
	private Date doeDate;

	@Column(name="manufacturer_name")
	private String manufacturerStr;

	@Column(name="product_image_link")
	private String documentLinkStr;

	public String getDocumentLinkStr() {
		return documentLinkStr;
	}

	public void setDocumentLinkStr(String documentLinkStr) {
		this.documentLinkStr = documentLinkStr;
	}

	public long getProductIdint() {
		return productIdint;
	}

	public void setProductIdint(long productIdint) {
		this.productIdint = productIdint;
	}

	public String getProductNameStr() {
		return productNameStr;
	}

	public void setProductNameStr(String productNameStr) {
		this.productNameStr = productNameStr;
	}

	public Date getDomDate() {
		return domDate;
	}

	public void setDomDate(Date domDate) {
		this.domDate = domDate;
	}

	public Date getDoeDate() {
		return doeDate;
	}

	public void setDoeDate(Date doeDate) {
		this.doeDate = doeDate;
	}

	public String getManufacturerStr() {
		return manufacturerStr;
	}

	public void setManufacturerStr(String manufacturerStr) {
		this.manufacturerStr = manufacturerStr;
	}
}
