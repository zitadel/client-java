package com.zitadel;

public class Pair {
    private String name = "";
    private String value = "";

    public Pair(String name, String value) {
        setName(name);
        setValue(value);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (isValidString(name)) {
            return;
        }

        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    private void setValue(String value) {
        if (isValidString(value)) {
            return;
        }

        this.value = value;
    }

    private boolean isValidString(String arg) {
        return arg == null;
    }
}
