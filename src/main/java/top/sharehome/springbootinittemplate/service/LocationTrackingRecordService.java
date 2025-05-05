// 定位追踪记录 Service 接口
package top.sharehome.springbootinittemplate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.sharehome.springbootinittemplate.entity.LocationTrackingRecord;
import java.util.List;

public interface LocationTrackingRecordService extends IService<LocationTrackingRecord> {
    // 高精度轨迹追踪
    List<LocationTrackingRecord> trackEquipment(Long equipmentId);

    // 使用登记预警
    boolean usageRegistrationWarning(Long equipmentId);
}
