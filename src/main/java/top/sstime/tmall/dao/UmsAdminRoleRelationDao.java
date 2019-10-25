package top.sstime.tmall.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.sstime.tmall.mbg.model.UmsPermission;

import java.util.List;

/**
 * @author chenwei
 * @create_time 2019/10/25 11:57
 * @descriptions 后台用户与角色管理自定义Dao
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
