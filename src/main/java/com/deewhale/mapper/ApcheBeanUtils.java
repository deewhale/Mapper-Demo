package com.deewhale.mapper;

import com.deewhale.pojo.BookContentInfo;
import com.deewhale.pojo.dto.BooKContentInfoDTO;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Objects;

public class ApcheBeanUtils implements Transform {
    private static ApcheBeanUtils mapper = new ApcheBeanUtils();

    @Override
    public BooKContentInfoDTO convert(BookContentInfo data) {
        BooKContentInfoDTO dto = new BooKContentInfoDTO();
        try {
            BeanUtils.copyProperties(data, dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dto;
    }

    private ApcheBeanUtils() {
    }

    public static Transform getInstance() {
        if (Objects.isNull(mapper)) {
            mapper = new ApcheBeanUtils();
        }
        return mapper;
    }
}
