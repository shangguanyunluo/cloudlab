package cloudlab.dao;

import java.util.List;

import cloudlab.entity.Area;

public interface AreaDao {
	
	/**
	 * get all areainfo from db
	 * @return
	 */
	List<Area> queryArea();
	
	/**
	 * get area info by id
	 * 
	 * @param areaId
	 * @return
	 */
	Area queryAreaById(int areaId);
	
	/**
	 * insert a new areainfo to db
	 * @param area
	 * @return
	 */
	int  insertArea(Area area);
	
	/**
	 * update area info
	 * @param area
	 * @return
	 */
	int updateArea(Area area);
	
	/**
	 * delete area info
	 * 
	 * @param areaId
	 * @return
	 */
	int deleteArea(int areaId);
	
	

}
