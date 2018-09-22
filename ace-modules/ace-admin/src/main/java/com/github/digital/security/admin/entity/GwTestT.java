package com.github.digital.security.admin.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Rudy
 * @email Empty
 * @date 2018-09-22 17:44:50
 */
@Table(name = "gw_test_t")
public class GwTestT implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //测试表编号
    @Column(name = "code")
    private String code;
	
	    //内容描述
    @Column(name = "description")
    private String description;
	
	    //主题
    @Column(name = "name")
    private String name;
	
	    //
    @Column(name = "attr1")
    private String attr1;
	
	    //
    @Column(name = "attr2")
    private String attr2;
	
	    //
    @Column(name = "attr3")
    private String attr3;
	
	    //
    @Column(name = "attr4")
    private String attr4;
	
	    //
    @Column(name = "attr5")
    private String attr5;
	
	    //
    @Column(name = "attr6")
    private String attr6;
	
	    //
    @Column(name = "attr7")
    private String attr7;
	
	    //
    @Column(name = "attr8")
    private String attr8;
	

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：测试表编号
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：测试表编号
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：内容描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：内容描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：主题
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：主题
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	/**
	 * 获取：
	 */
	public String getAttr1() {
		return attr1;
	}
	/**
	 * 设置：
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	/**
	 * 获取：
	 */
	public String getAttr2() {
		return attr2;
	}
	/**
	 * 设置：
	 */
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	/**
	 * 获取：
	 */
	public String getAttr3() {
		return attr3;
	}
	/**
	 * 设置：
	 */
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	/**
	 * 获取：
	 */
	public String getAttr4() {
		return attr4;
	}
	/**
	 * 设置：
	 */
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}
	/**
	 * 获取：
	 */
	public String getAttr5() {
		return attr5;
	}
	/**
	 * 设置：
	 */
	public void setAttr6(String attr6) {
		this.attr6 = attr6;
	}
	/**
	 * 获取：
	 */
	public String getAttr6() {
		return attr6;
	}
	/**
	 * 设置：
	 */
	public void setAttr7(String attr7) {
		this.attr7 = attr7;
	}
	/**
	 * 获取：
	 */
	public String getAttr7() {
		return attr7;
	}
	/**
	 * 设置：
	 */
	public void setAttr8(String attr8) {
		this.attr8 = attr8;
	}
	/**
	 * 获取：
	 */
	public String getAttr8() {
		return attr8;
	}
}
