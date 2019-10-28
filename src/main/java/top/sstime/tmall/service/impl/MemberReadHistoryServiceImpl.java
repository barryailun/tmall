package top.sstime.tmall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.sstime.tmall.nosql.mongodb.document.MemberReadHistory;
import top.sstime.tmall.nosql.mongodb.repository.MemberReadHistoryRepository;
import top.sstime.tmall.service.MemberReadHistoryService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author chenwei
 * @create_time 2019/10/28 15:18
 * @descriptions 会员浏览记录管理Service实现类
 */
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {
    @Autowired
    private MemberReadHistoryRepository memberReadHistoryRepository;
    @Override
    public int create(MemberReadHistory memberReadHistory) {
        memberReadHistory.setId(null);
        memberReadHistory.setCreateTime(new Date());
        memberReadHistoryRepository.save(memberReadHistory);
        return 1;
    }

    @Override
    public int delete(List<String> ids) {
        List<MemberReadHistory> deleteList = new ArrayList<>();
        for (String id : ids) {
            MemberReadHistory memberReadHistory = new MemberReadHistory();
            memberReadHistory.setId(id);
            deleteList.add(memberReadHistory);
        }
        memberReadHistoryRepository.deleteAll(deleteList);
        return ids.size();
    }

    @Override
    public List<MemberReadHistory> list(Long memberId) {
        return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);
    }
}