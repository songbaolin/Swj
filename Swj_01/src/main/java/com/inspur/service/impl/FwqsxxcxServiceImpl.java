package com.inspur.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.inspur.service.inf.FwqsxxcxServiceInf;
@Service
public class FwqsxxcxServiceImpl implements FwqsxxcxServiceInf {
	@Autowired
	private FwqsxxcxServiceInf fwqsxxcxServiceInf;
	@Autowired
	 JdbcTemplate  jdbcTemplate;
	@Override
	public List getFwqsxxcxServiceInf(String SFZH) {
		List list = new ArrayList();
		 if (!StringUtils.isEmpty(SFZH)&&SFZH.length()==18) {
		      list = this.jdbcTemplate.queryForList("select j.* from dj_zrr z left join  zs_jks j on z.DJXH=j.DJXH where z.SFZJHM=?", 		      
		        new Object[] { SFZH });
		    }
		    return list;
	}

}
