package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] codes = name.toCharArray();
        if (name.isEmpty() || codes[0] < 'a' || codes[0] > 'z') {
            return false;
        } else {
            for (int i = 1; i < codes.length; i++) {
                if (isSpecialSymbol(name.codePointAt(i)) || isLowerLatinLetter(name.codePointAt(i))
                        || isUpperLatinLetter(name.codePointAt(i))
                        || Character.isDigit(codes[i])) {
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
