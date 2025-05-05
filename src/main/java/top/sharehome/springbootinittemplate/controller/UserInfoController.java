// 用户信息 Controller 类
package top.sharehome.springbootinittemplate.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.sharehome.springbootinittemplate.entity.UserInfo;
import top.sharehome.springbootinittemplate.service.UserInfoService;

import java.util.List;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    // 添加用户信息
    @PostMapping
    public boolean addUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.save(userInfo);
    }

    // 删除用户信息
    @DeleteMapping("/{id}")
    public boolean deleteUserInfo(@PathVariable Long id) {
        return userInfoService.removeById(id);
    }

    // 修改用户信息
    @PutMapping
    public boolean updateUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.updateById(userInfo);
    }

    // 查询用户信息列表
    @GetMapping
    public List<UserInfo> getUserInfoList() {
        return userInfoService.list();
    }

    // 分页查询用户信息列表
    @GetMapping("/page")
    public Page<UserInfo> getUserInfoPage(@RequestParam(defaultValue = "1") long current,
            @RequestParam(defaultValue = "10") long size) {
        return userInfoService.page(new Page<>(current, size));
    }

    // 用户权限验证
    @GetMapping("/verifyUserPermission/{userId}/{permission}")
    public boolean verifyUserPermission(@PathVariable Long userId, @PathVariable String permission) {
        return userInfoService.verifyUserPermission(userId, permission);
    }
}