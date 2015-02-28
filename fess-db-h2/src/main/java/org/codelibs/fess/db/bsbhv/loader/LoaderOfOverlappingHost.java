package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of OVERLAPPING_HOST as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, REGULAR_NAME, OVERLAPPING_NAME, SORT_ORDER, CREATED_BY, CREATED_TIME, UPDATED_BY, UPDATED_TIME, DELETED_BY, DELETED_TIME, VERSION_NO
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfOverlappingHost {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<OverlappingHost> _selectedList;
    protected BehaviorSelector _selector;
    protected OverlappingHostBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfOverlappingHost ready(List<OverlappingHost> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected OverlappingHostBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(OverlappingHostBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<OverlappingHost> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
