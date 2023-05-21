package com.example.hm14.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {


    @NotNull(message = "id can't be null")
    @Size(message = "have to be 3 character long")
    private int id;

    @NotEmpty(message = "name can't be null ")
    @Size(max = 3, message = "have to be 3 character long")
    private String name;

    @NotNull(message = "price can't be null")
    @Positive(message = "The number must be positive")
    private int price;

    @NotEmpty(message = "have to be 3 character long")
    @Size
    private String categoryiD;



}





