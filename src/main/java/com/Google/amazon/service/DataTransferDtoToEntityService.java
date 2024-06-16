package com.Google.amazon.service;

public interface DataTransferDtoToEntityService<D, E> {
	
	E convertDtoToEntity(D dto);
}
