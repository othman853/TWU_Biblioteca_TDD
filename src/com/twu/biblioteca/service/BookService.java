package com.twu.biblioteca.service;

import java.util.List;


public interface BookService<T> {

    List<T> getAll();
}
