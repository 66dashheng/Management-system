package top.sharehome.springbootinittemplate.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("equipment_info")
public class EquipmentInfo {
    private Long id; // 设备 ID
    private String name; // 设备名称
    private String model; // 设备型号
    private String status; // 设备状态
    // 其他设备属性...
}