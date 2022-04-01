package com.deewhale;

import com.deewhale.mapper.*;
import com.deewhale.pojo.BookContentInfo;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class Application {

    private static PodamFactory podamFactory = new PodamFactoryImpl();

    public static void main(String[] args) {

        int count = 100000;
        runTest(Dozer.getInstance(),count);
        runTest(MapStruct.getInstance(),count);
        runTest(ModelMappers.getInstance(),count);
        runTest(Orika.getInstance(),count);
        runTest(ApcheBeanUtils.getInstance(),count);

    }

    private static void runTest(Transform transform, int count){

        BookContentInfo data =podamFactory.manufacturePojo(BookContentInfo.class);
        Long timestamp = System.currentTimeMillis();
        for (int i = 0; i < count ;i ++){
            transform.convert(data);
        }
        Long result = System.currentTimeMillis() - timestamp;
        System.out.println(transform.getClass().getName() + " timestamp : " + result + " ms");
    }
}
