package org.codelibs.fess.db.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.codelibs.fess.db.exbhv.*;
import org.codelibs.fess.db.exentity.*;

/**
 * The referrer loader of LABEL_TYPE_TO_ROLE_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID
 *
 * [column]
 *     ID, LABEL_TYPE_ID, ROLE_TYPE_ID
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
 *     LABEL_TYPE, ROLE_TYPE
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     labelType, roleType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLabelTypeToRoleTypeMapping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<LabelTypeToRoleTypeMapping> _selectedList;
    protected BehaviorSelector _selector;
    protected LabelTypeToRoleTypeMappingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLabelTypeToRoleTypeMapping ready(List<LabelTypeToRoleTypeMapping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LabelTypeToRoleTypeMappingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LabelTypeToRoleTypeMappingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLabelType _foreignLabelTypeLoader;
    public LoaderOfLabelType pulloutLabelType() {
        if (_foreignLabelTypeLoader == null)
        { _foreignLabelTypeLoader = new LoaderOfLabelType().ready(myBhv().pulloutLabelType(_selectedList), _selector); }
        return _foreignLabelTypeLoader;
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
    public List<LabelTypeToRoleTypeMapping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
