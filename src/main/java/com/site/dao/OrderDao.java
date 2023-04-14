package com.site.dao;

import java.util.Map;

import com.site.enitity.SiteOrder;

public interface OrderDao {

	int saveOrder(SiteOrder siteOrder);

	int updateItem(Map<String, Object> params);

}
