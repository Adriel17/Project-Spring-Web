package org.siges.siges.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller("/siges")
public class SigesController {

	@GetMapping
	public @ResponseBody String vaklsjdl(){
		try {
			return "Hello World!!";
		} catch (Exception e) {
			return "Como assim deu erro?";
		}		
	}
	
	
	
}
