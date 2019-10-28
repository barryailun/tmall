package top.sstime.tmall.nosql.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import top.sstime.tmall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @author chenwei
 * @create_time 2019/10/28 15:11
 * @descriptions
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory, String> {
    /**
     * 根据会员ID按时间倒序获取浏览记录
     * @param memberId
     * @return
     */
    List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);
}
