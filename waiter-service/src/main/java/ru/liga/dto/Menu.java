package ru.liga.dto;

import java.io.Serializable;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu implements Serializable{

	 int id;
	 String name;
	 float price;

}
