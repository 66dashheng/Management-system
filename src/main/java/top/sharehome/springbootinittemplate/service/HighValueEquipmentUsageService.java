// 大精设备使用情况 Service 接口
package top.sharehome.springbootinittemplate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.sharehome.springbootinittemplate.entity.HighValueEquipmentUsage;

public interface HighValueEquipmentUsageService extends IService<HighValueEquipmentUsage> {
    // 统计大精设备使用情况
    double calculateUsageTime(Long equipmentId);

    // 开放共享不常用的大精设备
    boolean openSharing(Long equipmentId);
}