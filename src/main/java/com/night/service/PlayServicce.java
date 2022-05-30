package com.night.service;

import com.night.pojo.Play;
import com.night.pojo.PlayAndOrderVo;

import java.util.List;
import java.util.Map;

public interface PlayServicce {
    List<Play> getAll();

    List<Play> getPlayAll(Map<String,Object> params);

    List<Play> getPlayPage(int pageNum,int pageSize);

    Play getId(int id);

    int updatePlay(Play play);

    int insertPlay(Play play);

    int deletPlay(Play play);

    List<PlayAndOrderVo> playAanOrder();
}
