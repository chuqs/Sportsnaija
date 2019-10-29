/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportsnaija;

/**
 *
 * @author Uche-Pc
 */
public class push {
    /* public void push(){
        public Container createDemo(final Form parentForm) {
    ComponentGroup grp = new ComponentGroup();
    Button register = new Button("Register For Push");
    Button deregister = new Button("Deregister");
    Button sendPush = new Button("Send Push");
    final TextField destDevice = new TextField("");
    destDevice.setHint("Dest ID, blank for all devices");
    grp.addComponent(register);
    grp.addComponent(deregister);
    grp.addComponent(sendPush);
    grp.addComponent(destDevice);
    grp.addComponent(new Label("Id: " + com.codename1.push.Push.getDeviceKey()));
    
    register.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            Hashtable meta = new Hashtable();
            meta.put(com.codename1.push.Push.GOOGLE_PUSH_KEY, GOOGLE_AUTH_KEY);
            Display.getInstance().registerPush(meta, false);
        }
    });
    deregister.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            Display.getInstance().deregisterPush();
        }
    });
    sendPush.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            String devKey = null;
            if(destDevice.getText().length() > 0) {
                devKey = destDevice.getText();
            }
            com.codename1.push.Push.sendPushMessage("Hi Kitchen Sink users!", devKey, false, GOOGLE_SERVER_KEY, IOS_CERTIFICATE_URL, IOS_CERTIFICATE_PASSWORD);
        }
    });
    
    return grp;
}
    }
  */  
}
