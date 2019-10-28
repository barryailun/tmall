package top.sstime.tmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.sstime.tmall.service.MemberReadHistoryService;

/**
 * @author chenwei
 * @create_time 2019/10/28 15:26
 * @descriptions 会员商品浏览记录管理Controller
 */
@Controller
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {
    @Autowired
    private MemberReadHistoryService memberReadHistoryService;


}
