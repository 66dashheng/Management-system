// 定位追踪记录 Service 实现类
package top.sharehome.springbootinittemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.sharehome.springbootinittemplate.entity.LocationTrackingRecord;
import top.sharehome.springbootinittemplate.mapper.LocationTrackingRecordMapper;
import top.sharehome.springbootinittemplate.service.LocationTrackingRecordService;

import java.util.List;

@Service
public class LocationTrackingRecordServiceImpl extends ServiceImpl<LocationTrackingRecordMapper, LocationTrackingRecord>
        implements LocationTrackingRecordService {

    @Override
    public List<LocationTrackingRecord> trackEquipment(Long equipmentId) {
        return lambdaQuery().eq(LocationTrackingRecord::getEquipmentId, equipmentId).list();
    }

    @Override
    public boolean usageRegistrationWarning(Long equipmentId) {
        // 实现使用登记预警逻辑
        return true;
    }
}
