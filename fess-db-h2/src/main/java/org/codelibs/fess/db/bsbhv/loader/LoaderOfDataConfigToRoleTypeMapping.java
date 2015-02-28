package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of DATA_CONFIG_TO_ROLE_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, DATA_CONFIG_ID, ROLE_TYPE_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     DATA_CRAWLING_CONFIG, ROLE_TYPE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     dataCrawlingConfig, roleType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfDataConfigToRoleTypeMapping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<DataConfigToRoleTypeMapping> _selectedList;
    protected BehaviorSelector _selector;
    protected DataConfigToRoleTypeMappingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfDataConfigToRoleTypeMapping ready(List<DataConfigToRoleTypeMapping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected DataConfigToRoleTypeMappingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(DataConfigToRoleTypeMappingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfDataCrawlingConfig _foreignDataCrawlingConfigLoader;
    public LoaderOfDataCrawlingConfig pulloutDataCrawlingConfig() {
        if (_foreignDataCrawlingConfigLoader == null)
        { _foreignDataCrawlingConfigLoader = new LoaderOfDataCrawlingConfig().ready(myBhv().pulloutDataCrawlingConfig(_selectedList), _selector); }
        return _foreignDataCrawlingConfigLoader;
    }

    protected LoaderOfRoleType _foreignRoleTypeLoader;
    public LoaderOfRoleType pulloutRoleType() {
        if (_foreignRoleTypeLoader == null)
        { _foreignRoleTypeLoader = new LoaderOfRoleType().ready(myBhv().pulloutRoleType(_selectedList), _selector); }
        return _foreignRoleTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<DataConfigToRoleTypeMapping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
