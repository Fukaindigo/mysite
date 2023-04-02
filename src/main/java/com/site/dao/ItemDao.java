package com.site.dao;

import java.util.List;

import com.site.enitity.SiteItem;

public interface ItemDao {

	List<SiteItem> getList();

	SiteItem getItemById(long itemCode);

}
