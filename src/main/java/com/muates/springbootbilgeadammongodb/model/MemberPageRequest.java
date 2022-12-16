package com.muates.springbootbilgeadammongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberPageRequest {

    private Integer size;
    private Integer page;
}
