package com.jpabooks.base;


import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public abstract class BaseDTO<ID> {
    private ID id;

    private String statusCode;

    private boolean isDeleted;

}
