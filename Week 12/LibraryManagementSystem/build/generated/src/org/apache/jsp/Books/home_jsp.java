package org.apache.jsp.Books;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Library Management System</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"is-preload\">\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <!-- Header -->\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <h1>\n");
      out.write("                    <a href=\"home.jsp\" id=\"logo\">Library <em>Management System</em></a>\n");
      out.write("                </h1>\n");
      out.write("\n");
      out.write("                <!-- Nav -->\n");
      out.write("                <nav id=\"nav\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"current\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"AddBook.jsp\">Add Book</a></li>\n");
      out.write("                        <li><a href=\"viewBook.jsp\">View Books</a></li>\n");
      out.write("                        <!--<li><a href=\"ViewBooks.jsp\">View Books 2</a></li>-->\n");
      out.write("                        <li><a href=\"DeleteBook.jsp\">Delete Book</a></li>\n");
      out.write("                        <li><a href=\"Issue.jsp\">Issue Book</a></li>\n");
      out.write("                        <li><a href=\"Return.jsp\">Return Book</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/Member/displaymembers.jsp\">Members</a></li>\n");
      out.write("                        <li><form action=\"");
      out.print(request.getContextPath());
      out.write("/logout\" method=\"post\"><input type=\"submit\" value=\"Logout\" id=\"logout-button\"/></form></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Banner -->\n");
      out.write("            <section id=\"banner\"></section>\n");
      out.write("\n");
      out.write("            <!-- Gigantic Heading -->\n");
      out.write("            <section class=\"wrapper style2\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <header class=\"major\">\n");
      out.write("                        <h2>THE WONDERFUL WORLD OF READING</h2>\n");
      out.write("                        <p>Current books in our catalog</p>\n");
      out.write("                    </header>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- Posts -->\n");
      out.write("            <section class=\"wrapper style1\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <section class=\"col-6 col-12-narrower\">\n");
      out.write("                            <div class=\"box post\">\n");
      out.write("                                <a href=\"#\" class=\"image left\"\n");
      out.write("                                   ><img src=\"images/book1.jpg\" alt=\"\"\n");
      out.write("                                      /></a>\n");
      out.write("                                <div class=\"inner\">\n");
      out.write("                                    <h3>The First Thing</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        Duis neque nisi, dapibus sed mattis et quis, nibh. Sed et\n");
      out.write("                                        dapibus nisl amet mattis, sed a rutrum accumsan sed.\n");
      out.write("                                        Suspendisse eu.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                        <section class=\"col-6 col-12-narrower\">\n");
      out.write("                            <div class=\"box post\">\n");
      out.write("                                <a href=\"#\" class=\"image left\"\n");
      out.write("                                   ><img src=\"images/book2.jpg\" alt=\"\"\n");
      out.write("                                      /></a>\n");
      out.write("                                <div class=\"inner\">\n");
      out.write("                                    <h3>The Second Thing</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        Duis neque nisi, dapibus sed mattis et quis, nibh. Sed et\n");
      out.write("                                        dapibus nisl amet mattis, sed a rutrum accumsan sed.\n");
      out.write("                                        Suspendisse eu.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <section class=\"col-6 col-12-narrower\">\n");
      out.write("                            <div class=\"box post\">\n");
      out.write("                                <a href=\"#\" class=\"image left\"\n");
      out.write("                                   ><img src=\"images/book3.jpg\" alt=\"\"\n");
      out.write("                                      /></a>\n");
      out.write("                                <div class=\"inner\">\n");
      out.write("                                    <h3>The Third Thing</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        Duis neque nisi, dapibus sed mattis et quis, nibh. Sed et\n");
      out.write("                                        dapibus nisl amet mattis, sed a rutrum accumsan sed.\n");
      out.write("                                        Suspendisse eu.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                        <section class=\"col-6 col-12-narrower\">\n");
      out.write("                            <div class=\"box post\">\n");
      out.write("                                <a href=\"#\" class=\"image left\"\n");
      out.write("                                   ><img src=\"images/book4.jpg\" alt=\"\"\n");
      out.write("                                      /></a>\n");
      out.write("                                <div class=\"inner\">\n");
      out.write("                                    <h3>The Fourth Thing</h3>\n");
      out.write("                                    <p>\n");
      out.write("                                        Duis neque nisi, dapibus sed mattis et quis, nibh. Sed et\n");
      out.write("                                        dapibus nisl amet mattis, sed a rutrum accumsan sed.\n");
      out.write("                                        Suspendisse eu.\n");
      out.write("                                    </p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </section>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <!-- Copyright -->\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li>&copy; Untitled. All rights reserved</li>\n");
      out.write("                    <li>Design: <a href=\"http://html5up.net\">HTML5 UP</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Scripts -->\n");
      out.write("            <script src=\"js/jquery.min.js\"></script>\n");
      out.write("            <script src=\"js/jquery.dropotron.min.js\"></script>\n");
      out.write("            <script src=\"js/browser.min.js\"></script>\n");
      out.write("            <script src=\"js/breakpoints.min.js\"></script>\n");
      out.write("            <script src=\"js/util.js\"></script>\n");
      out.write("            <script src=\"js/main.js\"></script>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
