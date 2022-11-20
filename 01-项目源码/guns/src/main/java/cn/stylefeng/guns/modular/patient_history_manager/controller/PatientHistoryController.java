package cn.stylefeng.guns.modular.patient_history_manager.controller;

import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.core.shiro.ShiroUser;
import cn.stylefeng.guns.modular.system.model.User;
import cn.stylefeng.guns.modular.system.service.IUserService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import cn.stylefeng.guns.modular.system.model.PatientHistory;
import cn.stylefeng.guns.modular.patient_history_manager.service.IPatientHistoryService;

import java.util.ArrayList;
import java.util.List;

/**
 * 居民就诊历史管理控制器
 *
 */
@Controller
@RequestMapping("/patientHistory")
public class PatientHistoryController extends BaseController {

    private String PREFIX = "/patient_history_manager/patientHistory/";

    @Autowired
    private IPatientHistoryService patientHistoryService;

    @Autowired
    private IUserService userService;

    /**
     * 跳转到居民就诊历史管理首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "patientHistory.html";
    }

    /**
     * 跳转到添加居民就诊历史管理
     */
    @RequestMapping("/patientHistory_add")
    public String patientHistoryAdd() {
        return PREFIX + "patientHistory_add.html";
    }

    /**
     * 跳转到修改居民就诊历史管理
     */
    @RequestMapping("/patientHistory_update/{patientHistoryId}")
    public String patientHistoryUpdate(@PathVariable Integer patientHistoryId, Model model) {
        PatientHistory patientHistory = patientHistoryService.selectById(patientHistoryId);
        model.addAttribute("item", patientHistory);
        LogObjectHolder.me().set(patientHistory);
        return PREFIX + "patientHistory_edit.html";
    }

    /**
     * 获取居民就诊历史管理列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list() {
        Integer userid = ShiroKit.getUser().getId();
        User user = this.userService.selectById(userid);
        List<PatientHistory> patientHistories;
        if (ShiroKit.isUsers()) {
            patientHistories= patientHistoryService.getHistoryList(user.getCardid());
        } else {
            patientHistories= patientHistoryService.selectList(null);
        }
        return patientHistories;
    }

    /**
     * 新增居民就诊历史管理
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(PatientHistory patientHistory) {
        patientHistoryService.insert(patientHistory);
        return SUCCESS_TIP;
    }

    /**
     * 删除居民就诊历史管理
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer patientHistoryId) {
        patientHistoryService.deleteById(patientHistoryId);
        return SUCCESS_TIP;
    }

    /**
     * 修改居民就诊历史管理
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(PatientHistory patientHistory) {
        patientHistoryService.updateById(patientHistory);
        return SUCCESS_TIP;
    }

    /**
     * 居民就诊历史管理详情
     */
    @RequestMapping(value = "/detail/{patientHistoryId}")
    @ResponseBody
    public Object detail(@PathVariable("patientHistoryId") Integer patientHistoryId) {
        return patientHistoryService.selectById(patientHistoryId);
    }
}
