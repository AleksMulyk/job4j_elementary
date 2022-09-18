package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty() || name.codePointAt(0) < 97 || name.codePointAt(0) > 122) {
            return false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                if (isSpecialSymbol(name.codePointAt(i)) || isLowerLatinLetter(name.codePointAt(i))
                        || isUpperLatinLetter(name.codePointAt(i))
                        || Character.isDigit(name.codePointAt(i))) {
                    return true;
                }

            }
        }
        return false;
    }

    public static boolean isSpecialSymbol(int code) {
            if (code == 36 || code == 95) {
                return true;
        }

        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code < 91 && code > 64) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code < 123 && code > 97) {
            return true;
        }
        return false;
    }
}
