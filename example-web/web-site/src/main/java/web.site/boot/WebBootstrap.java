package web.site.boot;

import libra.framework.context.BootStrap;
import libra.framework.context.ContextInitializer;
import mail.api.service.MailService;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import storage.api.service.StorageService;
import web.service.boot.CloudWebServiceConfig;

/**
 * Created by jun.
 */
@BootStrap
@EnableEurekaClient
@EnableFeignClients(basePackageClasses = {MailService.class, StorageService.class})
@ComponentScan(basePackageClasses = {WebBootstrap.class, CloudWebServiceConfig.class})
public class WebBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(WebBootstrap.class)
                .initializers(new ContextInitializer())
                .web(true)
                .run(args);
    }
}
