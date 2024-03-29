/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkMime {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkMime(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkMime obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkMime(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkMime() {
    this(chilkatJNI.new_CkMime(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkMime_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkMime_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkMime_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_Boundary(CkString str) {
    chilkatJNI.CkMime_get_Boundary(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String boundary() {
    return chilkatJNI.CkMime_boundary(swigCPtr, this);
  }

  public void put_Boundary(String newVal) {
    chilkatJNI.CkMime_put_Boundary(swigCPtr, this, newVal);
  }

  public void get_Charset(CkString str) {
    chilkatJNI.CkMime_get_Charset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String charset() {
    return chilkatJNI.CkMime_charset(swigCPtr, this);
  }

  public void put_Charset(String newVal) {
    chilkatJNI.CkMime_put_Charset(swigCPtr, this, newVal);
  }

  public void get_ContentType(CkString str) {
    chilkatJNI.CkMime_get_ContentType(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String contentType() {
    return chilkatJNI.CkMime_contentType(swigCPtr, this);
  }

  public void put_ContentType(String newVal) {
    chilkatJNI.CkMime_put_ContentType(swigCPtr, this, newVal);
  }

  public void get_CurrentDateTime(CkString str) {
    chilkatJNI.CkMime_get_CurrentDateTime(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String currentDateTime() {
    return chilkatJNI.CkMime_currentDateTime(swigCPtr, this);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkMime_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkMime_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkMime_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_Disposition(CkString str) {
    chilkatJNI.CkMime_get_Disposition(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String disposition() {
    return chilkatJNI.CkMime_disposition(swigCPtr, this);
  }

  public void put_Disposition(String newVal) {
    chilkatJNI.CkMime_put_Disposition(swigCPtr, this, newVal);
  }

  public void get_Encoding(CkString str) {
    chilkatJNI.CkMime_get_Encoding(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String encoding() {
    return chilkatJNI.CkMime_encoding(swigCPtr, this);
  }

  public void put_Encoding(String newVal) {
    chilkatJNI.CkMime_put_Encoding(swigCPtr, this, newVal);
  }

  public void get_Filename(CkString str) {
    chilkatJNI.CkMime_get_Filename(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String filename() {
    return chilkatJNI.CkMime_filename(swigCPtr, this);
  }

  public void put_Filename(String newVal) {
    chilkatJNI.CkMime_put_Filename(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkMime_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkMime_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkMime_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkMime_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkMime_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkMime_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkMime_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkMime_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_Micalg(CkString str) {
    chilkatJNI.CkMime_get_Micalg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String micalg() {
    return chilkatJNI.CkMime_micalg(swigCPtr, this);
  }

  public void put_Micalg(String newVal) {
    chilkatJNI.CkMime_put_Micalg(swigCPtr, this, newVal);
  }

  public void get_Name(CkString str) {
    chilkatJNI.CkMime_get_Name(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String name() {
    return chilkatJNI.CkMime_name(swigCPtr, this);
  }

  public void put_Name(String newVal) {
    chilkatJNI.CkMime_put_Name(swigCPtr, this, newVal);
  }

  public int get_NumEncryptCerts() {
    return chilkatJNI.CkMime_get_NumEncryptCerts(swigCPtr, this);
  }

  public int get_NumHeaderFields() {
    return chilkatJNI.CkMime_get_NumHeaderFields(swigCPtr, this);
  }

  public int get_NumParts() {
    return chilkatJNI.CkMime_get_NumParts(swigCPtr, this);
  }

  public int get_NumSignerCerts() {
    return chilkatJNI.CkMime_get_NumSignerCerts(swigCPtr, this);
  }

  public void get_OaepHash(CkString str) {
    chilkatJNI.CkMime_get_OaepHash(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String oaepHash() {
    return chilkatJNI.CkMime_oaepHash(swigCPtr, this);
  }

  public void put_OaepHash(String newVal) {
    chilkatJNI.CkMime_put_OaepHash(swigCPtr, this, newVal);
  }

  public void get_OaepMgfHash(CkString str) {
    chilkatJNI.CkMime_get_OaepMgfHash(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String oaepMgfHash() {
    return chilkatJNI.CkMime_oaepMgfHash(swigCPtr, this);
  }

  public void put_OaepMgfHash(String newVal) {
    chilkatJNI.CkMime_put_OaepMgfHash(swigCPtr, this, newVal);
  }

  public boolean get_OaepPadding() {
    return chilkatJNI.CkMime_get_OaepPadding(swigCPtr, this);
  }

  public void put_OaepPadding(boolean newVal) {
    chilkatJNI.CkMime_put_OaepPadding(swigCPtr, this, newVal);
  }

  public void get_Pkcs7CryptAlg(CkString str) {
    chilkatJNI.CkMime_get_Pkcs7CryptAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String pkcs7CryptAlg() {
    return chilkatJNI.CkMime_pkcs7CryptAlg(swigCPtr, this);
  }

  public void put_Pkcs7CryptAlg(String newVal) {
    chilkatJNI.CkMime_put_Pkcs7CryptAlg(swigCPtr, this, newVal);
  }

  public int get_Pkcs7KeyLength() {
    return chilkatJNI.CkMime_get_Pkcs7KeyLength(swigCPtr, this);
  }

  public void put_Pkcs7KeyLength(int newVal) {
    chilkatJNI.CkMime_put_Pkcs7KeyLength(swigCPtr, this, newVal);
  }

  public void get_Protocol(CkString str) {
    chilkatJNI.CkMime_get_Protocol(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String protocol() {
    return chilkatJNI.CkMime_protocol(swigCPtr, this);
  }

  public void put_Protocol(String newVal) {
    chilkatJNI.CkMime_put_Protocol(swigCPtr, this, newVal);
  }

  public void get_SigningAlg(CkString str) {
    chilkatJNI.CkMime_get_SigningAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String signingAlg() {
    return chilkatJNI.CkMime_signingAlg(swigCPtr, this);
  }

  public void put_SigningAlg(String newVal) {
    chilkatJNI.CkMime_put_SigningAlg(swigCPtr, this, newVal);
  }

  public void get_SigningHashAlg(CkString str) {
    chilkatJNI.CkMime_get_SigningHashAlg(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String signingHashAlg() {
    return chilkatJNI.CkMime_signingHashAlg(swigCPtr, this);
  }

  public void put_SigningHashAlg(String newVal) {
    chilkatJNI.CkMime_put_SigningHashAlg(swigCPtr, this, newVal);
  }

  public boolean get_UnwrapExtras() {
    return chilkatJNI.CkMime_get_UnwrapExtras(swigCPtr, this);
  }

  public void put_UnwrapExtras(boolean newVal) {
    chilkatJNI.CkMime_put_UnwrapExtras(swigCPtr, this, newVal);
  }

  public boolean get_UseMmDescription() {
    return chilkatJNI.CkMime_get_UseMmDescription(swigCPtr, this);
  }

  public void put_UseMmDescription(boolean newVal) {
    chilkatJNI.CkMime_put_UseMmDescription(swigCPtr, this, newVal);
  }

  public boolean get_UseXPkcs7() {
    return chilkatJNI.CkMime_get_UseXPkcs7(swigCPtr, this);
  }

  public void put_UseXPkcs7(boolean newVal) {
    chilkatJNI.CkMime_put_UseXPkcs7(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkMime_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkMime_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkMime_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkMime_version(swigCPtr, this);
  }

  public void AddContentLength() {
    chilkatJNI.CkMime_AddContentLength(swigCPtr, this);
  }

  public boolean AddDecryptCert(CkCert cert) {
    return chilkatJNI.CkMime_AddDecryptCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean AddDetachedSignature(CkCert cert) {
    return chilkatJNI.CkMime_AddDetachedSignature(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean AddDetachedSignature2(CkCert cert, boolean transferHeaderFields) {
    return chilkatJNI.CkMime_AddDetachedSignature2(swigCPtr, this, CkCert.getCPtr(cert), cert, transferHeaderFields);
  }

  public boolean AddDetachedSignaturePk(CkCert cert, CkPrivateKey privateKey) {
    return chilkatJNI.CkMime_AddDetachedSignaturePk(swigCPtr, this, CkCert.getCPtr(cert), cert, CkPrivateKey.getCPtr(privateKey), privateKey);
  }

  public boolean AddDetachedSignaturePk2(CkCert cert, CkPrivateKey privateKey, boolean transferHeaderFields) {
    return chilkatJNI.CkMime_AddDetachedSignaturePk2(swigCPtr, this, CkCert.getCPtr(cert), cert, CkPrivateKey.getCPtr(privateKey), privateKey, transferHeaderFields);
  }

  public boolean AddEncryptCert(CkCert cert) {
    return chilkatJNI.CkMime_AddEncryptCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean AddHeaderField(String name, String value) {
    return chilkatJNI.CkMime_AddHeaderField(swigCPtr, this, name, value);
  }

  public boolean AddPfxSourceData(CkByteData pfxFileData, String pfxPassword) {
    return chilkatJNI.CkMime_AddPfxSourceData(swigCPtr, this, CkByteData.getCPtr(pfxFileData), pfxFileData, pfxPassword);
  }

  public boolean AddPfxSourceFile(String pfxFilePath, String password) {
    return chilkatJNI.CkMime_AddPfxSourceFile(swigCPtr, this, pfxFilePath, password);
  }

  public boolean AppendPart(CkMime mime) {
    return chilkatJNI.CkMime_AppendPart(swigCPtr, this, CkMime.getCPtr(mime), mime);
  }

  public boolean AppendPartFromFile(String filename) {
    return chilkatJNI.CkMime_AppendPartFromFile(swigCPtr, this, filename);
  }

  public boolean AsnBodyToXml(CkString outStr) {
    return chilkatJNI.CkMime_AsnBodyToXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String asnBodyToXml() {
    return chilkatJNI.CkMime_asnBodyToXml(swigCPtr, this);
  }

  public void ClearEncryptCerts() {
    chilkatJNI.CkMime_ClearEncryptCerts(swigCPtr, this);
  }

  public boolean ContainsEncryptedParts() {
    return chilkatJNI.CkMime_ContainsEncryptedParts(swigCPtr, this);
  }

  public boolean ContainsSignedParts() {
    return chilkatJNI.CkMime_ContainsSignedParts(swigCPtr, this);
  }

  public void Convert8Bit() {
    chilkatJNI.CkMime_Convert8Bit(swigCPtr, this);
  }

  public boolean ConvertToMultipartAlt() {
    return chilkatJNI.CkMime_ConvertToMultipartAlt(swigCPtr, this);
  }

  public boolean ConvertToMultipartMixed() {
    return chilkatJNI.CkMime_ConvertToMultipartMixed(swigCPtr, this);
  }

  public boolean ConvertToSigned(CkCert cert) {
    return chilkatJNI.CkMime_ConvertToSigned(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean ConvertToSignedPk(CkCert cert, CkPrivateKey privateKey) {
    return chilkatJNI.CkMime_ConvertToSignedPk(swigCPtr, this, CkCert.getCPtr(cert), cert, CkPrivateKey.getCPtr(privateKey), privateKey);
  }

  public boolean Decrypt() {
    return chilkatJNI.CkMime_Decrypt(swigCPtr, this);
  }

  public boolean Decrypt2(CkCert cert, CkPrivateKey privateKey) {
    return chilkatJNI.CkMime_Decrypt2(swigCPtr, this, CkCert.getCPtr(cert), cert, CkPrivateKey.getCPtr(privateKey), privateKey);
  }

  public boolean DecryptUsingCert(CkCert cert) {
    return chilkatJNI.CkMime_DecryptUsingCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean DecryptUsingPfxData(CkByteData pfxData, String password) {
    return chilkatJNI.CkMime_DecryptUsingPfxData(swigCPtr, this, CkByteData.getCPtr(pfxData), pfxData, password);
  }

  public boolean DecryptUsingPfxFile(String pfxFilePath, String pfxPassword) {
    return chilkatJNI.CkMime_DecryptUsingPfxFile(swigCPtr, this, pfxFilePath, pfxPassword);
  }

  public boolean Encrypt(CkCert cert) {
    return chilkatJNI.CkMime_Encrypt(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean EncryptN() {
    return chilkatJNI.CkMime_EncryptN(swigCPtr, this);
  }

  public CkStringArray ExtractPartsToFiles(String dirPath) {
    long cPtr = chilkatJNI.CkMime_ExtractPartsToFiles(swigCPtr, this, dirPath);
    return (cPtr == 0) ? null : new CkStringArray(cPtr, true);
  }

  public CkCert FindIssuer(CkCert cert) {
    long cPtr = chilkatJNI.CkMime_FindIssuer(swigCPtr, this, CkCert.getCPtr(cert), cert);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public boolean GetBodyBd(CkBinData binDat) {
    return chilkatJNI.CkMime_GetBodyBd(swigCPtr, this, CkBinData.getCPtr(binDat), binDat);
  }

  public boolean GetBodyBinary(CkByteData outData) {
    return chilkatJNI.CkMime_GetBodyBinary(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public boolean GetBodyDecoded(CkString outStr) {
    return chilkatJNI.CkMime_GetBodyDecoded(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getBodyDecoded() {
    return chilkatJNI.CkMime_getBodyDecoded(swigCPtr, this);
  }

  public String bodyDecoded() {
    return chilkatJNI.CkMime_bodyDecoded(swigCPtr, this);
  }

  public boolean GetBodyEncoded(CkString outStr) {
    return chilkatJNI.CkMime_GetBodyEncoded(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getBodyEncoded() {
    return chilkatJNI.CkMime_getBodyEncoded(swigCPtr, this);
  }

  public String bodyEncoded() {
    return chilkatJNI.CkMime_bodyEncoded(swigCPtr, this);
  }

  public CkCert GetEncryptCert(int index) {
    long cPtr = chilkatJNI.CkMime_GetEncryptCert(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public boolean GetEntireBody(CkString outStr) {
    return chilkatJNI.CkMime_GetEntireBody(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getEntireBody() {
    return chilkatJNI.CkMime_getEntireBody(swigCPtr, this);
  }

  public String entireBody() {
    return chilkatJNI.CkMime_entireBody(swigCPtr, this);
  }

  public boolean GetEntireHead(CkString outStr) {
    return chilkatJNI.CkMime_GetEntireHead(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getEntireHead() {
    return chilkatJNI.CkMime_getEntireHead(swigCPtr, this);
  }

  public String entireHead() {
    return chilkatJNI.CkMime_entireHead(swigCPtr, this);
  }

  public boolean GetHeaderField(String fieldName, CkString outStr) {
    return chilkatJNI.CkMime_GetHeaderField(swigCPtr, this, fieldName, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderField(String fieldName) {
    return chilkatJNI.CkMime_getHeaderField(swigCPtr, this, fieldName);
  }

  public String headerField(String fieldName) {
    return chilkatJNI.CkMime_headerField(swigCPtr, this, fieldName);
  }

  public boolean GetHeaderFieldAttribute(String name, String attrName, CkString outStr) {
    return chilkatJNI.CkMime_GetHeaderFieldAttribute(swigCPtr, this, name, attrName, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderFieldAttribute(String name, String attrName) {
    return chilkatJNI.CkMime_getHeaderFieldAttribute(swigCPtr, this, name, attrName);
  }

  public String headerFieldAttribute(String name, String attrName) {
    return chilkatJNI.CkMime_headerFieldAttribute(swigCPtr, this, name, attrName);
  }

  public boolean GetHeaderFieldName(int index, CkString outStr) {
    return chilkatJNI.CkMime_GetHeaderFieldName(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderFieldName(int index) {
    return chilkatJNI.CkMime_getHeaderFieldName(swigCPtr, this, index);
  }

  public String headerFieldName(int index) {
    return chilkatJNI.CkMime_headerFieldName(swigCPtr, this, index);
  }

  public boolean GetHeaderFieldValue(int index, CkString outStr) {
    return chilkatJNI.CkMime_GetHeaderFieldValue(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getHeaderFieldValue(int index) {
    return chilkatJNI.CkMime_getHeaderFieldValue(swigCPtr, this, index);
  }

  public String headerFieldValue(int index) {
    return chilkatJNI.CkMime_headerFieldValue(swigCPtr, this, index);
  }

  public boolean GetMime(CkString outStr) {
    return chilkatJNI.CkMime_GetMime(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getMime() {
    return chilkatJNI.CkMime_getMime(swigCPtr, this);
  }

  public String mime() {
    return chilkatJNI.CkMime_mime(swigCPtr, this);
  }

  public boolean GetMimeBd(CkBinData bindat) {
    return chilkatJNI.CkMime_GetMimeBd(swigCPtr, this, CkBinData.getCPtr(bindat), bindat);
  }

  public boolean GetMimeBytes(CkByteData outBytes) {
    return chilkatJNI.CkMime_GetMimeBytes(swigCPtr, this, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean GetMimeSb(CkStringBuilder sb) {
    return chilkatJNI.CkMime_GetMimeSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public CkMime GetPart(int index) {
    long cPtr = chilkatJNI.CkMime_GetPart(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkMime(cPtr, true);
  }

  public boolean GetSignatureSigningTime(int index, SYSTEMTIME outSysTime) {
    return chilkatJNI.CkMime_GetSignatureSigningTime(swigCPtr, this, index, SYSTEMTIME.getCPtr(outSysTime), outSysTime);
  }

  public boolean GetSignatureSigningTimeStr(int index, CkString outStr) {
    return chilkatJNI.CkMime_GetSignatureSigningTimeStr(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String getSignatureSigningTimeStr(int index) {
    return chilkatJNI.CkMime_getSignatureSigningTimeStr(swigCPtr, this, index);
  }

  public String signatureSigningTimeStr(int index) {
    return chilkatJNI.CkMime_signatureSigningTimeStr(swigCPtr, this, index);
  }

  public CkCert GetSignerCert(int index) {
    long cPtr = chilkatJNI.CkMime_GetSignerCert(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCert(cPtr, true);
  }

  public CkCertChain GetSignerCertChain(int index) {
    long cPtr = chilkatJNI.CkMime_GetSignerCertChain(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkCertChain(cPtr, true);
  }

  public boolean GetStructure(String fmt, CkString outStr) {
    return chilkatJNI.CkMime_GetStructure(swigCPtr, this, fmt, CkString.getCPtr(outStr), outStr);
  }

  public String getStructure(String fmt) {
    return chilkatJNI.CkMime_getStructure(swigCPtr, this, fmt);
  }

  public String structure(String fmt) {
    return chilkatJNI.CkMime_structure(swigCPtr, this, fmt);
  }

  public boolean GetXml(CkString outStr) {
    return chilkatJNI.CkMime_GetXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String getXml() {
    return chilkatJNI.CkMime_getXml(swigCPtr, this);
  }

  public String xml() {
    return chilkatJNI.CkMime_xml(swigCPtr, this);
  }

  public boolean HasSignatureSigningTime(int index) {
    return chilkatJNI.CkMime_HasSignatureSigningTime(swigCPtr, this, index);
  }

  public boolean IsApplicationData() {
    return chilkatJNI.CkMime_IsApplicationData(swigCPtr, this);
  }

  public boolean IsAttachment() {
    return chilkatJNI.CkMime_IsAttachment(swigCPtr, this);
  }

  public boolean IsAudio() {
    return chilkatJNI.CkMime_IsAudio(swigCPtr, this);
  }

  public boolean IsEncrypted() {
    return chilkatJNI.CkMime_IsEncrypted(swigCPtr, this);
  }

  public boolean IsHtml() {
    return chilkatJNI.CkMime_IsHtml(swigCPtr, this);
  }

  public boolean IsImage() {
    return chilkatJNI.CkMime_IsImage(swigCPtr, this);
  }

  public boolean IsMultipart() {
    return chilkatJNI.CkMime_IsMultipart(swigCPtr, this);
  }

  public boolean IsMultipartAlternative() {
    return chilkatJNI.CkMime_IsMultipartAlternative(swigCPtr, this);
  }

  public boolean IsMultipartMixed() {
    return chilkatJNI.CkMime_IsMultipartMixed(swigCPtr, this);
  }

  public boolean IsMultipartRelated() {
    return chilkatJNI.CkMime_IsMultipartRelated(swigCPtr, this);
  }

  public boolean IsPlainText() {
    return chilkatJNI.CkMime_IsPlainText(swigCPtr, this);
  }

  public boolean IsSigned() {
    return chilkatJNI.CkMime_IsSigned(swigCPtr, this);
  }

  public boolean IsText() {
    return chilkatJNI.CkMime_IsText(swigCPtr, this);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkMime_IsUnlocked(swigCPtr, this);
  }

  public boolean IsVideo() {
    return chilkatJNI.CkMime_IsVideo(swigCPtr, this);
  }

  public boolean IsXml() {
    return chilkatJNI.CkMime_IsXml(swigCPtr, this);
  }

  public CkJsonObject LastJsonData() {
    long cPtr = chilkatJNI.CkMime_LastJsonData(swigCPtr, this);
    return (cPtr == 0) ? null : new CkJsonObject(cPtr, true);
  }

  public boolean LoadMime(String mimeMsg) {
    return chilkatJNI.CkMime_LoadMime(swigCPtr, this, mimeMsg);
  }

  public boolean LoadMimeBd(CkBinData bindat) {
    return chilkatJNI.CkMime_LoadMimeBd(swigCPtr, this, CkBinData.getCPtr(bindat), bindat);
  }

  public boolean LoadMimeBytes(CkByteData binData) {
    return chilkatJNI.CkMime_LoadMimeBytes(swigCPtr, this, CkByteData.getCPtr(binData), binData);
  }

  public boolean LoadMimeFile(String fileName) {
    return chilkatJNI.CkMime_LoadMimeFile(swigCPtr, this, fileName);
  }

  public boolean LoadMimeSb(CkStringBuilder sb) {
    return chilkatJNI.CkMime_LoadMimeSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public boolean LoadXml(String xml) {
    return chilkatJNI.CkMime_LoadXml(swigCPtr, this, xml);
  }

  public boolean LoadXmlFile(String fileName) {
    return chilkatJNI.CkMime_LoadXmlFile(swigCPtr, this, fileName);
  }

  public boolean NewMessageRfc822(CkMime mimeObject) {
    return chilkatJNI.CkMime_NewMessageRfc822(swigCPtr, this, CkMime.getCPtr(mimeObject), mimeObject);
  }

  public boolean NewMultipartAlternative() {
    return chilkatJNI.CkMime_NewMultipartAlternative(swigCPtr, this);
  }

  public boolean NewMultipartMixed() {
    return chilkatJNI.CkMime_NewMultipartMixed(swigCPtr, this);
  }

  public boolean NewMultipartRelated() {
    return chilkatJNI.CkMime_NewMultipartRelated(swigCPtr, this);
  }

  public void RemoveHeaderField(String fieldName, boolean bAllOccurrences) {
    chilkatJNI.CkMime_RemoveHeaderField(swigCPtr, this, fieldName, bAllOccurrences);
  }

  public boolean RemovePart(int index) {
    return chilkatJNI.CkMime_RemovePart(swigCPtr, this, index);
  }

  public boolean SaveBody(String filename) {
    return chilkatJNI.CkMime_SaveBody(swigCPtr, this, filename);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkMime_SaveLastError(swigCPtr, this, path);
  }

  public boolean SaveMime(String filename) {
    return chilkatJNI.CkMime_SaveMime(swigCPtr, this, filename);
  }

  public boolean SaveXml(String filename) {
    return chilkatJNI.CkMime_SaveXml(swigCPtr, this, filename);
  }

  public void SetBody(String str) {
    chilkatJNI.CkMime_SetBody(swigCPtr, this, str);
  }

  public boolean SetBodyFromBinary(CkByteData binData) {
    return chilkatJNI.CkMime_SetBodyFromBinary(swigCPtr, this, CkByteData.getCPtr(binData), binData);
  }

  public boolean SetBodyFromEncoded(String encoding, String str) {
    return chilkatJNI.CkMime_SetBodyFromEncoded(swigCPtr, this, encoding, str);
  }

  public boolean SetBodyFromFile(String fileName) {
    return chilkatJNI.CkMime_SetBodyFromFile(swigCPtr, this, fileName);
  }

  public boolean SetBodyFromHtml(String str) {
    return chilkatJNI.CkMime_SetBodyFromHtml(swigCPtr, this, str);
  }

  public boolean SetBodyFromPlainText(String str) {
    return chilkatJNI.CkMime_SetBodyFromPlainText(swigCPtr, this, str);
  }

  public boolean SetBodyFromXml(String str) {
    return chilkatJNI.CkMime_SetBodyFromXml(swigCPtr, this, str);
  }

  public boolean SetHeaderField(String name, String value) {
    return chilkatJNI.CkMime_SetHeaderField(swigCPtr, this, name, value);
  }

  public boolean SetVerifyCert(CkCert cert) {
    return chilkatJNI.CkMime_SetVerifyCert(swigCPtr, this, CkCert.getCPtr(cert), cert);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkMime_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean UnwrapSecurity() {
    return chilkatJNI.CkMime_UnwrapSecurity(swigCPtr, this);
  }

  public void UrlEncodeBody(String charset) {
    chilkatJNI.CkMime_UrlEncodeBody(swigCPtr, this, charset);
  }

  public boolean UseCertVault(CkXmlCertVault vault) {
    return chilkatJNI.CkMime_UseCertVault(swigCPtr, this, CkXmlCertVault.getCPtr(vault), vault);
  }

  public boolean Verify() {
    return chilkatJNI.CkMime_Verify(swigCPtr, this);
  }

}
