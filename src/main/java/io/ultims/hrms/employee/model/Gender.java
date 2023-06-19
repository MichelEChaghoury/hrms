package io.ultims.hrms.employee.model;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("M"),
    FEMALE("F");

    private final String code;

    Gender(final String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

}
