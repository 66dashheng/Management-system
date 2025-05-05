// 领取使用记录 Service 实现类
package top.sharehome.springbootinittemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.sharehome.springbootinittemplate.entity.UsageRecord;
import top.sharehome.springbootinittemplate.mapper.UsageRecordMapper;
import top.sharehome.springbootinittemplate.service.UsageRecordService;

@Service
public class UsageRecordServiceImpl extends ServiceImpl<UsageRecordMapper, UsageRecord> implements UsageRecordService {

    @Override
    public boolean approveUsageRecord(Long id, String status) {
        UsageRecord usageRecord = getById(id);
        if (usageRecord != null) {
            usageRecord.setStatus(status);
            return updateById(usageRecord);
        }
        return false;
    }
}