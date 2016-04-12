package com.the3xcollector.ui;

import com.the3xcollector.service.HelloService;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.springframework.beans.factory.annotation.Autowired;

@Theme("valo")
@SpringUI(path = "")
public class Hello extends UI {

    @Autowired
    HelloService myService;

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label(myService.index()));
    }
}
