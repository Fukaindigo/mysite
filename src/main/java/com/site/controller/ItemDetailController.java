package com.site.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.site.enitity.SiteItem;
import com.site.service.ItemService;
import com.site.utils.JSONResult;

@RestController
public class ItemDetailController {

	private final static Logger logger = LoggerFactory.getLogger(ItemDetailController.class);

	@Autowired
	private ItemService service;

	@GetMapping("/detail")
	private JSONResult getDetail(long id) {
		try {
			SiteItem e = service.getDetail(id);
			return JSONResult.ok(e);
		} catch (Exception e) {
			logger.error("Get item detail failed.");
			throw e;
		}
	}

}
