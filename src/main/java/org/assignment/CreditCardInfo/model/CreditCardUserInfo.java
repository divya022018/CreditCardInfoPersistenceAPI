package org.assignment.CreditCardInfo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.assignment.CreditCardInfo.dao.CreditCardInfoDAO;

@XmlRootElement(name = "creditCardUserInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCardUserInfo {
	
	private String cardid;
	private String nickname;
	private String cardtype;
	private String cardsubtype;
	private String cardholdername;
	
	public CreditCardUserInfo() {
		
	}

	public CreditCardUserInfo(String cardid, String nickname, String cardholdername) {
		super();
		this.cardid = cardid;
		this.nickname = nickname;
		this.cardholdername = cardholdername;
		CreditCardInfo cardInfo = CreditCardInfoDAO.getCreditCardTypeInfo(cardid);
		this.cardtype = cardInfo.getCardtype();
		this.cardsubtype = cardInfo.getCardsubtype();
		System.out.println("ADDED USER");
	}

	public String getCardid() {
		return cardid;
	}

	public void setCardid(String cardid) {
		this.cardid = cardid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getCardholdername() {
		return cardholdername;
	}

	public void setCardholdername(String cardholdername) {
		this.cardholdername = cardholdername;
	}

	public String getCardsubtype() {
		return cardsubtype;
	}

	public void setCardsubtype(String cardsubtype) {
		this.cardsubtype = cardsubtype;
	}
	
}
