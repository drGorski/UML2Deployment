package pl.gdynia.amw.annotation;

import pl.gdynia.amw.dictionary.TaggedValues;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface TaggedValue {

    TaggedValues taggedValue();

}
