package com.inspur.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.inspur.service.inf.NsrjbxxcxServiceInf;
@Service
public class NsrjbxxcxServiceImpl implements NsrjbxxcxServiceInf {
    @Autowired
    private  NsrjbxxcxServiceInf  nsrjbxxcxServiceInf;
	@Autowired
	JdbcTemplate template;
	public List getNsrjbxxcxInfServiceInf(String SFZH) {
		 List list = new ArrayList();
		    if (!StringUtils.isEmpty(SFZH)&&SFZH.length()==18) {
		      list = this.template.queryForList("select *  from dj_zrr where SFZJHM =?", new Object[] { SFZH });
		    }
		    return list;
		  }
	}
 
	
	
  
	


