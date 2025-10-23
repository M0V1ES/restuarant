package ru.liga.services;

import ru.liga.api.StatusService;
import ru.liga.dto.Status;

public class StatusServiceImpl implements StatusService {
	@Override
	public Status get() {
		Status status = new Status();
		status.setId(1);
		status.setName("Готовится");
		return status;
	}

	@Override
	public Status delete(int id) {
		return new Status(id, "Удалено");
	}

	@Override
	public Status update(int id, Status status) {
		if (status.getName().isEmpty()){
			throw new NullPointerException("Проверьте правильность заполнения данных и повторите попытку.");
		}
		return status;
	}

	@Override
	public Status create(Status status) {
		if (status.getName().isEmpty()){
			throw new NullPointerException("Проверьте правильность заполнения данных и повторите попытку.");
		}
		return status;
	}
}
