// 设备信息 Service 实现类
package top.sharehome.springbootinittemplate.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.sharehome.springbootinittemplate.entity.EquipmentInfo;
import top.sharehome.springbootinittemplate.mapper.EquipmentInfoMapper;
import top.sharehome.springbootinittemplate.service.EquipmentInfoService;

@Service
public class EquipmentInfoServiceImpl extends ServiceImpl<EquipmentInfoMapper, EquipmentInfo>
        implements EquipmentInfoService {
}