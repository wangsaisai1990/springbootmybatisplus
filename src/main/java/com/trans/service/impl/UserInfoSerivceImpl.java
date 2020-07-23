package com.trans.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.trans.dao.UserInfoDao;
import com.trans.entity.UserInfoEntity;
import com.trans.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoSerivceImpl extends ServiceImpl<UserInfoDao, UserInfoEntity> implements UserInfoService {
}