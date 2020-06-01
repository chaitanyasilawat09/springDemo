package annotation.required_annotation;

import java.util.Properties;

public enum ApplicationProperty {
    INSTANCE;

    private final Properties properties;

    ApplicationProperty() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getName(){
        return properties.getProperty("name");
    }

}
