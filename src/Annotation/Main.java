package Annotation;

import java.io.IOException;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        User user = new User(1,"Test", "test@gmail.com" );
        System.out.println(user);

        //5) Виколикаємо анотацію.
        //Передаємо в хендлер класс нашого юхера через getClass()
//        handlerEmailValidator(user.getClass());
        handlerNameValidator(user);

    }


    //4) Описуємо її поведінку
    // Передаємо класс Class(будь який клас) з імям clazz.
//    public static void handlerEmailValidator(Class clazz) throws IllegalAccessException {
//        //Створюю масив полів і присвоюю їм всі описані поля нашого переданого класу
//        Field[] fields = clazz.getDeclaredFields();
//        //Ітерую всі поля
//        for (Field field : fields) {
//            // Можливість діставатись до приватних полів
//            field.setAccessible(true);
//            // Якщо аннотація присутня, то ...
//            if (field.isAnnotationPresent(EnailValidator.class)){
//                //
//                String s = (String) field.get(clazz);
//                if (s.contains("test")){
//                    System.out.println("error");
//                }
//
//            }
//        }
//        }

        public static void handlerNameValidator(User user) throws IllegalAccessException {
        Class clazz = user.getClass();
        Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(NameValidator.class)) {
                    String s = (String) field.get(clazz);
                    if (s.contains("est")) {
                        System.out.println("erroe");
                    }
                }
            }

        }
    }
