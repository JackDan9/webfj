package com.feng.jun.webfj.controller.chartdata;

/**
 * Created by JackDan9 on 2018/8/2.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.feng.jun.webfj.common.constant.BFConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feng.jun.webfj.common.base.BaseController;
import com.feng.jun.webfj.common.constant.BFConstant;

/**
 * 图标数据: 访问来源
 *
 * @author JackDan9
 * @version webfj V1.0.0, 2018年8月5日
 * @see
 * @since webfj V1.0.0
 */

@RestController
@RequestMapping(value = "/addatas")
public class AccessDataController extends BaseController {
    /**
     * 曲线图数据模型，一般是从数据库中获取的，这里直接模拟产生
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = "applications/json; charset=utf-8")
    public ResponseEntity<Map<String, Object>> getAdData()
    {
        System.out.println(BFConstant.HELLO_MSG);
        Map<String, Object> map = new HashMap<String, Object>();
        List<Integer> emailList = new ArrayList<Integer>();
        List<Integer> allianceList = new ArrayList<Integer>();
        List<Integer> vedioList = new ArrayList<Integer>();
        List<Integer> directList = new ArrayList<Integer>();
        List<Integer> searchList = new ArrayList<Integer>();
        List<String> xTitleList = new ArrayList<String>();
        Random r = new Random();

        // 模拟产生数据，实际应用中请调用service获取
        for (int i = 0; i < 60; i++)
        {
            emailList.add(r.nextInt(50));
            allianceList.add(r.nextInt(50));
            vedioList.add(r.nextInt(50));
            directList.add(r.nextInt(50));
            searchList.add(r.nextInt(50));
            xTitleList.add(i + "m");
        }
        map.put("emailList", emailList);
        map.put("allianceList", allianceList);
        map.put("vedioList", vedioList);
        map.put("directList", directList);
        map.put("searchList", searchList);
        map.put("xTitleList", xTitleList);
        return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
    }
}
