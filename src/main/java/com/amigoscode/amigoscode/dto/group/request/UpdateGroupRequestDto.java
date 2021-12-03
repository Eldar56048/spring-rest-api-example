package com.amigoscode.amigoscode.dto.group.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import static com.amigoscode.amigoscode.constants.validation.GroupValidationConstants.*;
import static com.amigoscode.amigoscode.constants.validation.GroupValidationConstants.FIELD_GROUP_NAME_MAX_LENGTH_VALUE;

@Data
public class UpdateGroupRequestDto {

    @NotNull(message = FIELD_ID_REQUIRED)
    @Positive(message = FIELD_ID_MUST_BE_POSITIVE)
    private Long id;

    @NotBlank(message = FIELD_GROUP_NAME_REQUIRED)
    @Length(message = FIELD_GROUP_NAME_LENGTH_MESSAGE, min = FIELD_GROUP_NAME_MIN_LENGTH_VALUE, max = FIELD_GROUP_NAME_MAX_LENGTH_VALUE)
    private String groupName;

}
