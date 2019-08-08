package com.inspur.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.inspur.service.inf.GffpxxcxServiceInf;


@Service
public class GffpxxcxServiceImpl implements GffpxxcxServiceInf {
  @Autowired
  private GffpxxcxServiceInf gffpxxcxServiceInf;
  @Autowired
  JdbcTemplate jdbcTemplate;
	
	public List getGffpxxcxServiceInf(String SFZH) {
		
		List list = new ArrayList();
		 if (!StringUtils.isEmpty(SFZH)&&SFZH.length()==18) {
		      list = this.jdbcTemplate.queryForList("select f.* from dj_zrr z left join  fp_fc_dkje f on z.DJXH=f.DJXH where z.SFZJHM=?", 		      
		        new Object[] { SFZH });
		    }
		    return list;
	}
   
}
