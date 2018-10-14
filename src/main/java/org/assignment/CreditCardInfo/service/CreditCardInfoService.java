package org.assignment.CreditCardInfo.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.assignment.CreditCardInfo.dao.CreditCardInfoDAO;
import org.assignment.CreditCardInfo.dao.CreditCardUserInfoDAO;
import org.assignment.CreditCardInfo.model.CreditCardInfo;
import org.assignment.CreditCardInfo.model.CreditCardUserInfo;

@Path("/creditCardInfo")
public class CreditCardInfoService {

	    // URI:
	    // /contextPath/servletPath/creditCardInfos
	    @GET
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public List<CreditCardUserInfo> getCreditCardInfos_JSON() {
	        List<CreditCardUserInfo> listOfUsers = CreditCardUserInfoDAO.getAllCreditCardUserInfos();
	        return listOfUsers;
	    }
	    
	    // URI:
	    // /contextPath/servletPath/creditCardInfos/{bin}
	    @GET
	    @Path("/{cardid}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public CreditCardUserInfo getCreditCardUserInfo(@PathParam("cardid") String cardid) {
	        return CreditCardUserInfoDAO.getCreditCardUserInfo(cardid);
	    }

	    // URI:
	    // /contextPath/servletPath/creditCardInfos
	    @POST
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public CreditCardUserInfo addCreditCardUserInfo(CreditCardUserInfo ccui) {
	        return CreditCardUserInfoDAO.addCreditCardUserInfo(ccui);
	    }
	 
	    // URI:
	    // /contextPath/servletPath/creditCardInfos
	    @PUT
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public CreditCardUserInfo updateCreditCardUserInfo(CreditCardUserInfo ccui) {
	        return CreditCardUserInfoDAO.updateCreditCardUserInfo(ccui);
	    }
	 
	    @DELETE
	    @Path("/{bin}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public void deleteCreditCardUserInfo(@PathParam("cardid") String cardid) {
	        CreditCardUserInfoDAO.deleteCreditCardUserInfo(cardid);
	    }
	    
	    // URI:
	    // /contextPath/servletPath/creditCardInfos/creditCard
	    @GET
	    @Path("/creditCard")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public List<CreditCardInfo> getCreditCards_JSON() {
	        List<CreditCardInfo> listOfCards = CreditCardInfoDAO.getAllCreditCardInfos();
	        return listOfCards;
	    }
	    
	    // URI:
	    // /contextPath/servletPath/creditCardInfos/{bin}
	    @GET
	    @Path("/creditCard/{bin}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public CreditCardInfo getCreditCardInfo(@PathParam("bin") String bin) {
	        return CreditCardInfoDAO.getCreditCardInfo(bin);
	    }
	    // URI:
	    // /contextPath/servletPath/creditCardInfos/searchCardType/{bin}
	    @GET
	    @Path("/searchCardType/{bin}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public CreditCardInfo getCreditCardInfoSearch(@PathParam("bin") String bin) {
	        return CreditCardInfoDAO.getCreditCardTypeInfo(bin);
	    }
	 
	    // URI:
	    // /contextPath/servletPath/creditCardInfos/addCardType
	    @POST
	    @Path("/addCardType")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public CreditCardInfo addCreditCardInfo(CreditCardInfo cci) {
	        return CreditCardInfoDAO.addCreditCardInfo(cci);
	    }
}
