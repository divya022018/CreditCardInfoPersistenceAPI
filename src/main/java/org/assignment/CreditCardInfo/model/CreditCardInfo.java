package org.assignment.CreditCardInfo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "creditCardInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCardInfo {
	
	private String bin;
	private String cardtype;
	private String cardsubtype;
	
	public CreditCardInfo() {
		
	}
	
	public CreditCardInfo(String bin, String cardtype, String cardsubtype) {
		super();
		this.bin = bin;
		this.cardtype = cardtype;
		this.cardsubtype = cardsubtype;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getCardsubtype() {
		return cardsubtype;
	}
	public void setCardsubtype(String cardsubtype) {
		this.cardsubtype = cardsubtype;
	}
}
