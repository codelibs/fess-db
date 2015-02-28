package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of FILE_CONFIG_TO_ROLE_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, FILE_CONFIG_ID, ROLE_TYPE_ID
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
 *     FILE_CRAWLING_CONFIG, ROLE_TYPE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     fileCrawlingConfig, roleType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfFileConfigToRoleTypeMapping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<FileConfigToRoleTypeMapping> _selectedList;
    protected BehaviorSelector _selector;
    protected FileConfigToRoleTypeMappingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfFileConfigToRoleTypeMapping ready(List<FileConfigToRoleTypeMapping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected FileConfigToRoleTypeMappingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(FileConfigToRoleTypeMappingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfFileCrawlingConfig _foreignFileCrawlingConfigLoader;
    public LoaderOfFileCrawlingConfig pulloutFileCrawlingConfig() {
        if (_foreignFileCrawlingConfigLoader == null)
        { _foreignFileCrawlingConfigLoader = new LoaderOfFileCrawlingConfig().ready(myBhv().pulloutFileCrawlingConfig(_selectedList), _selector); }
        return _foreignFileCrawlingConfigLoader;
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
    public List<FileConfigToRoleTypeMapping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
