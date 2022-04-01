package com.deewhale.mapper;

import com.deewhale.pojo.BookContentInfo;
import com.deewhale.pojo.dto.BooKContentInfoDTO;
import org.mapstruct.factory.Mappers;

import java.util.Objects;

public class MapStruct implements Transform {
    private static DataMapper dataMapper = Mappers.getMapper(DataMapper.class);

    private static MapStruct mapStruct = new MapStruct();

    @Override
    public BooKContentInfoDTO convert(BookContentInfo data) {
        return dataMapper.booKContentInfoDTO(data);
    }


    public static Transform getInstance() {
        if (Objects.isNull(mapStruct)) {
            mapStruct = new MapStruct();
        }
        return mapStruct;
    }

    private MapStruct() {
    }
}
