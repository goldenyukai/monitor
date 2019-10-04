package com.dejiacheng.framework.web.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dejiacheng.system.domain.SysDictData;
import com.dejiacheng.system.service.ISysDictDataService;

/**
 * @author pcy
 * RuoYi首创 html调用 thymeleaf 实现字典读取
 * @version 创建时间:2019年9月9日-下午2:17:09
 */
@Service("dict")
public class DictService
{
    @Autowired
    private ISysDictDataService dictDataService;

    /**
     * 根据字典类型查询字典数据信息
     * 
     * @param dictType 字典类型
     * @return 参数键值
     */
    public List<SysDictData> getType(String dictType)
    {
        return dictDataService.selectDictDataByType(dictType);
    }

    /**
     * 根据字典类型和字典键值查询字典数据信息
     * 
     * @param dictType 字典类型
     * @param dictValue 字典键值
     * @return 字典标签
     */
    public String getLabel(String dictType, String dictValue)
    {
        return dictDataService.selectDictLabel(dictType, dictValue);
    }
}
