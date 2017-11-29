package libra.framework.context;

import org.springframework.boot.env.PropertySourcesLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by li
 */
public class ContextInitializer implements ApplicationContextInitializer {

    private final List<String> propertyFileExtensions = Arrays.asList("properties", "yml", "yaml");

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        MutablePropertySources mutablePropertySources = applicationContext.getEnvironment().getPropertySources();
        PropertySourcesLoader propertySourcesLoader = new PropertySourcesLoader(mutablePropertySources);
        try {
            Resource[] propertiesResources = new PathMatchingResourcePatternResolver().getResources("classpath*:*");
            for (Resource resource : propertiesResources) {
                if (propertyFileExtensions.stream()
                        .filter(extension -> resource.getFilename().toLowerCase().endsWith("." + extension))
                        .findAny().isPresent()) {
                    propertySourcesLoader.load(resource);
                }
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
