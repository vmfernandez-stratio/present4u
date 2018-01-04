package com.stratio.present4u.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiParam;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


///https://github.com/OKaluzny/spring-boot-rest-api-mongodb/blob/master/src/main/java/com/kaluzny/domain/Book.java

@Data
@NoArgsConstructor
@Document(collection = "Employee")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee {


    @NotNull
    @ApiParam(required = true)
    private Long employeeid;

    private String firstname;
    private String lastname1;

}

