/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-24 23:53:57 UTC
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".buttonload {\r\n");
      out.write("    background-color: #4CAF50; /* Green background */\r\n");
      out.write("    border: none; /* Remove borders */\r\n");
      out.write("    color: white; /* White text */\r\n");
      out.write("    padding: 12px 24px; /* Some padding */\r\n");
      out.write("    font-size: 16px; /* Set a font-size */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body { padding-top: 70px; }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Baltimore Restaurants</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("      $(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("    \t\tvar s = document.getElementById('search')\r\n");
      out.write("\r\n");
      out.write("    \t \t$(\"#table\").hide();\r\n");
      out.write("    \t\t$(\"#loading-btn\").hide();\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t    $(\"#search\")\r\n");
      out.write("    \t\t    .click(\r\n");
      out.write("    \t\t\t    function() {\r\n");
      out.write("    \t\t    \t\t$(\"#addedMsg\").hide();\r\n");
      out.write("\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t\t  $.ajax({\r\n");
      out.write("    \t\t\t\t     type: \"GET\",\r\n");
      out.write("    \t\t\t\t     url: \"http://localhost:8080/BaltimoreCityData/search\",\r\n");
      out.write("    \t\t\t\t     data: { \"searchParam\": $(\"#searchText\").val() }, \r\n");
      out.write("    \t\t\t  \t\t    success : function(data) {\r\n");
      out.write("    \t\t\t  \t\t    //alert(data);\r\n");
      out.write("    \t\t\t  \t\t    \r\n");
      out.write("    \t\t\t  \t\t    \r\n");
      out.write("    \t\t\t  \t\t\tif (data) {\r\n");
      out.write("    \t\t\t  \t\t\t    var len = data.length;\r\n");
      out.write("    \t\t\t  \t\t\t    var txt = \"\";\r\n");
      out.write("    \t\t\t  \t\t\t    if (len > 0) {\r\n");
      out.write("    \t\t\t  \t\t\t\t$(\"#table\").empty();\r\n");
      out.write("    \t\t\t  \t\t\t\ttxt+=\"<tr>\"\r\n");
      out.write("    \t\t\t  \t\t\t\t\t+\"<th>Name</th>\"\r\n");
      out.write("    \t\t\t  \t\t\t\t\t+\"<th>Zipcode</th>\"\r\n");
      out.write("    \t\t\t  \t\t\t\t\t+\"<th>Neighborhood</th>\"\r\n");
      out.write("    \t\t\t  \t\t\t\t\t+\"<th>Address</th>\"\r\n");
      out.write("\r\n");
      out.write("    \t\t\t  \t\t\t\t+\"</tr>\";\r\n");
      out.write("    \t\t\t  \t\t\t\t//alert(data);\r\n");
      out.write("    \t\t\t  \t\t\t\tfor (var i = 0; i < len; i++) {\r\n");
      out.write("    \t\t\t  \t\t\t\t    \r\n");
      out.write("    \t\t\t  \t\t\t\t  txt += \"<tr><td>\"\r\n");
      out.write("    \t\t\t\t\t\t\t\t    + data[i].name\r\n");
      out.write("    \t\t\t\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("    \t\t\t\t\t\t\t\t    + data[i].zipcode\r\n");
      out.write("    \t\t\t\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("    \t\t\t\t\t\t\t\t    + data[i].neighborhood\r\n");
      out.write("    \t\t\t\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("    \t\t\t\t\t\t\t\t    +data[i].location_1_address\r\n");
      out.write("    \t\t\t\t\t\t\t\t    +\"</td><td>\"\r\n");
      out.write("    \t\t\t\t\t\t\t\t    + \"<button type=\\\"button\\\" class=\\\"btn btn-danger\\\">Delete</button></td></tr>\"\r\n");
      out.write("\r\n");
      out.write("    \t\t\t  \t\t\t\t}\r\n");
      out.write("    \t\t\t  \t\t\t\t\r\n");
      out.write("    \t\t\t  \t\t\t\tif (txt != \"\") {\r\n");
      out.write("    \t\t\t  \t\t\t\t    $(\"#table\").append(txt).show();\r\n");
      out.write("    \t\t\t  \t\t\t\t}\r\n");
      out.write("    \t\t\t  \t\t\t    }\r\n");
      out.write("    \t\t\t  \t\t\t    \r\n");
      out.write("    \t\t\t  \t\t\t    else{\r\n");
      out.write("    \t\t\t  \t\t\t    \t\r\n");
      out.write("    \t\t\t  \t\t\t    \talert(\"Sorry, No Restaurant could be found with the given name\");\r\n");
      out.write("    \t\t\t  \t\t\t    }\r\n");
      out.write("    \t\t\t  \t\t\t}\r\n");
      out.write("    \t\t\t  \t\t    \r\n");
      out.write("    \t\t\t  \t\t    \r\n");
      out.write("    \t\t\t  \t\t    \r\n");
      out.write("    \t\t\t  \t\t    }\r\n");
      out.write("    \t\t\t  \t\t    });\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#add-btn\").click(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#addedMsg\").show();\r\n");
      out.write("\r\n");
      out.write("        window.location.href = \"http://localhost:8080/BaltimoreCityData/addRestaurant\";\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $(\"#view-all-btn\")\r\n");
      out.write("\t    .click(\r\n");
      out.write("\t\t    function() {\r\n");
      out.write("\t    \t\t$(\"#addedMsg\").hide();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#loading-btn\").show();\r\n");
      out.write("\r\n");
      out.write("\t\t\t$\r\n");
      out.write("\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t    type : \"POST\",\r\n");
      out.write("\t\t\t\t    url : \"http://localhost:8080/BaltimoreCityData/ShowAllRestaurants\",\r\n");
      out.write("\t\t\t\t    dataType : \"JSON\",\r\n");
      out.write("\t\t\t\t    success : function(data) {\r\n");
      out.write("\t\t\t\t\tif (data) {\r\n");
      out.write("\t\t\t\t\t    var len = data.length;\r\n");
      out.write("\t\t\t\t\t    var txt = \"\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t    //alert(data);\r\n");
      out.write("\t\t\t\t\t    if (len > 0) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < len; i++) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    txt += \"<tr><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t    + data[i].name\r\n");
      out.write("\t\t\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t    + data[i].zipcode\r\n");
      out.write("\t\t\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t    + data[i].neighborhood\r\n");
      out.write("\t\t\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t    +data[i].location_1_address\r\n");
      out.write("\t\t\t\t\t\t\t    +\"</td><td>\"\r\n");
      out.write("\t\t\t\t\t\t\t    + \"<button type=\\\"button\\\" class=\\\"btn btn-danger\\\">Delete</button></td></tr>\"\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (txt != \"\") {\r\n");
      out.write("\t\t\t\t\t\t    $(\"#table\").append(txt).show();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t    else{\r\n");
      out.write("\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t    \talert(\"Sorry data is empty !\");\r\n");
      out.write("\t\t\t\t\t    }\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t    },\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    complete : function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$(\"#loading-btn\").hide();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t    }\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t    });\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\t function getEventTarget(e) {\r\n");
      out.write("    e = e || window.event;\r\n");
      out.write("    return e.target || e.srcElement; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("var ul = document.getElementById('filter')\r\n");
      out.write("ul.onclick = function(event) {\r\n");
      out.write("    var target = getEventTarget(event);\r\n");
      out.write("\t$(\"#addedMsg\").hide();\r\n");
      out.write("\r\n");
      out.write("    //alert(target.innerHTML);\r\n");
      out.write("    $.ajax({\r\n");
      out.write("\t     type: \"GET\",\r\n");
      out.write("\t     url: \"http://localhost:8080/BaltimoreCityData/FilterResults\",\r\n");
      out.write("\t     data: { \"filter-param\": target.innerHTML }, \r\n");
      out.write("  \t\t    success : function(data) {\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t\t//alert(data);\r\n");
      out.write("  \t\t\t\r\n");
      out.write("  \t\t\tif (data) {\r\n");
      out.write("  \t\t\t    var len = data.length;\r\n");
      out.write("  \t\t\t    var txt = \"\";\r\n");
      out.write("  \t\t\t    if (len > 0) {\r\n");
      out.write("  \t\t\t\t$(\"#table\").empty();\r\n");
      out.write("  \t\t\t\ttxt+=\"<tr>\"\r\n");
      out.write("  \t\t\t\t\t+\"<th>Name</th>\"\r\n");
      out.write("  \t\t\t\t\t+\"<th>Zipcode</th>\"\r\n");
      out.write("  \t\t\t\t\t+\"<th>Neighborhood</th>\"\r\n");
      out.write("  \t\t\t\t\t+\"<th>Address</th>\"\r\n");
      out.write("\r\n");
      out.write("  \t\t\t\t+\"</tr>\";\r\n");
      out.write("  \t\t\t\t//alert(data);\r\n");
      out.write("  \t\t\t\tfor (var i = 0; i < len; i++) {\r\n");
      out.write("  \t\t\t\t    \r\n");
      out.write("  \t\t\t\t  txt += \"<tr><td>\"\r\n");
      out.write("\t\t\t\t\t    + data[i].name\r\n");
      out.write("\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t    + data[i].zipcode\r\n");
      out.write("\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t    + data[i].neighborhood\r\n");
      out.write("\t\t\t\t\t    + \"</td><td>\"\r\n");
      out.write("\t\t\t\t\t    +data[i].location_1_address\r\n");
      out.write("\t\t\t\t\t    +\"</td><td>\"\r\n");
      out.write("\t\t\t\t\t    + \"<button type=\\\"button\\\" class=\\\"btn btn-danger\\\">Delete</button></td></tr>\"\r\n");
      out.write("\r\n");
      out.write("  \t\t\t\t}\r\n");
      out.write("  \t\t\t\t\r\n");
      out.write("  \t\t\t\tif (txt != \"\") {\r\n");
      out.write("  \t\t\t\t    $(\"#table\").append(txt).show();\r\n");
      out.write("  \t\t\t\t}\r\n");
      out.write("  \t\t\t    }\r\n");
      out.write("  \t\t\t    \r\n");
      out.write("  \t\t\t    else{\r\n");
      out.write("  \t\t\t    \t\r\n");
      out.write("  \t\t\t    \talert(\"Sorry data is empty !\")\r\n");
      out.write("  \t\t\t    }\r\n");
      out.write("  \t\t\t}\r\n");
      out.write("  \t\t    }\r\n");
      out.write("\t});\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("};\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" \t$('#table').on('click', '.btn', function(){\r\n");
      out.write("\t\t$(\"#addedMsg\").hide();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var $name = $(this).closest(\"tr\")   \r\n");
      out.write("                   .find('td:first')    \r\n");
      out.write("                   .text();   \r\n");
      out.write("\r\n");
      out.write("var $zipcode = $(this).closest(\"tr\")   \r\n");
      out.write(".find('td:eq(1)')    \r\n");
      out.write(".text(); \r\n");
      out.write("\r\n");
      out.write("var $neighborhood = $(this).closest(\"tr\")   \r\n");
      out.write(".find('td:eq(2)')    \r\n");
      out.write(".text(); \r\n");
      out.write("                   \r\n");
      out.write("\r\n");
      out.write(" // alert($name+\", \"+$zipcode) ;\r\n");
      out.write("  $(this).closest(\"tr\").remove();\r\n");
      out.write("  \r\n");
      out.write("  $.ajax({\r\n");
      out.write("\t     type: \"GET\",\r\n");
      out.write("\t     url: \"http://localhost:8080/BaltimoreCityData/deleteRestaurant\",\r\n");
      out.write("\t     data: { \"name\": $name, \"zipcode\" : $zipcode, \"neighborhood\" : $neighborhood }, // parameters,\r\n");
      out.write("\t\t    success : function(data) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert(\"Deleted\")\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t    }\r\n");
      out.write("  });\t\r\n");
      out.write("  \r\n");
      out.write("});   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \t\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("      </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Restaurants in Baltimore</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li><a href=\"javascript:;\" id=\"view-all-btn\">ViewRestaurants</a></li>\r\n");
      out.write("            <li><a href=\"javascript:;\" id=\"add-btn\">Add Your Own</a></li>\r\n");
      out.write("            <li>\r\n");
      out.write("\t\t\t\t<div class=\"dropdown\">\r\n");
      out.write("\t\t\t\t  <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\tSort By\r\n");
      out.write("\t\t\t\t\t<span class=\"caret\"></span></button>\r\n");
      out.write("\t\t\t\t  </button>\r\n");
      out.write("\t\t\t\t  <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\" id=\"filter\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">Address</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">Neighborhood</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">Zipcode</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">Name</a></li>\r\n");
      out.write("\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("          </ul>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <form class=\"navbar-form navbar-right\" action=\"javascript:;\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <input type=\"text\" placeholder=\"Search by Name\" class=\"form-control\" id=\"searchText\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\" id=\"search\">Search</button>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div style=\"text-align:center;\">\r\n");
      out.write("\t  \r\n");
      out.write("\t  <i class=\"fa fa-refresh fa-spin\" style=\"font-size:50px; width:300px; margin: 0 auto\" id=\"loading-btn\"\"></i>\r\n");
      out.write("\t  \r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<table id=\"table\" class=\"table table-striped\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t<th>Zipcode</th>\r\n");
      out.write("\t\t\t\t<th>Neighborhood</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>Address</th>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("      <h3><p style=text-align:center id=\"addedMsg\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${success}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></p></h3>\r\n");
      out.write("    \t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
