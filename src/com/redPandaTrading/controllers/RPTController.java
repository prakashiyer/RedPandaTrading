package com.redPandaTrading.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.redPandaTrading.entities.Order;
import com.redPandaTrading.entities.Trade;
import com.redPandaTrading.entities.Trader;


@Controller
@RequestMapping("/operation")
public class RPTController {

	private static final Logger logger = Logger.getLogger(RPTController.class);
	
	@RequestMapping(method = RequestMethod.GET, value = "/registerTrader")
	public @ResponseBody
	Trader registerTrader(@RequestParam(value = "name") String name,
			@RequestParam(value = "address") String address) {
		logger.info("Register new Trader.");
		Trader trader = new Trader();
		trader.setId(1);
		trader.setName(name);
		trader.setAddress(address);;
		return trader;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/createOrder")
	public @ResponseBody
	Order createOrder(@RequestParam(value = "commodity") String commodity,
			@RequestParam(value = "units") int units,
			@RequestParam(value = "totalCost") String totalCost,
			@RequestParam(value = "unitCost") String unitCost,
			@RequestParam(value = "traderId") int traderId,
			@RequestParam(value = "status") String status,
			@RequestParam(value = "orderType") String orderType) {
		logger.info("Create New Order.");
		Order order = new Order();
		order.setId(1);
		order.setCommodity(commodity);
		order.setUnits(units);
		order.setTotalCost(totalCost);
		order.setUnitCost(unitCost);
		Trader trader = new Trader();
		trader.setId(traderId);
		trader.setAddress("xyz");
		trader.setName("abc");
		order.setStatus(status);
		order.setOrderType(orderType);
		return order;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getBestOrders")
	public @ResponseBody
	List<Order> getBestOrders(@RequestParam(value = "commodity") String commodity) {
		logger.info("Get top 10 orders.");
		List<Order> bestOrderList = new ArrayList<Order>();
		return bestOrderList;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getTraderOrders")
	public @ResponseBody
	List<Order> getTraderOrders(@RequestParam(value = "traderId") String traderId) {
		logger.info("Get orders for trader.");
		List<Order> traderOrdersList = new ArrayList<Order>();
		return traderOrdersList;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/findMatches")
	public @ResponseBody
	List<Order> findMatches(@RequestParam(value = "orderId") String orderId) {
		logger.info("Get Best matched for this order Id.");
		List<Order> matchingOrdersList = new ArrayList<Order>();
		return matchingOrdersList;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cancelOrder")
	public @ResponseBody
	void cancelOrder(@RequestParam(value = "orderId") String orderId) {
		logger.info("Delete the order Id.");
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/matchOrders")
	public @ResponseBody
	Trade matchOrders(@RequestParam(value = "traderOrderId") String traderOrderId,
			@RequestParam(value = "matchedOrderId") String matchedOrderId) {
		logger.info("Create a trade for trader's order and matched order.");
		Trade trade = new Trade();
		return trade;
	}
	
}
