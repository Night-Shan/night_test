package com.night.controller;
import com.night.pojo.Play;
import com.night.pojo.PlayAndOrderVo;
import com.night.service.PlayServicce;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/play")
public class PlayController {

    @Autowired
    private PlayServicce playServicce;

    @GetMapping("/getAll")
    public R getAll(){
        List<Play> all = playServicce.getAll();
        return R.testR(all,true);
    }

    @GetMapping("/getPlayAll")
    public R getPlayAll(@RequestParam Map<String,Object> params){
//        Object username = params.get("username");
//        Object user_password = params.get("user_password");
//        System.out.println("erree"+username+"________"+user_password);

        return R.lR(playServicce.getPlayAll(params));

    }

    @GetMapping("/playAanOrder")
    public R playAanOrder() {
        return R.testR(playServicce.playAanOrder(), true);

    }

    @GetMapping("/selectPage2")
    public R getPlayPage(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        return R.testR(playServicce.getPlayPage(pageNum,pageSize),true);
    }
}
