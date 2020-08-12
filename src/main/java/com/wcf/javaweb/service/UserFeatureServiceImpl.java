package com.wcf.javaweb.service;

import com.wcf.javaweb.dao.UserFeatureDao;
import com.wcf.javaweb.pojo.UserFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFeatureServiceImpl implements UserFeatureService{
    @Autowired
    private UserFeatureDao userFeatureDao;

    @Override
    public void addUserFeature(UserFeature userFeature) {
        userFeatureDao.save(userFeature);
    }
}
