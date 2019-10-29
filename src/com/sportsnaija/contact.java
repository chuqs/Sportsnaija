/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsnaija;

import com.codename1.messaging.Message;
import com.codename1.ui.Button;
import com.codename1.ui.Command;
import com.codename1.ui.ComponentGroup;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;

/**
 *
 * @author Uche-Pc
 */
class contact {
    private Form home;
    public void contact(){
   
            Form cf = new Form("Email Us");  
        //input text fields
        Container message = new Container(new BoxLayout(BoxLayout.Y_AXIS));        
        ComponentGroup gp = new ComponentGroup();
        message.addComponent(gp);
        
        final TextField to = new TextField("chuqs007@hotmail.com");
        to.setHint("Email Address:");
        to.setEditable(false);
        gp.addComponent(to);
        
        final TextField subject = new TextField("");
        subject.setHint("Subject");
        gp.addComponent(subject);
        
        final TextField body = new TextField("");
        body.setSingleLineTextArea(false);
        body.setRows(4);
        body.setHint("Message");
        gp.addComponent(body);
        
        ComponentGroup buttonGroup = new ComponentGroup();
        Button btn = new Button("Send");
        buttonGroup.addComponent(btn);
        message.addComponent(buttonGroup);
        btn.addActionListener((ActionListener) (ActionEvent evt) -> {
            Message msg = new Message(body.getText());
            Display.getInstance().sendMessage(new String[] {to.getText()}, subject.getText(), msg);
            });
        Command back = new Command("") {

            @Override
            public void actionPerformed(ActionEvent evt) {
              Sportsnaija sp = new Sportsnaija();
                 sp.HomeForm();
            }

        };
        Image img = FontImage.createMaterial(FontImage.MATERIAL_ARROW_BACK, UIManager.getInstance().getComponentStyle("TitleCommand"));
        back.setIcon(img);
        cf.getToolbar().addCommandToLeftBar(back);
        cf.getToolbar().setTitleCentered(true);
        cf.setBackCommand(back);
                 
    
    cf.add(message);
    cf.show();
    }
        
            }
    

