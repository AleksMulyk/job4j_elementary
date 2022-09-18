package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        for (int i = 0; i < name.length(); i++) {
            return (name.codePointAt(0) > 97 && name.codePointAt(0) < 122)
                    && (isSpecialSymbol(name.codePointAt(i))
                    || isUpperLatinLetter(name.codePointAt(i)) || isLowerLatinLetter(name.codePointAt(i)));
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
