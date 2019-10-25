package top.sstime.tmall.dao.impl;

import org.springframework.stereotype.Repository;
import top.sstime.tmall.dao.UmsAdminRoleRelationDao;
import top.sstime.tmall.mbg.model.UmsPermission;

import java.util.List;

/**
 * @author chenwei
 * @create_time 2019/10/25 15:54
 * @descriptions
 */
@Repository
public class UmsAdminRoleRelationDaoImpl implements UmsAdminRoleRelationDao {
    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return null;
    }
}
