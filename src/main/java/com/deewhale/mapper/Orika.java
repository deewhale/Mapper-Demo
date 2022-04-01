package com.deewhale.mapper;

import com.deewhale.pojo.BookContentInfo;
import com.deewhale.pojo.dto.BooKContentInfoDTO;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.Objects;

public class Orika implements Transform {

    private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    private static Orika orika = new Orika();

    @Override
    public BooKContentInfoDTO convert(BookContentInfo data) {
        return mapperFactory.getMapperFacade().map(data, BooKContentInfoDTO.class);
    }

    private Orika() {
    }

    public static Transform getInstance() {
        if (Objects.isNull(orika)){
            orika = new Orika();
        }
        return orika;
    }
}
