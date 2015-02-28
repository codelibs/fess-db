package org.codelibs.fess.db.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import org.codelibs.fess.db.allcommon.DBMetaInstanceHandler;
import org.codelibs.fess.db.exentity.*;

/**
 * The entity of WEB_CONFIG_TO_ROLE_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary-key]
 *     ID
 * 
 * [column]
 *     ID, WEB_CONFIG_ID, ROLE_TYPE_ID
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
 *     ROLE_TYPE, WEB_CRAWLING_CONFIG
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     roleType, webCrawlingConfig
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * Long webConfigId = entity.getWebConfigId();
 * Long roleTypeId = entity.getRoleTypeId();
 * entity.setId(id);
 * entity.setWebConfigId(webConfigId);
 * entity.setRoleTypeId(roleTypeId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWebConfigToRoleTypeMapping extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _id;

    /** WEB_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG} */
    protected Long _webConfigId;

    /** ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE} */
    protected Long _roleTypeId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WEB_CONFIG_TO_ROLE_TYPE_MAPPING";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_id == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'. */
    protected OptionalEntity<RoleType> _roleType;

    /**
     * [get] ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'roleType'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<RoleType> getRoleType() {
        if (_roleType == null) { _roleType = OptionalEntity.relationEmpty(this, "roleType"); }
        return _roleType;
    }

    /**
     * [set] ROLE_TYPE by my ROLE_TYPE_ID, named 'roleType'.
     * @param roleType The entity of foreign property 'roleType'. (NullAllowed)
     */
    public void setRoleType(OptionalEntity<RoleType> roleType) {
        _roleType = roleType;
    }

    /** WEB_CRAWLING_CONFIG by my WEB_CONFIG_ID, named 'webCrawlingConfig'. */
    protected OptionalEntity<WebCrawlingConfig> _webCrawlingConfig;

    /**
     * [get] WEB_CRAWLING_CONFIG by my WEB_CONFIG_ID, named 'webCrawlingConfig'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'webCrawlingConfig'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WebCrawlingConfig> getWebCrawlingConfig() {
        if (_webCrawlingConfig == null) { _webCrawlingConfig = OptionalEntity.relationEmpty(this, "webCrawlingConfig"); }
        return _webCrawlingConfig;
    }

    /**
     * [set] WEB_CRAWLING_CONFIG by my WEB_CONFIG_ID, named 'webCrawlingConfig'.
     * @param webCrawlingConfig The entity of foreign property 'webCrawlingConfig'. (NullAllowed)
     */
    public void setWebCrawlingConfig(OptionalEntity<WebCrawlingConfig> webCrawlingConfig) {
        _webCrawlingConfig = webCrawlingConfig;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWebConfigToRoleTypeMapping) {
            BsWebConfigToRoleTypeMapping other = (BsWebConfigToRoleTypeMapping)obj;
            if (!xSV(_id, other._id)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _id);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_roleType != null && _roleType.isPresent())
        { sb.append(li).append(xbRDS(_roleType, "roleType")); }
        if (_webCrawlingConfig != null && _webCrawlingConfig.isPresent())
        { sb.append(li).append(xbRDS(_webCrawlingConfig, "webCrawlingConfig")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_webConfigId));
        sb.append(dm).append(xfND(_roleTypeId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_roleType != null && _roleType.isPresent())
        { sb.append(dm).append("roleType"); }
        if (_webCrawlingConfig != null && _webCrawlingConfig.isPresent())
        { sb.append(dm).append("webCrawlingConfig"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WebConfigToRoleTypeMapping clone() {
        return (WebConfigToRoleTypeMapping)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getId() {
        checkSpecifiedProperty("id");
        return _id;
    }

    /**
     * [set] ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param id The value of the column 'ID'. (basically NotNull if update: for the constraint)
     */
    public void setId(Long id) {
        registerModifiedProperty("id");
        _id = id;
    }

    /**
     * [get] WEB_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG} <br>
     * @return The value of the column 'WEB_CONFIG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getWebConfigId() {
        checkSpecifiedProperty("webConfigId");
        return _webConfigId;
    }

    /**
     * [set] WEB_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to WEB_CRAWLING_CONFIG} <br>
     * @param webConfigId The value of the column 'WEB_CONFIG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setWebConfigId(Long webConfigId) {
        registerModifiedProperty("webConfigId");
        _webConfigId = webConfigId;
    }

    /**
     * [get] ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE} <br>
     * @return The value of the column 'ROLE_TYPE_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRoleTypeId() {
        checkSpecifiedProperty("roleTypeId");
        return _roleTypeId;
    }

    /**
     * [set] ROLE_TYPE_ID: {IX, NotNull, BIGINT(19), FK to ROLE_TYPE} <br>
     * @param roleTypeId The value of the column 'ROLE_TYPE_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRoleTypeId(Long roleTypeId) {
        registerModifiedProperty("roleTypeId");
        _roleTypeId = roleTypeId;
    }
}
