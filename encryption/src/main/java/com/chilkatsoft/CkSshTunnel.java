/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkSshTunnel {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkSshTunnel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkSshTunnel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkSshTunnel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkSshTunnel() {
    this(chilkatJNI.new_CkSshTunnel(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkSshTunnel_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkSshTunnel_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkSshTunnel_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkSshTunnel_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public boolean get_AbortCurrent() {
    return chilkatJNI.CkSshTunnel_get_AbortCurrent(swigCPtr, this);
  }

  public void put_AbortCurrent(boolean newVal) {
    chilkatJNI.CkSshTunnel_put_AbortCurrent(swigCPtr, this, newVal);
  }

  public void get_AcceptLog(CkString str) {
    chilkatJNI.CkSshTunnel_get_AcceptLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String acceptLog() {
    return chilkatJNI.CkSshTunnel_acceptLog(swigCPtr, this);
  }

  public void put_AcceptLog(String newVal) {
    chilkatJNI.CkSshTunnel_put_AcceptLog(swigCPtr, this, newVal);
  }

  public void get_AcceptLogPath(CkString str) {
    chilkatJNI.CkSshTunnel_get_AcceptLogPath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String acceptLogPath() {
    return chilkatJNI.CkSshTunnel_acceptLogPath(swigCPtr, this);
  }

  public void put_AcceptLogPath(String newVal) {
    chilkatJNI.CkSshTunnel_put_AcceptLogPath(swigCPtr, this, newVal);
  }

  public int get_ConnectTimeoutMs() {
    return chilkatJNI.CkSshTunnel_get_ConnectTimeoutMs(swigCPtr, this);
  }

  public void put_ConnectTimeoutMs(int newVal) {
    chilkatJNI.CkSshTunnel_put_ConnectTimeoutMs(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkSshTunnel_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkSshTunnel_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkSshTunnel_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_DestHostname(CkString str) {
    chilkatJNI.CkSshTunnel_get_DestHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String destHostname() {
    return chilkatJNI.CkSshTunnel_destHostname(swigCPtr, this);
  }

  public void put_DestHostname(String newVal) {
    chilkatJNI.CkSshTunnel_put_DestHostname(swigCPtr, this, newVal);
  }

  public int get_DestPort() {
    return chilkatJNI.CkSshTunnel_get_DestPort(swigCPtr, this);
  }

  public void put_DestPort(int newVal) {
    chilkatJNI.CkSshTunnel_put_DestPort(swigCPtr, this, newVal);
  }

  public boolean get_DynamicPortForwarding() {
    return chilkatJNI.CkSshTunnel_get_DynamicPortForwarding(swigCPtr, this);
  }

  public void put_DynamicPortForwarding(boolean newVal) {
    chilkatJNI.CkSshTunnel_put_DynamicPortForwarding(swigCPtr, this, newVal);
  }

  public void get_HostKeyFingerprint(CkString str) {
    chilkatJNI.CkSshTunnel_get_HostKeyFingerprint(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String hostKeyFingerprint() {
    return chilkatJNI.CkSshTunnel_hostKeyFingerprint(swigCPtr, this);
  }

  public void get_HttpProxyAuthMethod(CkString str) {
    chilkatJNI.CkSshTunnel_get_HttpProxyAuthMethod(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyAuthMethod() {
    return chilkatJNI.CkSshTunnel_httpProxyAuthMethod(swigCPtr, this);
  }

  public void put_HttpProxyAuthMethod(String newVal) {
    chilkatJNI.CkSshTunnel_put_HttpProxyAuthMethod(swigCPtr, this, newVal);
  }

  public void get_HttpProxyDomain(CkString str) {
    chilkatJNI.CkSshTunnel_get_HttpProxyDomain(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyDomain() {
    return chilkatJNI.CkSshTunnel_httpProxyDomain(swigCPtr, this);
  }

  public void put_HttpProxyDomain(String newVal) {
    chilkatJNI.CkSshTunnel_put_HttpProxyDomain(swigCPtr, this, newVal);
  }

  public void get_HttpProxyHostname(CkString str) {
    chilkatJNI.CkSshTunnel_get_HttpProxyHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyHostname() {
    return chilkatJNI.CkSshTunnel_httpProxyHostname(swigCPtr, this);
  }

  public void put_HttpProxyHostname(String newVal) {
    chilkatJNI.CkSshTunnel_put_HttpProxyHostname(swigCPtr, this, newVal);
  }

  public void get_HttpProxyPassword(CkString str) {
    chilkatJNI.CkSshTunnel_get_HttpProxyPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyPassword() {
    return chilkatJNI.CkSshTunnel_httpProxyPassword(swigCPtr, this);
  }

  public void put_HttpProxyPassword(String newVal) {
    chilkatJNI.CkSshTunnel_put_HttpProxyPassword(swigCPtr, this, newVal);
  }

  public int get_HttpProxyPort() {
    return chilkatJNI.CkSshTunnel_get_HttpProxyPort(swigCPtr, this);
  }

  public void put_HttpProxyPort(int newVal) {
    chilkatJNI.CkSshTunnel_put_HttpProxyPort(swigCPtr, this, newVal);
  }

  public void get_HttpProxyUsername(CkString str) {
    chilkatJNI.CkSshTunnel_get_HttpProxyUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String httpProxyUsername() {
    return chilkatJNI.CkSshTunnel_httpProxyUsername(swigCPtr, this);
  }

  public void put_HttpProxyUsername(String newVal) {
    chilkatJNI.CkSshTunnel_put_HttpProxyUsername(swigCPtr, this, newVal);
  }

  public int get_IdleTimeoutMs() {
    return chilkatJNI.CkSshTunnel_get_IdleTimeoutMs(swigCPtr, this);
  }

  public void put_IdleTimeoutMs(int newVal) {
    chilkatJNI.CkSshTunnel_put_IdleTimeoutMs(swigCPtr, this, newVal);
  }

  public void get_InboundSocksPassword(CkString str) {
    chilkatJNI.CkSshTunnel_get_InboundSocksPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String inboundSocksPassword() {
    return chilkatJNI.CkSshTunnel_inboundSocksPassword(swigCPtr, this);
  }

  public void put_InboundSocksPassword(String newVal) {
    chilkatJNI.CkSshTunnel_put_InboundSocksPassword(swigCPtr, this, newVal);
  }

  public void get_InboundSocksUsername(CkString str) {
    chilkatJNI.CkSshTunnel_get_InboundSocksUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String inboundSocksUsername() {
    return chilkatJNI.CkSshTunnel_inboundSocksUsername(swigCPtr, this);
  }

  public void put_InboundSocksUsername(String newVal) {
    chilkatJNI.CkSshTunnel_put_InboundSocksUsername(swigCPtr, this, newVal);
  }

  public boolean get_IsAccepting() {
    return chilkatJNI.CkSshTunnel_get_IsAccepting(swigCPtr, this);
  }

  public boolean get_KeepAcceptLog() {
    return chilkatJNI.CkSshTunnel_get_KeepAcceptLog(swigCPtr, this);
  }

  public void put_KeepAcceptLog(boolean newVal) {
    chilkatJNI.CkSshTunnel_put_KeepAcceptLog(swigCPtr, this, newVal);
  }

  public boolean get_KeepTunnelLog() {
    return chilkatJNI.CkSshTunnel_get_KeepTunnelLog(swigCPtr, this);
  }

  public void put_KeepTunnelLog(boolean newVal) {
    chilkatJNI.CkSshTunnel_put_KeepTunnelLog(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkSshTunnel_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkSshTunnel_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkSshTunnel_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkSshTunnel_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkSshTunnel_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkSshTunnel_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkSshTunnel_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkSshTunnel_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_ListenBindIpAddress(CkString str) {
    chilkatJNI.CkSshTunnel_get_ListenBindIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String listenBindIpAddress() {
    return chilkatJNI.CkSshTunnel_listenBindIpAddress(swigCPtr, this);
  }

  public void put_ListenBindIpAddress(String newVal) {
    chilkatJNI.CkSshTunnel_put_ListenBindIpAddress(swigCPtr, this, newVal);
  }

  public int get_ListenPort() {
    return chilkatJNI.CkSshTunnel_get_ListenPort(swigCPtr, this);
  }

  public void get_OutboundBindIpAddress(CkString str) {
    chilkatJNI.CkSshTunnel_get_OutboundBindIpAddress(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String outboundBindIpAddress() {
    return chilkatJNI.CkSshTunnel_outboundBindIpAddress(swigCPtr, this);
  }

  public void put_OutboundBindIpAddress(String newVal) {
    chilkatJNI.CkSshTunnel_put_OutboundBindIpAddress(swigCPtr, this, newVal);
  }

  public int get_OutboundBindPort() {
    return chilkatJNI.CkSshTunnel_get_OutboundBindPort(swigCPtr, this);
  }

  public void put_OutboundBindPort(int newVal) {
    chilkatJNI.CkSshTunnel_put_OutboundBindPort(swigCPtr, this, newVal);
  }

  public boolean get_PreferIpv6() {
    return chilkatJNI.CkSshTunnel_get_PreferIpv6(swigCPtr, this);
  }

  public void put_PreferIpv6(boolean newVal) {
    chilkatJNI.CkSshTunnel_put_PreferIpv6(swigCPtr, this, newVal);
  }

  public void get_SocksHostname(CkString str) {
    chilkatJNI.CkSshTunnel_get_SocksHostname(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksHostname() {
    return chilkatJNI.CkSshTunnel_socksHostname(swigCPtr, this);
  }

  public void put_SocksHostname(String newVal) {
    chilkatJNI.CkSshTunnel_put_SocksHostname(swigCPtr, this, newVal);
  }

  public void get_SocksPassword(CkString str) {
    chilkatJNI.CkSshTunnel_get_SocksPassword(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksPassword() {
    return chilkatJNI.CkSshTunnel_socksPassword(swigCPtr, this);
  }

  public void put_SocksPassword(String newVal) {
    chilkatJNI.CkSshTunnel_put_SocksPassword(swigCPtr, this, newVal);
  }

  public int get_SocksPort() {
    return chilkatJNI.CkSshTunnel_get_SocksPort(swigCPtr, this);
  }

  public void put_SocksPort(int newVal) {
    chilkatJNI.CkSshTunnel_put_SocksPort(swigCPtr, this, newVal);
  }

  public void get_SocksUsername(CkString str) {
    chilkatJNI.CkSshTunnel_get_SocksUsername(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String socksUsername() {
    return chilkatJNI.CkSshTunnel_socksUsername(swigCPtr, this);
  }

  public void put_SocksUsername(String newVal) {
    chilkatJNI.CkSshTunnel_put_SocksUsername(swigCPtr, this, newVal);
  }

  public int get_SocksVersion() {
    return chilkatJNI.CkSshTunnel_get_SocksVersion(swigCPtr, this);
  }

  public void put_SocksVersion(int newVal) {
    chilkatJNI.CkSshTunnel_put_SocksVersion(swigCPtr, this, newVal);
  }

  public int get_SoRcvBuf() {
    return chilkatJNI.CkSshTunnel_get_SoRcvBuf(swigCPtr, this);
  }

  public void put_SoRcvBuf(int newVal) {
    chilkatJNI.CkSshTunnel_put_SoRcvBuf(swigCPtr, this, newVal);
  }

  public int get_SoSndBuf() {
    return chilkatJNI.CkSshTunnel_get_SoSndBuf(swigCPtr, this);
  }

  public void put_SoSndBuf(int newVal) {
    chilkatJNI.CkSshTunnel_put_SoSndBuf(swigCPtr, this, newVal);
  }

  public boolean get_TcpNoDelay() {
    return chilkatJNI.CkSshTunnel_get_TcpNoDelay(swigCPtr, this);
  }

  public void put_TcpNoDelay(boolean newVal) {
    chilkatJNI.CkSshTunnel_put_TcpNoDelay(swigCPtr, this, newVal);
  }

  public void get_TunnelLog(CkString str) {
    chilkatJNI.CkSshTunnel_get_TunnelLog(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String tunnelLog() {
    return chilkatJNI.CkSshTunnel_tunnelLog(swigCPtr, this);
  }

  public void put_TunnelLog(String newVal) {
    chilkatJNI.CkSshTunnel_put_TunnelLog(swigCPtr, this, newVal);
  }

  public void get_TunnelLogPath(CkString str) {
    chilkatJNI.CkSshTunnel_get_TunnelLogPath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String tunnelLogPath() {
    return chilkatJNI.CkSshTunnel_tunnelLogPath(swigCPtr, this);
  }

  public void put_TunnelLogPath(String newVal) {
    chilkatJNI.CkSshTunnel_put_TunnelLogPath(swigCPtr, this, newVal);
  }

  public void get_UncommonOptions(CkString str) {
    chilkatJNI.CkSshTunnel_get_UncommonOptions(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String uncommonOptions() {
    return chilkatJNI.CkSshTunnel_uncommonOptions(swigCPtr, this);
  }

  public void put_UncommonOptions(String newVal) {
    chilkatJNI.CkSshTunnel_put_UncommonOptions(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkSshTunnel_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkSshTunnel_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkSshTunnel_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkSshTunnel_version(swigCPtr, this);
  }

  public boolean AuthenticatePk(String username, CkSshKey privateKey) {
    return chilkatJNI.CkSshTunnel_AuthenticatePk(swigCPtr, this, username, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public CkTask AuthenticatePkAsync(String username, CkSshKey privateKey) {
    long cPtr = chilkatJNI.CkSshTunnel_AuthenticatePkAsync(swigCPtr, this, username, CkSshKey.getCPtr(privateKey), privateKey);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean AuthenticatePw(String login, String password) {
    return chilkatJNI.CkSshTunnel_AuthenticatePw(swigCPtr, this, login, password);
  }

  public CkTask AuthenticatePwAsync(String login, String password) {
    long cPtr = chilkatJNI.CkSshTunnel_AuthenticatePwAsync(swigCPtr, this, login, password);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean AuthenticatePwPk(String username, String password, CkSshKey privateKey) {
    return chilkatJNI.CkSshTunnel_AuthenticatePwPk(swigCPtr, this, username, password, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public CkTask AuthenticatePwPkAsync(String username, String password, CkSshKey privateKey) {
    long cPtr = chilkatJNI.CkSshTunnel_AuthenticatePwPkAsync(swigCPtr, this, username, password, CkSshKey.getCPtr(privateKey), privateKey);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean AuthenticateSecPw(CkSecureString login, CkSecureString password) {
    return chilkatJNI.CkSshTunnel_AuthenticateSecPw(swigCPtr, this, CkSecureString.getCPtr(login), login, CkSecureString.getCPtr(password), password);
  }

  public CkTask AuthenticateSecPwAsync(CkSecureString login, CkSecureString password) {
    long cPtr = chilkatJNI.CkSshTunnel_AuthenticateSecPwAsync(swigCPtr, this, CkSecureString.getCPtr(login), login, CkSecureString.getCPtr(password), password);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean AuthenticateSecPwPk(CkSecureString username, CkSecureString password, CkSshKey privateKey) {
    return chilkatJNI.CkSshTunnel_AuthenticateSecPwPk(swigCPtr, this, CkSecureString.getCPtr(username), username, CkSecureString.getCPtr(password), password, CkSshKey.getCPtr(privateKey), privateKey);
  }

  public CkTask AuthenticateSecPwPkAsync(CkSecureString username, CkSecureString password, CkSshKey privateKey) {
    long cPtr = chilkatJNI.CkSshTunnel_AuthenticateSecPwPkAsync(swigCPtr, this, CkSecureString.getCPtr(username), username, CkSecureString.getCPtr(password), password, CkSshKey.getCPtr(privateKey), privateKey);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean BeginAccepting(int listenPort) {
    return chilkatJNI.CkSshTunnel_BeginAccepting(swigCPtr, this, listenPort);
  }

  public CkTask BeginAcceptingAsync(int listenPort) {
    long cPtr = chilkatJNI.CkSshTunnel_BeginAcceptingAsync(swigCPtr, this, listenPort);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CloseTunnel(boolean waitForThreads) {
    return chilkatJNI.CkSshTunnel_CloseTunnel(swigCPtr, this, waitForThreads);
  }

  public boolean Connect(String hostname, int port) {
    return chilkatJNI.CkSshTunnel_Connect(swigCPtr, this, hostname, port);
  }

  public CkTask ConnectAsync(String hostname, int port) {
    long cPtr = chilkatJNI.CkSshTunnel_ConnectAsync(swigCPtr, this, hostname, port);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean ConnectThroughSsh(CkSsh ssh, String hostname, int port) {
    return chilkatJNI.CkSshTunnel_ConnectThroughSsh(swigCPtr, this, CkSsh.getCPtr(ssh), ssh, hostname, port);
  }

  public CkTask ConnectThroughSshAsync(CkSsh ssh, String hostname, int port) {
    long cPtr = chilkatJNI.CkSshTunnel_ConnectThroughSshAsync(swigCPtr, this, CkSsh.getCPtr(ssh), ssh, hostname, port);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean DisconnectAllClients(boolean waitForThreads) {
    return chilkatJNI.CkSshTunnel_DisconnectAllClients(swigCPtr, this, waitForThreads);
  }

  public boolean GetCurrentState(CkString outStr) {
    return chilkatJNI.CkSshTunnel_GetCurrentState(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getCurrentState() {
    return chilkatJNI.CkSshTunnel_getCurrentState(swigCPtr, this);
  }

  public String currentState() {
    return chilkatJNI.CkSshTunnel_currentState(swigCPtr, this);
  }

  public boolean IsSshConnected() {
    return chilkatJNI.CkSshTunnel_IsSshConnected(swigCPtr, this);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkSshTunnel_SaveLastError(swigCPtr, this, path);
  }

  public boolean StopAccepting(boolean waitForThread) {
    return chilkatJNI.CkSshTunnel_StopAccepting(swigCPtr, this, waitForThread);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkSshTunnel_UnlockComponent(swigCPtr, this, unlockCode);
  }

}
