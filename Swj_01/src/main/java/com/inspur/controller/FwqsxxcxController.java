package com.inspur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inspur.service.impl.FwqsxxcxServiceImpl;

@RestController
@RequestMapping("/fwqsxxcx")
public class FwqsxxcxController {
 
	@Autowired
	private FwqsxxcxServiceImpl fwqsxxcxServiceImpl;
	@RequestMapping(value={"/SFZH"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	  public List FrxxcxController(String SFZH)
	  {
	    return this.fwqsxxcxServiceImpl.getFwqsxxcxServiceInf(SFZH);
	  }
}
