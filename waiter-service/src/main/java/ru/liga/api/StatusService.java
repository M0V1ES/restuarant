package ru.liga.api;

import ru.liga.dto.Status;

public interface StatusService {
	Status get();
	Status delete(int id);
	Status update (int id, Status status);
	Status create(Status status);
}
