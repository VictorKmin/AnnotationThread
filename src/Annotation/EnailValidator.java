package Annotation;
 // 1) Створюємо анотацію
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//2) Вказуємо області видимості і таргети
//Анотація буде дійсна тільки під час виконання програми
@Retention(RetentionPolicy.RUNTIME)
// Анотація буде використовуватись над полем
@Target(ElementType.FIELD)
public @interface EnailValidator {
}
