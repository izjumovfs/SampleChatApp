/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkJsonArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkJsonArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkJsonArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkJsonArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkJsonArray() {
    this(chilkatJNI.new_CkJsonArray(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkJsonArray_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkJsonArray_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkJsonArray_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkJsonArray_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkJsonArray_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkJsonArray_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_EmitCompact() {
    return chilkatJNI.CkJsonArray_get_EmitCompact(swigCPtr, this);
  }

  public void put_EmitCompact(boolean newVal) {
    chilkatJNI.CkJsonArray_put_EmitCompact(swigCPtr, this, newVal);
  }

  public boolean get_EmitCrlf() {
    return chilkatJNI.CkJsonArray_get_EmitCrlf(swigCPtr, this);
  }

  public void put_EmitCrlf(boolean newVal) {
    chilkatJNI.CkJsonArray_put_EmitCrlf(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkJsonArray_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkJsonArray_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkJsonArray_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkJsonArray_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkJsonArray_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkJsonArray_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkJsonArray_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkJsonArray_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_Size() {
    return chilkatJNI.CkJsonArray_get_Size(swigCPtr, this);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkJsonArray_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkJsonArray_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkJsonArray_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkJsonArray_version(swigCPtr, this);
  }

  public boolean AddArrayAt(int index) {
    return chilkatJNI.CkJsonArray_AddArrayAt(swigCPtr, this, index);
  }

  public boolean AddBoolAt(int index, boolean value) {
    return chilkatJNI.CkJsonArray_AddBoolAt(swigCPtr, this, index, value);
  }

  public boolean AddIntAt(int index, int value) {
    return chilkatJNI.CkJsonArray_AddIntAt(swigCPtr, this, index, value);
  }

  public boolean AddNullAt(int index) {
    return chilkatJNI.CkJsonArray_AddNullAt(swigCPtr, this, index);
  }

  public boolean AddNumberAt(int index, String numericStr) {
    return chilkatJNI.CkJsonArray_AddNumberAt(swigCPtr, this, index, numericStr);
  }

  public boolean AddObjectAt(int index) {
    return chilkatJNI.CkJsonArray_AddObjectAt(swigCPtr, this, index);
  }

  public boolean AddStringAt(int index, String value) {
    return chilkatJNI.CkJsonArray_AddStringAt(swigCPtr, this, index, value);
  }

  public CkJsonArray ArrayAt(int index) {
    long cPtr = chilkatJNI.CkJsonArray_ArrayAt(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkJsonArray(cPtr, true);
  }

  public boolean BoolAt(int index) {
    return chilkatJNI.CkJsonArray_BoolAt(swigCPtr, this, index);
  }

  public void Clear() {
    chilkatJNI.CkJsonArray_Clear(swigCPtr, this);
  }

  public boolean DateAt(int index, CkDateTime dateTime) {
    return chilkatJNI.CkJsonArray_DateAt(swigCPtr, this, index, CkDateTime.getCPtr(dateTime), dateTime);
  }

  public boolean DeleteAt(int index) {
    return chilkatJNI.CkJsonArray_DeleteAt(swigCPtr, this, index);
  }

  public boolean DtAt(int index, boolean bLocal, CkDtObj dt) {
    return chilkatJNI.CkJsonArray_DtAt(swigCPtr, this, index, bLocal, CkDtObj.getCPtr(dt), dt);
  }

  public boolean Emit(CkString outStr) {
    return chilkatJNI.CkJsonArray_Emit(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String emit() {
    return chilkatJNI.CkJsonArray_emit(swigCPtr, this);
  }

  public boolean EmitSb(CkStringBuilder sb) {
    return chilkatJNI.CkJsonArray_EmitSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public int FindObject(String name, String value, boolean caseSensitive) {
    return chilkatJNI.CkJsonArray_FindObject(swigCPtr, this, name, value, caseSensitive);
  }

  public int FindString(String value, boolean caseSensitive) {
    return chilkatJNI.CkJsonArray_FindString(swigCPtr, this, value, caseSensitive);
  }

  public int IntAt(int index) {
    return chilkatJNI.CkJsonArray_IntAt(swigCPtr, this, index);
  }

  public boolean IsNullAt(int index) {
    return chilkatJNI.CkJsonArray_IsNullAt(swigCPtr, this, index);
  }

  public boolean Load(String jsonArray) {
    return chilkatJNI.CkJsonArray_Load(swigCPtr, this, jsonArray);
  }

  public boolean LoadSb(CkStringBuilder sb) {
    return chilkatJNI.CkJsonArray_LoadSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public CkJsonObject ObjectAt(int index) {
    long cPtr = chilkatJNI.CkJsonArray_ObjectAt(swigCPtr, this, index);
    return (cPtr == 0) ? null : new CkJsonObject(cPtr, true);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkJsonArray_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetBoolAt(int index, boolean value) {
    return chilkatJNI.CkJsonArray_SetBoolAt(swigCPtr, this, index, value);
  }

  public boolean SetIntAt(int index, int value) {
    return chilkatJNI.CkJsonArray_SetIntAt(swigCPtr, this, index, value);
  }

  public boolean SetNullAt(int index) {
    return chilkatJNI.CkJsonArray_SetNullAt(swigCPtr, this, index);
  }

  public boolean SetNumberAt(int index, String value) {
    return chilkatJNI.CkJsonArray_SetNumberAt(swigCPtr, this, index, value);
  }

  public boolean SetStringAt(int index, String value) {
    return chilkatJNI.CkJsonArray_SetStringAt(swigCPtr, this, index, value);
  }

  public boolean StringAt(int index, CkString outStr) {
    return chilkatJNI.CkJsonArray_StringAt(swigCPtr, this, index, CkString.getCPtr(outStr), outStr);
  }

  public String stringAt(int index) {
    return chilkatJNI.CkJsonArray_stringAt(swigCPtr, this, index);
  }

  public boolean Swap(int index1, int index2) {
    return chilkatJNI.CkJsonArray_Swap(swigCPtr, this, index1, index2);
  }

  public int TypeAt(int index) {
    return chilkatJNI.CkJsonArray_TypeAt(swigCPtr, this, index);
  }

}
