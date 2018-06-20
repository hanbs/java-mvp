package org.legacycode.mvc.view;

import org.legacycode.mvc.controller.TreeSearchController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;

import java.awt.*;

@Component
public class TreeSearchView extends JPanel {
    // UI COMPONENTS
    private TreeSearchController controller;

    // INJECTED CONTROLLER

    // INJECTED VIEWS

    @Autowired
    public  TreeSearchView(TreeSearchController controller){

        if (controller == null){
            throw new IllegalArgumentException("controller must not be null");
        }

        this.controller = controller;

        this.setLayout(new BorderLayout());

        this.add(new TextField(), BorderLayout.CENTER);
        this.add(new JButton("Search"), BorderLayout.LINE_END);
    }

    // INJECTION METHODS

    @PostConstruct
    public void arrangeView() {

    }
}
