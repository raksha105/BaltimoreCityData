/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-07-24 23:54:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Datasetloaded_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".buttonload {\n");
      out.write("    background-color: #4CAF50; /* Green background */\n");
      out.write("    border: none; /* Remove borders */\n");
      out.write("    color: white; /* White text */\n");
      out.write("    padding: 12px 24px; /* Some padding */\n");
      out.write("    font-size: 16px; /* Set a font-size */\n");
      out.write("}\n");
      out.write("\n");
      out.write("body { padding-top: 70px; }\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js\"></script>\n");
      out.write("\t\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Baltimore Restaurants</title>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("      $(document).ready(function() {\n");
      out.write("\n");
      out.write("    \t\tvar s = document.getElementById('search')\n");
      out.write("\n");
      out.write("    \t \t$(\"#table\").hide();\n");
      out.write("    \t\t$(\"#loading-btn\").hide();\n");
      out.write("    \t\t\n");
      out.write("    \t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t    $(\"#search\")\n");
      out.write("    \t\t    .click(\n");
      out.write("    \t\t\t    function() {\n");
      out.write("    \t\t    \t\t$(\"#addedMsg\").hide();\n");
      out.write("\n");
      out.write("    \t\t\n");
      out.write("    \t\t\t\n");
      out.write("    \t\t\t  $.ajax({\n");
      out.write("    \t\t\t\t     type: \"GET\",\n");
      out.write("    \t\t\t\t     url: \"http://localhost:8080/BaltimoreCityData/search\",\n");
      out.write("    \t\t\t\t     data: { \"searchParam\": $(\"#searchText\").val() }, \n");
      out.write("    \t\t\t  \t\t    success : function(data) {\n");
      out.write("    \t\t\t  \t\t    //alert(data);\n");
      out.write("    \t\t\t  \t\t    \n");
      out.write("    \t\t\t  \t\t    \n");
      out.write("    \t\t\t  \t\t\tif (data) {\n");
      out.write("    \t\t\t  \t\t\t    var len = data.length;\n");
      out.write("    \t\t\t  \t\t\t    var txt = \"\";\n");
      out.write("    \t\t\t  \t\t\t    if (len > 0) {\n");
      out.write("    \t\t\t  \t\t\t\t$(\"#table\").empty();\n");
      out.write("    \t\t\t  \t\t\t\ttxt+=\"<tr>\"\n");
      out.write("    \t\t\t  \t\t\t\t\t+\"<th>Name</th>\"\n");
      out.write("    \t\t\t  \t\t\t\t\t+\"<th>Zipcode</th>\"\n");
      out.write("    \t\t\t  \t\t\t\t\t+\"<th>Neighborhood</th>\"\n");
      out.write("    \t\t\t  \t\t\t\t\t+\"<th>Address</th>\"\n");
      out.write("\n");
      out.write("    \t\t\t  \t\t\t\t+\"</tr>\";\n");
      out.write("    \t\t\t  \t\t\t\t//alert(data);\n");
      out.write("    \t\t\t  \t\t\t\tfor (var i = 0; i < len; i++) {\n");
      out.write("    \t\t\t  \t\t\t\t    \n");
      out.write("    \t\t\t  \t\t\t\t  txt += \"<tr><td>\"\n");
      out.write("    \t\t\t\t\t\t\t\t    + data[i].name\n");
      out.write("    \t\t\t\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("    \t\t\t\t\t\t\t\t    + data[i].zipcode\n");
      out.write("    \t\t\t\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("    \t\t\t\t\t\t\t\t    + data[i].neighborhood\n");
      out.write("    \t\t\t\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("    \t\t\t\t\t\t\t\t    +data[i].location_1_address\n");
      out.write("    \t\t\t\t\t\t\t\t    +\"</td><td>\"\n");
      out.write("    \t\t\t\t\t\t\t\t    + \"<button type=\\\"button\\\" class=\\\"btn btn-danger\\\">Delete</button></td></tr>\"\n");
      out.write("\n");
      out.write("    \t\t\t  \t\t\t\t}\n");
      out.write("    \t\t\t  \t\t\t\t\n");
      out.write("    \t\t\t  \t\t\t\tif (txt != \"\") {\n");
      out.write("    \t\t\t  \t\t\t\t    $(\"#table\").append(txt).show();\n");
      out.write("    \t\t\t  \t\t\t\t}\n");
      out.write("    \t\t\t  \t\t\t    }\n");
      out.write("    \t\t\t  \t\t\t    \n");
      out.write("    \t\t\t  \t\t\t    else{\n");
      out.write("    \t\t\t  \t\t\t    \t\n");
      out.write("    \t\t\t  \t\t\t    \talert(\"Sorry, No Restaurant could be found with the given name\");\n");
      out.write("    \t\t\t  \t\t\t    }\n");
      out.write("    \t\t\t  \t\t\t}\n");
      out.write("    \t\t\t  \t\t    \n");
      out.write("    \t\t\t  \t\t    \n");
      out.write("    \t\t\t  \t\t    \n");
      out.write("    \t\t\t  \t\t    }\n");
      out.write("    \t\t\t  \t\t    });\n");
      out.write("    \t\t\t\n");
      out.write("    \t\t\t\n");
      out.write("    \t\t});\n");
      out.write("    \t\t\n");
      out.write("    \t\t\n");
      out.write("    \t\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t$(\"#add-btn\").click(function() {\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t$(\"#addedMsg\").show();\n");
      out.write("\n");
      out.write("        window.location.href = \"http://localhost:8080/BaltimoreCityData/addRestaurant\";\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("});\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    $(\"#view-all-btn\")\n");
      out.write("\t    .click(\n");
      out.write("\t\t    function() {\n");
      out.write("\t    \t\t$(\"#addedMsg\").hide();\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t$(\"#loading-btn\").show();\n");
      out.write("\n");
      out.write("\t\t\t$\n");
      out.write("\t\t\t\t.ajax({\n");
      out.write("\t\t\t\t    type : \"POST\",\n");
      out.write("\t\t\t\t    url : \"http://localhost:8080/BaltimoreCityData/ShowAllRestaurants\",\n");
      out.write("\t\t\t\t    dataType : \"JSON\",\n");
      out.write("\t\t\t\t    success : function(data) {\n");
      out.write("\t\t\t\t\tif (data) {\n");
      out.write("\t\t\t\t\t    var len = data.length;\n");
      out.write("\t\t\t\t\t    var txt = \"\";\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t    //alert(data);\n");
      out.write("\t\t\t\t\t    if (len > 0) {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < len; i++) {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t    txt += \"<tr><td>\"\n");
      out.write("\t\t\t\t\t\t\t    + data[i].name\n");
      out.write("\t\t\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("\t\t\t\t\t\t\t    + data[i].zipcode\n");
      out.write("\t\t\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("\t\t\t\t\t\t\t    + data[i].neighborhood\n");
      out.write("\t\t\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("\t\t\t\t\t\t\t    +data[i].location_1_address\n");
      out.write("\t\t\t\t\t\t\t    +\"</td><td>\"\n");
      out.write("\t\t\t\t\t\t\t    + \"<button type=\\\"button\\\" class=\\\"btn btn-danger\\\">Delete</button></td></tr>\"\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\tif (txt != \"\") {\n");
      out.write("\t\t\t\t\t\t    $(\"#table\").append(txt).show();\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t    }\n");
      out.write("\t\t\t\t\t    \n");
      out.write("\t\t\t\t\t    else{\n");
      out.write("\t\t\t\t\t    \t\n");
      out.write("\t\t\t\t\t    \talert(\"Sorry data is empty !\");\n");
      out.write("\t\t\t\t\t    }\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t    },\n");
      out.write("\n");
      out.write("\t\t\t\t    complete : function() {\n");
      out.write("\n");
      out.write("\t\t\t\t\t$(\"#loading-btn\").hide();\n");
      out.write("\n");
      out.write("\t\t\t\t    }\n");
      out.write("\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t    });\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\t function getEventTarget(e) {\n");
      out.write("    e = e || window.event;\n");
      out.write("    return e.target || e.srcElement; \n");
      out.write("}\n");
      out.write("\n");
      out.write("var ul = document.getElementById('filter')\n");
      out.write("ul.onclick = function(event) {\n");
      out.write("    var target = getEventTarget(event);\n");
      out.write("\t$(\"#addedMsg\").hide();\n");
      out.write("\n");
      out.write("    //alert(target.innerHTML);\n");
      out.write("    $.ajax({\n");
      out.write("\t     type: \"GET\",\n");
      out.write("\t     url: \"http://localhost:8080/BaltimoreCityData/FilterResults\",\n");
      out.write("\t     data: { \"filter-param\": target.innerHTML }, \n");
      out.write("  \t\t    success : function(data) {\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t\t//alert(data);\n");
      out.write("  \t\t\t\n");
      out.write("  \t\t\tif (data) {\n");
      out.write("  \t\t\t    var len = data.length;\n");
      out.write("  \t\t\t    var txt = \"\";\n");
      out.write("  \t\t\t    if (len > 0) {\n");
      out.write("  \t\t\t\t$(\"#table\").empty();\n");
      out.write("  \t\t\t\ttxt+=\"<tr>\"\n");
      out.write("  \t\t\t\t\t+\"<th>Name</th>\"\n");
      out.write("  \t\t\t\t\t+\"<th>Zipcode</th>\"\n");
      out.write("  \t\t\t\t\t+\"<th>Neighborhood</th>\"\n");
      out.write("  \t\t\t\t\t+\"<th>Address</th>\"\n");
      out.write("\n");
      out.write("  \t\t\t\t+\"</tr>\";\n");
      out.write("  \t\t\t\t//alert(data);\n");
      out.write("  \t\t\t\tfor (var i = 0; i < len; i++) {\n");
      out.write("  \t\t\t\t    \n");
      out.write("  \t\t\t\t  txt += \"<tr><td>\"\n");
      out.write("\t\t\t\t\t    + data[i].name\n");
      out.write("\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("\t\t\t\t\t    + data[i].zipcode\n");
      out.write("\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("\t\t\t\t\t    + data[i].neighborhood\n");
      out.write("\t\t\t\t\t    + \"</td><td>\"\n");
      out.write("\t\t\t\t\t    +data[i].location_1_address\n");
      out.write("\t\t\t\t\t    +\"</td><td>\"\n");
      out.write("\t\t\t\t\t    + \"<button type=\\\"button\\\" class=\\\"btn btn-danger\\\">Delete</button></td></tr>\"\n");
      out.write("\n");
      out.write("  \t\t\t\t}\n");
      out.write("  \t\t\t\t\n");
      out.write("  \t\t\t\tif (txt != \"\") {\n");
      out.write("  \t\t\t\t    $(\"#table\").append(txt).show();\n");
      out.write("  \t\t\t\t}\n");
      out.write("  \t\t\t    }\n");
      out.write("  \t\t\t    \n");
      out.write("  \t\t\t    else{\n");
      out.write("  \t\t\t    \t\n");
      out.write("  \t\t\t    \talert(\"Sorry data is empty !\")\n");
      out.write("  \t\t\t    }\n");
      out.write("  \t\t\t}\n");
      out.write("  \t\t    }\n");
      out.write("\t});\n");
      out.write("    \n");
      out.write("    \n");
      out.write("};\n");
      out.write("    \n");
      out.write("    \n");
      out.write(" \t$('#table').on('click', '.btn', function(){\n");
      out.write("\t\t$(\"#addedMsg\").hide();\n");
      out.write("\n");
      out.write("\n");
      out.write("var $name = $(this).closest(\"tr\")   \n");
      out.write("                   .find('td:first')    \n");
      out.write("                   .text();   \n");
      out.write("\n");
      out.write("var $zipcode = $(this).closest(\"tr\")   \n");
      out.write(".find('td:eq(1)')    \n");
      out.write(".text(); \n");
      out.write("\n");
      out.write("var $neighborhood = $(this).closest(\"tr\")   \n");
      out.write(".find('td:eq(2)')    \n");
      out.write(".text(); \n");
      out.write("                   \n");
      out.write("\n");
      out.write(" // alert($name+\", \"+$zipcode) ;\n");
      out.write("  $(this).closest(\"tr\").remove();\n");
      out.write("  \n");
      out.write("  $.ajax({\n");
      out.write("\t     type: \"GET\",\n");
      out.write("\t     url: \"http://localhost:8080/BaltimoreCityData/deleteRestaurant\",\n");
      out.write("\t     data: { \"name\": $name, \"zipcode\" : $zipcode, \"neighborhood\" : $neighborhood }, // parameters,\n");
      out.write("\t\t    success : function(data) {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\talert(\"Deleted\")\n");
      out.write("\t\t\t\n");
      out.write("\t\t    }\n");
      out.write("  });\t\n");
      out.write("  \n");
      out.write("});   \n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write(" \t\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("      </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Restaurants in Baltimore</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("            <li><a href=\"javascript:;\" id=\"view-all-btn\">ViewRestaurants</a></li>\n");
      out.write("            <li><a href=\"javascript:;\" id=\"add-btn\">Add Your Own</a></li>\n");
      out.write("            <li>\n");
      out.write("\t\t\t\t<div class=\"dropdown\">\n");
      out.write("\t\t\t\t  <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("\t\t\t\t\tSort By\n");
      out.write("\t\t\t\t\t<span class=\"caret\"></span></button>\n");
      out.write("\t\t\t\t  </button>\n");
      out.write("\t\t\t\t  <ul class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\" id=\"filter\">\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">Address</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">Neighborhood</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">Zipcode</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"javascript:;\">Name</a></li>\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("          </ul>\n");
      out.write("\t\t  \n");
      out.write("\t\t  <form class=\"navbar-form navbar-right\" action=\"javascript:;\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" placeholder=\"Search by Name\" class=\"form-control\" id=\"searchText\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\" id=\"search\">Search</button>\n");
      out.write("          </form>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div style=\"text-align:center;\">\n");
      out.write("\t  \n");
      out.write("\t  <i class=\"fa fa-refresh fa-spin\" style=\"font-size:50px; width:300px; margin: 0 auto\" id=\"loading-btn\"\"></i>\n");
      out.write("\t  \n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<table id=\"table\" class=\"table table-striped\">\n");
      out.write("\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<th>Name</th>\n");
      out.write("\t\t\t\t<th>Zipcode</th>\n");
      out.write("\t\t\t\t<th>Neighborhood</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th>Address</th>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("      <h3><p style=text-align:center id=\"addedMsg\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${success}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></p></h3>\n");
      out.write("    \t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
