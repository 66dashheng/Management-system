// 领取使用记录 Controller 类
package top.sharehome.springbootinittemplate.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.sharehome.springbootinittemplate.entity.UsageRecord;
import top.sharehome.springbootinittemplate.service.UsageRecordService;

import java.util.List;

@RestController
@RequestMapping("/usageRecord")
public class UsageRecordController {

    @Autowired
    private UsageRecordService usageRecordService;

    // 添加领取使用记录
    @PostMapping
    public boolean addUsageRecord(@RequestBody UsageRecord usageRecord) {
        return usageRecordService.save(usageRecord);
    }

    // 删除领取使用记录
    @DeleteMapping("/{id}")
    public boolean deleteUsageRecord(@PathVariable Long id) {
        return usageRecordService.removeById(id);
    }

    // 修改领取使用记录
    @PutMapping
    public boolean updateUsageRecord(@RequestBody UsageRecord usageRecord) {
        return usageRecordService.updateById(usageRecord);
    }

    // 查询领取使用记录列表
    @GetMapping
    public List<UsageRecord> getUsageRecordList() {
        return usageRecordService.list();
    }

    // 分页查询领取使用记录列表
    @GetMapping("/page")
    public Page<UsageRecord> getUsageRecordPage(@RequestParam(defaultValue = "1") long current,
            @RequestParam(defaultValue = "10") long size) {
        return usageRecordService.page(new Page<>(current, size));
    }

    // 审批领取使用记录
    @PutMapping("/approve/{id}")
    public boolean approveUsageRecord(@PathVariable Long id, @RequestParam String status) {
        return usageRecordService.approveUsageRecord(id, status);
    }
}