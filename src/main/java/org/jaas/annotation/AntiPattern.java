package org.jaas.annotation;

import org.jaas.annotation.types.Pattern;
import org.jaas.annotation.types.Smell;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AntiPattern {

    Pattern value();

}
