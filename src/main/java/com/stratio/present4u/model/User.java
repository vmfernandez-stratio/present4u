package com.stratio.present4u.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


///https://github.com/OKaluzny/spring-boot-rest-api-mongodb/blob/master/src/main/java/com/kaluzny/domain/Book.java
//http://mydevgeek.com/angular-4-crud-application-with-spring-boot-rest-service-part-2/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}