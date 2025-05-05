// 大精设备使用情况 Service 实现类
package top.sharehome.springbootinittemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.sharehome.springbootinittemplate.entity.HighValueEquipmentUsage;
import top.sharehome.springbootinittemplate.mapper.HighValueEquipmentUsageMapper;
import top.sharehome.springbootinittemplate.service.HighValueEquipmentUsageService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class HighValueEquipmentUsageServiceImpl extends
        ServiceImpl<HighValueEquipmentUsageMapper, HighValueEquipmentUsage> implements HighValueEquipmentUsageService {

    @Override
    public double calculateUsageTime(Long equipmentId) {
        List<HighValueEquipmentUsage> usageList = lambdaQuery().eq(HighValueEquipmentUsage::getEquipmentId, equipmentId)
                .list();
        double totalUsageTime = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (HighValueEquipmentUsage usage : usageList) {
            try {
                Date startTime = sdf.parse(usage.getStartTime());
                Date endTime = sdf.parse(usage.getEndTime());
                totalUsageTime += (endTime.getTime() - startTime.getTime()) / (1000.0 * 60 * 60); // 换算成小时
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return totalUsageTime;
    }

    @Override
    public boolean openSharing(Long equipmentId) {
        // 实现开放共享逻辑
        return true;
    }
}
