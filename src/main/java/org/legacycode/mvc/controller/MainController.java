package org.legacycode.mvc.controller;

import org.legacycode.mvc.functional.SizeChangedHandler;
import org.legacycode.mvc.functional.VisibilityChangedHandler;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class MainController implements Serializable {

    private static final long serialVersionUID = -2034657384563645959L;

    private transient SizeChangedHandler sizeChangedHandler;
    private transient VisibilityChangedHandler visibilityHandler;

    public void registerSizeChanged(SizeChangedHandler handler) {
        this.sizeChangedHandler = handler;
    }

    public void registerVisibilityChanged(VisibilityChangedHandler handler) {
        this.visibilityHandler = handler;
    }

    protected void setVisible(boolean visible) {
        if (visibilityHandler != null){
            visibilityHandler.setVisible(visible);
        }
    }

    public void setSize(int height, int width) {
        if (this.sizeChangedHandler != null){
            this.sizeChangedHandler.setSize(height, width);
        }
    }

    public void openProject() {

    }

    public void newProject (){

    }

    public void saveProject() {

    }

    public void closeProject() {

    }

    public void close() {
        this.setVisible(false);
    }

    public void open(){
        this.setVisible(true);
    }
}
