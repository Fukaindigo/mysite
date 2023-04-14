package com.site.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.site.enitity.SiteItem;
import com.site.enitity.SiteOrder;
import com.site.service.OrderService;
import com.site.utils.JSONResult;

@RestController
public class ItemOrderController {

	private final static Logger logger = LoggerFactory.getLogger(ItemOrderController.class);

	@Autowired
	private OrderService service;

	@PostMapping(value = "/order")
	private JSONResult placeOrder(@RequestParam("itemCode") long itemCode, @RequestParam("num") int num) {
		final float TAX = 0.1f;

		try {

			// 1. Get price and num of item
			SiteItem item = service.getDetail(itemCode);
			if (item == null) {
				return JSONResult.noObject();
			}

			//2. Check stock
			int price = item.getItemPrice();
			int numOld = item.getItemNum();
			if (numOld - num < 0) {
				return JSONResult.noStock();
			}

			//3.Save order
			SiteOrder order = new SiteOrder();
			order.setUserId(1);
			order.setItemCode(itemCode);
			order.setItemPrice(price);
			order.setItemNum(num);
			order.setItemAmount(price * num);
			order.setItemTax((int) (price * num * (1 + TAX)));
			service.saveOrder(order);
			/*logger.info("Save order OK. OrderId:{}", order.getOrderId());
			
			//4.Update stock
			service.updateItem(itemCode, num);
			logger.info("Update stock OK. itemCode:{},minus stock:{}", itemCode, num);*/

			return JSONResult.ok();

		} catch (Exception e) {
			logger.error("Save order failed.");
			throw e;
		}

	}

}
