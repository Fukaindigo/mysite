package com.site.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.site.dao.ItemDao;
import com.site.dao.OrderDao;
import com.site.enitity.SiteItem;
import com.site.enitity.SiteOrder;

@Service
public class OrderService {
	private final static Logger logger = LoggerFactory.getLogger(OrderService.class);

	@Autowired
	private ItemDao itemDao;

	@Autowired
	private OrderDao orderDao;

	public SiteItem getDetail(long id) {
		return itemDao.getItemById(id);
	}

	@Transactional
	public int saveOrder(SiteOrder order) {
		int rstIndex = 0;

		//3. Save order
		orderDao.saveOrder(order);
		logger.info("Save order OK. OrderId:{}", order.getOrderId());

		// System.out.println(1 / 0);

		//4.Update stock
		long itemCode = order.getItemCode();
		int itemNum = order.getItemNum();
		rstIndex = updateItem(itemCode, itemNum);
		logger.info("Update stock OK. itemCode:{},minus stock:{}", itemCode, itemNum);

		return rstIndex;
	}

	public int updateItem(long id, int num) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		params.put("num", num);
		return orderDao.updateItem(params);
	}
}
