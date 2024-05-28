package com.devsuperior.dscommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {

  @EmbeddedId
  private OrderItemPK id = new OrderItemPK();

  private Integer quantity;
  private Double price;

  public OrderItem() {}

  public OrderItem(Order order, Product product, Double price) {
    id.setOrder(order);
    id.setProduct(product);
    this.id = id;
    this.quantity = quantity;
    this.price = price;
  }

  public Order getOrder() {
    return id.getOrder();
  }

  public Product geProduct() {
    return id.getProduct();
  }

  public void setOrder(Order order) {
    id.setOrder(order);
  }

  public void setProduct(Product product) {
    id.setProduct(product);
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
