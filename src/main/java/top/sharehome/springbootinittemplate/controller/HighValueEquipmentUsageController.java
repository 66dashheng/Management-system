// 大精设备使用情况 Controller 类
package top.sharehome.springbootinittemplate.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.sharehome.springbootinittemplate.entity.HighValueEquipmentUsage;
import top.sharehome.springbootinittemplate.service.HighValueEquipmentUsageService;

import java.util.List;

@RestController
@RequestMapping("/highValueEquipmentUsage")
public class HighValueEquipmentUsageController {

    @Autowired
    private HighValueEquipmentUsageService highValueEquipmentUsageService;

    // 添加大精设备使用情况记录
    @PostMapping
    public boolean addHighValueEquipmentUsage(@RequestBody HighValueEquipmentUsage highValueEquipmentUsage) {
        return highValueEquipmentUsageService.save(highValueEquipmentUsage);
    }

    // 删除大精设备使用情况记录
    @DeleteMapping("/{id}")
    public boolean deleteHighValueEquipmentUsage(@PathVariable Long id) {
        return highValueEquipmentUsageService.removeById(id);
    }

    // 修改大精设备使用情况记录
    @PutMapping
    public boolean updateHighValueEquipmentUsage(@RequestBody HighValueEquipmentUsage highValueEquipmentUsage) {
        return highValueEquipmentUsageService.updateById(highValueEquipmentUsage);
    }

    // 查询大精设备使用情况记录列表
    @GetMapping
    public List<HighValueEquipmentUsage> getHighValueEquipmentUsageList() {
        return highValueEquipmentUsageService.list();
    }

    // 分页查询大精设备使用情况记录列表
    @GetMapping("/page")
    public Page<HighValueEquipmentUsage> getHighValueEquipmentUsagePage(@RequestParam(defaultValue = "1") long current,
            @RequestParam(defaultValue = "10") long size) {
        return highValueEquipmentUsageService.page(new Page<>(current, size));
    }

    // 统计大精设备使用情况
    @GetMapping("/calculateUsageTime/{equipmentId}")
    public double calculateUsageTime(@PathVariable Long equipmentId) {
        return highValueEquipmentUsageService.calculateUsageTime(equipmentId);
    }

    // 开放共享不常用的大精设备
    @PutMapping("/openSharing/{equipmentId}")
    public boolean openSharing(@PathVariable Long equipmentId) {
        return highValueEquipmentUsageService.openSharing(equipmentId);
    }
}