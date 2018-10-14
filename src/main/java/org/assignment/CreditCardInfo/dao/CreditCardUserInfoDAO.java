package org.assignment.CreditCardInfo.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.assignment.CreditCardInfo.model.*;
public class CreditCardUserInfoDAO {
	private static final Map<String, CreditCardUserInfo> ccuiMap = new HashMap<String, CreditCardUserInfo>();
	 
    static {
        initCcis();
    }

    private static void initCcis() {
        CreditCardUserInfo cci1 = new CreditCardUserInfo("455561", "SS", "SAM");
        CreditCardUserInfo cci2 = new CreditCardUserInfo("387765", "VIC", "VICTORIA");
         
        ccuiMap.put(cci1.getCardid(), cci1);
        ccuiMap.put(cci2.getCardid(), cci2);
    }
 
    public static CreditCardUserInfo getCreditCardUserInfo(String Cardid) {
        return ccuiMap.get(Cardid);
    }
 
    public static CreditCardUserInfo addCreditCardUserInfo(CreditCardUserInfo ccui) {
    	CreditCardUserInfo ccuiNew = new CreditCardUserInfo(ccui.getCardid(),ccui.getNickname(), ccui.getCardholdername());
    	ccuiMap.put(ccuiNew.getCardid(), ccuiNew);
        return ccuiNew;
    }
 
    public static CreditCardUserInfo updateCreditCardUserInfo(CreditCardUserInfo cci) {
    	ccuiMap.put(cci.getCardid(), cci);
        return cci;
    }
 
    public static void deleteCreditCardUserInfo(String cardid) {
    	ccuiMap.remove(cardid);
    }
 
    public static List<CreditCardUserInfo> getAllCreditCardUserInfos() {
        Collection<CreditCardUserInfo> c = ccuiMap.values();
        List<CreditCardUserInfo> list = new ArrayList<CreditCardUserInfo>();
        list.addAll(c);
        return list;
    }
     
    List<CreditCardUserInfo> list;
}
