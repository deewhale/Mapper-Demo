package com.deewhale.mapper;

import com.deewhale.pojo.BookContentInfo;
import com.deewhale.pojo.dto.BooKContentInfoDTO;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.Objects;

public class Dozer implements Transform{
    private static Mapper mapper = new DozerBeanMapper();

    private static Dozer dozer = new Dozer();
    @Override
    public BooKContentInfoDTO convert(BookContentInfo data) {
        return mapper.map(data,BooKContentInfoDTO.class);
    }

    private Dozer(){}


    public static Transform getInstance() {
        if (Objects.isNull(dozer)){
            dozer = new Dozer();
        }
        return dozer;
    }

}
