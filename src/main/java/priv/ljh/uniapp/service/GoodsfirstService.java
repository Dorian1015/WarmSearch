package priv.ljh.uniapp.service;

import priv.ljh.uniapp.entity.Goodsfirst;
import com.baomidou.mybatisplus.extension.service.IService;
import priv.ljh.uniapp.entity.Unbo;
import priv.ljh.utils.MyPage;

import java.util.List;

/**
 * <p>
 * 首页展示的物品信息 服务类
 * </p>
 *
 * @author lijinghai
 * @since 2021-02-19
 */
public interface GoodsfirstService extends IService<Goodsfirst> {

    /**
     * 自定义分页查询方法
     * @param pageNo
     * @param limit
     * @param idSorted
     * @param goodsfirsts
     * @return
     */
    public MyPage searchUnbo(int pageNo, int limit, String idSorted, List<Goodsfirst> goodsfirsts);
}
