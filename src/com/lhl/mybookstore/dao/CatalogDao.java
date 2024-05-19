package com.lhl.mybookstore.dao;

import java.util.List;

import com.lhl.mybookstore.bean.Catalog;
import com.lhl.mybookstore.bean.PageBean;

/**
 * 图书分类dao层
 *
 */
public interface CatalogDao {
	//获取图书分类信息
	List<Catalog> getCatalog();
	//获取图书分类信息（分页）
	List<Catalog> catalogList(PageBean pb);
	//统计总数
	long catalogReadCount();
	//分类删除
	boolean catalogDel(int catalogId);
	//分类批量删除
	boolean catalogBatDelById(String ids);
	//查找分类名称
	boolean findCatalogByCatalogName(String catalogName);
	//增加分类
	boolean catalogAdd(String catalogName);
}
