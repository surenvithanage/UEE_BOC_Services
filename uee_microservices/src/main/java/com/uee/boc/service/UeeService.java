package com.uee.boc.service;

import java.util.List;

public interface UeeService<T, U> {
	public T add(U u);

	public List<T> getAll();

	public T getById(Long id);

	public boolean deleteById(Long id);
}
