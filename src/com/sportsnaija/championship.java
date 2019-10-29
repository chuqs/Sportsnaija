package com.sportsnaija;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.codename1.ui.BrowserComponent;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;

/**
 *
 * @author Uche-Pc
 */
public class championship {

     public void championship(){
     Form form2 = new Form("Championship");
        Container wbt = new Container(new BoxLayout(BoxLayout.Y_AXIS));
        
        BrowserComponent wb1 = new  BrowserComponent();
        wb1.setURL("https://sportnaija.net/category/competitions/");
        
        
        wbt.addComponent(wb1);
        form2.add(wbt);
        setBackCommand(form2);
        form2.show();
        

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
