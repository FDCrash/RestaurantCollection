package com.restaurant.collection.mapper;

public interface EntityMapper<E, T> {

    T toDto(E entity);

    E fromDto(T dto);

}
