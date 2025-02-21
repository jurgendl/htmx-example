package com.example.htmx;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class HtmxApplicationErrorController {
	private final BasicErrorController basicErrorController;

	public HtmxApplicationErrorController(final BasicErrorController basicErrorController) {
		this.basicErrorController = basicErrorController;
	}

	//@RequestMapping(value = "${server.error.path:${error.path:/error}}", headers = "HX-Request=true")
	//@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView errorHtmx(final HttpServletRequest request,
	                              final HttpServletResponse response) {
		return basicErrorController.errorHtml(request, response);
	}
}
