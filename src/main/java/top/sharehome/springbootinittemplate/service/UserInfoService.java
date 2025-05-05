// 用户信息 Service 接口
package top.sharehome.springbootinittemplate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.sharehome.springbootinittemplate.entity.UserInfo;

public interface UserInfoService extends IService<UserInfo> {
    // 用户权限验证
    boolean verifyUserPermission(Long userId, String permission);
}