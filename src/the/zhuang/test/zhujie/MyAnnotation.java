package the.zhuang.test.zhujie;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface MyAnnotation {
    String value() default "hi";
}
