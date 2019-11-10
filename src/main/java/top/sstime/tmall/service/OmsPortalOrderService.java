package top.sstime.tmall.service;

import org.springframework.transaction.annotation.Transactional;
import top.sstime.tmall.common.api.CommonResult;
import top.sstime.tmall.dto.OrderParam;

/**
 * @author chenwei
 * @create_time 2019/11/10 11:10 上午
 * @descriptions 前台订单管理service
 */
public interface OmsPortalOrderService {
    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
