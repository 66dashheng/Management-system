// 大精设备使用情况实体类
package top.sharehome.springbootinittemplate.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("high_value_equipment_usage")
public class HighValueEquipmentUsage {
    private Long id; // 记录 ID
    private Long equipmentId; // 设备 ID
    private double power; // 功率
    private String startTime; // 开始时间
    private String endTime; // 结束时间
    // 其他大精设备使用情况属性...
}