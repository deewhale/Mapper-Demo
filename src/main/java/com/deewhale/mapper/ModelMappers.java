package com.deewhale.mapper;

import com.deewhale.pojo.BookContentInfo;
import com.deewhale.pojo.dto.BooKContentInfoDTO;
import org.modelmapper.ModelMapper;

import java.util.Objects;

public class ModelMappers implements Transform{
    private static ModelMapper mapper = new ModelMapper();
    private static ModelMappers modelMappers = new ModelMappers();

    @Override
    public BooKContentInfoDTO convert(BookContentInfo data) {
        return mapper.map(data,BooKContentInfoDTO.class);
    }

    private ModelMappers(){}


    public static Transform getInstance() {
        if (Objects.isNull(modelMappers)){
            modelMappers = new ModelMappers();
        }
        return modelMappers;
    }
}
