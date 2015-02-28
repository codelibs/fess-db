package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.LabelTypeToRoleTypeMappingCQ;

/**
 * The nest select set-upper of LABEL_TYPE_TO_ROLE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class LabelTypeToRoleTypeMappingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final LabelTypeToRoleTypeMappingCQ _query;
    public LabelTypeToRoleTypeMappingNss(LabelTypeToRoleTypeMappingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * LABEL_TYPE by my LABEL_TYPE_ID, named 'labelType'.
     */
    public void withLabelType() {
        _query.xdoNss(() -> _query.queryLabelType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     */
    public void withRoleType() {
        _query.xdoNss(() -> _query.queryRoleType());
    }
}
