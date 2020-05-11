package pers.mingda.cleancode;

import java.util.Iterator;

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
    public static boolean getValue(ArgumentMarshaler argumentMarshaler) {
        return false;
    }

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {

    }
}
