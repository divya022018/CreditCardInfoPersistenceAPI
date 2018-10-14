/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-14 08:42:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write("div {\r\n");
      out.write("    background-color: lightblue;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("    <form>\r\n");
      out.write("        <br>Display All Credit Card Users Information:\r\n");
      out.write("        <input type=\"button\" value=\"Display\" onclick=\"callAllUsers()\">\r\n");
      out.write("        </br>\r\n");
      out.write("        <br> Display User information (Enter Credit card number):\r\n");
      out.write("        \t<td><input type=\"text\" id=\"CardId1\" > </td>\r\n");
      out.write("        \t<td><input type=\"button\" value=\"Display\" onclick=\"callOneUsers()\"></td>\r\n");
      out.write("        </br>\r\n");
      out.write("        <br>Add User Information: \r\n");
      out.write("        \tCredit Card number: <td><input type=\"text\" id=\"CardId2\" ></td>\r\n");
      out.write("        \tNick name: <td><input type=\"text\" id=\"NickName\" ></td>\r\n");
      out.write("     \t\tUser name: <td><input type=\"text\" id=\"Name\" ></td>\r\n");
      out.write("     \t\t<td><input type=\"button\" value=\"Add\" onclick=\"callAddUser()\"></td>\r\n");
      out.write("        </br>\r\n");
      out.write("        <br>Display All Credit Cards:\r\n");
      out.write("        \t<input type=\"button\" value=\"Display\" onclick=\"callAll()\">\r\n");
      out.write("        </br>\r\n");
      out.write("        <br>Search Card Type & Sub Type: \r\n");
      out.write("        \tCredit card number: <td><input type=\"text\" id=\"CardId3\" ></td>\r\n");
      out.write("     \t\t<td><input type=\"button\" value=\"Display\" onclick=\"callSearchCard()\"></td>\r\n");
      out.write("        </br>\r\n");
      out.write("        <br>Add Card Information: \r\n");
      out.write("        \tCredit card number: <td><input type=\"text\" id=\"CardId4\" ></td>\r\n");
      out.write("        \tCredit card type: <td><input type=\"text\" id=\"cardtype\" ></td>\r\n");
      out.write("     \t\tCredit card sub-type: <td><input type=\"text\" id=\"subtype\" ></td>\r\n");
      out.write("     \t\t<td><input type=\"button\" value=\"Add\" onclick=\"callAddCard()\"></td>\r\n");
      out.write("        </br>\r\n");
      out.write("    </form>\r\n");
      out.write("    <div id=\"response\"></div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("        function callAllUsers() {\r\n");
      out.write("        \tvar xhttp = new XMLHttpRequest();\r\n");
      out.write("            xhttp.onreadystatechange = function() {\r\n");
      out.write("                if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("                    document.getElementById(\"response\").innerHTML = this.responseText;;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            xhttp.open(\"GET\", \"http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo\", true);\r\n");
      out.write("            xhttp.send();\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function callOneUsers() {\r\n");
      out.write("        \tvar xhttp = new XMLHttpRequest();\r\n");
      out.write("            xhttp.onreadystatechange = function() {\r\n");
      out.write("                if (this.readyState == 4 && this.status == 200) {         \t\r\n");
      out.write("                    document.getElementById(\"response\").innerHTML = this.responseText;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            var url = \"http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo/\"+ document.getElementById(\"CardId1\").value;\r\n");
      out.write("            \r\n");
      out.write("            xhttp.open(\"GET\",url , true);\r\n");
      out.write("            xhttp.send();\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function callAddUser() {\r\n");
      out.write("        \tvar data = new FormData();\r\n");
      out.write("        \tvar cardid = document.getElementById(\"CardId2\").value;\r\n");
      out.write("        \tvar nickname = document.getElementById(\"NickName\").value;\r\n");
      out.write("        \tvar username = document.getElementById(\"Name\").value;\r\n");
      out.write("        \tif(cardid===\"\"){\r\n");
      out.write("        \t\talert(\"Enter Card number\");\r\n");
      out.write("        \t\treturn;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tif(username===\"\"){\r\n");
      out.write("        \t\talert(\"Enter User Name\");\r\n");
      out.write("        \t\treturn;\r\n");
      out.write("        \t}\r\n");
      out.write("        \tdata = \"<?xml version='1.0'?><creditCardUserInfo>\"+\r\n");
      out.write("        \t\t'<cardid>'+cardid+'</cardid>';\r\n");
      out.write("        \tif(nickname !== \"\")\t{\r\n");
      out.write("        \t\tdata = data + '<nickname>'+nickname+'</nickname>';\r\n");
      out.write("        \t}\r\n");
      out.write("        \tdata = data +  '<cardholdername>'+ username +'</cardholdername>'+ '</creditCardUserInfo>';\r\n");
      out.write("        \t\t\r\n");
      out.write("        \tvar xhr = new XMLHttpRequest();\r\n");
      out.write("           \txhr.onreadystatechange = function() {\r\n");
      out.write("                if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("                \tdocument.getElementById(\"response\").innerHTML = xhr.responseText;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("        \txhr.open('POST', 'http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo'); \r\n");
      out.write("            xhr.setRequestHeader('Content-Type', 'text/xml'); \r\n");
      out.write("        \txhr.send(data);\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function callAll() {\r\n");
      out.write("        \tvar xhttp = new XMLHttpRequest();\r\n");
      out.write("            xhttp.onreadystatechange = function() {\r\n");
      out.write("                if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("                    document.getElementById(\"response\").innerHTML = this.responseText;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            xhttp.open(\"GET\", \"http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo/creditCard\", true);\r\n");
      out.write("            xhttp.send();\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function callSearchCard() {\r\n");
      out.write("        \tvar xhttp = new XMLHttpRequest();\r\n");
      out.write("            xhttp.onreadystatechange = function() {\r\n");
      out.write("                if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("                    document.getElementById(\"response\").innerHTML = this.responseText;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("            var url = \"http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo/searchCardType/\"+ document.getElementById(\"CardId3\").value;\r\n");
      out.write("            xhttp.open(\"GET\",url , true);\r\n");
      out.write("            xhttp.send();\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function callAddCard() {\r\n");
      out.write("        \tvar data = new FormData();\r\n");
      out.write("        \tvar cardid = document.getElementById(\"CardId4\").value;\r\n");
      out.write("        \tvar cardtype = document.getElementById(\"cardtype\").value;\r\n");
      out.write("        \tvar subtype = document.getElementById(\"subtype\").value;\r\n");
      out.write("        \tdata = \"<?xml version='1.0'?><creditCardInfo>\"+ '<bin>'+cardid+'</bin>';\r\n");
      out.write("        \tdata = data + '<cardsubtype>'+subtype+'</cardsubtype>';\r\n");
      out.write("        \tdata = data +  '<cardtype>'+ cardtype +'</cardtype>'+ '</creditCardInfo>';\r\n");
      out.write("        \t\t\r\n");
      out.write("        \tvar xhr = new XMLHttpRequest();\r\n");
      out.write("        \txhr.onreadystatechange = function() {\r\n");
      out.write("                if (this.readyState == 4 && this.status == 200) {\r\n");
      out.write("                \tdocument.getElementById(\"response\").innerHTML = xhr.responseText;\r\n");
      out.write("                }\r\n");
      out.write("            };\r\n");
      out.write("        \txhr.open('POST', 'http://localhost:8080/CreditCardInfoPersistenceAPI/rest/creditCardInfo/addCardType'); \r\n");
      out.write("            xhr.setRequestHeader('Content-Type', 'text/xml'); \r\n");
      out.write("        \txhr.send(data);\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}