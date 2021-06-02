package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
/*
 * 只需建立好連線，執行後會自動建立table
 * @GeneratedValue(strategy=GenerationType.IDENTITY) : 設定自增主鍵
 * @Id : 對應Table的主鍵
 * @Column(name=“id”) :  對應Column name
 * @Table : 設立資料庫的名字
 * 
 */
@Component
@Entity
@Table(name = "test")
public class ThisIsEntity {
	@Id
	private Integer id;
	private String name;
	private String phone;

	//以下是getters與setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
