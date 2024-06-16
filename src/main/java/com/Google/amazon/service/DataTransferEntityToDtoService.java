package com.Google.amazon.service;

public interface DataTransferEntityToDtoService<E, D> {
	D convertEntityToDto(E entity);
}
