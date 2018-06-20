package org.legacycode.mvc.view;

import org.legacycode.mvc.controller.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

@Component
public class MainView extends JFrame {
    // UI COMPONENTS
    private final JTextField textField;

    // INJECTED CONTROLLER
    private final MainController controller;

    // INJECTED VIEWS
    private TreeView treeView;

    @Autowired
    public MainView(MainController controller){

        if (controller == null){
            throw new IllegalArgumentException("controller must not be null!");
        }

        this.controller = controller;

        this.controller.registerVisibilityChanged(this::setVisible);
        this.controller.registerSizeChanged(this::setSize);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());
        Container contentPane = this.getContentPane();

        this.textField = initializeTextField();

        JMenuBar mainMenu = initializeMainMenu();
        contentPane.add(mainMenu, BorderLayout.PAGE_START);
    }

    private JMenuBar initializeMainMenu() {
        /*
         * OPEN MENU ITEM
         */
        JMenuItem openMenuItem = new JMenuItem("Open", KeyEvent.VK_O);
        openMenuItem.addActionListener(actionEvent -> this.controller.openProject());
        /*
         * OPEN MENU ITEM
         */
        JMenuItem newMenuItem = new JMenuItem("New", KeyEvent.VK_N);
        openMenuItem.addActionListener(actionEvent -> this.controller.newProject());
        /*
         * SAVE MENU ITEM
         */
        JMenuItem saveMenuItem = new JMenuItem("Save", KeyEvent.VK_S);
        saveMenuItem.addActionListener(actionEvent -> this.controller.saveProject());
        /*
         * CLOSE MENU ITEM
         */
        JMenuItem closeMenuItem = new JMenuItem("Close");
        closeMenuItem.addActionListener(actionEvent -> this.controller.closeProject());
        /*
         * CLOSE MENU ITEM
         */
        JMenuItem exitMenuItem = new JMenuItem("Exit", KeyEvent.VK_X);
        exitMenuItem.addActionListener(actionEvent -> this.controller.close());

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        fileMenu.add(openMenuItem);
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(closeMenuItem);
        fileMenu.add(new JSeparator());
        fileMenu.add(exitMenuItem);

        JMenuBar mainMenuBar = new JMenuBar();

        mainMenuBar.add(fileMenu);

        return mainMenuBar;
    }

    private JTextField initializeTextField() {
        return new JTextField();
    }

    // INJECTION METHODS

    @Autowired
    public void setTreeView(TreeView treeView){

        if (this.treeView != null){
            throw new IllegalStateException("treeView can only be set once");
        }

        this.treeView = treeView;
    }

    @PostConstruct
    public void arrangeViews(){

        if (this.treeView == null){
            throw new IllegalStateException("treeView is not initialized");
        }

        JSplitPane splitPanel =  new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, this.treeView, this.textField);

        Container contentPane = this.getContentPane();
        contentPane.add(splitPanel, BorderLayout.CENTER);

        splitPanel.setDividerLocation(0.33);
    }
}
