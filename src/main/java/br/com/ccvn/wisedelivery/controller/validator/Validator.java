package br.com.ccvn.wisedelivery.controller.validator;

public interface Validator<T> {

    boolean validator(T t);
    
}