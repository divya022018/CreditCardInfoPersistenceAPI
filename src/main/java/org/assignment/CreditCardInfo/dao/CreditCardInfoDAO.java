package org.assignment.CreditCardInfo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.assignment.CreditCardInfo.model.*;
public class CreditCardInfoDAO {
	private static final Map<String, CreditCardInfo> cciMap = new HashMap<String, CreditCardInfo>();
	 
    static {
        initCcis();
    }

    private static void initCcis() {
        CreditCardInfo cci1 = new CreditCardInfo("455561", "VISA", "DEBIT");
        CreditCardInfo cci2 = new CreditCardInfo("387765", "AMEX", "CREDIT");
        CreditCardInfo cci3 = new CreditCardInfo("454545", "VISA", "CREDIT");
        CreditCardInfo cci4 = new CreditCardInfo("444433333", "VISA", "PREMIUM CREDIT");
        CreditCardInfo cci5 = new CreditCardInfo("546626193", "MC", "BUSINESS");
 
        cciMap.put(cci1.getBin(), cci1);
        cciMap.put(cci2.getBin(), cci2);
        cciMap.put(cci3.getBin(), cci3);
        cciMap.put(cci4.getBin(), cci4);
        cciMap.put(cci5.getBin(), cci5);
    }
 
    public static CreditCardInfo getCreditCardInfo(String bin) {
        return cciMap.get(bin);
    }
    
    public static CreditCardInfo getCreditCardTypeInfo(String bin) {
    	
        if(cciMap.get(bin) !=null) {
        	return  cciMap.get(bin);
        }
        if(bin.length() >= 6) {
        	
        	for(String key : cciMap.keySet()) {
        	    if(key.length()>=6 && key.substring(0, 6).equalsIgnoreCase(bin)){
        	    	return new CreditCardInfo(bin,cciMap.get(key).getCardtype(),cciMap.get(key).getCardsubtype());
        	    }
        	}
        } 
        return new CreditCardInfo(bin,"unknown","unknown");
    }
 
    public static CreditCardInfo addCreditCardInfo(CreditCardInfo cci) {
        cciMap.put(cci.getBin(), cci);
        return cci;
    }
 
    public static CreditCardInfo updateCreditCardInfo(CreditCardInfo cci) {
        cciMap.put(cci.getBin(), cci);
        return cci;
    }
 
    public static void deleteCreditCardInfo(String bin) {
        cciMap.remove(bin);
    }
 
    public static List<CreditCardInfo> getAllCreditCardInfos() {
        Collection<CreditCardInfo> c = cciMap.values();
        List<CreditCardInfo> list = new ArrayList<CreditCardInfo>();
        list.addAll(c);
        return list;
    }
     
    List<CreditCardInfo> list;
}
