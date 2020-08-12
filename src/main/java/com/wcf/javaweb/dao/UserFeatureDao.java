package com.wcf.javaweb.dao;

import com.wcf.javaweb.pojo.UserFeature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserFeatureDao extends JpaRepository<UserFeature,Integer> {
}
