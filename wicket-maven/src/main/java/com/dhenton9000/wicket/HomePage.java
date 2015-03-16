/*
 * HomePage.java
 *
 * Created on December 3, 2012, 9:50 AM
 */

package com.dhenton9000.wicket;           

import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {

    public HomePage() {
        add(new Label("message", "Hello, World!"));
    }

}
