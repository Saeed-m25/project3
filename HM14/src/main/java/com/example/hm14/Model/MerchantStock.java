package com.example.hm14.Model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MerchantStock {
    @NotNull(message = "id can't be null")
    @Size(message = "have to be 3 character long")
    private int id;

    @NotNull(message = "id can't be null")
    @Size(message = "have to be 3 character long")
    private  int productid;

    @NotNull(message = "id can't be null")
    @Size(message = "have to be 3 character long")
    private int merchantid;

    @NotNull(message = "id can't be null")

    private int inventory;
}
