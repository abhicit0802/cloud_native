package com.ibank.repositories;

import java.util.Optional;

public interface DataRepository<E, I> {
    E create(E e);

    Optional<E> findById(I id);

    E update(E e);
}
