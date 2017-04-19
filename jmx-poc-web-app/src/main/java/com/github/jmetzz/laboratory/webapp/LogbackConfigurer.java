package com.github.jmetzz.laboratory.webapp;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;

public class LogbackConfigurer implements ServletContextListener,
		HttpSessionListener, HttpSessionAttributeListener {


    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackConfigurer.class);

	// Public constructor is required by servlet spec
	public LogbackConfigurer() {
	}

	// -------------------------------------------------------
	// ServletContextListener implementation
	// -------------------------------------------------------
	public void contextInitialized(ServletContextEvent sce) {
		/*
		 * This method is called when the servlet context is initialized(when the Web application is deployed). You can
		 * initialize servlet context related data here.
		 */

		LOGGER.info("LogBack configured ;)");

	}

	public void contextDestroyed(ServletContextEvent sce) {
		/*
		 * This method is invoked when the Servlet Context (the Web application) is undeployed or Application Server
		 * shuts down.
		 */
		LOGGER.info("Cleaning up LogBack context ;)");

		LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		lc.stop();
	}

	// -------------------------------------------------------
	// HttpSessionListener implementation
	// -------------------------------------------------------
	public void sessionCreated(HttpSessionEvent se) {
		/* Session is created. */
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		/* Session is destroyed. */
	}

	// -------------------------------------------------------
	// HttpSessionAttributeListener implementation
	// -------------------------------------------------------

	public void attributeAdded(HttpSessionBindingEvent sbe) {
		/*
		 * This method is called when an attribute is added to a session.
		 */
	}

	public void attributeRemoved(HttpSessionBindingEvent sbe) {
		/*
		 * This method is called when an attribute is removed from a session.
		 */
	}

	public void attributeReplaced(HttpSessionBindingEvent sbe) {
		/*
		 * This method is invoked when an attribute is replaced in a session.
		 */
	}
}
