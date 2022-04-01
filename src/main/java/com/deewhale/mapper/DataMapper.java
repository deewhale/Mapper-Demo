package com.deewhale.mapper;

import com.deewhale.pojo.BookContentInfo;
import com.deewhale.pojo.dto.BooKContentInfoDTO;
import org.mapstruct.Mapper;

@Mapper
public interface DataMapper {
    BooKContentInfoDTO booKContentInfoDTO(BookContentInfo bookContentInfo);
}
