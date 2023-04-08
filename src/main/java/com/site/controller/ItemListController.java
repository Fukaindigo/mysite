package com.site.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.site.enitity.SiteItem;
import com.site.service.ItemService;
import com.site.utils.JSONResult;

@RestController
public class ItemListController {
	private final static Logger logger = LoggerFactory.getLogger(ItemListController.class);

	@Autowired
	private ItemService service;

	@GetMapping("/getList")
	private JSONResult getList() {

		try {
			List<SiteItem> e = service.getList();
			if (e != null)
				logger.info("Get item list {} records", e.size());
			return JSONResult.ok(e);

		} catch (Exception e) {
			logger.error("Get item list failed.");
			throw e;
		}
	}
	@GetMapping("/getList/id={id}")
	private JSONResult getDetail(@PathVariable("id") long id) {
		try {
			SiteItem siteItem = service.getDetail(id);
			if(siteItem != null){
				logger.info("Get item list {} records");
			}
			return JSONResult.ok(siteItem);
		} catch (Exception e) {
			logger.error("Get item list failed.");
			throw e;
			// TODO: handle exception
		}
		
		
		
	}

}
