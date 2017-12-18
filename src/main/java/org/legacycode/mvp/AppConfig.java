package org.legacycode.mvp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * This class configures the component spring scan to "org.legacycode" and it's
 * sub packages. You can configure additional spring settings here.
 * 
 * @author legacycode
 *
 */
@ComponentScan(basePackages = "org.legacycode")
@Configuration
public class AppConfig {

}
