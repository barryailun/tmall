package top.sstime.tmall.service;

import top.sstime.tmall.common.api.CommonResult;

/**
 * @author chenwei
 * @create_time 2019/10/24 3:12 下午
 * @descriptions 会员管理
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
