// 定位追踪记录 Controller 类
package top.sharehome.springbootinittemplate.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.sharehome.springbootinittemplate.entity.LocationTrackingRecord;
import top.sharehome.springbootinittemplate.service.LocationTrackingRecordService;

import java.util.List;

@RestController
@RequestMapping("/locationTrackingRecord")
public class LocationTrackingRecordController {

    @Autowired
    private LocationTrackingRecordService locationTrackingRecordService;

    // 添加定位追踪记录
    @PostMapping
    public boolean addLocationTrackingRecord(@RequestBody LocationTrackingRecord locationTrackingRecord) {
        return locationTrackingRecordService.save(locationTrackingRecord);
    }

    // 删除定位追踪记录
    @DeleteMapping("/{id}")
    public boolean deleteLocationTrackingRecord(@PathVariable Long id) {
        return locationTrackingRecordService.removeById(id);
    }

    // 修改定位追踪记录
    @PutMapping
    public boolean updateLocationTrackingRecord(@RequestBody LocationTrackingRecord locationTrackingRecord) {
        return locationTrackingRecordService.updateById(locationTrackingRecord);
    }

    // 查询定位追踪记录列表
    @GetMapping
    public List<LocationTrackingRecord> getLocationTrackingRecordList() {
        return locationTrackingRecordService.list();
    }

    // 分页查询定位追踪记录列表
    @GetMapping("/page")
    public Page<LocationTrackingRecord> getLocationTrackingRecordPage(@RequestParam(defaultValue = "1") long current,
            @RequestParam(defaultValue = "10") long size) {
        return locationTrackingRecordService.page(new Page<>(current, size));
    }

    // 高精度轨迹追踪
    @GetMapping("/trackEquipment/{equipmentId}")
    public List<LocationTrackingRecord> trackEquipment(@PathVariable Long equipmentId) {
        return locationTrackingRecordService.trackEquipment(equipmentId);
    }

    // 使用登记预警
    @GetMapping("/usageRegistrationWarning/{equipmentId}")
    public boolean usageRegistrationWarning(@PathVariable Long equipmentId) {
        return locationTrackingRecordService.usageRegistrationWarning(equipmentId);
    }
}