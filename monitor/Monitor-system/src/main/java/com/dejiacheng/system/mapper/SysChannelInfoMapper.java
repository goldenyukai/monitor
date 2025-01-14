package com.dejiacheng.system.mapper;

import com.dejiacheng.system.domain.SysChannelInfo;
import java.util.List;

/**
 * 系统设备通道信息Mapper接口
 * 
 * @author yukai
 * @date 2019-10-06
 */
public interface SysChannelInfoMapper 
{
    /**
     * 查询系统设备通道信息
     * 
     * @param channelId 系统设备通道信息ID
     * @return 系统设备通道信息
     */
    public SysChannelInfo selectSysChannelInfoById(Long channelId);

    /**
     * 查询系统设备通道信息列表
     * 
     * @param sysChannelInfo 系统设备通道信息
     * @return 系统设备通道信息集合
     */
    public List<SysChannelInfo> selectSysChannelInfoList(SysChannelInfo sysChannelInfo);

    /**
     * 新增系统设备通道信息
     * 
     * @param sysChannelInfo 系统设备通道信息
     * @return 结果
     */
    public int insertSysChannelInfo(SysChannelInfo sysChannelInfo);

    /**
     * 修改系统设备通道信息
     * 
     * @param sysChannelInfo 系统设备通道信息
     * @return 结果
     */
    public int updateSysChannelInfo(SysChannelInfo sysChannelInfo);

    /**
     * 删除系统设备通道信息
     * 
     * @param channelId 系统设备通道信息ID
     * @return 结果
     */
    public int deleteSysChannelInfoById(Long channelId);

    /**
     * 批量删除系统设备通道信息
     * 
     * @param channelIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysChannelInfoByIds(String[] channelIds);
}
