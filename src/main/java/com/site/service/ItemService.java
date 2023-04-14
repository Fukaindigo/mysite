package com.site.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dao.ItemDao;
import com.site.enitity.SiteItem;

@Service
public class ItemService {

	@Autowired
	private ItemDao itemDao;

	public List<SiteItem> getList() {
		return itemDao.getList();
	}

	public SiteItem getDetail(long id) {
		return itemDao.getItemById(id);
	}
}
