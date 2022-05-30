package com.night.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.night.mapper.PlayMapper;
import com.night.pojo.Play;
import com.night.pojo.PlayAndOrderVo;
import com.night.service.PlayServicce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional()
public class PlayServiceimpl implements PlayServicce {

    @Autowired
    private PlayMapper playMapper;

    @Override
    public List<Play> getAll() {
        return playMapper.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Play> getPlayAll(Map<String, Object> params) {
        return playMapper.getPlayAll(params);
    }

    @Override
    public List<Play> getPlayPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Play> all = playMapper.getAll();
        PageInfo<Play> playPageInfo = new PageInfo<>(all);
        return playPageInfo.getList();
    }

    @Override
    public Play getId(int id) {
        return null;
    }

    @Override
    public int updatePlay(Play play) {
        return 0;
    }

    @Override
    public int insertPlay(Play play) {
        return 0;
    }

    @Override
    public int deletPlay(Play play) {
        return 0;
    }

    @Override
    public List<PlayAndOrderVo> playAanOrder() {
        return playMapper.playAanOrder();
    }
}
