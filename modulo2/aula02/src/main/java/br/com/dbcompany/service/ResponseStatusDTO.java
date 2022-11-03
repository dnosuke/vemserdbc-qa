package br.com.dbcompany.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class ResponseStatusDTO {
    private String statusCode;
}
