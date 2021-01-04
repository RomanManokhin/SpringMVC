package ru.rmanokhin.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//указываем к чему будет применяться данная аннотация, в данном случае к полям
@Target(ElementType.FIELD)
//Аннотация должна сохраняться до выполнения кода, самый долговечный это RUNTIME
@Retention(RetentionPolicy.RUNTIME)
//Указываем класс который будет обрабатывать эту аннотацию
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    //дефолтные значение будут затираться если в аннотации проставлено что то другое
    //дефолтное значение если в аннотации у поля не проставлено иное
    public String value() default  "xyz.com";
    //дефолтное сообщение если в аннотации у поля не проставлено иное
    public String message() default "Email must ends with xyz.com";

    //Обязательные строки для корректной работы аннотации
    public Class<?> [] groups() default {};
    public Class<? extends Payload> [] payload() default {};
}
