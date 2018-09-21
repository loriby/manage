package com.github.digital.security.admin.biz;

import org.springframework.stereotype.Service;

import com.github.digital.security.admin.entity.GroupType;
import com.github.digital.security.admin.mapper.GroupTypeMapper;
import com.github.digital.security.common.biz.BaseBiz;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2017-06-12 8:48
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper,GroupType> {
}
