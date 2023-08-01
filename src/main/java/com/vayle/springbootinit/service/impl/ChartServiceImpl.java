package com.vayle.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.vayle.springbootinit.model.entity.Chart;
import com.vayle.springbootinit.service.ChartService;
import com.vayle.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




