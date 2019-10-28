package top.sstime.tmall.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.sstime.tmall.dao.UmsAdminRoleRelationDao;
import top.sstime.tmall.mbg.mapper.UmsPermissionMapper;
import top.sstime.tmall.mbg.model.UmsPermission;
import top.sstime.tmall.mbg.model.UmsPermissionExample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenwei
 * @create_time 2019/10/25 15:54
 * @descriptions
 */
@Repository
public class UmsAdminRoleRelationDaoImpl implements UmsAdminRoleRelationDao {
    @Autowired
    private UmsPermissionMapper permissionMapper;
    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        List<UmsPermission> permissionList = new ArrayList<>();
        permissionList = permissionMapper.selectByExample(new UmsPermissionExample());
        return permissionList;
    }
}
