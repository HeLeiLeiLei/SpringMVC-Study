package com.hl.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JsonUtils {

    public static String getJson(Object o){
        return getJson(o,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object o, String dateFormat){
        ObjectMapper objectMapper = new ObjectMapper();
        //不使用时间戳的方式
        objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS,false);
        //自定义日期的格式
        SimpleDateFormat spf = new SimpleDateFormat(dateFormat);
        objectMapper.setDateFormat(spf);

        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }


}
