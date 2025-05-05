// 用户信息 Service 实现类
package top.sharehome.springbootinittemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.sharehome.springbootinittemplate.entity.UserInfo;
import top.sharehome.springbootinittemplate.mapper.UserInfoMapper;
import top.sharehome.springbootinittemplate.service.UserInfoService;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

    // 模拟角色权限映射
    private static final Map<String, String[]> ROLE_PERMISSION_MAP = new HashMap<>();

    static {
        ROLE_PERMISSION_MAP.put("admin", new String[] { "equipment_info_manage", "usage_record_manage",
                "high_value_equipment_usage_manage", "location_tracking_record_manage", "user_info_manage" });
        ROLE_PERMISSION_MAP.put("teacher",
                new String[] { "equipment_info_view", "usage_record_apply", "usage_record_approve" });
        ROLE_PERMISSION_MAP.put("student", new String[] { "equipment_info_view", "usage_record_apply" });
    }

    @Override
    public boolean verifyUserPermission(Long userId, String permission) {
        UserInfo userInfo = getById(userId);
        if (userInfo != null) {
            String role = userInfo.getRole();
            String[] permissions = ROLE_PERMISSION_MAP.get(role);
            if (permissions != null) {
                for (String p : permissions) {
                    if (p.equals(permission)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}