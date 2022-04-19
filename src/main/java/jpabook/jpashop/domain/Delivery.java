package jpabook.jpashop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Delivery {
  @Id @GeneratedValue
  private long id;

  @OneToOne(mappedBy = "delivery")
  private Order order;

  private String city;

  private String street;

  private String zipcode;

  private DeliveryStatus status;
}
