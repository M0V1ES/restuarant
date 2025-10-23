package ru.liga.dto;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dish implements Serializable {

    int id;
    String name;
    ArrayList<String> ingredients;
    int cookingTime;

}
