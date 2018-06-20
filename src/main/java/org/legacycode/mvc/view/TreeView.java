package org.legacycode.mvc.view;

import org.legacycode.mvc.controller.TreeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class TreeView extends JPanel {
    // UI COMPONENTS
    private final JTree tree;

    // INJECTED CONTROLLER
    private final TreeController controler;

    // INJECTED VIEWS
    private TreeSearchView treeSearchView;

    @Autowired
    public TreeView(TreeController controller){

        if (controller == null){
            throw new IllegalArgumentException("controller must not be null");
        }

        this.controler = controller;

        this.setLayout(new BorderLayout());

        this.tree = new JTree();

        this.add(tree, BorderLayout.CENTER);
    }

    // INJECTION METHODS

    @Autowired
    public void setTreeSearchView(TreeSearchView treeSearchView){

        if (this.treeSearchView != null){
            throw new IllegalStateException("treeSearchView can only be set once!");
        }

        this.treeSearchView = treeSearchView;
    }

    @PostConstruct
    public void arrangeView(){

        if (this.treeSearchView == null){
            throw new IllegalStateException("treeSearchView is not initialized");
        }

        this.add(this.treeSearchView, BorderLayout.PAGE_START);
    }
}
