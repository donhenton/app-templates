/*
 * WicketExamplePage.java
 *
 * Created on December 3, 2012, 9:50 AM
 */
 
package com.dhenton9000.wicket;           

import org.apache.wicket.markup.html.WebPage;

/** 
 *
 * @author dhenton
 * @version 
 */

public abstract class BasePage extends WebPage {

    public BasePage() { 
        super(); 
        add(new HeaderPanel("headerpanel", "Welcome To Wicket")); 
        add(new FooterPanel("footerpanel", "Powered by Wicket and the NetBeans Wicket Plugin"));
    } 

}
