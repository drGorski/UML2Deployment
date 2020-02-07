package pl.gdynia.amw.dictionary;

public enum TaggedValues {

    additionalP2PAddresses,
    attachmentContentCacheSizeMegaBytes,
    attachmentCacheBound,
    blacklistedAttachmentSigningKeys,
    cordappSignerKeyFingerprintBlacklist,
    crlCheckSoftFail,
    custom_jvmArgs,
    database_transactionIsolationLevel,
    database_exportHibernateJMXStatistics,
    database_initialiseSchema,
    database_initialiseAppSchema,
    dataSourceProperties_dataSourceClassName,
    dataSourceProperties_dataSource_url,
    dataSourceProperties_dataSource_user,
    dataSourceProperties_dataSource_password,
    detectPublicIp,
    devMode,
    emailAddress,
    extraNetworkMapKeys,
    flowMonitorPeriodMillis,
    flowMonitorSuspensionLoggingThresholdMillis,
    flowTimeout_timeout,
    flowTimeout_maxRestartCount,
    flowTimeout_backoffBase,
    h2Settings,
    jarDirs,
    jmxMonitoringHttpPort,
    jmxReporterType,
    keyStorePassword,
    messagingServerAddress,
    messagingServerExternal,
    myLegalName,
    networkParameterAcceptanceSettings_autoAcceptEnabled,
    networkParameterAcceptanceSettings_excludedAutoAcceptableParameters,
    networkServices_doormanURL,
    networkServices_networkMapURL,
    networkServices_pnm,
    p2pAddress,
    rpcSettings_address,
    rpcSettings_adminAddress,
    rpcSettings_standAloneBroker,
    rpcSettings_useSsl,
    rpcSettings_ssl_keyStorePath,
    rpcSettings_ssl_keyStorePassword,
    rpcUsers,
    security,
    sshd_port,
    systemProperties,
    transactionCacheSizeMegaBytes,
    tlsCertCrlDistPoint,
    tlsCertCrlIssuer,
    trustStorePassword,
    notary_validating,
    notary_serviceLegalName,
    notary_raft_nodeAddress,
    notary_raft_clusterAddresses,
    notary_bftSMaRt_replicaId,
    notary_dftSMaRt_clusterAddresses;

    public String getTaggedValueKey() {
        return this.name().replaceAll("_", ".");
    }

    public String getTemplateKey() {
        return "<<" + this.name().replaceAll("_", ".") + ">>";
    }
}
