package ru.rmanokhin.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// 1 необходимо указать нашу аннотацию и тип данных к которому мы будем применять аннотацию (String) в данном случае
public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        //получаем окончание нашего Email из класса checkEmail метода value()
        endOfEmail = checkEmail.value();
    }

    @Override
    //1ый параметр это значение которое будет вводиться в наши Email, в нашу форму
    public boolean isValid(String enteredValue, ConstraintValidatorContext context) {
        //проверка всего Email на, то что в конце необходимое значение
        return enteredValue.endsWith(endOfEmail);
    }
}
