package ac.za.cput.companymanager.Service;

import java.util.List;

/**
 * Created by yusraAdmin on 9/26/2015.
 */
public interface Service<S, ID> {

    public S findById(ID id);

    public S create(S entity);

    public S edit(S entity);

    public void delete(S entity);

    public List<S> findAll();

}
