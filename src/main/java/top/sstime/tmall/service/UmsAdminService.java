package top.sstime.tmall.service;

import top.sstime.tmall.mbg.model.UmsAdmin;
import top.sstime.tmall.mbg.model.UmsPermission;

import java.util.List;

/**
 * @author chenwei
 * @create_time 2019/10/25 10:18
 * @descriptions 后台管理员service
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     * @param umsAdminParam
     * @return
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限(包括角色权限和+-权限)
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
