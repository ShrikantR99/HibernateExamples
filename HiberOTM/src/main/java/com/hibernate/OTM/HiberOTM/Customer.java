package com.hibernate.OTM.HiberOTM;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
 
@Entity
public class Customer 
{
@Id
int cust_id;
String cust_name;
int cust_age;
@OneToMany
List<Product> product;
public Customer() {
super();
// TODO Auto-generated constructor stub
}
public Customer(int cust_id, String cust_name, int cust_age, List<Product> product) {
super();
this.cust_id = cust_id;
this.cust_name = cust_name;
this.cust_age = cust_age;
this.product = product;
}
public int getCust_id() {
return cust_id;
}
public void setCust_id(int cust_id) {
this.cust_id = cust_id;
}
public String getCust_name() {
return cust_name;
}
public void setCust_name(String cust_name) {
this.cust_name = cust_name;
}
public int getCust_age() {
return cust_age;
}
public void setCust_age(int cust_age) {
this.cust_age = cust_age;
}
public List<Product> getProduct() {
return product;
}
public void setProduct(List<Product> product) {
this.product = product;
}

}

