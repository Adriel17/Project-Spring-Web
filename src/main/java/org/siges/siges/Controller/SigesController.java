package org.siges.siges.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SigesController {
	
	private static final Logger log = LoggerFactory.getLogger(SigesController.class);

	@GetMapping("/start")
	public ModelAndView vaklsjdl(){
		try { 
			ModelAndView model = new ModelAndView("main");
			return model;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}		
	}
	
	
}
