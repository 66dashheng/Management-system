// 用户信息实体类
package top.sharehome.springbootinittemplate.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_info")
public class UserInfo {
    private Long id; // 用户 ID
    private String username; // 用户名
    private String password; // 密码
    private String role; // 用户角色
    // 其他用户信息属性...
}
