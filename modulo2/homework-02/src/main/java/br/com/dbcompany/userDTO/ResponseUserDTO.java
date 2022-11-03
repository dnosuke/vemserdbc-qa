package br.com.dbcompany.userDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties
public class ResponseUserDTO {
    private String code;
    private String type;
    private String message;
}
