package com.night.mapper;

import com.night.pojo.Play;
import com.night.pojo.PlayAndOrderVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface PlayMapper {
    List<Play> getAll();

    List<PlayAndOrderVo> playAanOrder();

    List<Play> getPlayAll(Map<String,Object> params);







    Play getId(int id);

    int updatePlay(Play play);

    int insertPlay(Play play);

    int deletPlay(Play play);
}
