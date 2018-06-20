package org.legacycode.mvc;

import org.legacycode.mvc.controller.MainController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.legacycode.mvc")
public class Application {

    public static void main(String[] args){
        ApplicationContext context = null;
        try {
            context = new AnnotationConfigApplicationContext(Application.class);
            MainController controller = context.getBean(MainController.class);

            controller.setSize(1024, 768);
            controller.open();

        } finally{
            if (context != null) {
                ((AnnotationConfigApplicationContext) context).destroy();
            }
        }
    }
}
