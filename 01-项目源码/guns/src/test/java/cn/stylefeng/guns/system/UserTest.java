package cn.stylefeng.guns.system;

import cn.stylefeng.guns.base.BaseJunit;
import cn.stylefeng.guns.modular.system.dao.UserMapper;
import cn.stylefeng.guns.modular.system.model.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 用户测试
 *
 */
public class UserTest extends BaseJunit {
    @Resource
    UserMapper userMapper;
    @Test
    public void userTest() throws Exception {
        System.out.println("-----根据用户Id查询用户信息-----");
        User user = userMapper.selectById("11");
        if (Objects.isNull(user)){
            System.out.println("抱歉，用户不存在！");
        }else {
            System.out.println(user.getName());
        }
    }
}
