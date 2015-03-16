package com.dhenton9000.spring.mvc.controllers;

import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.apache.log4j.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * The controller for the homepage
 * @author Don
 *
 */
@Controller
public class HomePageController {
	
	
	
	private static Logger log = LogManager.getLogger(HomePageController.class);
	
	 
	
	    /**
     * To handle the regular request to the application context. e.g.
     * http://localhost:8080/learn-websockets-1
     * 
     * @param model
     * @param locale
     * @return
     */
    @RequestMapping("/")
    public ModelAndView handleIndexPage(Model model, Locale locale) {
        log.info("Request for default / url processed ");
        return new ModelAndView("tiles.login");
    }

    /**
     * Method is executed when there is a call to the <code>/logoutPage</code>
     * url.
     * 
     * @return
     */
    @RequestMapping(value = "/logoutPage", method = RequestMethod.GET)
    public ModelAndView logoutPage() {
        log.info("Request for /logoutPage url processed");
        return new ModelAndView("tiles.logout");
    }

    /**
     * Method is executed when there is a call to the <code>/loginPage</code>
     * url. On successful login, the user is re-directed to the
     * <code>/secured/myPage</code> url.
     * 
     * @return
     */
    @RequestMapping(value = "/loginPage", method = RequestMethod.GET)
    public String loginPage() {
        log.info("Request for /loginPage url processed");
        return "tiles.login";
    }
	
     @RequestMapping(value = "/secured/securedSample", method = RequestMethod.GET)
     public String securedHomePage() {
        log.info("Request for secure page home url processed");
        return "tiles.securedSample";
    }
    
    
}
