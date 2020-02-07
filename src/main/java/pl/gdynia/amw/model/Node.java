package pl.gdynia.amw.model;

import lombok.*;
import pl.gdynia.amw.annotation.TaggedValue;
import pl.gdynia.amw.dictionary.TaggedValues;

@NoArgsConstructor
@EqualsAndHashCode
public class Node implements CordaObject {

    @Getter @Setter private String additionalP2PAddresses;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.attachmentContentCacheSizeMegaBytes)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.attachmentContentCacheSizeMegaBytes)})
    private String attachmentContentCacheSizeMegaBytes;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.attachmentCacheBound)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.attachmentCacheBound)})
    private String attachmentCacheBound;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.blacklistedAttachmentSigningKeys)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.blacklistedAttachmentSigningKeys)})
    private String blacklistedAttachmentSigningKeys;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.cordappSignerKeyFingerprintBlacklist)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.cordappSignerKeyFingerprintBlacklist)})
    private String cordappSignerKeyFingerprintBlacklist;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.crlCheckSoftFail)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.crlCheckSoftFail)})
    private String crlCheckSoftFail;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.custom_jvmArgs)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.custom_jvmArgs)})
    private String custom_jvmArgs;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.database_transactionIsolationLevel)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.database_transactionIsolationLevel)})
    private String database_transactionIsolationLevel;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.database_exportHibernateJMXStatistics)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.database_exportHibernateJMXStatistics)})
    private String database_exportHibernateJMXStatistics;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.database_initialiseSchema)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.database_initialiseSchema)})
    private String database_initialiseSchema;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.database_initialiseAppSchema)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.database_initialiseAppSchema)})
    private String database_initialiseAppSchema;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.dataSourceProperties_dataSourceClassName)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.dataSourceProperties_dataSourceClassName)})
    private String dataSourceProperties_dataSourceClassName;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.dataSourceProperties_dataSource_url)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.dataSourceProperties_dataSource_url)})
    private String dataSourceProperties_dataSource_url;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.dataSourceProperties_dataSource_user)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.dataSourceProperties_dataSource_user)})
    private String dataSourceProperties_dataSource_user;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.dataSourceProperties_dataSource_password)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.dataSourceProperties_dataSource_password)})
    private String dataSourceProperties_dataSource_password;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.detectPublicIp)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.detectPublicIp)})
    private String detectPublicIp;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.devMode)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.devMode)})
    private String devMode;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.emailAddress)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.emailAddress)})
    private String emailAddress;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.extraNetworkMapKeys)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.extraNetworkMapKeys)})
    private String extraNetworkMapKeys;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowMonitorPeriodMillis)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowMonitorPeriodMillis)})
    private String flowMonitorPeriodMillis;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowMonitorSuspensionLoggingThresholdMillis)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowMonitorSuspensionLoggingThresholdMillis)})
    private String flowMonitorSuspensionLoggingThresholdMillis;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowTimeout_timeout)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowTimeout_timeout)})
    private String flowTimeout_timeout;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowTimeout_maxRestartCount)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowTimeout_maxRestartCount)})
    private String flowTimeout_maxRestartCount;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowTimeout_backoffBase)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.flowTimeout_backoffBase)})
    private String flowTimeout_backoffBase;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.h2Settings)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.h2Settings)})
    private String h2Settings;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.jarDirs)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.jarDirs)})
    private String jarDirs;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.jmxMonitoringHttpPort)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.jmxMonitoringHttpPort)})
    private String jmxMonitoringHttpPort;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.jmxReporterType)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.jmxReporterType)})
    private String jmxReporterType;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.keyStorePassword)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.keyStorePassword)})
    private String keyStorePassword;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.messagingServerAddress)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.messagingServerAddress)})
    private String messagingServerAddress;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.messagingServerExternal)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.messagingServerExternal)})
    private String messagingServerExternal;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.myLegalName)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.myLegalName)})
    private String myLegalName;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkParameterAcceptanceSettings_autoAcceptEnabled)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkParameterAcceptanceSettings_autoAcceptEnabled)})
    private String networkParameterAcceptanceSettings_autoAcceptEnabled;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkParameterAcceptanceSettings_excludedAutoAcceptableParameters)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkParameterAcceptanceSettings_excludedAutoAcceptableParameters)})
    private String networkParameterAcceptanceSettings_excludedAutoAcceptableParameters;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkServices_doormanURL)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkServices_doormanURL)})
    private String networkServices_doormanURL;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkServices_networkMapURL)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkServices_networkMapURL)})
    private String networkServices_networkMapURL;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkServices_pnm)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.networkServices_pnm)})
    private String networkServices_pnm;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.p2pAddress)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.p2pAddress)})
    private String p2pAddress;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_address)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_address)})
    private String rpcSettings_address;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_adminAddress)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_adminAddress)})
    private String rpcSettings_adminAddress;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_standAloneBroker)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_standAloneBroker)})
    private String rpcSettings_standAloneBroker;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_useSsl)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_useSsl)})
    private String rpcSettings_useSsl;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_ssl_keyStorePath)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_ssl_keyStorePath)})
    private String rpcSettings_ssl_keyStorePath;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_ssl_keyStorePassword)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcSettings_ssl_keyStorePassword)})
    private String rpcSettings_ssl_keyStorePassword;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcUsers)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.rpcUsers)})
    private String rpcUsers;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.security)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.security)})
    private String security;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.sshd_port)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.sshd_port)})
    private String sshd_port;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.systemProperties)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.systemProperties)})
    private String  systemProperties;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.transactionCacheSizeMegaBytes)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.transactionCacheSizeMegaBytes)})
    private String  transactionCacheSizeMegaBytes;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.tlsCertCrlDistPoint)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.tlsCertCrlDistPoint)})
    private String  tlsCertCrlDistPoint;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.tlsCertCrlIssuer)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.tlsCertCrlIssuer)})
    private String  tlsCertCrlIssuer;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.trustStorePassword)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.trustStorePassword)})
    private String  trustStorePassword;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_validating)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_validating)})
    private String  notary_validating;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_serviceLegalName)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_serviceLegalName)})
    private String  notary_serviceLegalName;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_raft_nodeAddress)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_raft_nodeAddress)})
    private String  notary_raft_nodeAddress;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_raft_clusterAddresses)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_raft_clusterAddresses)})
    private String  notary_raft_clusterAddresses;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_bftSMaRt_replicaId)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_bftSMaRt_replicaId)})
    private String  notary_bftSMaRt_replicaId;

    @Getter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_dftSMaRt_clusterAddresses)})
    @Setter(onMethod_={@TaggedValue(taggedValue = TaggedValues.notary_dftSMaRt_clusterAddresses)})
    private String  notary_dftSMaRt_clusterAddresses;

}
