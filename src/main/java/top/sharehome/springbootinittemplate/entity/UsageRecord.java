// 领取使用记录实体类
package top.sharehome.springbootinittemplate.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("usage_record")
public class UsageRecord {
    private Long id; // 记录 ID
    private Long equipmentId; // 设备 ID
    private Long userId; // 用户 ID
    private String status; // 审批状态
    private String startTime; // 开始时间
    private String endTime; // 结束时间
    // 其他领取使用记录属性...
}