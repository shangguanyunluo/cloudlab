package cloudlab.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import cloudlab.dao.AreaDao;
import cloudlab.entity.Area;
import cloudlab.service.AreaServiceI;

@Service
public class AreaServiceImpl implements AreaServiceI {

	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {
		List<Area> areaList = areaDao.queryArea();
		return areaList;
	}

	@Override
	public Area getAreaById(int areaId) {
		// TODO Auto-generated method stub
		return areaDao.queryAreaById(areaId);
	}

	@Override
	@Transactional
	public boolean addArea( Area area) {
		// TODO Auto-generated method stub
		if (area.getAreaName() != null && !"".equals(area.getAreaName())) {
			area.setCreateTime(new Date());
			area.setLastEditTime(new Date());

			try {
				int num = areaDao.insertArea(area);
				if (num > 0) {
					return true;
				} else {
					throw new RuntimeException("添加区域信息失败!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				throw new RuntimeException("添加区域信息失败:" + e.toString());
			}
		} else {
			throw new RuntimeException("区域信息不能为空！");
		}
	}

	@Override
	@Transactional
	public boolean modifyArea(Area area) {
		if (area.getAreaId() != null && area.getAreaId() > 0) {
			// 设置默认值
			area.setLastEditTime(new Date());
			try {
				// 更新区域信息
				int effectedNum = areaDao.updateArea(area);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("更新区域信息失败!");
				}
			} catch (Exception e) {
				throw new RuntimeException("更新区域信息失败:" + e.toString());
			}
		} else {
			throw new RuntimeException("区域信息不能为空！");
		}
	}

	@Override
	public boolean deleteArea(int areaId) {
		if (areaId > 0) {
			try {
				// 删除区域信息
				int effectedNum = areaDao.deleteArea(areaId);
				if (effectedNum > 0) {
					return true;
				} else {
					throw new RuntimeException("删除区域信息失败!");
				}
			} catch (Exception e) {
				throw new RuntimeException("删除区域信息失败:" + e.toString());
			}
		} else {
			throw new RuntimeException("区域Id不能为空！");
		}
	}

}
