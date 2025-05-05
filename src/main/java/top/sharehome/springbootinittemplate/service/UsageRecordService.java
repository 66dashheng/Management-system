// 领取使用记录 Service 接口
package top.sharehome.springbootinittemplate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.sharehome.springbootinittemplate.entity.UsageRecord;

public interface UsageRecordService extends IService<UsageRecord> {
    // 审批领取使用记录
    boolean approveUsageRecord(Long id, String status);
}
