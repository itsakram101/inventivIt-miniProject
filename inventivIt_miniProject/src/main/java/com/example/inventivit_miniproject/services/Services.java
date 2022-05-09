package com.example.inventivit_miniproject.services;

public interface Services<T> {
    T get(Long id);
    T add(T t);
    T edit(T t);
    boolean delete(T t);
}
