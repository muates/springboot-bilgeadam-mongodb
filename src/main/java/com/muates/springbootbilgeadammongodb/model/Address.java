package com.muates.springbootbilgeadammongodb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    private String country;
    private String city;
    private String neighbourhood;
    private String street;
}
