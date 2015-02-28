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
 * The entity of FILE_CONFIG_TO_ROLE_TYPE_MAPPING as TABLE. <br>
 * <pre>
 * [primary-key]
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
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long id = entity.getId();
 * Long fileConfigId = entity.getFileConfigId();
 * Long roleTypeId = entity.getRoleTypeId();
 * entity.setId(id);
 * entity.setFileConfigId(fileConfigId);
 * entity.setRoleTypeId(roleTypeId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsFileConfigToRoleTypeMapping extends AbstractEntity implements DomainEntity {

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

    /** FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG} */
    protected Long _fileConfigId;

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
        return "FILE_CONFIG_TO_ROLE_TYPE_MAPPING";
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
    /** FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'. */
    protected OptionalEntity<FileCrawlingConfig> _fileCrawlingConfig;

    /**
     * [get] FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'fileCrawlingConfig'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<FileCrawlingConfig> getFileCrawlingConfig() {
        if (_fileCrawlingConfig == null) { _fileCrawlingConfig = OptionalEntity.relationEmpty(this, "fileCrawlingConfig"); }
        return _fileCrawlingConfig;
    }

    /**
     * [set] FILE_CRAWLING_CONFIG by my FILE_CONFIG_ID, named 'fileCrawlingConfig'.
     * @param fileCrawlingConfig The entity of foreign property 'fileCrawlingConfig'. (NullAllowed)
     */
    public void setFileCrawlingConfig(OptionalEntity<FileCrawlingConfig> fileCrawlingConfig) {
        _fileCrawlingConfig = fileCrawlingConfig;
    }

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
        if (obj instanceof BsFileConfigToRoleTypeMapping) {
            BsFileConfigToRoleTypeMapping other = (BsFileConfigToRoleTypeMapping)obj;
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
        if (_fileCrawlingConfig != null && _fileCrawlingConfig.isPresent())
        { sb.append(li).append(xbRDS(_fileCrawlingConfig, "fileCrawlingConfig")); }
        if (_roleType != null && _roleType.isPresent())
        { sb.append(li).append(xbRDS(_roleType, "roleType")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_id));
        sb.append(dm).append(xfND(_fileConfigId));
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
        if (_fileCrawlingConfig != null && _fileCrawlingConfig.isPresent())
        { sb.append(dm).append("fileCrawlingConfig"); }
        if (_roleType != null && _roleType.isPresent())
        { sb.append(dm).append("roleType"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public FileConfigToRoleTypeMapping clone() {
        return (FileConfigToRoleTypeMapping)super.clone();
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
     * [get] FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG} <br>
     * @return The value of the column 'FILE_CONFIG_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFileConfigId() {
        checkSpecifiedProperty("fileConfigId");
        return _fileConfigId;
    }

    /**
     * [set] FILE_CONFIG_ID: {IX, NotNull, BIGINT(19), FK to FILE_CRAWLING_CONFIG} <br>
     * @param fileConfigId The value of the column 'FILE_CONFIG_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFileConfigId(Long fileConfigId) {
        registerModifiedProperty("fileConfigId");
        _fileConfigId = fileConfigId;
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
