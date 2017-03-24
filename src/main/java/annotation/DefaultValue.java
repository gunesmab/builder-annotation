package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by mabocoglug on 20/03/17.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface DefaultValue {
    String value();
}
