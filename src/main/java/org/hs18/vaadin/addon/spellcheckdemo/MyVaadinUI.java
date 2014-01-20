package org.hs18.vaadin.addon.spellcheckdemo;
 
import org.hs18.vaadin.spellcheck.SpellCheck;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * The Application's "main" class
 */
@Theme("spellcheckdemo")
@SuppressWarnings("serial")
public class MyVaadinUI extends UI
{
    @Override
    protected void init(VaadinRequest request) {
    	
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSizeFull();
        layout.setSpacing(true);
        setContent(layout);
        

        Label label = new Label("SpellCheck for Vaadin Demo");
        TextField field = new TextField();
        try {
			SpellCheck spellCheck = new SpellCheck();
			spellCheck.addSpellCheck(field);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        layout.addComponent(label);
        layout.addComponent(field);
        layout.setComponentAlignment(label, Alignment.MIDDLE_CENTER);
        layout.setComponentAlignment(field, Alignment.MIDDLE_CENTER);
    }
}
