package storage.boot;

import libra.framework.context.BootStrap;
import libra.framework.context.ContextInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by jun
 */
@BootStrap
public class StorageBootstrap {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(StorageBootstrap.class)
                .initializers(new ContextInitializer())
                .web(true)
                .run(args);
    }
}
