package cn.stylefeng.guns.system;

import cn.stylefeng.guns.base.BaseJunit;
import cn.stylefeng.guns.modular.system.dao.NoticeMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * 首页通知展示测试
 *
 */
public class BlackBoardTest extends BaseJunit {

    @Autowired
    NoticeMapper noticeMapper;

    @Test
    public void blackBoardTest() {
        List<Map<String, Object>> notices = noticeMapper.list(null);
        assertTrue(notices.size() > 0);
    }
}
