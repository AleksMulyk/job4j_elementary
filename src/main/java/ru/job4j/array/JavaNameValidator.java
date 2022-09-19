package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean rsl = true;
        if (name.isEmpty() || (name.codePointAt(0) < 97 || name.codePointAt(0) > 122)) {
            rsl = false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                if (rsl != (isSpecialSymbol(name.codePointAt(i)) || isLowerLatinLetter(name.codePointAt(i))
                        || isUpperLatinLetter(name.codePointAt(i)) || Character.isDigit(name.charAt(i)))) {
                    rsl = false;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code < 91 && code > 64;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code < 123 && code > 97;
    }
}
