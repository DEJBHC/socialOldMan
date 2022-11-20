package cn.stylefeng.guns.modular.doctor_point.controller;

import cn.stylefeng.guns.core.shiro.ShiroKit;
import cn.stylefeng.guns.modular.system.model.User;
import cn.stylefeng.guns.modular.system.service.IUserService;
import cn.stylefeng.roses.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import cn.stylefeng.guns.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import cn.stylefeng.guns.modular.system.model.DoctorPoint;
import cn.stylefeng.guns.modular.doctor_point.service.IDoctorPointService;

import java.util.List;

/**
 * 医生预约控制器
 *
 */
@Controller
@RequestMapping("/doctorPoint")
public class DoctorPointController extends BaseController {

    private String PREFIX = "/doctor_point/doctorPoint/";

    @Autowired
    private IDoctorPointService doctorPointService;

    @Autowired
    private IUserService userService;
    /**
     * 跳转到医生预约首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "doctorPoint.html";
    }

    /**
     * 跳转到添加医生预约
     */
    @RequestMapping("/doctorPoint_add")
    public String doctorPointAdd() {
        return PREFIX + "doctorPoint_add.html";
    }

    /**
     * 跳转到修改医生预约
     */
    @RequestMapping("/doctorPoint_update/{doctorPointId}")
    public String doctorPointUpdate(@PathVariable Integer doctorPointId, Model model) {
        DoctorPoint doctorPoint = doctorPointService.selectById(doctorPointId);
        model.addAttribute("item",doctorPoint);
        LogObjectHolder.me().set(doctorPoint);
        return PREFIX + "doctorPoint_edit.html";
    }

    /**
     * 获取医生预约列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        List<DoctorPoint> doctorPoints;
        if (ShiroKit.isUsers()){
            Integer userid = ShiroKit.getUser().getId();
            User user = this.userService.selectById(userid);
            doctorPoints= doctorPointService.getDoctorList(user.getCardid());
        }else {
            doctorPoints=doctorPointService.selectList(null);
        }
        return doctorPoints;
    }

    /**
     * 新增医生预约
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(DoctorPoint doctorPoint) {
        doctorPointService.insert(doctorPoint);
        return SUCCESS_TIP;
    }

    /**
     * 删除医生预约
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer doctorPointId) {
        doctorPointService.deleteById(doctorPointId);
        return SUCCESS_TIP;
    }

    /**
     * 修改医生预约
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(DoctorPoint doctorPoint) {
        doctorPointService.updateById(doctorPoint);
        return SUCCESS_TIP;
    }

    /**
     * 医生预约详情
     */
    @RequestMapping(value = "/detail/{doctorPointId}")
    @ResponseBody
    public Object detail(@PathVariable("doctorPointId") Integer doctorPointId) {
        return doctorPointService.selectById(doctorPointId);
    }
}
