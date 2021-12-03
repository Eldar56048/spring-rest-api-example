package com.amigoscode.amigoscode.dto.group.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

import static com.amigoscode.amigoscode.constants.validation.GroupValidationConstants.*;

@Data
public class AddGroupRequestDto {

    @NotBlank(message = FIELD_GROUP_NAME_REQUIRED)
    @Length(message = FIELD_GROUP_NAME_LENGTH_MESSAGE, min = FIELD_GROUP_NAME_MIN_LENGTH_VALUE, max = FIELD_GROUP_NAME_MAX_LENGTH_VALUE)
    private String groupName;

}
