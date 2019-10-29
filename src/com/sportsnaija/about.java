/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsnaija;

import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.UIManager;

/**
 *
 * @author Uche-Pc
 */
class about {
     private Form home;
    public void about(){
    Form about = new Form("About");
    Label p = new Label("Developer: Topchuqs Tech Solutions");
       p.setUIID("SplashSubTitle");
    
       Label p2 = new Label("Version: 1.0.1");
       p2.setUIID("SplashSubTitle");
    
   Container c = new Container( new BorderLayout());
c.setScrollVisible(true);
c.addComponent(BorderLayout.SOUTH,p);
c.addComponent(BorderLayout.NORTH,p2);
    about.add(c);
    setBackCommand(about); 
    about.show();
        
            }
    
    
    //back command
     protected void setBackCommand(Form f) {
        Command back = new Command("") {

            @Override
            public void actionPerformed(ActionEvent evt) {
                Sportsnaija sp = new Sportsnaija();
               sp.HomeForm();
            }

        };
        Image img = FontImage.createMaterial(FontImage.MATERIAL_ARROW_BACK, UIManager.getInstance().getComponentStyle("TitleCommand"));
        back.setIcon(img);
        f.getToolbar().addCommandToLeftBar(back);
        f.getToolbar().setTitleCentered(true);
        f.setBackCommand(back);
    }
    
}
