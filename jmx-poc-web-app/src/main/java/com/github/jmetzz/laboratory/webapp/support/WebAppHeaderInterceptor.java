package com.github.jmetzz.laboratory.webapp.support;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class WebAppHeaderInterceptor extends HandlerInterceptorAdapter {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebAppHeaderInterceptor.class);

	@Value("${service.client.id}")
	private String serviceClientId;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		LOGGER.info("Request intercepted for client id {} ", serviceClientId);

		request.setAttribute("clientId", serviceClientId);
		return super.preHandle(request, response, handler);
	}
}
