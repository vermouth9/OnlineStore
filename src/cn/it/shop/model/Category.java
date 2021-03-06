package cn.it.shop.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


/**
 * Category entity. @author MyEclipse Persistence Tools
 */


public class Category implements java.io.Serializable {

	// Fields

	private Integer id;
	private String type;
	private Boolean hot;
	@JsonInclude(Include.NON_NULL)  
	private Account account;
	
	

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	/** default constructor */
	public Category() {
	}

	/** full constructor */
	public Category(String type, Boolean hot) {
		this.type = type;
		this.hot = hot;
	}

	public Category(Integer id, String type, Boolean hot) {
		super();
		this.id = id;
		this.type = type;
		this.hot = hot;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getHot() {
		return this.hot;
	}

	public void setHot(Boolean hot) {
		this.hot = hot;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", type=" + type + ", hot=" + hot + "]";
	}

	
}