package com.youlai.common.core.constant;

public interface AuthConstants {

    /**
     * JWT存储权限前缀
     */
    String AUTHORITY_PREFIX = "ROLE_";


    /**
     * JWT存储权限属性
     */
    String AUTHORITY_CLAIM_NAME = "authorities";

    /**
     * 认证信息Http请求头
     */
    String JWT_TOKEN_HEADER = "Authorization";

    /**
     * JWT令牌前缀
     */
    String JWT_TOKEN_PREFIX = "Bearer ";


    /**
     * 用户信息HTTP请求头
     */
    String USER_TOKEN_HEADER = "user";


    /**
     * 后台管理client_id
     */
    String ADMIN_CLIENT_ID = "admin-client";


    /**
     * 前台client_id
     */
    String PORTAL_CLIENT_ID = "portal-client";


    /**
     * 小程序client_id
     */
    String MP_CLIENT_ID = "mp-client";


    /**
     * 后台管理接口路径匹配
     */
    String ADMIN_URL_PATTERN = "/youlai-admin/**";

    /**
     * Redis缓存权限规则key
     */
    String RESOURCE_ROLES_MAP_KEY = "auth:resourceRolesMap";


    String OAUTH2_TOKEN_PREFIX = "oauth2:token:";


    String CLIENT_DETAILS_FIELDS = "client_id, CONCAT('{noop}',client_secret) as client_secret, resource_ids, scope, "
            + "authorized_grant_types, web_server_redirect_uri, authorities, access_token_validity, "
            + "refresh_token_validity, additional_information, autoapprove";
    String CLIENT_DETAILS_BASE_SQL = "select " + CLIENT_DETAILS_FIELDS + " from oauth_client_details";
    String CLIENT_DETAILS_FIND_SQL = CLIENT_DETAILS_BASE_SQL + " order by client_id";
    String CLIENT_DETAILS_SELECT_SQL = CLIENT_DETAILS_BASE_SQL + " where client_id = ?";

    String BCRYPT = "{bcrypt}";
}
