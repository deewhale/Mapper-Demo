package com.deewhale.mapper;

import com.deewhale.pojo.BookContentInfo;
import com.deewhale.pojo.dto.BooKContentInfoDTO;

public interface Transform {

    BooKContentInfoDTO convert(BookContentInfo data);
}
