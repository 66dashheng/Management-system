// 设备信息 Controller 类
package top.sharehome.springbootinittemplate.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.sharehome.springbootinittemplate.entity.EquipmentInfo;
import top.sharehome.springbootinittemplate.service.EquipmentInfoService;

import java.util.List;

@RestController
@RequestMapping("/equipmentInfo")
public class EquipmentInfoController {

    @Autowired
    private EquipmentInfoService equipmentInfoService;

    // 添加设备信息
    @PostMapping
    public boolean addEquipmentInfo(@RequestBody EquipmentInfo equipmentInfo) {
        return equipmentInfoService.save(equipmentInfo);
    }

    // 删除设备信息
    @DeleteMapping("/{id}")
    public boolean deleteEquipmentInfo(@PathVariable Long id) {
        return equipmentInfoService.removeById(id);
    }

    // 修改设备信息
    @PutMapping
    public boolean updateEquipmentInfo(@RequestBody EquipmentInfo equipmentInfo) {
        return equipmentInfoService.updateById(equipmentInfo);
    }

    // 查询设备信息列表
    @GetMapping
    public List<EquipmentInfo> getEquipmentInfoList() {
        return equipmentInfoService.list();
    }

    // 分页查询设备信息列表
    @GetMapping("/page")
    public Page<EquipmentInfo> getEquipmentInfoPage(@RequestParam(defaultValue = "1") long current,
            @RequestParam(defaultValue = "10") long size) {
        return equipmentInfoService.page(new Page<>(current, size));
    }
}