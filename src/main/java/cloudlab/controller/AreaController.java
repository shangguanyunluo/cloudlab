package cloudlab.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cloudlab.entity.Area;
import cloudlab.service.AreaServiceI;

@Controller
@RequestMapping("/area")
public class AreaController {
	
	@Autowired
	private AreaServiceI areaService;

	@RequestMapping(value="/list")
	@ResponseBody
	public Map<String, Object> getAreas() {
		Map<String, Object> responseData=new HashMap<String, Object>();
		 List<Area> areaList = areaService.getAreaList();
		responseData.put("success",true);
		responseData.put("data",areaList);
		return responseData;
	}
	@RequestMapping(value="/getArea")
	@ResponseBody
	public Map<String, Object> getAreaById(int areaId) {
		Map<String, Object> responseData=new HashMap<String, Object>();
		Area area = areaService.getAreaById(areaId);
		System.out.println("==========================");
		responseData.put("success",true);
		responseData.put("data",area);
		return responseData;
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addArea(@RequestBody Area area) {
		Map<String, Object> responseData=new HashMap<String, Object>();
		boolean areaNum = areaService.addArea(area);
		responseData.put("success",true);
		responseData.put("data",areaNum);
		return responseData;
	}
	@RequestMapping(value="/modify", method=RequestMethod.PUT)
	@ResponseBody
	public Map<String, Object> updateArea(@RequestBody Area area) {
		Map<String, Object> responseData=new HashMap<String, Object>();
		boolean modifyArea = areaService.modifyArea(area);
		responseData.put("success",true);
		responseData.put("data",modifyArea);
		return responseData;
	}
	@RequestMapping(value="/delete")
	@ResponseBody
	public Map<String, Object> deleteArea(int areaId) {
		Map<String, Object> responseData=new HashMap<String, Object>();
		boolean b = areaService.deleteArea(areaId);
		responseData.put("success",true);
		responseData.put("data",b);
		return responseData;
	}
	
}
