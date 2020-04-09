package cc.mrbird.febs.server.system.service;

import cc.mrbird.febs.common.entity.system.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IUserRoleService extends IService<UserRole> {

	void deleteUserRolesByRoleId(String[] roleIds);

	void deleteUserRolesByUserId(String[] userIds);
}