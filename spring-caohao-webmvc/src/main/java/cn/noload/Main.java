package cn.noload;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
 * @author hao.caosh@ttpai.cn
 * @date 2020-01-10 11:29
 */
public class Main {

	public static void main(String[] args) throws ServletException, LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(10000);
		tomcat.getHost().setAppBase(".");
		tomcat.addWebapp("/", ".");
		tomcat.start();
		tomcat.getServer().await();
	}
}
