package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.DataConfigToRoleTypeMappingCQ;

/**
 * The nest select set-upper of DATA_CONFIG_TO_ROLE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class DataConfigToRoleTypeMappingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DataConfigToRoleTypeMappingCQ _query;
    public DataConfigToRoleTypeMappingNss(DataConfigToRoleTypeMappingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * DATA_CRAWLING_CONFIG by my DATA_CONFIG_ID, named 'dataCrawlingConfig'.
     */
    public void withDataCrawlingConfig() {
        _query.xdoNss(() -> _query.queryDataCrawlingConfig());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     */
    public void withRoleType() {
        _query.xdoNss(() -> _query.queryRoleType());
    }
}
