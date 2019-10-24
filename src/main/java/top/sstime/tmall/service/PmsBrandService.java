package top.sstime.tmall.service;

import top.sstime.tmall.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author chenwei
 * @create_time 2019/10/23 8:20 下午
 * @descriptions
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();
    int createBrand(PmsBrand brand);
    int updateBrand(Long id, PmsBrand brand);
    int deleteBrand(Long id);
    List<PmsBrand> listBrand(int pageNum, int pageSize);
    PmsBrand getBrand(Long id);
}
