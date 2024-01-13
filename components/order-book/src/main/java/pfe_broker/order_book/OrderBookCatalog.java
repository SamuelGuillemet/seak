package pfe_broker.order_book;

import jakarta.inject.Singleton;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class OrderBookCatalog {

  private Map<String, LimitOrderBook> orderBooks;

  public OrderBookCatalog() {
    this.orderBooks = Collections.synchronizedMap(new HashMap<>());
  }

  public void addOrderBook(String symbol) {
    if (orderBooks.containsKey(symbol)) {
      return;
    }
    orderBooks.put(symbol, new LimitOrderBook(symbol));
  }

  public LimitOrderBook getOrderBook(String symbol) {
    return orderBooks.get(symbol);
  }

  public void clear() {
    orderBooks.clear();
  }
}
