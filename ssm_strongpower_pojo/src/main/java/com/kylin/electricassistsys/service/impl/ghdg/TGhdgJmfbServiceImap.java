package com.kylin.electricassistsys.service.impl.ghdg;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.ghdg.TGhdgJmfbDao;
import com.kylin.electricassistsys.pojo.ghdg.TGhdgJmfb;
import com.kylin.electricassistsys.service.ghdg.TGhdgJmfbService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TGhdgJmfbServiceImap extends ServiceImpl<TGhdgJmfbDao, TGhdgJmfb> implements TGhdgJmfbService {

}
