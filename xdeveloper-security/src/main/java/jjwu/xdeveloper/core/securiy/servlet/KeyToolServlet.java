package jjwu.xdeveloper.core.securiy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jjwu.xdeveloper.core.securiy.checksign.SignUtil;
import jjwu.xdeveloper.core.securiy.key.MasterKeyUtil;

public class KeyToolServlet extends HttpServlet {
	private static final long serialVersionUID = 349539552173687670L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ServletContext context = getServletContext();
		String encCheckKey = context.getInitParameter("checkKey");
		if (encCheckKey != null) {
			SignUtil.setCheckKey(MasterKeyUtil.decKey(encCheckKey));
		}
		String timeout = context.getInitParameter("checkKeyTimeout");
		if (timeout != null)
			SignUtil.setTimeout(Long.valueOf(timeout).longValue());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print(output(null));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String key = req.getParameter("key");
		if (key == null) {
			out.print(output("Error:Please Input Key"));
			return;
		}
		String encKey = MasterKeyUtil.encKey(key);
		out.print(output("Encrypted Key is:  <span style='color:ff0000;'>" + encKey + "</span>"));
	}

	private String output(String message) {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>KeyTool</title></head><body><form action=\"keytool\" method=\"post\">");
		sb.append("<table><tr>");
		sb.append("<td>Please Input Key:</td>");
		sb.append("<td><input type=\"textfield\" name=\"key\"></td>");
		sb.append("</tr><tr>");
		sb.append("<td><input type=\"submit\"></td>");
		sb.append("</tr></table>");
		if (message != null) {
			sb.append("<div>" + message + "</div>");
		}
		sb.append("</form></body></html>");
		return sb.toString();
	}
}