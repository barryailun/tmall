package top.sstime.tmall.service;

import top.sstime.tmall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @author chenwei
 * @create_time 2019/10/28 15:17
 * @descriptions 会员浏览记录管理Service
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
