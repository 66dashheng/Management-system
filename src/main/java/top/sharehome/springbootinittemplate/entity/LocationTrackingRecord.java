// 定位追踪记录实体类
package top.sharehome.springbootinittemplate.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("location_tracking_record")
public class LocationTrackingRecord {
    private Long id; // 记录 ID
    private Long equipmentId; // 设备 ID
    private String location; // 位置
    private String time; // 时间
    // 其他定位追踪记录属性...
}