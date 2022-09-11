package com.muratkistan.ft.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.muratkistan.ft.entity.ProductComment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Long id;

    @NotNull
    @Size(max = 50)
    private String firstName;

    @NotNull
    @Size(max = 50)
    private String lastName;

    @NotNull
    @Size(max = 50)
    private String email;

    @NotNull
    @Size(max = 15)
    private String phone;

    @JsonIgnore
    private List<ProductComment> productComment;
}
