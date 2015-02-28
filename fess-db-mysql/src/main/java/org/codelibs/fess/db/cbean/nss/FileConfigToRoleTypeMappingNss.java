package org.codelibs.fess.db.cbean.nss;

import org.codelibs.fess.db.cbean.cq.FileConfigToRoleTypeMappingCQ;

/**
 * The nest select set-upper of FILE_CONFIG_TO_ROLE_TYPE_MAPPING.
 * @author DBFlute(AutoGenerator)
 */
public class FileConfigToRoleTypeMappingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final FileConfigToRoleTypeMappingCQ _query;
    public FileConfigToRoleTypeMappingNss(FileConfigToRoleTypeMappingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'.
     */
    public void withFileCrawlingConfig() {
        _query.xdoNss(() -> _query.queryFileCrawlingConfig());
    }
    /**
     * With nested relation columns to select clause. <br>
     * ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     */
    public void withRoleType() {
        _query.xdoNss(() -> _query.queryRoleType());
    }
}
