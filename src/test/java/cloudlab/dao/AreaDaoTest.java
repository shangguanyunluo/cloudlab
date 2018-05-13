package cloudlab.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;  
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cloudlab.entity.Area;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AreaDaoTest {

	@Autowired
	private AreaDao areaDao;
	
	@Ignore
	@Test
	public void testAQueryArea() { 
		List<Area> areaList = areaDao.queryArea();
		System.out.println("Not yet implemented----"+areaList.size());
		assertEquals(2, areaList.size());
	}
	@Ignore
	@Test
	public void queryAreaById() { 
		Area area = areaDao.queryAreaById(1);
		assertEquals((Integer)1, area.getAreaId());
	}
	@Ignore
	@Test
	public void insertArea() {
		Area area=new Area("北苑",3,new Date(),new Date());
		int areaList = areaDao.insertArea(area);
		System.out.println("insertArea----"+areaList);
		assertEquals(1, areaList);
	}
	@Ignore
	@Test
	public void updateArea() { 
		Area area=new Area("北苑",3,new Date(),new Date());
		area.setAreaId(4);
		int num = areaDao.updateArea(area);
		System.out.println("updateArea----"+num);
		assertEquals(1, num);
	}
	@Ignore
	@Test
	public void deleteArea() { 
		int num = areaDao.deleteArea(4);
		System.out.println("deleteArea--------"+num);
		assertEquals(1, num);
	}

}
