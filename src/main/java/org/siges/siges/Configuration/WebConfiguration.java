package org.siges.siges.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@EnableWebMvc
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
	
	@Autowired
    private ApplicationContext applicationContext;

	public WebConfiguration() {
		super();
	}
	
		
    @Bean
    SpringResourceTemplateResolver templateResolver(){
	    SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	    templateResolver.setApplicationContext(applicationContext);
	    templateResolver.setPrefix("/templates/");
	    templateResolver.setSuffix(".html");
	    templateResolver.setTemplateMode(TemplateMode.HTML);
	    templateResolver.setCacheable(true);
	    return templateResolver;
	}

    @Bean
    SpringTemplateEngine templateEngine(){
	    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	    templateEngine.setTemplateResolver(templateResolver());
	    templateEngine.setEnableSpringELCompiler(true);
	    return templateEngine;
	}
    
    @Bean
    ThymeleafViewResolver viewResolver(){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(templateEngine());
        // NOTE 'order' and 'viewNames' are optional
        viewResolver.setOrder(1);
        viewResolver.setViewNames(new String[] {".html", ".xhtml"});
        return viewResolver;
    }


}
