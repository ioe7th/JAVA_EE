/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-26 12:58:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/page.tld", Long.valueOf(1501073888396L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1496803445208L));
    _jspx_dependants.put("/WEB-INF/jsp/taglib.jsp", Long.valueOf(1501073888363L));
    _jspx_dependants.put("jar:file:/C:/Users/SKT/.gradle/caches/modules-2/files-2.1/javax.servlet/jstl/1.2/74aca283cd4f4b4f3e425f5820cda58f44409547/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!-- 设置一个项目路径的变量  -->\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- 配置分页标签   -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/html5shiv.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/respond.min.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<link href=\"static/h-ui/css/H-ui.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"static/h-ui.admin/css/H-ui.login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"static/h-ui.admin/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"lib/Hui-iconfont/1.0.8/iconfont.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<!--[if IE 6]>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("<script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<title>实验基地后台管理--黑盟</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"黑盟首创\">\r\n");
      out.write("<meta name=\"description\" content=\"中国矿业大学管理学院实验基地黑盟出品\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".code \r\n");
      out.write("{\r\n");
      out.write(" background:url(code_bg.jpg);\r\n");
      out.write(" font-family:Arial;\r\n");
      out.write(" font-style:italic;\r\n");
      out.write(" color:blue;\r\n");
      out.write(" font-size:30px;\r\n");
      out.write(" border:0;\r\n");
      out.write(" padding:-7px 4px;\r\n");
      out.write(" letter-spacing:3px;\r\n");
      out.write(" font-weight:bolder;\r\n");
      out.write(" float:left;\r\n");
      out.write(" cursor:pointer;\r\n");
      out.write(" width:150px;\r\n");
      out.write(" height:62px;\r\n");
      out.write(" line-height:62px;\r\n");
      out.write(" text-align:center;\r\n");
      out.write(" vertical-align:middle;\r\n");
      out.write("}\r\n");
      out.write("a \r\n");
      out.write("{\r\n");
      out.write(" text-decoration:none;\r\n");
      out.write(" font-size:12px;\r\n");
      out.write(" color:#288bc4;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var code;\r\n");
      out.write("function createCode() \r\n");
      out.write("{\r\n");
      out.write(" code = \"\";\r\n");
      out.write(" var codeLength = 6; //验证码的长度\r\n");
      out.write(" var checkCode = document.getElementById(\"checkCode\");\r\n");
      out.write(" var codeChars = new Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, \r\n");
      out.write("      'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',\r\n");
      out.write("      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'); //所有候选组成验证码的字符，当然也可以用中文的\r\n");
      out.write(" for(var i = 0; i < codeLength; i++) \r\n");
      out.write(" {\r\n");
      out.write("  var charNum = Math.floor(Math.random() * 52);\r\n");
      out.write("  code += codeChars[charNum];\r\n");
      out.write(" }\r\n");
      out.write(" if(checkCode) \r\n");
      out.write(" {\r\n");
      out.write("  checkCode.className = \"code\";\r\n");
      out.write("  checkCode.innerHTML = code;\r\n");
      out.write(" }\r\n");
      out.write("}\r\n");
      out.write("function validateCode() \r\n");
      out.write("{\r\n");
      out.write(" var inputCode=document.getElementById(\"inputCode\").value;\r\n");
      out.write(" if(inputCode.length <= 0) \r\n");
      out.write(" {\r\n");
      out.write("  alert(\"请输入验证码！\");\r\n");
      out.write(" }\r\n");
      out.write(" else if(inputCode.toUpperCase() != code.toUpperCase()) \r\n");
      out.write(" {\r\n");
      out.write("   alert(\"验证码输入有误！\");\r\n");
      out.write("   createCode();\r\n");
      out.write("   document.getElementById(\"inputCode\").value=\"\";\r\n");
      out.write(" }\r\n");
      out.write(" else \r\n");
      out.write(" {\r\n");
      out.write("  alert(\"验证码正确！\");\r\n");
      out.write("  document.getElementById(\"btn\").disabled=false;\r\n");
      out.write(" }   \r\n");
      out.write("}  \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<input type=\"hidden\" id=\"TenantId\" name=\"TenantId\" value=\"\" />\r\n");
      out.write("<div class=\"loginWraper\">\r\n");
      out.write("  <div id=\"loginform\" class=\"loginBox\">\r\n");
      out.write("    <form class=\"form form-horizontal\" action=\"dologin\" method=\"post\">\r\n");
      out.write("      <div class=\"row cl\">\r\n");
      out.write("        <label class=\"form-label col-xs-3\"><i class=\"Hui-iconfont\">&#xe60d;</i></label>\r\n");
      out.write("        <div class=\"formControls col-xs-8\">\r\n");
      out.write("          <input id=\"\" name=\"name\" type=\"text\" placeholder=\"用户名\" class=\"input-text size-L\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row cl\">\r\n");
      out.write("        <label class=\"form-label col-xs-3\"><i class=\"Hui-iconfont\">&#xe60e;</i></label>\r\n");
      out.write("        <div class=\"formControls col-xs-8\">\r\n");
      out.write("          <input id=\"\" name=\"password\" type=\"password\" placeholder=\"密码\" class=\"input-text size-L\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row cl\">\r\n");
      out.write("        <div class=\"formControls col-xs-8 col-xs-offset-3\">\r\n");
      out.write("          <input class=\"input-text size-L\" type=\"text\" id=\"inputCode\" placeholder=\"验证码\" onblur=\"if(this.value==''){this.value='验证码:'}\" onclick=\"if(this.value=='验证码:'){this.value='';}\" \r\n");
      out.write("           value=\"验证码:\" style=\"width:150px;\">\r\n");
      out.write("    <div  class=\"code\" id=\"checkCode\" onclick=\"createCode()\" ></div> \r\n");
      out.write("       <a id=\"kanbuq\" href=\"#\" onclick=\"createCode()\">看不清，换一张</a> </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row cl\">\r\n");
      out.write("        <div class=\"formControls col-xs-8 col-xs-offset-3\">\r\n");
      out.write("          <label for=\"online\">\r\n");
      out.write("            <input type=\"checkbox\" name=\"online\" id=\"online\" value=\"\">\r\n");
      out.write("            使我保持登录状态</label>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row cl\">\r\n");
      out.write("        <div class=\"formControls col-xs-8 col-xs-offset-3\">\r\n");
      out.write("         <input name=\"\" type=\"button\" onclick=\"validateCode()\" class=\"btn btn-success radius size-L\" value=\"&nbsp;提交验证码&nbsp;\">\r\n");
      out.write("          <input name=\"\" type=\"submit\" id=\"btn\" disabled=\"true\" class=\"btn btn-success radius size-L\" value=\"&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;\">\r\n");
      out.write("          <input name=\"\" type=\"reset\" class=\"btn btn-default radius size-L\" value=\"&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;\">\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"footer\">中国矿业大学管理学院实验基地</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"lib/jquery/1.9.1/jquery.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"static/h-ui/js/H-ui.min.js\"></script>\r\n");
      out.write("<!--此乃百度统计代码，请自行删除-->\r\n");
      out.write("<!-- <script>\r\n");
      out.write("var _hmt = _hmt || [];\r\n");
      out.write("  var hm = document.createElement(\"script\");\r\n");
      out.write("  hm.src = \"https://hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911\";\r\n");
      out.write("  var s = document.getElementsByTagName(\"script\")[0]; \r\n");
      out.write("  s.parentNode.insertBefore(hm, s);\r\n");
      out.write("})();\r\n");
      out.write("</script> -->\r\n");
      out.write("<!--/此乃百度统计代码，请自行删除-->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/taglib.jsp(5,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/jsp/taglib.jsp(5,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/taglib.jsp(5,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
