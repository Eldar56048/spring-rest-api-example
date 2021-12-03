package com.amigoscode.amigoscode.facade.base;

import java.util.List;

public interface BaseFacade<Model, AddDto, UpdateDto, ResponseDto>{
    ResponseDto modelToResponseDto(Model model);
    List<ResponseDto> modelListToResponseDtoList(List<Model> modelList);
    Model addDtoToModel(AddDto addDto);
    Model updateDtoToModel(Model model, UpdateDto updateDto);
}
